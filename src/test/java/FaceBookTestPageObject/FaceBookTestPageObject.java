package FaceBookTestPageObject;

import FaceBookPageObject.FaceBookLoginFailedPage;
import FaceBookPageObject.FaceBookLoginForm;
import FaceBookPageObject.GoogleSearchPage;
import FaceBookPageObject.GoogleSearchResultsList;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FaceBookTestPageObject{
    private String searchText = "Facebook";

    public static void main(String[] args) {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.getSearchField().click();
        googleSearchPage.searchForText("Facebook");

        GoogleSearchResultsList googleSearchResultsList = new GoogleSearchResultsList(driver);
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MICROSECONDS );
//       add waiter
        googleSearchResultsList.getFaceBookLink().click();
        driver.manage().timeouts().pageLoadTimeout(4000, TimeUnit.MILLISECONDS);
//add waiter
        FaceBookLoginForm faceBookLoginForm = new FaceBookLoginForm(driver);
        faceBookLoginForm.loginToFacebook("emailforfacebook@jgfd.com", "HardPass");

        FaceBookLoginFailedPage faceBookLoginFailedPage = new FaceBookLoginFailedPage(driver);
        WebElement message = faceBookLoginFailedPage.getErrorMessage();
        String errorMessageText = message.getText();

        if (errorMessageText.equals("Ви робите спроби занадто часто. Будь ласка, спробуйте пізніше.")) {
            System.out.println("TEST PASSED!");
        } else {
            System.out.println("TEST FAILED!\nActual text is: " + errorMessageText);
        }
        driver.close();
    }
}

