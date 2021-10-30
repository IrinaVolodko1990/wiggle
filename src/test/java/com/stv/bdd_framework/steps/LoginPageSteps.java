package com.stv.bdd_framework.steps;


import com.stv.factory.factorypages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
    LoginPage loginPage = new LoginPage();

    @Given("Account page is loaded")
    public void accountPageIsLoaded() {
        loginPage.isLoginContainerDisplayed();

    }

    @When("User type to password field {PASSWORD}")
    public void userTypeToPasswordFieldString() {
        loginPage.enterPassword();
    }

    @And("User click continue button")
    public void ClickContinueButton() {
        loginPage.clickOnContinueButton();
    }

    @Then("User should see warningContinueMessage")
    public void ShouldSeeWarningContinueMessage() {
        loginPage.isWarningMessageDisplayed();
    }



}
