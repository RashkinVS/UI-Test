package org.example;

import Pages.CalculatePageDivisionByZero;
import Pages.CalculatePageError;
import Pages.CalculatePageIntegerOperations;
import Pages.GooglePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestTask {
    public static WebDriver driver;

    @BeforeTest
    public void setupTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterTest
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void integerOperationsTest() throws IOException {
        driver.get("http://google.com");
        GooglePage googlePage = new GooglePage(driver);
        googlePage.clickAndSetString();
        CalculatePageIntegerOperations calculatePageIntegerOperations = new CalculatePageIntegerOperations(driver);
        calculatePageIntegerOperations.clickButtonsIntegerOperations();
    }

    @Test
    public void divisionByZeroTest() throws IOException {
        driver.get("http://google.com");
        GooglePage googlePage = new GooglePage(driver);
        googlePage.clickAndSetString();
        CalculatePageDivisionByZero calculatePageDivisionByZero = new CalculatePageDivisionByZero(driver);
        calculatePageDivisionByZero.clickButtonsDivisionByZero();
    }

    @Test
    public void errorTest() throws IOException {
        driver.get("http://google.com");
        GooglePage googlePage = new GooglePage(driver);
        googlePage.clickAndSetString();
        CalculatePageError calculatePageError = new CalculatePageError(driver);
        calculatePageError.clickButtonsError();
    }
}
