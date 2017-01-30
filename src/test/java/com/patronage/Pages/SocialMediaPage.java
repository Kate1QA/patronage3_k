package com.patronage.Pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Kasia on 2017-01-29.
 */
public class SocialMediaPage {

    @FindBy(how = How.ID_OR_NAME, using = "index")
    private WebElement indexLink;

    @FindBy(how = How.CLASS_NAME, using = "facebook")
    private WebElement buttonFb;

    @FindBy(how = How.CLASS_NAME, using = "twitter")
    private WebElement buttonTwit;

    @FindBy(how = How.CLASS_NAME, using = "youtube")
    private WebElement buttonYT;

    @FindBy(how = How.CLASS_NAME, using = "google-plus")
    private WebElement buttonGplus;


    public WebElement getIndexLink() {
        return indexLink; }

    public WebElement getButtonFb(){
        return buttonFb;  }

    public WebElement getButtonTwit(){
       return buttonTwit; }

    public WebElement getButtonYT(){
        return buttonYT;  }

    public WebElement getButtonGplus(){
        return buttonGplus;}


}


