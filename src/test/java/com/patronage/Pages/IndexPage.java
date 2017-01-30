package com.patronage.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class IndexPage {
    @FindBy(how = How.ID_OR_NAME, using = "header_logo")
    private WebElement logo;
    @FindBy(how = How.LINK_TEXT, using = "My Store")
    private WebElement indexLink;
    @FindBy(how = How.ID_OR_NAME, using = "contact-link")
    private WebElement iconcontact;


    public WebElement getLogo() {
        return logo;
    }
    public WebElement getIconContact() {
        return iconcontact;
    }
}


