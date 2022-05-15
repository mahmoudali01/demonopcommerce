package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.P01_register;
import pages.P02_login;
import pages.P03_homePage;

public class D05_hoverCategoriesStepDef {
    WebDriver driver = null;
    P01_register register;
    P02_login login;
    P03_homePage page;

    @Given("browser is opened and navigated to home page")
    public void userNavigationToHomePage() throws InterruptedException {
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
        page =new P03_homePage(driver);
        login = new P02_login(driver);
        register = new P01_register(driver);
        Thread.sleep(1000);

    }

    @Then("user hover all categories")
    public void hoverAllCategories() throws InterruptedException {

        Actions actions = new Actions(driver);

        actions.moveToElement(page.computersCategoryPOM())
                .pause(java.time.Duration.ofSeconds(2)).perform();
        actions.moveToElement(page.electronicsCategoryPOM())
                .pause(java.time.Duration.ofSeconds(2)).perform();
        actions.moveToElement(page.apparelCategoryPOM())
                .pause(java.time.Duration.ofSeconds(2)).perform();
        actions.moveToElement(page.dDownloadsCategoryPOM())
                .pause(java.time.Duration.ofSeconds(2)).perform();
        actions.moveToElement(page.booksCategoryPOM())
                .pause(java.time.Duration.ofSeconds(2)).perform();
        actions.moveToElement(page.jewelryCategoryPOM())
                .pause(java.time.Duration.ofSeconds(2)).perform();
        actions.moveToElement(page.giftCategoryPOM())
                .pause(java.time.Duration.ofSeconds(2)).perform();




    }
    @And("click on all menu items")
    public void clickComputesCategory() throws InterruptedException {

      page.computersCategoryPOM().click();
        String acomputersUrl = driver.getCurrentUrl();
        String ecomputersUrl = "https://demo.nopcommerce.com/computers";
        Assert.assertEquals(acomputersUrl.contains(ecomputersUrl),true);
        Thread.sleep(1500);
        page.electronicsCategoryPOM().click();
        String aelectronicsUrl = driver.getCurrentUrl();
        String eElectronicsUrl = "https://demo.nopcommerce.com/electronics";
        Assert.assertEquals(aelectronicsUrl.contains(aelectronicsUrl),true);
        Thread.sleep(1500);
        page.apparelCategoryPOM().click();
        String aapparelUrl = driver.getCurrentUrl();
        String eapparelUrl = "https://demo.nopcommerce.com/apparel";
        Assert.assertEquals(aapparelUrl.contains(eapparelUrl),true);
        Thread.sleep(1500);
        page.dDownloadsCategoryPOM().click();
        String aDownloadsUrl = driver.getCurrentUrl();
        String eDownloadsUrl = "https://demo.nopcommerce.com/digital-downloads";
        Assert.assertEquals(aDownloadsUrl.contains(eDownloadsUrl),true);
        Thread.sleep(1500);
        page.booksCategoryPOM().click();
        String abooksUrl = driver.getCurrentUrl();
        String ebooksUrl = "https://demo.nopcommerce.com/books";
        Assert.assertEquals(abooksUrl.contains(ebooksUrl),true);
        Thread.sleep(1500);
        page.jewelryCategoryPOM().click();
        String ajewelryUrl = driver.getCurrentUrl();
        String ejewelryUrl = "https://demo.nopcommerce.com/jewelry";
        Assert.assertEquals(ajewelryUrl.contains(ejewelryUrl),true);
        Thread.sleep(1500);
        page.giftCategoryPOM().click();
        String agiftUrl = driver.getCurrentUrl();
        String egiftUrl = "https://demo.nopcommerce.com/gift-cards";
        Assert.assertEquals(agiftUrl.contains(egiftUrl),true);
        Thread.sleep(1500);
         driver.quit();

    }
    @When("user click on register button from header menu")
    public void clickRegisterMenuBTN() throws InterruptedException {
        register.registerMenuBTN().sendKeys(Keys.ENTER);
    }
    @And("^fill  form with \"(.*)\" \"(.*)\" \"(.*)\" \"(.*)\" \"(.*)\"$")
    public void register(String fname , String lname ,String email , String password ,String confirm) throws InterruptedException {
        register.regisrationSteps(fname, lname, email, password, confirm);
        Thread.sleep(2000);
    }

    @And("click REGISTER then click continue")
    public void registerAndContinue() throws InterruptedException {
        register.registerBTN().click();
        page.continueButtonPOM().click();
    }
    @When("user click on login button from header menu")
    public void clickLoginMenuBTN() throws InterruptedException {
        login.loginMenuBTN().click();
    }
    @And("^fill login form with \"(.*)\" \"(.*)\"$")
    public void login(String email ,String password) throws InterruptedException {
        login.loginSteps(email,password);
        Thread.sleep(2000);
    }

    @And("click Login")
    public void clickLoginBTN() throws InterruptedException {
        login.passElementPOM().sendKeys(Keys.ENTER);
    }

}
