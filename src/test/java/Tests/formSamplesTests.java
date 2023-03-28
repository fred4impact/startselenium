package Tests;

import Base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import static net.bytebuddy.matcher.ElementMatchers.is;

public class formSamplesTests extends SeleniumBase {



    @Test(enabled = false)
    public void formTestCases(){
        Reporter.log("Opening the application URL");
        // get element names and create a variable of for the elements
        WebElement firstName = driver.findElement(By.id("first-name"));
        // clear the textfiels
        firstName.clear();
        String valueName = "Ryan";

        // send value to the textfield
        firstName.sendKeys(valueName);
        String nameCheck = firstName.getAttribute("value");

        // Assert your result
        Assert.assertEquals(valueName, nameCheck);
        System.out.println("The entered result" +  nameCheck);

        // Lastname elements
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.clear();
        lastName.sendKeys("Json");

        // Job title field
        WebElement jobTile = driver.findElement(By.id("job-title"));
        jobTile.clear();
        jobTile.sendKeys("Automation Analysts");

        // select the radio button option 3
        WebElement radioGrad = driver.findElement(By.id("radio-button-3"));
        radioGrad.click();

        String radio3value = radioGrad.getAttribute("value");
        System.out.println(radio3value);


       // Check box

        WebElement maleCheckBox = driver.findElement(By.id("checkbox-1"));
        boolean male = maleCheckBox.isDisplayed();
        maleCheckBox.click();


        //Select Options
        WebElement seleYearOfExperirence = driver.findElement(By.id("select-menu"));
        Select select1 = new Select(seleYearOfExperirence);
        select1.selectByIndex(1);

         // just to get the seletect option value.
        List<WebElement> getSelect = select1.getAllSelectedOptions();
        System.out.println(getSelect.size());

        // pic a date
        WebElement getDateTable = driver.findElement(By.cssSelector("input#datepicker"));
        getDateTable.click();


        // get the date
        WebElement  todaysDate = driver.findElement(By.xpath("//*[@class=\"today\"]"));
        System.out.println(todaysDate.isDisplayed());
        String date = todaysDate.getText();
        System.out.println(date);

       WebElement Submit = driver.findElement(By.linkText("Submit"));
       Submit.click();



        WebElement h1 = new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.elementToBeClickable(By.tagName("h1")));
        // verify h1 tag is "Thanks for submitting your form" after submit
        driver.findElement(By.tagName("h1")).isDisplayed();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Complete Web Form");
        //assertThat(driver.findElement(By.tagName("h1")).getText(), is("Thanks for submitting your form"));


//      WebElement actual = driver.findElement(By.xpath("//div[@class=\"alert alert-success\"]"));
//       String getActual = actual.getText();
//      System.out.println(actual.getText());
//       String alertTitle = "The form was successfully submitted! ";
//       Assert.assertEquals(getActual, alertTitle, "The Form does not get submitted");



        // using assert first value is what to check  and second value what its is

    }

    @Test
    public void useCaseIteration(){

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
           System.out.println("This are the number of link object" + allLinks.size());

           // ilteration through all the links

                for (WebElement Link : allLinks) {
                    String url = Link.getText();
                    System.out.println(url);

                }
        }



    }

