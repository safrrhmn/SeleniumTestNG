import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Saifur on 3/13/2015.
 */
public class GitHubExplorePage extends BaseClass{

    public GitHubExplorePage(WebDriver driver) {
        super(driver);

    }

    @FindBy(how = How.CSS, using = ".container>h1")
    private WebElement TitleElement;

    public String getGitHubExplorerPageTitle() {

        return TitleElement.getText();
    }
}