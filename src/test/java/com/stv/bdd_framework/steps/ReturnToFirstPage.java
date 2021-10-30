package com.stv.bdd_framework.steps;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorypages.MainFactoryPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReturnToFirstPage {
    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    LoginPage loginPage= new LoginPage();
    @Given("Account page is loaded")
    public void accountPageIsLoaded(){
        loginPage.isLoginContainerDisplayed();

    }
    @When("User click wiggle label")
    public void clickWiggleLabel(){
        loginPage.clickOnWiggle();
    }
    @Then("User should on the start page russian text ")
    public void shouldSeeStartPageWithoutChanges(){
        mainFactoryPage.isPageInNewLanguage();

    }

}

