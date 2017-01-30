package com.patronage.Steps;

import com.patronage.Pages.IndexPage;


import cucumber.api.java8.En;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Kasia on 2017-01-28.
 */

public class IndexAction implements En {

    WebDriver driver = new ChromeDriver();
    String baseUrl = "automationpractice.com";
    IndexPage ip = PageFactory.initElements(driver, IndexPage.class);

    public IndexAction() {
        After(Scenario -> { driver.quit();  });

        Given("^user is on start page$", () -> {
            driver.get("http://" + baseUrl);
        });
        When("^user click on logo$", () -> {
            ip.getLogo().click();
        });

        Then("^user should see start page$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body#index")));
            Assert.assertEquals(false, driver.findElements(By.cssSelector("body#index")).isEmpty());
        });

        Given("^user is on start page for click icon$", () -> {
            driver.get("http://" + baseUrl);
        });
        When("^user click on 'Contact us' button$", () -> {
            ip.getIconContact().click();
        });
        Then("^user should see 'Contact us' page$", () -> {
            WebDriverWait wait = new WebDriverWait(driver, 1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body#contact")));
            Assert.assertEquals(false, driver.findElements(By.cssSelector("body#contact")).isEmpty());
        });
    }
}


