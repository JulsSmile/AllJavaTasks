package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage{
    private WebDriver driver;

    private By inputField = By.xpath("//input[@name='q']");
    private By searchButton = By.xpath("//input[@name='btnK']");


    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
        this.driver.get("https://www.google.com");
    }
    public WebElement searchField(){
        return driver.findElement(inputField);
    }
public WebElement searchButton(){
        return driver.findElement(searchButton);
    }

}
