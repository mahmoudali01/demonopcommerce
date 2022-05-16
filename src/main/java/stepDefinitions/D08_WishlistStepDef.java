package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.P03_homePage;
import pages.P04_wishList;
import pages.P05_shoppingCart;

public class D08_WishlistStepDef {
    P03_homePage page;
    P05_shoppingCart cart;
    P04_wishList wishlist;
    WebDriver driver = null;

    @Given("browser open to home page")
    public void navigationToHome() throws InterruptedException {
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
        page =new P03_homePage(driver);
        cart = new P05_shoppingCart(driver);
        wishlist =new P04_wishList(driver);
        Thread.sleep(1000);
    }
    @When("^user scroll down to featured products and click \"(.*)\" product$")
    public void clickFeaturedProduct(String productName) throws InterruptedException {
        //cart.firstFeaturedProductPOM().click();
        String er = cart.locateProductPOM(productName).getAttribute("href");
        cart.locateProductPOM(productName).click();
        String ar = driver.getCurrentUrl();
        Assert.assertEquals(ar.equals(er),true);
        Thread.sleep(1500);
    }

    @And("user click on add to wishlist button from featured product details page")
    public void featuredProductDetailsPageAddWishlistBTN() throws InterruptedException {
        Select selectProcessor = new Select(cart.processorDDPOM());
        selectProcessor.selectByVisibleText("2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]");
        Thread.sleep(1500);
        Select selectRAM = new Select(cart.ramDDPOM());
        selectRAM.selectByVisibleText("8GB [+$60.00]");
        Thread.sleep(1500);
        cart.hddDDPOM().click();
        Thread.sleep(1000);
        wishlist.addToWishlistBTNPOM().click();
    }
    @Then("go back to home page")
    public void addedSuccessfully() throws InterruptedException {
//    String er = "The product has been added to your ";
//     String ar = cart.flashProductAddedPOM().getText();
//    System.out.println(ar);
//     Assert.assertEquals(ar.contains(er),true);
        driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(1500);
    }
    @When("user click on digital downloads from product category top menu")
    public void clickDownloadsProductCategory() throws InterruptedException {
        page.dDownloadsCategoryPOM().click();
    }
    @And("user click on add to wishlist button from category product details page")
    public void categoryProductDetailsPageAddWishlisttBTN() throws InterruptedException {
        wishlist.addToWishlistBTNPOM().click();
        //    String er = "The product has been added to your ";
//     String ar = cart.flashProductAddedPOM().getText();
//    System.out.println(ar);
//     Assert.assertEquals(ar.contains(er),true);
        Thread.sleep(500);

    }

    @And("^click on \"(.*)\" product$")
    public void downloadsChoosenProduct(String productName) throws InterruptedException {
        // cart.firstCategoryProductPOM().click();
        //cart.locateProductPOM(productName).click();
        String er = cart.locateProductPOM(productName).getAttribute("href");
        cart.locateProductPOM(productName).click();
        String ar = driver.getCurrentUrl();
        Assert.assertEquals(ar.equals(er),true);
        Thread.sleep(1500);
    }

    @And("user select wishlist")
    public void clickAddWishlistIconTopMenu() throws InterruptedException {
        wishlist.wishlistMenuBTNPOM().click();
        Thread.sleep(5000);
    }
    @And("^check \"(.*)\" and \"(.*)\"  products are added to wish list and quit$")
    public void checkProductsAndQuit(String product1, String product2) throws InterruptedException {
        String ar1 = wishlist.locateWishlistItems(product1).getText();
        String ar2 =  wishlist.locateWishlistItems(product2).getText();
        Assert.assertEquals(ar1.equals(product1),true);
        Assert.assertEquals(ar2.equals(product2),true);
        Thread.sleep(1000);
        driver.quit();
    }


}
