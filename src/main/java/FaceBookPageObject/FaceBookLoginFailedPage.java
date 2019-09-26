package FaceBookPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FaceBookLoginFailedPage{
    WebDriver driver;
    public FaceBookLoginFailedPage(WebDriver driver){
        this.driver = driver;
    }
    private By errorMessage = By.xpath("//*[@id='error_box']/div[2]");
    public WebElement getErrorMessage() {
        return driver.findElement(errorMessage);
    }
}
