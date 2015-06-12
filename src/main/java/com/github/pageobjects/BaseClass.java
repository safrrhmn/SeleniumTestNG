package com.github.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

public class BaseClass {

    protected WebDriver driver;
    private long DefaultPageLoadTimeOut = 10;

    /**@param _driver
     * @param byKnownElement
     */
    public BaseClass(WebDriver _driver, By byKnownElement) {

        //assigning driver instance globally.
        driver = _driver;
        this.isReadyState();
        this.correctPageLoadedCheck(byKnownElement);

        /* Instantiating all elements since this is super class
        and inherited by each and every page object */
        PageFactory.initElements(driver, this);
    }

    /**
     * Verifies correct page was returned.
     * @param by
     */
    private void correctPageLoadedCheck(By by) {

        this.isReadyState();
        try {
            driver.findElement(by).isDisplayed();
        } catch (NoSuchElementException ex) {
            throw ex;
        }
    }

    /* Waits until the Document Object Model is in ready State.
     */
    private void isReadyState() {

        ExpectedCondition<Boolean> pageLoadCondition = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor) driver).executeScript(ClientSideScript.domReadyState).equals("complete");
                    }
                };

        WebDriverWait wait = new WebDriverWait(driver, DefaultPageLoadTimeOut);
        wait.until(pageLoadCondition);
    }
}