package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class BrowserActions {

       public static WebDriver driver;


         // JAVA , TESTNG  AND SELENIUM IN YOUR FRAMEWORK

      @Test
       public void setupBrowser() throws InterruptedException {

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
       driver.get("https://www.saucedemo.com/");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//       driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
//       driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(10));


       /*
       ***************************************
       NAVIGATE COMMANDS  FUNCTIONS WITH DRIVER
       **********************************
//  */    // driver.navigate().to("https://www.saucedemo.com/");
//         driver.navigate().forward();
//         driver.navigate().refresh();
//         driver.navigate().back();
//         driver.get("http://formy-project.herokuapp.com/form");


        // SET TIMEOUTS
       /*
          BROWSER ACTIONS
         // SET AND GET WINDOW SIZE USE:
         ********************************
         driver.manage().window().maximize();
         driver.manage().window().fullscreen();
         driver.manage().window().minimize();
         driver.manage().window().getSize();
         driver.manage().window().setSize(new Dimension(600,800));

        */
//          driver.manage().window().minimize();
//          driver.manage().window().maximize();
//          driver.manage().window().fullscreen();
           //driver.manage().window().setSize(new Dimension(400, 800));



          // HOW TO LOCATE ELEMETNS ON WEBPAGE
            // USING  findelents()
             //WebElement button =  driver.findElement(By.linkText("login"));
             WebElement userName = driver.findElement(By.id("user-name"));
             userName.click();
             userName.clear();
             userName.sendKeys("Sussan");
             //userName.sendKeys("Sussan", Keys.ENTER); // search an item
             String usernameText = userName.getText();

             Boolean isUsernameDisplayed  = userName.isDisplayed();
             System.out.println(" What the status of my username Field? " + isUsernameDisplayed);

             WebElement password = driver.findElement(By.id("password"));
             password.sendKeys("secret_sauce");

              // get login button

              String titleOfMtPage = driver.getTitle();

              /* DRIVER FINDELEMENTS USECASE:
              ****************
             driver.findElement(By.cssSelector(""));
            // single element
             driver.findElement(By.linkText("")); // hyper link
             driver.findElement(By.className(""));
             driver.findElement(By.xpath(""));
             driver.findElement(By.partialLinkText(""));
             driver.findElement(By.name(""));
             */


             // get Multiple elements
             //List<WebElement> links = driver.findElements(By.tagName(""));

             //driver.findElements() ;    // multiple elements e.g a links




           // TASK ONE get your app title, pages source , current URL  the page , get the window handle
       //  Getting aage and Browser info to display on the console
        //driver.getTitle(); // to get title of a current page
       // driver.getPageSource(); // html source of the page
       //System.out.println(driver.getPageSource());


/*
       **********************************
        WAYS TO FIND ELEMENTS ON YOUR PAGE
        *
        *  To get a single element on the web use :: driver.findElement() method
        *  to get Multiple elements e.g all the links or all the images on your page
        *  single element:  driver.findElement()
        *  multiple elements : driver.findElements()
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

//        driver.findElement(By.id("first-name")).sendKeys("Sussan");// this get the first-name field
//        driver.findElement(By.id("last-name")).sendKeys("automation");
//
//        //
//        WebElement firstName = driver.findElement(By.id("first-name"));
//        firstName.clear();
//        firstName.sendKeys("Sussan");

        // THE LOCATORS FOR THIS PAGE
        //jobTitle  : id=job-title


       // to print out any information in java
       //System.out.println(driver.getTitle());
//       System.out.println(pageTitle);

       //


       // Driver uses this to close and  quite the running application
       //driver.close(); // close it close current open browser
       driver.quit();  //  quite the browser from task bar



       }




}
