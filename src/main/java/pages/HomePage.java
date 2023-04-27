package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    //Variables
    @FindBy(xpath = "xpath")
    private WebElement signInButton;

    @FindBy(linkText = "visible text")
    private WebElement imag;

    @FindBy(name = "object name")
    private WebElement field;

    @FindBy(xpath = "//a[@class='HeaderMenu-link no-underline mr-3']")
    private WebElement signInBtn;

    // Constructor later



    //Methods
    public void clickSignInButton() {
        signInButton.click();
    }
}
