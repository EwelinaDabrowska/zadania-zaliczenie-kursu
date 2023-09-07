package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelNewAddressPage {

    private final WebDriver driver;

    @FindBy(css = "#content > div.addresses-footer > a > span")
    private WebElement createNewAddressBtn;
    @FindBy(id = "field-address1")
    private WebElement addressInput;

    @FindBy(id = "field-postcode")
    private WebElement postalCodeInput;

    @FindBy(id = "field-city")
    private WebElement cityInput;

    @FindBy(id = "field-phone")
    private WebElement phoneNumberInput;

    @FindBy(css = "#content > div > div > form > footer > button")
    private WebElement submitBtn;

    public HotelNewAddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterNewAddressData(String address, String city, String postalCode, String phoneNumber) {


        addressInput.click();
        addressInput.clear();
        addressInput.sendKeys(address);

        cityInput.click();
        cityInput.clear();
        cityInput.sendKeys(city);

        postalCodeInput.click();
        postalCodeInput.clear();
        postalCodeInput.sendKeys(postalCode);

        phoneNumberInput.click();
        phoneNumberInput.clear();
        phoneNumberInput.sendKeys(phoneNumber);

        submitBtn.click();
    }
}
