// Ranorex Webtestit Page Object File

package uitest.pageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class OrangeEveryDayPage {

    private By openNow = By.xpath("/html/body//section[@class='ING-body']/div[2]/div/a[@href='#applyNow']");
    protected WebDriver driver;
    protected WebDriverWait wait;

    public OrangeEveryDayPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public CustomerTypeSelectionPopUp clickOpenNow() {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.openNow)).click();
        return new CustomerTypeSelectionPopUp(driver);
    }
}
