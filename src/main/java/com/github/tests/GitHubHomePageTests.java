package com.github.tests;

import com.github.pageobjects.GitHubLandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GitHubHomePageTests extends BaseTest {

    @Test
    public void ExploreLinkTest(){

        String explorePageTitle = new GitHubLandingPage(driver)
                .clickGitHubExplorePage()
                .getGitHubExplorerPageTitle().trim();

        System.out.println(explorePageTitle);
        Assert.assertEquals(explorePageTitle,"Explore GitHub");
    }
}
