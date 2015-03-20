import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Saifur on 3/13/2015.
 */
public class GitHubLandingPage extends BaseClass {

    //UI Mapping
    @FindBy(how = How.CSS, using = ".container.clearfix>ul>li:first-child>a")
    private WebElement ExploreLink;

    @FindBy(how = How.CSS, using = ".container.clearfix>ul>li:nth-child(2)>a")
    private WebElement FeaturesLink;


    public GitHubLandingPage(WebDriver driver) {
        super(driver);

    }

    public GitHubExplorePage clickGitHubExplorePage(){

        ExploreLink.click();

        return new GitHubExplorePage(driver);
    }
}
