package com.stv.bdd_framework.steps;


import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


import java.util.concurrent.TimeUnit;

import static com.stv.framework.core.lib.WigglePageURLs.START_URL;


public class FirstPageSteps extends BasicFactoryTest {
    MainFactoryPage mainFactoryPage = new MainFactoryPage();


    @Given("^Start page is loaded$")
    public void MenuIsVisible() {
        WebDriver driver = getDriver();
        driver.get(START_URL);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        mainFactoryPage.isFlagDisplayed();
    }

    @When("^User click on flag$")
    public void clickOnFlag() {
        mainFactoryPage.clickOnFlagButton();
    }

    @And("^User click on field Region & Language$")
    @When("^User click on field Region & Language$")
    public void clickOnFieldWithLanguages() {
        mainFactoryPage.clickOnLanguageList();
    }

    @And("^User click on RU-russian on field Region & Language$")
    @When("^User click on RU-russianon field Region & Language$")
    public void clickOnChoosenField() {
        mainFactoryPage.clickOnNewLanguage();

    }


    @And("^User click on button with text Принять$")
    @When("^User click on button with text Принять$")
    public void clickToUpdate() {
        mainFactoryPage.clickOnUpdateButton();

    }

    @Then("User should see on the page russian text")
    public void shouldSeeChanges() {
        mainFactoryPage.isUpdateButtonRusIsDisplayed();
    }


}
