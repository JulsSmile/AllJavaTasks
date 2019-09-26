package FaceBookTestPageObject;

import FaceBookPageObject.GoogleSearchPage;
import FaceBookPageObject.GoogleSearchResultsList;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookTestPageObject{

    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.getSearchField().click();
        googleSearchPage.searchForText("Facebook");

        GoogleSearchResultsList googleSearchResultsList = new GoogleSearchResultsList();


        googleSearchResultsList.getFaceBookLink().click();

    }

}