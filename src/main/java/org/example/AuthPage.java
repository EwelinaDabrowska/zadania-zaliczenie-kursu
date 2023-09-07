package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelAuthPage {
    private final WebDriver driver;

    @FindBy(name = "email")
    private WebElement loginEmailInput;

    @FindBy(id = "field-password")
    private WebElement loginPasswdInput;

    @FindBy(id = "submit-login")
    private WebElement loginBtn;

    @FindBy(css = "#content > div.addresses-footer > a > span")
    private WebElement createNewAddressBtn;


    public HotelAuthPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void loginAs(String email, String passwd) {
        loginEmailInput.clear();
        loginEmailInput.sendKeys(email);

        loginPasswdInput.clear();
        loginPasswdInput.sendKeys(passwd);

        loginBtn.click();

        createNewAddressBtn.click();

    }
}