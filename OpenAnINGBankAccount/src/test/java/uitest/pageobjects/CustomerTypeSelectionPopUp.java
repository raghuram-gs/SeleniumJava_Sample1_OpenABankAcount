// Ranorex Webtestit Page Object File

package uitest.pageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class CustomerTypeSelectionPopUp {
    private By newCustomer = By.cssSelector("a[title='New customer']");

    protected WebDriver driver;
    protected WebDriverWait wait;

    public CustomerTypeSelectionPopUp(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public EveryDayNewAccountFormPage clickNewCustomer() {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.newCustomer)).click();

        return new EveryDayNewAccountFormPage(driver);
    }
}
