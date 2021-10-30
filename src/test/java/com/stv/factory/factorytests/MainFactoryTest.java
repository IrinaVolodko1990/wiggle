package com.stv.factory.factorytests;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorypages.MainFactoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MainFactoryTest extends BasicFactoryTest {

    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    LoginPage loginPage = new LoginPage();


    @Test(description = "Assert the main page is loaded and flag icon is visible")
    public void assertFlagIconIsDisplayed() {
        boolean actualResult = mainFactoryPage.isFlagDisplayed();
        Assert.assertEquals(actualResult, true, "Flag link isn't visible");
    }

    @Test(description = "Assert the flag button is clicked and loaded", dependsOnMethods = "assertFlagIconIsDisplayed")
    public void assertFlagButtonIsClick() {
        mainFactoryPage.clickOnTrustButton();
        mainFactoryPage.clickOnFlagButton();
        Assert.assertEquals(new MainFactoryPage().isRegionAndLanguageFormDisplayed(), true, "Failed to press the button of flag");
    }


    @Test(description = "Assert the list of languages is visible", dependsOnMethods = "assertFlagButtonIsClick")
    public void assertLanguageListIsDisplayed() {
        boolean actualResult = mainFactoryPage.isLanguagesListDisplayed();
        Assert.assertEquals(actualResult, true, "List of languages isn't visible");
    }

    @Test(description = "Assert the button of languages list  is clicked and loaded", dependsOnMethods = "assertLanguageListIsDisplayed")
    public void assertLanguagesListButtonIsClick() {
        mainFactoryPage.clickOnLanguageList();
        Assert.assertEquals(new MainFactoryPage().isNewLanguageDisplayed(), true, "Failed to press the button of languages list");
    }


    @Test(description = "Assert the chosen language is clicked", dependsOnMethods = "assertLanguagesListButtonIsClick")
    public void assertNewLanguageButtonIsClick() {
        mainFactoryPage.clickOnNewLanguage();
        Assert.assertEquals(new MainFactoryPage().isUpdateButtonRusIsDisplayed(), true, "Failed to press the button of new language");
    }

    @Test(description = "Assert the update button in new language is clicked", dependsOnMethods = "assertNewLanguageButtonIsClick")
    public void assertUpdateButtonIsClick() {
        mainFactoryPage.clickOnUpdateButton();
        Assert.assertEquals(new MainFactoryPage().isAccountLinkDisplayed(), true, "Failed to press the update button in new language");
    }


    @Test(description = "Assert the login page is loaded", dependsOnMethods = "assertUpdateButtonIsClick")
    public void assertLoginPageOpened() {
        mainFactoryPage.clickOnTrustButtonRus();
        mainFactoryPage.clickOnAccountButton();
        Assert.assertEquals(new LoginPage().isLoginContainerDisplayed(), true, "Login page isn't loaded properly");
    }


    @Test(description = "Assert the password field is visible ", dependsOnMethods = "assertLoginPageOpened")
    public void assertPasswordFieldIsDisplayed() {
        boolean actual = loginPage.isPasswordFieldDisplayed();
        Assert.assertEquals(actual, true, "Password field isn't visible");
    }

    @Test(description = "Assert the password type in password field ", dependsOnMethods = "assertPasswordFieldIsDisplayed")
    public void assertPasswordIsTyped() {
        loginPage.enterPassword();
        Assert.assertEquals(new LoginPage().isContinueButtonDisplayed(), true, "Password field isn't visible");
    }

    @Test(description = "Assert the continue button is click", dependsOnMethods = "assertPasswordIsTyped")
    public void assertContinueButtonIsClick() {
        loginPage.clickOnContinueButton();
        Assert.assertEquals(new LoginPage().isWarningMessageDisplayed(), true, "Failed to press the button of flag");
    }

    @Test(description = "Assert Wiggle logo is visible", dependsOnMethods = "assertContinueButtonIsClick")
    public void assertWiggleLogoIsDisplayed() {
        boolean actual = loginPage.isWiggleContainerDisplayed();
        Assert.assertEquals(actual, true, "Wiggle logo isn't visible");

    }

    @Test(description = "Assert the wiggle link is click", dependsOnMethods = "assertWiggleLogoIsDisplayed")
    public void assertWiggleLinkIsClick() {
        loginPage.clickOnWiggle();
        Assert.assertEquals(new MainFactoryPage().isPageInNewLanguage(), true, "Failed to press on the wiggle logo");
    }

}
