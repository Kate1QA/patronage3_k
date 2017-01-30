package com.patronage.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



    public class SignIn
{
        @FindBy(how = How.CLASS_NAME, using = "login")
        private WebElement iconSign;

        @FindBy(how = How.ID_OR_NAME, using = "index")
        private WebElement indexLink;

        @FindBy(how = How.ID_OR_NAME, using = "login_form")
        private WebElement loginBox;

        @FindBy(how = How.ID_OR_NAME, using = "email")
        private WebElement emailTextBox;

        @FindBy(how = How.ID_OR_NAME, using = "passwd")
        private WebElement passTextBox;

        @FindBy(how = How.ID_OR_NAME, using = "SubmitLogin")
        private WebElement buttonSubmit;


        public WebElement getIconSign() {
            return iconSign;
        }
        public WebElement getIndexLink() {
            return indexLink;
        }
        public WebElement getLoginBox() {
            return loginBox;
        }
        public WebElement getEmailTextBox(){
            return emailTextBox;
        }
        public WebElement getPassTextBox(){
            return passTextBox;
        }
        public WebElement getButtonSubmit(){
            return buttonSubmit;
        }
}