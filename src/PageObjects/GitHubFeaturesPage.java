package PageObjects;
import PageObjects.PageObjectHelpers.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GitHubFeaturesPage extends BaseClass {

    private static final By elementSelector = By.xpath("//h1[contains(text(),'Field-tested tools for any project.')]");

    public GitHubFeaturesPage(WebDriver driver) {
        super(driver,elementSelector);

    }
}