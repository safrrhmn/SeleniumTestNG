import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Saifur on 2/14/2015.
 */
public class BaseClass {

    //global driver instance.
    WebDriver driver;

    //super constructor
    public BaseClass(WebDriver _driver)
    {
        //assigning driver instance globally.
        driver = _driver;

        /*Instantiating all elements since this is super class
        and inherited by each and every page object            */

        PageFactory.initElements(driver, this);
    }
}