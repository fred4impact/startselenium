//package seleniumBasics;
//
//
//
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Reporter;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import java.util.concurrent.TimeUnit;
//
//public class SeleniumWebDriverBasics {
//    // declare your web driver
//    public WebDriver driver;
//
//   @BeforeClass
//    public void setUpBrowser(){
//        // WebDriverManager.firefoxdriver().setup();
//        // WebDriverManager.chromedriver().setup();
//       // sample ORNAGE HRM TEST SITE
//       //  https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
//
//        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
//        driver = new ChromeDriver(); // set type of browser to use
//
//
//        driver.get("http://formy-project.herokuapp.com/form");
//        driver.manage().window().maximize();
//        driver.manage().window().setSize(new Dimension(375,667));
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//
//    }
//
//
//
//
//    @AfterClass
//    public void closeBrowser(){
//       driver.quit();
//    }
//
//
//
//}
//
