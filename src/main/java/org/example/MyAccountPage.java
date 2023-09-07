package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {
    private final WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToHomePage() {
        driver.findElement(By.linkText("Home")).click();
    }

    public void goToMyAddressesPage() {
        driver.findElement(By.cssSelector("a[title=Addresses]")).click();
    }
}