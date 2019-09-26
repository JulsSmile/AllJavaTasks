package FaceBookPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FaceBookLoginForm{

    WebDriver driver;

    private By emailInputField = By.xpath("//*[@id='email']");
    private By passwordInputField = By.xpath("//*[@id='pass']");
    private By loginButton = By.xpath("//*[@id='loginbutton']");


}
