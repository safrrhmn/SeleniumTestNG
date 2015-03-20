import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Saifur on 3/13/2015.
 */
public class GitHubTests extends BaseTest {

    @Test
    public void ExploreLinkTest(){

        String explorePageTitle = new GitHubLandingPage(driver)
                .clickGitHubExplorePage()
                .getGitHubExplorerPageTitle().trim();

        System.out.println(explorePageTitle);
        Assert.assertEquals(explorePageTitle,"Explore GitHub");
    }
}
