package seleniumBasics;



import com.github.javafaker.DateAndTime;
import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SeleniumPracticeBase {
    // declare your web driver
    public WebDriver driver;

   @BeforeClass
    public void setUpBrowser(){

       // implementation of faker to Genertate random data
       Faker faker = new Faker();
       String userName = String.valueOf(faker.funnyName());
       String emailAddress = faker.internet().emailAddress();
       String passWord = faker.internet().password();
       String text = String.valueOf(faker.lorem());
       PhoneNumber phoneNumber = faker.phoneNumber();
       DateAndTime dateTime = faker.date();

        // WebDriverManager.firefoxdriver().setup();
       // sample ORNAGE HRM TEST SITE
       //  https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

//     System.setProperty("webdriver.chrome.driver","resources/chromedriver");
       ChromeOptions setOption = new ChromeOptions();
       setOption.addArguments("--remote-allow-origins=*");
//      setOption.addArguments("incognito");
       DesiredCapabilities caps = new DesiredCapabilities();
       caps.setCapability(ChromeOptions.CAPABILITY,setOption);
       setOption.merge(caps);

        WebDriverManager.chromedriver().driverVersion("111.0.5563.64").setup();
        driver = new ChromeDriver(setOption); // set type of browser to use
        driver.get("https://the-internet.herokuapp.com");
        driver.manage().window().maximize();
    }




    @AfterClass
    public void closeBrowser(){
       driver.close();
       driver.quit();
    }



}

