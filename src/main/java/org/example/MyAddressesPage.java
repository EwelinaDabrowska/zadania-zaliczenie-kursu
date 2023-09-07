package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyAddressesPage {

    private final WebDriver driver;

    @FindBy(className = "address")
    private List<WebElement> addresses;

    @FindBy(css = "a[title='Add an address']")
    private WebElement newAddressBtn;

    public MyAddressesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addNewAddress() {
        newAddressBtn.click();
    }

    public boolean addressIsVisible() {
        return addresses.size() > 0;
    }


}