package com.github.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GitHubLandingPage extends BaseClass {

    private static final By elementSelector = By.xpath("//button[contains(.,'Sign up for GitHub')]");

    // <editor-fold desc='UIMapping'>

    @FindBy(how = How.CSS, using = "[href='/explore']")
    private WebElement exploreLink;

    @FindBy(how = How.CSS, using = ".site-header-menu [href='/features']")
    private WebElement featuresLink;

    // </editor-fold>

    public GitHubLandingPage(WebDriver driver) {

        super(driver, elementSelector);
    }

    /*
     * @return GitHub Explore page.
     */
    public GitHubExplorePage clickGitHubExplorePage() {

        exploreLink.click();
        return new GitHubExplorePage(driver);
    }

    public GitHubFeaturesPage clickGitHubFeaturesPage() {

        featuresLink.click();
        return new GitHubFeaturesPage(driver);
    }
}
