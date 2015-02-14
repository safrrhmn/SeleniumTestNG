import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.List;

/**
 * Created by Saifur on 2/14/2015.
 */
public class HelloSelenium {

    WebDriver driver;


    @BeforeTest
    public void SertUpTest(){
        System.setProperty("webdriver.chrome.driver", "\\working\\Seleniumjava\\drivers\\chromedriver.exe");
        //System.setProperty("webdriver.ie.driver", "\\working\\Seleniumjava\\drivers\\IEDriverServer.exe");
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        //driver = new InternetExplorerDriver();


        driver.navigate().to("https://github.com/search?l=java&q=hasRole%28%29&type=Code&utf8=%E2%9C%93");
    }

    @AfterTest
    public void CleaUpDriver(){

        driver.quit();
    }

    @Test
    public void DemoTest(){

        //maximizing the window for better view
        driver.manage().window().maximize();

        //a selector to find all the links on the page
        By selector = By.xpath("//p[@class='title']/a[1]");

        //finding the list of all elements
        List<WebElement> list = driver.findElements(selector);

        /*Iterating over the collection may StaleElementReference exception due to DOM refresh
        according to my knowledge for loop is best in such case
        */
        for (int i = 0; i<list.size(); i++){

            new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(selector));

            //Click on the title
            driver.findElements(selector).get(i).click();

            //Navigating back to the main page. This is not feasible but no other option present due to page structure
            driver.navigate().back();

        }
    }
}







