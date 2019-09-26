package FaceBookPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FaceBookLoginForm{

    WebDriver driver;
    public FaceBookLoginForm(WebDriver driver){
        this.driver = driver;
    }

    private By emailInputField = By.xpath("//*[@id='email']");
    private By passwordInputField = By.xpath("//*[@id='pass']");
    private By loginButton = By.xpath("//*[@id='loginbutton']");

    public WebElement emailInputField() {
        return driver.findElement(emailInputField);
    }
    public WebElement passwordInputField() {
        return driver.findElement(passwordInputField);
    }
    public WebElement loginButton() {
        return driver.findElement(loginButton);
    }

    public void loginToFacebook(String email, String password) {
        emailInputField().sendKeys(email);
        passwordInputField().sendKeys(password);
        loginButton().click();
    }
}
