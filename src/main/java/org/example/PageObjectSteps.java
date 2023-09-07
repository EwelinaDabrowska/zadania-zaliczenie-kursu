package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PageObjectSteps {
    private WebDriver driver;
    private MyAddressesPage myAddressesPage;

    @Given("I'm on the My Store authentication page")
    public void imOnTheHotelAuthPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://prod-course.coderslab.com/index.php?controller=authentication&back=addresses");
    }

    @When("I login using {string} and {string}")
    public void iLoginUsingAnd(String login, String passwd) {
        AuthPage authPage = new AuthPage(driver);
        authPage.loginAs(login, passwd);
    }

    @And("I enter new address {string}, {string}, {string}, {string}")
    public void iEnterNewAddress(String address, String postalCode, String city, String phoneNumber) {
        NewAddressPage newAddressPage = new NewAddressPage(driver);
        newAddressPage.enterNewAddressData(address, city, postalCode, phoneNumber);
    }

    @And("I close page")
    public void iCloseTheBrowser() {
        driver.quit();
    }
}
