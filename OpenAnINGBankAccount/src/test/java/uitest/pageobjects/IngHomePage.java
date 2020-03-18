// Ranorex Webtestit Page Object File

package uitest.pageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class IngHomePage {
    // Additional data:
    // {"img":"screenshots/11b8bd67-8743-a6e0-6a2a-c33c9227eef0.png"}
    private By orangeEveryday = By
            .xpath("/html//div[@id='home-bank-and-save']//a[@href='/everyday-banking.html']/p[.='Orange Everyday']");

    protected WebDriver driver;
    protected WebDriverWait wait;

    public IngHomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void open() {
        this.driver.get("https://www.ing.com.au/");
    }

    public OrangeEveryDayPage clickOrangeEveryday() {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.orangeEveryday)).click();
        return new OrangeEveryDayPage(driver);
    }
}
