package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormProject {

    @FindBy(id = "first-name")
    WebElement firstName;

    @FindBy(id ="logo")
    WebElement log;
}
