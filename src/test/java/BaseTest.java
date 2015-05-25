import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {


    public WebDriver driver;
    String url = "https://github.com/";


    @BeforeClass
    public void SetUpTests() {

        System.setProperty("webdriver.chrome.driver", "\\working\\Seleniumjava\\drivers\\chromedriver.exe");
        //System.setProperty("webdriver.ie.driver", "\\working\\Seleniumjava\\drivers\\IEDriverServer.exe");
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        //driver = new InternetExplorerDriver();

        //Navigate to url
        driver.navigate().to(url);

        //Maximize the browser window
        driver.manage().window().maximize();
    }

    @AfterClass
    public void CleanUpDriver() throws Exception {

        // Quit current driver instance.
        try {

            driver.quit();

        }catch (Exception ex){

            throw ex;
        }
    }
} 