package Pages;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.shaft.gui.element.ElementActions.click;

public class landingPage {
    private String url = System.getProperty("baseUrl");
    private WebDriver driver;

    public landingPage(WebDriver driver) {
        this.driver = driver;
        BrowserActions.navigateToURL(driver, url);
    }

    public By TransalationBtn = By.id("translation-btn");

    public By getTransalationBtn() {
        return TransalationBtn;
    }

    public By Logo = By.id("jawwy-logo-web");

    public By getLogo() {
        return Logo;
    }


    public By planTitle = By.id("plan-title");

    public By getPlanTitle() {
        return planTitle;
    }

    private By countryTab = By.id("country-name");

    public By getCountryTab() {
        return countryTab;
    }

    public By saudiFlag = By.id("sa-contry-flag");

    public By getSaudiFlag() {
        return saudiFlag;
    }

    public By bahrainFlag = By.id("bh-contry-flag");

    public By getBahrainFlag() {
        return bahrainFlag;
    }

    public By kuwaitFlag = By.id("kw-contry-flag");

    public By getKuwaitFlagS() {
        return kuwaitFlag;
    }

    public By supportBtn = By.xpath("//*[@id=\"Embed\"]/div/div/button");

    public By getSupportBtn() {
        return supportBtn;
    }

    public By FAQfooter = By.xpath("//*[@id=\"links_group\"]/li[2]/a");

    public By getFAQfooter() {
        return FAQfooter;
    }

    public By TermsAndConditions = By.xpath("//*[@id=\"links_group\"]/li[3]/a");

    public By getTermsAndConditions() {
        return TermsAndConditions;
    }

    public By privacyPolicy = By.xpath("//*[@id=\"links_group\"]/li[4]/a");

    public By getprivacyPolicy() {
        return privacyPolicy;
    }

    public By AboutUS = By.xpath("//*[@id=\"links_group\"]/li[5]/a");

    public By getAboutUS() {
        return AboutUS;
    }

    public By contactUS = By.xpath("//*[@id=\"links_group\"]/li[6]/a");

    public By getcontactUS() {
        return contactUS;
    }

    public By vatRegistrationCertificate = By.xpath("//*[@id=\"links_group\"]/li[7]/a");

    public By getvatRegistrationCertificate() {
        return vatRegistrationCertificate;
    }

    public landingPage clickTransalationBtn() {
        click(driver, TransalationBtn);
        return this;
    }

    public landingPage clickCountryBtn() {
        click(driver, countryTab);
        return this;
    }

    public landingPage clickOnBahrain() {
        click(driver, bahrainFlag);
        return this;
    }

    public landingPage clickOnSaudiArabia() {
        click(driver, saudiFlag);
        return this;
    }

    public landingPage checkFooter() {
        new ElementActions(driver).assertThat(Logo).exists().perform();
        new ElementActions(driver).assertThat(TermsAndConditions).isVisible().perform();
        new ElementActions(driver).assertThat(contactUS).isVisible().perform();
        new ElementActions(driver).assertThat(AboutUS).isVisible().perform();
        new ElementActions(driver).assertThat(privacyPolicy).isVisible().perform();
        new ElementActions(driver).assertThat(vatRegistrationCertificate).isVisible().perform();
        new ElementActions(driver).assertThat(FAQfooter).isVisible().perform();
        return this;
    }

    public landingPage OpenBahrainPage() {
        new ElementActions(driver).click(TransalationBtn).click(countryTab).click(bahrainFlag);

        return this;
    }

    public landingPage OpenKuwaitPage() {
        new ElementActions(driver).click(TransalationBtn).click(countryTab).click(kuwaitFlag);

        return this;
    }

    public landingPage clickOnKuwait() {
        click(driver, kuwaitFlag);
        return this;
    }


}
