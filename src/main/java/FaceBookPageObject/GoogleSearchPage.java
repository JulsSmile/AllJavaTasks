package FaceBookPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage{

        private WebDriver driver;
        private String BaseURL = "https://www.google.com";
    private By searchField = By.xpath("//input[@name='q']");
    private By firstSearcingResult = By.xpath("//*[@id='tsf']//li[1]");

    public GoogleSearchPage (WebDriver driver){
            this.driver = driver;
            this.driver.get(BaseURL);
        }
    }
