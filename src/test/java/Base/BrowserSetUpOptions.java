package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.time.Duration;

public class BrowserSetUpOptions {

       public static WebDriver driver;


       @Test
       public void setupBrowser()  {

       /*
       *********************************
        BROWSER ACTIONS
        ******************************
        Chrome arguments that can be set as required
        * *******************************
        options.addArguments("--remote-allow-origins=*");
        addArguments("start-maximized");
        addArguments("incognito");
        addArguments("disable-popup-blocking");
        addArguments("disable-infobars");
        */

       // Setting options of browsers How is used.
       ChromeOptions options =  new ChromeOptions();
       options.addArguments("--remote-allow-origins=*");
       options.addArguments("start-maximized");
       DesiredCapabilities caps = new DesiredCapabilities();
       caps.setCapability(ChromeOptions.CAPABILITY, options);
       options.merge(caps);

       // Setup Webdriver Manger
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver(options);

       // Open Test Application URL
       driver.get("http://formy-project.herokuapp.com/form");

       /*
           ***************************************
           NAVIGATE COMMANDS  FUNCTIONS WITH DRIVER
           **********************************

         driver.navigate().to("");
         driver.navigate().forward();
         driver.navigate().back();
         driver.navigate().refresh();
        */

       // Set Timeout of page before loading
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       /*
         driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
         driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(10));
         driver.manage().window().maximize();
        */


       /*
       ***************************************
        Driver can get the following on browser
        **************************************
         driver.getCurrentUrl(), getTitle(), getPageSource()
         quit(), close(), driver.getWindowHandle(), river.switchTo();
        */


              // Assignmnet
       //  Getting aage and Browser info to display on the console
        driver.getTitle(); // to get title of a current page
        driver.getPageSource(); // html source of the page
        System.out.println(driver.getPageSource());

/*
       **********************************
        WAYS TO FIND ELEMENTS ON YOUR PAGE
        **********************************

        driver.findElement(By.id(""));
        driver.findElement(By.xpath(""));
        driver.findElement(By.cssSelector(""));
        driver.findElement(By.tagName(""));
        driver.findElement(By.name(""));
        driver.findElement(By.linkText(""));
        driver.findElement(By.partialLinkText(""));
        */

       /*
       ***********************
       ELEMENTS ACTIONS
       ************************
       element.findElement(By.id("first-name"))
       element.click();
       element.sendKeys("someText");
       element.clear();
       element.submit();
       element.getText();  // get title

       String innerText = element.getText();
       boolean isEnabled = element.isEnabled();
       boolean isDisplayed = element.isDisplayed();
       boolean isSelected = element.isSelected();
        */

        driver.findElement(By.id("first-name")).sendKeys("Sussan");// this get the first-name field
        driver.findElement(By.id("last-name")).sendKeys("automation");

        //
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.clear();
        firstName.sendKeys("Sussan");

        // THE LOCATORS FOR THIS PAGE
        //jobTitle  : id=job-title


       // to print out any information in java
       System.out.println(driver.getTitle());
//       System.out.println(pageTitle);
       System.out.println(driver.getPageSource());
       //


       // Driver uses this to close and  quite the running application
       driver.close(); // close it close current open browser
       driver.quit();  //  quite the browser from task bar



       }




}
