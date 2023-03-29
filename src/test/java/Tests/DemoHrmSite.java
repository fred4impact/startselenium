package Tests;

import Base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;



public class DemoHrmSite extends SeleniumBase {

    @Test
    public void loginToHrmPage(){
        // save the username and pass word in variables
        String Uname = "Admin";
        String Pword = "admin123";

        // enter valid username
        WebElement username = driver.findElement(By.name("username"));
        username.clear();
        username.sendKeys("Admin");


        // enter valid password
        WebElement password = driver.findElement(By.name("password"));
        password.clear();
        password.sendKeys("admin123", Keys.ENTER);

        // click n login button
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));


        // logout
        WebElement profileDropDown = driver.findElement(By.className(".oxd-userdropdown-tab"));
        driver.findElement(By.xpath("a[href$='/web/index.php/auth/logout']")).click();



//        WebElement  DashMenu =  driver.findElement(By.xpath("//div[@class=\"oxd-sidepanel-body\"]"));
//        System.out.println("Is Dash Menu visisble ? :" +  DashMenu.isDisplayed());


    }


}


 /*
     to resolve all import press cmd + shift + o


     APP : URL https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
    *************************
    Data username & password
    Username : Admin
    Password : admin123
    *********************
    HomPage Elements
    * ************ **
    logo   xpath ==  //div[@class="orangehrm-login-branding"]
    username == name=username
    password == name=password
    Submit button xpath //button[@type="submit"] by linkText == "Login"

   confirm Dashbaord name is xpath = //h6[text()="Dashboard"]
  * Link to Admin menu on Dashbaord xpath = //a[contains(@href, '/web/index.php/admin/viewAdminModule')]
  *  Recruitment link   xpath = //span[text()="Recruitment"]
  * Performance link in Dashboard  xpath = //span[text()="Performance"]

*
*WebDriverWait wait = new WebDriverWait(driver,30);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
// click on the compose button as soon as the "compose" button is visible
driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
*
*
 */



// Wait for visibility of an element explicit waite
        /*
        WebDriverWait ewaite  = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement elelment = ewaite.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("#locator")));
       */