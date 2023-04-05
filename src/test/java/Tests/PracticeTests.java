package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;

public class PracticeTests  extends seleniumBasics.SeleniumPracticeBase {
  public  String linkUrl = "";

    @Test(testName = "Test to ilterate through multiple objects")
    public void getMultipleObjectTest(){


       List<WebElement> multiLinks = driver.findElements(By.tagName("a"));
       System.out.println("The count of the links on page is:" + multiLinks.size());

        for (WebElement multiLink : multiLinks) {
            linkUrl = multiLink.getText();
            System.out.println(linkUrl);
        }


    }

     @Test(testName = "Return All Links on the Page Test")
     public void checkAllLinksOnThePage(){
         List<WebElement> multiLinks = driver.findElements(By.tagName("a"));
         System.out.println("The count of the links on page is:" + multiLinks.size());

         for(int i=0; i < multiLinks.size(); i++){
             WebElement element = multiLinks.get(i);
             linkUrl = element.getAttribute("href");
             validateLinkURL(linkUrl);
         }

     }

    private void validateLinkURL(String linkUrl) {
    }


}
