package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelMyAccountPage {
    private final WebDriver driver;

    public HotelMyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isSuccessAlertDisplayed() {
        return driver.findElement(By.className("alert-success")).isDisplayed();
    }

    public String getSuccessAlert() {
        return driver.findElement(By.className("alert-success")).getText();
    }

    public String getUserName() {
        return driver.findElement(By.className("account_user_name")).getText();
    }

    public void goToHomePage() {
        driver.findElement(By.linkText("Home")).click();
    }

    public void goToMyAddressesPage() {
        driver.findElement(By.cssSelector("a[title=Addresses]")).click();
    }
}