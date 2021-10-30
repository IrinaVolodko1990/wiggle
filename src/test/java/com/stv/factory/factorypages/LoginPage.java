package com.stv.factory.factorypages;

import com.stv.framework.core.utils.Waiters;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends FactoryPage {
    private static final String PASSWORD = "K2Hrd$NVp_Bav7i";
    @FindBy(className = "bem-checkout__container-block")
    private WebElement loginContainer;
    @FindBy(id = "LogOnModel_Password")
    private WebElement passwordField;
    @FindBy(id = "qa-login")
    private WebElement continueButton;
    @FindBy(id = "LogOnModel_UserName-error")
    private WebElement warningContinueMessage;
    @FindBy(className = "row")
    private WebElement wiggleContainer;



    public boolean isLoginContainerDisplayed() {
        return loginContainer.isDisplayed();
    }

    public boolean isPasswordFieldDisplayed() {
        return passwordField.isDisplayed();
    }

    public LoginPage enterPassword() {
        passwordField.sendKeys(PASSWORD);
        return this;
    }


    public boolean isContinueButtonDisplayed() {
        return continueButton.isDisplayed();
    }

    public LoginPage clickOnContinueButton() {
        continueButton.click();
        return this;
    }

    public boolean isWarningMessageDisplayed() {
        //Waiters.waitForElementVisible(getDriver(), 2, warningContinueMessage);
        return warningContinueMessage.isDisplayed();

    }

    public LoginPage clearPassword() {
        passwordField.clear();
        return this;
    }

    public boolean isWiggleContainerDisplayed(){
        return wiggleContainer.isDisplayed();
    }

    public LoginPage clickOnWiggle(){
        wiggleContainer.click();
        return this;
    }
}
