package com.github.tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {

    public static WebDriver createWebDriver(String browser) {

        if (browser.toString().equalsIgnoreCase("firefox")) {

            return new FirefoxDriver();
        } else if (browser.toString().equalsIgnoreCase("ie")) {

            return new InternetExplorerDriver();
        } else if (browser.toString().equalsIgnoreCase("chrome")) {

            return new ChromeDriver();
        }
        throw new IllegalArgumentException(
            "Supplied WebDriver type is not understood. Please refer to " + WebDriverFactory.class.getName());
    }
}
