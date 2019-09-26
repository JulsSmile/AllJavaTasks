package FaceBookPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage{

    private WebDriver driver;
    private String BaseURL = "https://www.google.com";

//    public String getSearchText() {
//        return searchText;
//    }

    private By searchField = By.xpath("//input[@name='q']");
    private By firstSearcingResult = By.xpath("//*[@id='tsf']//li[1]");
    private By searchButton = By.xpath("//*[@class='gNO89b']");

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
        this.driver.get(BaseURL);
    }

    public WebElement getSearchField() {
        return driver.findElement(searchField);
    }

    public WebElement getSearchButton() {
        return driver.findElement(searchButton);
    }
    public void searchForText(String searchText){
        getSearchField().sendKeys(searchText);
//        getSearchButton().click();
        getSearchField().sendKeys(Keys.ENTER);
    }

}
