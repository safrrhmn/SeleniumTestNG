package com.github.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest extends WebDriverFactory {

    public static WebDriver driver;
    static String url = "https://github.com/";

    @Parameters("browser")
    @BeforeClass
    public static void setUpTests(String browser) {

        driver = WebDriverFactory.createWebDriver(browser);
        //Navigate to url
        driver.navigate().to(url);
        //Maximize the browser window
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void CleanUpDriver() throws Exception {

        // Quit current driver instance.
        try {
            driver.quit();
        } catch (Exception ex) {

            throw ex;
        }
    }
} 