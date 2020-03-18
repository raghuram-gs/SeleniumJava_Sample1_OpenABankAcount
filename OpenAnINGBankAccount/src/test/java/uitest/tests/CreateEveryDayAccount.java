// Ranorex Webtestit Test File

package uitest.tests;

import uitest.TestNgTestBase;
import uitest.pageobjects.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

class CreateEveryDayAccount extends TestNgTestBase {
    @Test
    public void Test_EnteringDetailsForNewEveryDayAccountOfNewCustomer_AbleToEnterCustomerDetailsAndProceedButtonIsShown()
            throws InterruptedException {
        // 1. Arrange
        WebDriver driver = getDriver();
        driver.manage().window().maximize();

        IngHomePage ingHomePage = new IngHomePage(driver);
        ingHomePage.open();

        OrangeEveryDayPage orangeEveryDayPage = ingHomePage.clickOrangeEveryday();
        CustomerTypeSelectionPopUp popUp = orangeEveryDayPage.clickOpenNow();
        EveryDayNewAccountFormPage newAccountFormPage = popUp.clickNewCustomer();

        newAccountFormPage.selectSingle();
        newAccountFormPage.enterNationility("INDIA");
        newAccountFormPage.selectMrAsTitle();
        newAccountFormPage.enterFirstName("Raghu");
        newAccountFormPage.enterMiddleName("ram");
        newAccountFormPage.enterFamilyName("FamilyName");
        newAccountFormPage.selectMale();
        newAccountFormPage.enterDob("14/12/1984");
        newAccountFormPage.enterPlaceOfBirth("Bangalore");
        newAccountFormPage.enterCountryOfBirth("INDIA");
        newAccountFormPage.enterEmail("abc@gmail.com");
        newAccountFormPage.enterMobile("0418855338");
        newAccountFormPage.enterAddress("Unit 401a");
        newAccountFormPage.clickSameAsResidential();
        newAccountFormPage.clickThreeOrMoreYears();
        newAccountFormPage.clickYesForTaxPayerResidense();
        newAccountFormPage.typeIntoSecurityQuestion("Maiden");

        // 2. Act
        newAccountFormPage.clickContinueButton();

        Thread.sleep(5000);

        // 3. Assert
        Assert.assertTrue(newAccountFormPage.isProceedButtonVisible());
    }
}
