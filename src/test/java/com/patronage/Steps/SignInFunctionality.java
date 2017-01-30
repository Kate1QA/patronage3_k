package com.patronage.Steps;

import com.patronage.Pages.SignIn;
import cucumber.api.PendingException;
import cucumber.api.java8.En;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Kasia on 2017-01-29.
 */
public class SignInFunctionality implements En {
    WebDriver driver = new ChromeDriver();
    String baseUrl = "automationpractice.com";
    SignIn si = PageFactory.initElements(driver, SignIn.class);

    public SignInFunctionality() {

        After(Scenario -> { driver.quit(); });

        Given("^user is on start page and would like to 'Sign in'$", () -> {
            driver.get("http://" + baseUrl);
        });
        When("^user click on 'Sign in' button$", () -> {
            si.getIconSign().click();
        });

        Then("^user should see page to Login$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login_form")));
            Assert.assertEquals(false, driver.findElements(By.id("login_form")).isEmpty());
        });

        //----incorrect password

        Given("^user is on page to Login$", () -> {
            driver.get("http://" + baseUrl+"/index.php?controller=authentication&back=my-account");
        });
        When("^user gives email$", () -> {
            si.getEmailTextBox().sendKeys("ybgqogolqrm2@10minut.com.pl");
        });
        And("^user gives incorrect password$", () -> {
            si.getPassTextBox().sendKeys("user321");
        });

        When("^user click on 'Submit' button$", () -> {
            si.getButtonSubmit().click();
        });
        Then("^user should see error incorrect password$", ()
                -> {
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.alert.alert-danger")));
            Assert.assertEquals(false, driver.findElements(By.cssSelector("div.alert.alert-danger")).isEmpty());
        });

        //----incorrect login
        Given("^user is on page to login to user account$", () -> {
            driver.get("http://" + baseUrl+"/index.php?controller=authentication&back=my-account");
        });
        When("^user gives incorrect email$", () -> {
            si.getEmailTextBox().sendKeys("ybgqqrm2@10minut.com.pl");
        });
        And("^user gives correct password$", () -> {
            si.getPassTextBox().sendKeys("user123");
        });
        When("^click on 'Submit' button$", () -> {
            si.getButtonSubmit().click();

        });
        Then("^user should see error incorrect email$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.alert.alert-danger")));
            Assert.assertEquals(false, driver.findElements(By.cssSelector("div.alert.alert-danger")).isEmpty());

        });

        //----correct login&password

        Given("^user is on Login page$", () -> {
            driver.get("http://" + baseUrl+"/index.php?controller=authentication&back=my-account");
        });

        When("^user gives email adres$", () -> {
            si.getEmailTextBox().sendKeys("ybgqogolqrm2@10minut.com.pl");
        });

        And ("^user gives password$", () -> {
            si.getPassTextBox().sendKeys("user123");

        });
        When("^user click on 'Submit' button'$", () -> {
            si.getButtonSubmit().click();
        });
        Then("^user should see account$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body#my-account")));
            Assert.assertEquals(false, driver.findElements(By.cssSelector("body#my-account")).isEmpty());

        });


    }
}
