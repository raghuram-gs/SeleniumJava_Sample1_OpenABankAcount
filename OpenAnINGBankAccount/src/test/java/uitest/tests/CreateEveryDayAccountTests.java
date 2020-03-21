// Ranorex Webtestit Test File

package uitest.tests;

import uitest.TestNgTestBase;
import uitest.pageobjects.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

class CreateEveryDayAccountTests extends TestNgTestBase {
    @Test
    public void Test_EnteringDetailsForNewEveryDayAccountOfNewCustomer_AbleToEnterCustomerDetailsAndProceedButtonIsShown(){
        // 1. Arrange
        WebDriver driver = getDriver();
        driver.manage().window().maximize();

        IngHomePage ingHomePage = new IngHomePage(driver);
        ingHomePage.open();

        OrangeEveryDayPage orangeEveryDayPage = ingHomePage.clickOrangeEveryday();
        CustomerTypeSelectionPopUp popUp = orangeEveryDayPage.clickOpenNow();
        EveryDayNewAccountFormPage newAccountFormPage = popUp.clickNewCustomer();

        newAccountFormPage.selectSingle().enterNationility("INDIA").selectMrAsTitle().enterFirstName("Raghu")
                .enterMiddleName("ram").enterFamilyName("FamilyName").selectMale().enterDob("14/12/1984")
                .enterPlaceOfBirth("Bangalore").enterCountryOfBirth("INDIA").enterEmail("abc@gmail.com")
                .enterMobile("0418855338").enterAddress("Unit 401a").clickSameAsResidential().clickThreeOrMoreYears()
                .clickYesForTaxPayerResidense().typeIntoSecurityQuestion("Maiden");

        // 2. Act
        newAccountFormPage.clickContinueButton();

        // 3. Assert
        Assert.assertTrue(newAccountFormPage.isProceedButtonVisible());
    }
}
