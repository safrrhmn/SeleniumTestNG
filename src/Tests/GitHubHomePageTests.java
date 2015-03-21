package Tests;
import PageObjects.GitHubLandingPage;
import Tests.TestHelpers.BaseTest;
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
