package com.patronage.Steps;

import com.patronage.Pages.IndexPage;
import com.patronage.Pages.SocialMediaPage;
import cucumber.api.PendingException;
import cucumber.api.java8.En;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * Created by Kasia
 * W poniższym teście założyłam, że podane linki do social media do nich prowadzą.
 * W testach dla inwestora wprowadziłabym do sprawdzenia istniejące linki
 */
public class SocialMediaFunc implements En {
    WebDriver driver = new ChromeDriver();
    String baseUrl = "automationpractice.com";
    SocialMediaPage sm = PageFactory.initElements(driver, SocialMediaPage.class);


    public SocialMediaFunc() {
        After(Scenario -> { driver.quit(); });

        Given("^user is on 'My store' home page$", () -> {
            driver.get("http://" + baseUrl);
        });

        When("^user click on 'Facebook' button$", () -> {
            sm.getButtonFb().click();
        });

        Then("^user should see Facebook page$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Selenium Framework")));
            Assert.assertEquals(false, driver.findElements(By.partialLinkText("Selenium Framework")).isEmpty());
        });


        Given("^user is on My Store home page$", () -> {
            driver.get("http://" + baseUrl);
        });
        When("^user click on 'Twitter' button$", () -> {
            sm.getButtonTwit().click();
        });
        Then("^user should see Twitter page$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Selenium Framework")));
            Assert.assertEquals(false, driver.findElements(By.partialLinkText("Selenium Framework")).isEmpty());
        });


        Given("^user is on 'My Store' page$", () -> {
            driver.get("http://" + baseUrl);
        });
        When("^user click on 'YouTube' button$", () -> {
            sm.getButtonYT().click();
        });
        Then("^user should see YouTube page$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Selenium Framework")));
            Assert.assertEquals(false, driver.findElements(By.partialLinkText("Selenium Framework")).isEmpty());
        });


        Given("^user is on My Store page$", () -> {
            driver.get("http://" + baseUrl);
        });
        When("^user click on 'Google Plus' button$", () -> {
            sm.getButtonGplus().click();
        });
        Then("^user should see Google Plus page$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Selenium Framework")));
            Assert.assertEquals(false, driver.findElements(By.partialLinkText("Selenium Framework")).isEmpty());
        });
    }
}
