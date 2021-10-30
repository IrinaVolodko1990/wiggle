package com.stv.factory.factorypages;

import com.stv.framework.core.drivers.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import static com.stv.framework.core.lib.WigglePageURLs.START_URL;

public abstract class FactoryPage {
    static WebDriver getDriver() {
        return Driver.getDriver();
    }
    protected FactoryPage(){
        PageFactory.initElements(getDriver(), this);
    }


}

