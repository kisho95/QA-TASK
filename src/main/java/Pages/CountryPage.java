package Pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static com.shaft.gui.element.ElementActions.click;

public class CountryPage {

    private WebDriver driver;
    public CountryPage(WebDriver driver){
        this.driver = driver;}


    private By planTitle = By
            .xpath("/html/body/div[1]/div[11]/div/div/div[1]/div/h2/b");


    private By liteselectbtn = By
            .id("liteSelection");

    private By litesectiontitle = By
            .id("lite");

    private By classicSectiontitle = By
            .id("classic");

    private By premiumSectiontitle = By
            .id("premium");

    public By getLiteselectbtn() {
        return liteselectbtn;
    }

    public CountryPage clickliteselectbtnBtn() {
        click(driver, liteselectbtn);
        return this;
    }

    public By getLiteSelctionBtn() {
        return liteselectbtn;
    }

    public By getLitesectiontitle() {
        return litesectiontitle;
    }

    public By getClassicSectiontitle() {
        return classicSectiontitle;
    }

    public By getPremiumSectiontitle() {
        return premiumSectiontitle;
    }

    public By getPlanTitle_text() {
        return planTitle;
    }

    public By getLiteCurrency() {
        return liteCurrency;
    }

    public By getClassicCurrency() {
        return classicCurrency;
    }

    public By getPremiumCurrency() {
        return premiumCurrency;
    }
    private By freeTrial = By
            .id("tier_feature_1");

    private By liteTrial = By
            .id("lite_tier");

    private By liteCurrency = By
            .xpath("/html/body/div[1]/div[11]/div/div/div[3]/div[2]/div[1]/div");

    private By classicCurrency = By
            .xpath("/html/body/div[1]/div[11]/div/div/div[3]/div[2]/div[2]/div");

    private By premiumCurrency = By
            .xpath("/html/body/div[1]/div[11]/div/div/div[3]/div[2]/div[3]/div");

    private By liteVideo = By
            .xpath("/html/body/div[1]/div[11]/div/div/div[6]/div[2]/div[1]/div");

    private By premiumVideo = By
            .xpath("/html/body/div[1]/div[11]/div/div/div[6]/div[2]/div[3]/div");

    private By classicVideo = By
            .xpath("/html/body/div[1]/div[11]/div/div/div[6]/div[2]/div[2]/div");


    public By getLiteVideo() {
        return liteVideo;
    }

    public By getClassicVideo() {
        return classicVideo;
    }

    public By getPremiumVideo() {
        return premiumVideo;
    }

    private By liteDeviceAccess = By
            .xpath("/html/body/div[1]/div[11]/div/div/div[7]/div[2]/div[1]/div");

    private By classicDeviceAccess = By
            .xpath("/html/body/div[1]/div[11]/div/div/div[7]/div[2]/div[2]/div");

    private By premiumVDeviceAccess = By
            .xpath("/html/body/div[1]/div[11]/div/div/div[7]/div[2]/div[3]/div");


    public By getLiteDeviceAccess() {
        return liteDeviceAccess;
    }

    public By getClassicDeviceAccess() {
        return classicDeviceAccess;
    }

    public By getPremiumDeviceAccess() {
        return premiumVDeviceAccess;
    }

    private By liteRewindContent = By
            .xpath("/html/body/div[1]/div[11]/div/div/div[8]/div[2]/div[1]/div");

    private By classicRewindContent = By
            .xpath("/html/body/div[1]/div[11]/div/div/div[8]/div[2]/div[2]/div");

    private By premiumRewindContent = By
            .xpath("/html/body/div[1]/div[11]/div/div/div[8]/div[2]/div[3]/div");

    private By AddonSection = By
            .id("addons-title");


    public By getAddonSection() {
        return AddonSection;    }

    public By getLiteRewindContent() {
       return liteRewindContent;    }

    public By getClassicRewindContent() {
        return classicRewindContent;
    }

    public By getPremiumRewindContent() {
        return premiumRewindContent;
    }

    public CountryPage() {

    }

    public CountryPage scrollToPlan() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//*[@id=\"lite_tierCurrency\"]")));
        return this;
    }

    public CountryPage validateAddon() {
        new ElementActions(driver).assertThat(AddonSection).exists().perform();
        return this;
    }



}
