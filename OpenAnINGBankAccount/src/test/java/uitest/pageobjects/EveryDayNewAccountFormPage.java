// Ranorex Webtestit Page Object File

package uitest.pageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class EveryDayNewAccountFormPage {

    private By firstName = By.cssSelector("ing-input#firstName ing-field#coreField > input#inputField");
    private By middleName = By.cssSelector("ing-input#middleName ing-field#coreField > input#inputField");
    private By nationality = By.cssSelector(
            "#apply-form-edit [class='layout-3 layout-3-alt style-scope ing-join-apply-about-you-edit x-scope ing-layout-0']:nth-child(2) [is='iron-input']");
    private By firstOfNationality = By.cssSelector("div > paper-item:nth-of-type(1)");
    private By title = By.cssSelector("input#titleDropdown_targetInput");
    private By mr = By.cssSelector(
            "[class] [role='option']:nth-of-type(1) .ing-join-apply-about-you-edit .ing-join-apply-about-you-edit .ing-join-apply-about-you-edit div");
    private By familyName = By
            .xpath("//ing-input[@id='surName']//ing-input-validator[@id='validator']//input[@id='inputField']");
    private By dateOfBirth = By
            .xpath("//ing-input[@id='desktopInput']//ing-input-validator[@id='validator']//input[@id='inputField']");
    private By placeOfBirth = By
            .xpath("//ing-input[@id='placeOfBirth']//ing-input-validator[@id='validator']//input[@id='inputField']");
    // Additional data:
    // {"img":"screenshots/f48e93dc-1849-e6d0-8e77-e843bf0df886.png"}
    private By countryOfBirth = By.xpath(
            "//ing-input-auto-complete[@id='countryOfBirthAutoComplete']//ing-input[@id='inputField']//ing-input-validator[@id='validator']//input[@id='inputField']");
    // Additional data:
    // {"img":"screenshots/61614999-2b93-3818-d216-4a95b7bfbc34.png"}
    private By countryOfBirthFirstElement = By.xpath(
            "//ing-input-auto-complete[@id='countryOfBirthAutoComplete']//paper-dialog[@id='drop']/paper-menu[@id='dropMenuItem']//paper-item[@role='menuitem']");
    // Additional data:
    // {"img":"screenshots/da18a296-979b-efcb-0592-109f812d9505.png"}
    private By emailAddress = By
            .xpath("//ing-input[@id='emailAddress']//ing-input-validator[@id='validator']//input[@id='inputField']");
    // Additional data:
    // {"img":"screenshots/adbec706-6ff8-eb5f-1a87-2b89aea4f463.png"}
    private By mobile = By.xpath(
            "//ing-input[@id='mobilePhoneInput']//ing-input-validator[@id='validator']//input[@id='inputField']");
    // Additional data:
    // {"img":"screenshots/61ab82db-68db-0554-8ffc-e2076e0cf769.png"}
    private By address = By.cssSelector(
            "#residentialAddress [class='layout-3 address-container style-scope ing-structured-address x-scope ing-layout-0'] input");
    // Additional data:
    // {"img":"screenshots/8416f7c1-44ab-a636-8d17-e963e53e7bc0.png"}
    private By sameAsResidential = By
            .cssSelector("#template-checkbox-sameAsResidential .checkbox-label.style-scope.ing-checkbox");
    // Additional data:
    // {"img":"screenshots/38e444fb-9c47-4599-5b99-200392312e29.png"}
    private By threeOrMoreYears = By
            .cssSelector("#timeAtAddress fieldset > .radio.style-scope.ing-time-current-address:nth-child(3) label");
    // Additional data:
    // {"img":"screenshots/b0e9c2cd-b2db-feb7-d0eb-88691b0a1b72.png"}
    private By securityQuestion = By
            .cssSelector("ing-input#securityQuestion  ing-input-validator#validator  input#inputField");
    // Additional data:
    // {"img":"screenshots/df7d374e-03de-d02b-f3a4-cf82be7a9d21.png"}
    private By continueButton = By.cssSelector("button#continueButton");
    // Additional data:
    // {"img":"screenshots/ca66b47b-c3b8-1774-74b7-d33bccd37b14.png"}
    private By proceedButton = By.cssSelector("button#proceedButton");
    // Additional data:
    // {"img":"screenshots/157b7b2f-c26a-6468-18fb-eef2aefe89a1.png"}
    private By male = By.cssSelector(
            "#genderField fieldset > .radio.gender.style-scope.ing-join-apply-about-you-edit:nth-child(4) label");
    // Additional data:
    // {"img":"screenshots/766393a8-6da5-5115-ca34-0f140ab4d780.png"}
    private By yes = By.cssSelector(
            "#taxResidencyField fieldset > .radio.taxResidency.style-scope.ing-join-apply-about-you-edit:nth-child(3) label");
    // Additional data:
    // {"img":"screenshots/da6e65cd-1fc1-88dd-6626-302738b2aece.png"}
    private By single = By.cssSelector("[for='singleOrJointButtons-0']");
    // Additional data:
    // {"img":"screenshots/2e8f90bb-e443-f0b2-289f-db96c662c56a.png"}
    private By firstAddressItem = By.cssSelector(
            "ing-input-auto-complete#autoCompleteStreet paper-dialog#drop > paper-menu#dropMenuItem > div > paper-item:nth-of-type(1)");
    // private By singleRadio = By.id("singleOrJointButtons-0");

    protected WebDriver driver;
    protected WebDriverWait wait;

    public EveryDayNewAccountFormPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void selectSingle() {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.single)).click();
    }

    public void enterFirstName(String text) {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.firstName)).sendKeys(text);
    }

    public void selectMale() {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.male)).click();
    }

    public void clickYesForTaxPayerResidense() {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.yes)).click();
    }

    public void enterMiddleName(String text) {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.middleName)).sendKeys(text);
    }

    public void enterNationility(String text) {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.nationality)).sendKeys(text);
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.firstOfNationality)).click();
    }

    public void selectMrAsTitle() {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.title)).click();
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.mr)).click();
    }

    public void enterFamilyName(String text) {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.familyName)).sendKeys(text);
    }

    public void enterDob(String text) {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.dateOfBirth)).sendKeys(text);
    }

    public void enterPlaceOfBirth(String text) {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.placeOfBirth)).sendKeys(text);
    }

    public void enterCountryOfBirth(String text) {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.countryOfBirth)).sendKeys(text);
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.countryOfBirthFirstElement)).click();
    }

    public void enterEmail(String text) {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.emailAddress)).sendKeys(text);
    }

    public void enterMobile(String text) {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.mobile)).sendKeys(text);
    }

    public void enterAddress(String text) {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.address)).sendKeys(text);
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.firstAddressItem)).click();
    }

    public void clickSameAsResidential() {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.sameAsResidential)).click();
    }

    public void clickThreeOrMoreYears() {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.threeOrMoreYears)).click();
    }

    public void typeIntoSecurityQuestion(String text) {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.securityQuestion)).sendKeys(text);
    }

    public void clickContinueButton() {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(this.continueButton)).click();
    }

    public Boolean isProceedButtonPresent() {
        Boolean proceedButtonIsPresent = driver.findElements(this.proceedButton).size() > 0;
        return proceedButtonIsPresent;
    }

    public Boolean isProceedButtonVisible() {
        scrollToProceedButton();
        Boolean proceedButtonIsVisible = this.wait
                .until(ExpectedConditions.visibilityOfElementLocated(this.proceedButton)).isDisplayed();

        return proceedButtonIsVisible;
    }

    public EveryDayNewAccountFormPage scrollToProceedButton() {
        WebElement proceedButtonElement = this.wait
                .until(ExpectedConditions.visibilityOfElementLocated(this.proceedButton));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", proceedButtonElement);

        return this;
    }

}
