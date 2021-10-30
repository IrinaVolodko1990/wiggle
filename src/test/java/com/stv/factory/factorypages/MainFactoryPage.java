package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainFactoryPage extends FactoryPage {


    @FindBy(className = "bem-header__language-selector")
    private WebElement flag;

    @FindBy(id = "lcdUpdateForm")
    private WebElement regionAndLanguageForm;
    @FindBy(id = "langId")
    private WebElement languagesList;

    @FindBy( xpath = "//option[contains(text(),'RU - русский язык')]")
    private WebElement newLanguage;

    @FindBy(className = "bem-language-selector__button")
    private WebElement updateButton;

    @FindBy(id = "accountLink")
    private WebElement accountLink;

    @FindBy(xpath = "//button[contains(text(),'Accept All Cookies')]")
    private WebElement trustButton;
    @FindBy(xpath = "//button[contains(text(),'Принять все файлы cookie')]")
    private WebElement trustButtonRus;

    @FindBy(xpath = "//button[contains(text(),'Обновить')]")
    private WebElement updateButtonRus;

    @FindBy(xpath = "//h2[contains(text(),'ГОТОВЫ К ЧЕМУ УГОДНО')]")
    private WebElement vetifyInRussian;



    public boolean isPageInNewLanguage(){
        return vetifyInRussian.isDisplayed();
    }

    public boolean isFlagDisplayed() {
        return flag.isDisplayed();
    }

    public MainFactoryPage clickOnFlagButton() {
        flag.click();
        return this;
    }
    public boolean isRegionAndLanguageFormDisplayed() {
        return regionAndLanguageForm.isDisplayed();
    }

    public boolean isLanguagesListDisplayed() {
        return languagesList.isDisplayed();
    }

    public MainFactoryPage clickOnLanguageList() {
        languagesList.click();
        return this;
    }

    public boolean isNewLanguageDisplayed() {
        return newLanguage.isDisplayed();
    }

    public MainFactoryPage clickOnNewLanguage() {
        newLanguage.click();
        return this;
    }

    public boolean isUpdateButtonDisplayed() {
        return updateButton.isDisplayed();
    }



    public MainFactoryPage  clickOnUpdateButton() {
        updateButton.click();
        return this;
    }

    public boolean isAccountLinkDisplayed() {
        return accountLink.isDisplayed();
    }


    public void clickOnAccountButton() {
       accountLink.click();
    }

    public boolean isUpdateButtonRusIsDisplayed() {
        return updateButtonRus.isDisplayed();
    }

    public void clickOnTrustButton() {
        trustButton.click();
    }
    public void clickOnTrustButtonRus() {
        trustButtonRus.click();
    }

}
