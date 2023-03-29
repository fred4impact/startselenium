package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import java.time.Duration;



public class SeleniumBase {

    protected WebDriver driver;


    @BeforeClass
    public void  setUpDriver() throws InterruptedException {

         // form URL: http://formy-project.herokuapp.com/form
        // Second url: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        //System.setProperty("webdriver.chrome.driver", "resources/chromedriver");

         // set these selenium 4 applies to chrome issues
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("start-maximized");
        options.addArguments("incognito");
//        options.addArguments("disable-popup-blocking");
//        options.addArguments("disable-infobars");
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(caps);

        // add the options to the driver

        // using WebDriverManager
        WebDriverManager.chromedriver().driverVersion("111.0.5563.64").setup();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


       // Form url :   http://formy-project.herokuapp.com/form


      driver.findElement(By.tagName("a"));


    }


    @AfterTest
    public  void closeApp(){
        driver.close();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}

/*
NEW DRIVER WAITE
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

*
 */