package com.github.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GitHubExplorePage extends BaseClass {

    private static final By elementSelector = By.cssSelector("[href='/explore']");

    public GitHubExplorePage(WebDriver driver) {

        super(driver, elementSelector);

    }

    // <editor-fold desc="UIMapping">

    @FindBy(how = How.CSS, using = ".pagehead-heading")
    private WebElement titleElement;

    // </editor-fold>

    public String getGitHubExplorerPageTitle() {

        WebElement element = findElementWithExpectedCondition(ExpectedConditions.visibilityOf(titleElement));
        return element.getText();
    }
}