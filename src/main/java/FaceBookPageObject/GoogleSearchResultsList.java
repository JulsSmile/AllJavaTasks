package FaceBookPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchResultsList{

    WebDriver driver;
    public GoogleSearchResultsList(WebDriver driver){
this.driver = driver;
    }
    private By facebookLink = By.xpath("//*[@id='rso']//a/h3/div");
    public WebElement getFaceBookLink() {
        return driver.findElement(facebookLink);
    }
}
