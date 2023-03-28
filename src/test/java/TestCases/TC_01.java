package TestCases;

import Pages.*;
import com.shaft.driver.DriverFactory;

import com.shaft.tools.io.JSONFileManager;
import com.shaft.validation.Validations;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.shaft.driver.DriverFactory.getDriver;

public class TC_01 {
    private WebDriver driver;
    private JSONFileManager TestData;
    private String PlanTitleTxt;


    @BeforeClass
    public void beforeClass() {
        driver = DriverFactory.getDriver();
        TestData = new JSONFileManager(System.getProperty("testDataFolderPath") + "TestData.json");
    }

    @Test
    public void navigateToBahrainPage() {
        var openBahrainPage = new landingPage(driver).OpenBahrainPage().checkFooter();
    }

    @Test(dependsOnMethods = "navigateToBahrainPage")
    public void assertLitePlanSection() {

        var plantitle = new CountryPage(driver).getPlanTitle_text();
        Validations.assertThat().element(driver, plantitle).isVisible();

        var LiteSectionTitle = new CountryPage(driver).getLitesectiontitle();
        Validations.assertThat().element(driver, LiteSectionTitle).exists().perform();
        Validations.assertThat().element(driver, LiteSectionTitle).text().equals(TestData.getTestData("LitePackage.Title"));


        var LiteSectionBtn = new CountryPage(driver).getLiteselectbtn();
        Validations.assertThat().element(driver, LiteSectionBtn).exists().perform();
        Validations.assertThat().element(driver, LiteSectionBtn).text().equals(TestData.getTestData("LitePackage.Button"));

        var LiteSelectnBtn = new CountryPage(driver).getLiteselectbtn();
        Validations.assertThat().element(driver, LiteSelectnBtn).exists().perform();
    }


    @Test(dependsOnMethods = "assertLitePlanSection")
    public void assertClassicPlanSection() {
        var ClassicSectionTitle = new CountryPage(driver).getClassicSectiontitle();
        Validations.assertThat().element(driver, ClassicSectionTitle).exists().perform();
        Validations.assertThat().element(driver, ClassicSectionTitle).text().equals(TestData.getTestData("ClassicPackage.Title"));
    }

    @Test(dependsOnMethods = "assertClassicPlanSection")
    public void assertPremiumPlanSection() {
        var PremiumSectiontitle = new CountryPage(driver).getPremiumSectiontitle();
        Validations.assertThat().element(driver, PremiumSectiontitle).exists().perform();
        Validations.assertThat().element(driver, PremiumSectiontitle).text().equals(TestData.getTestData("PremiumPackage.Title"));


    }

    @Test(dependsOnMethods = "assertClassicPlanSection")
    public void validateCurrency() {

        var liteCurrency = new CountryPage(driver).getLiteCurrency();
        Validations.assertThat().element(driver, liteCurrency).text().contains(TestData.getTestData("LitePackage.BahrainCurrency")).perform();

        var classicCurrency = new CountryPage(driver).getClassicCurrency();
        Validations.assertThat().element(driver, classicCurrency).text().contains(TestData.getTestData("ClassicPackage.BahrainCurrency")).perform();

        var premiumCurrency = new CountryPage(driver).getPremiumCurrency();
        Validations.assertThat().element(driver, premiumCurrency).text().contains(TestData.getTestData("PremiumPackage.BahrainCurrency")).perform();


    }
    
    @Test(dependsOnMethods = "validateCurrency")
    public void validateVideoQuality() {

        var liteVideoQuality = new CountryPage(driver).getLiteVideo();
        Validations.assertThat().element(driver, liteVideoQuality).text().contains (TestData.getTestData("LitePackage.VideoQuality")).perform();

        var classicVideoQuality = new CountryPage(driver).getClassicVideo();
        Validations.assertThat().element(driver, classicVideoQuality).text().contains(TestData.getTestData("ClassicPackage.VideoQuality")).perform();

        var premiumVideoQuality = new CountryPage(driver).getPremiumVideo();
        Validations.assertThat().element(driver, premiumVideoQuality).text().contains(TestData.getTestData("PremiumPackage.VideoQuality")).perform();


    }

    @Test(dependsOnMethods = "validateVideoQuality")
    public void validateDeviceAccess() {

        var liteDeviceAccess = new CountryPage(driver).getLiteDeviceAccess();
        Validations.assertThat().element(driver, liteDeviceAccess).text().contains(TestData.getTestData("LitePackage.DeviceAccess")).perform();

        var classicDeviceAccess = new CountryPage(driver).getClassicDeviceAccess();
        Validations.assertThat().element(driver, classicDeviceAccess).text().contains(TestData.getTestData("ClassicPackage.DeviceAccess")).perform();

        var premiumDeviceAccess = new CountryPage(driver).getPremiumDeviceAccess();
        Validations.assertThat().element(driver, premiumDeviceAccess).text().contains(TestData.getTestData("PremiumPackage.DeviceAccess")).perform();


    }

    @Test(dependsOnMethods = "validateDeviceAccess")
    public void validateRewindContent() {

        var liteRewindContent = new CountryPage(driver).getLiteRewindContent();
        Validations.assertThat().element(driver, liteRewindContent).text().contains(TestData.getTestData("LitePackage.RewindContent")).perform();

        var classicRewindContent = new CountryPage(driver).getClassicRewindContent();
        Validations.assertThat().element(driver, classicRewindContent).text().contains(TestData.getTestData("ClassicPackage.RewindContent")).perform();

        var premiumRewindContent = new CountryPage(driver).getPremiumRewindContent();
        Validations.assertThat().element(driver, premiumRewindContent).text().contains(TestData.getTestData("PremiumPackage.RewindContent")).perform();


    }
    @Test(dependsOnMethods = "validateRewindContent")
    public void validateAddON() {
        var validateAddonSection = new CountryPage(driver).validateAddon();
    }
}
