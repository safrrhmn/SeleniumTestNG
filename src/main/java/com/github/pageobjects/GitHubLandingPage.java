package com.github.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GitHubLandingPage extends BaseClass {


    private static final By elementSelector = By.xpath("//button[contains(.,'Sign up for GitHub')]");

    //UI Mapping
    @FindBy(how = How.CSS, using = ".container.clearfix>ul>li:first-child>a")
    private WebElement ExploreLink;

    @FindBy(how = How.CSS, using = ".container.clearfix>ul>li:nth-child(2)>a")
    private WebElement FeaturesLink;


    public GitHubLandingPage(WebDriver driver) {
        super(driver,elementSelector);

    }

    /**
     *
     * @return GitHub Explore page.
     */
    public GitHubExplorePage clickGitHubExplorePage(){

        ExploreLink.click();

        return new GitHubExplorePage(driver);
    }

    public GitHubFeaturesPage ClickGitHubFeaturesPage(){

        FeaturesLink.click();

        return new GitHubFeaturesPage(driver);
    }
}
