package com.github.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseTest {


    public WebDriver driver;
    String url = "https://github.com/";

    @Parameters("browser")
    @BeforeClass
    public void SetUpTests(String browser) {
        if(browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", ".\\drivers\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }else if (browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        //Navigate to url
        driver.navigate().to(url);

        //Maximize the browser window
        driver.manage().window().maximize();
    }

    @AfterClass
    public void CleanUpDriver() throws Exception {

        // Quit current driver instance.
        try {

            driver.quit();

        }catch (Exception ex){

            throw ex;
        }
    }
} 