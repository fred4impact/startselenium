package project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    // element like vairable
    // username field
     //password field
    // login button
    // logo

    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(className = "login_logo")
    private WebElement log;

    //error message
    @FindBy(className = "error-button")
    private WebElement errorMessage;

  // Constroctor()
    public LoginPage(){
        // driver go in the pagefactory
    }



   // create method login
   public void clickLoginButton(){
       loginButton.click();
   }


    public void setUsername(){
        username.clear();
        username.sendKeys("standard_user");
    }



}
