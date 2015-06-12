package com.github.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GitHubExplorePage extends BaseClass {

    private static final By elementSelector = By.xpath("//h2[.='Explore']");

    public GitHubExplorePage(WebDriver driver) {
        super(driver,elementSelector);

    }

    // <editor-fold desc="UIMapping">

        @FindBy(how = How.CSS, using = ".container>h1")
        private WebElement TitleElement;

    // </editor-fold>

    public String getGitHubExplorerPageTitle() {

        return TitleElement.getText();
    }
}