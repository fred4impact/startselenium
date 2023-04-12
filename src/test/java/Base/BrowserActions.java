package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.lang.model.element.Element;
import java.time.Duration;
import java.util.List;

public class BrowserActions {

       public static WebDriver driver;


         // JAVA , TESTNG  AND SELENIUM IN YOUR FRAMEWORK

      @Test(enabled = false)
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

//             String currenthANDLE =  driver.getWindowHandle();
//             System.out.println("My browser handle" + currenthANDLE);


//             WebElement userName = driver.findElement(By.id("user-name"));
//             userName.click();
//             userName.clear();
//             userName.sendKeys("Sussan");
//             //userName.sendKeys("Sussan", Keys.ENTER); // search an item
//             String usernameText = userName.getText();
//
//             Boolean isUsernameDisplayed  = userName.isDisplayed();
//             System.out.println(" What the status of my username Field? " + isUsernameDisplayed);
//
//             WebElement password = driver.findElement(By.id("password"));
//             password.sendKeys("secret_sauce");
//
//              // get title of the page and assert the title is correct
//              String mainTitle = "Swag Labs";
//              String currentTitle = driver.getTitle();
//              System.out.println("Current browser name" + "  " +  currentTitle );
//              Assert.assertEquals(mainTitle, currentTitle);


              // if you declaring a variable for an elememnt

               //WebElement varibale_name = driver.findElement("what element to locate ");
               // String my_variable = driver.getCurrentUrl(); variable declearation and assign value



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
       *
       *
       *
       *
       *
       *

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



          //select // dropdown


          /// multiple element locator using the page https://www.bstackdemo.com/




       driver.quit();  //  quite the browser from task bar



       }




   @Test(testName = "Multiple elements locations", enabled = false)
   public void MultipleElements(){
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
       driver.get("https://automationintesting.online/"); // this is the application e are testing against
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


       // we are getting the number of links on the current page adn storing it on the varible
      List<WebElement> multipleLink =  driver.findElements(By.tagName("a"));
      int getMyLinkSize =  multipleLink.size();
      System.out.println("Print number of links on the page we are on"  + "   " + getMyLinkSize);

      // get and list all the images on the application under test
       List<WebElement> images = driver.findElements(By.tagName("img"));
       int countImageNumber = images.size();
       System.out.println("Number og images on my page"  + "  " + countImageNumber);


        /*
            1, find elements using driver  by id, linkText, name, cssLocator, class xpath or relevant locators
            2. Assign them to varilable
            3. perform action on the elements e.g send a text or click or enable
            44 you can get values from them
            5. perform assertion on them

         */

       WebElement nameVar =  driver.findElement(By.id("name")); // pattern
       nameVar.clear();
       nameVar.sendKeys("sussan");
       String currentValueInName = nameVar.getText();
       System.out.println("The value i just entered" +  " "  + currentValueInName);



       driver.quit();
   }

   @Test
   public void SelectMethod(){
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
       driver.get("http://formy-project.herokuapp.com/form"); // this is the application e are testing against
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));



       // perform action
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.clear();
        firstName.sendKeys("firstname");

        /*
           1 get the parent elements and set to webelement variable
           2. use Select  to get the value in teh select box
           3 you can select by 1 index, value, text
           camel caSING VARIABLE NAME  VariableName or variableName
         */
        // get the parent
       WebElement yearsOfExperience =  driver.findElement(By.id("select-menu"));

       // use select method to in teract with the select object
       Select valueOne = new Select(yearsOfExperience);
       valueOne.selectByIndex(0);
       //valueOne.selectByValue("0");
        //valueOne.selectByVisibleText("0-1");
//       List<WebElement> allSelected =  valueOne.getAllSelectedOptions();
//       System.out.println(allSelected);


       // quit application
       driver.quit();
   }



}// end of class
