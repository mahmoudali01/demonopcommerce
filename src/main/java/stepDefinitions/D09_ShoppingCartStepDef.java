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
import pages.P05_shoppingCart;

import java.util.ArrayList;

public class D09_ShoppingCartStepDef {
  P03_homePage page;
  P05_shoppingCart cart;
  WebDriver driver = null;
public static String count = "";
  @Given("browser navigated to home page")
  public void navigationToHome() throws InterruptedException {
    String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", chromePath);
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://demo.nopcommerce.com/");
    page =new P03_homePage(driver);
    cart = new P05_shoppingCart(driver);
    Thread.sleep(1000);
  }
  @When("^user scroll to featured products and click \"(.*)\" product$")
  public void clickFeaturedFirstProduct(String productName) throws InterruptedException {
    //cart.firstFeaturedProductPOM().click();
    String er = cart.locateProductPOM(productName).getAttribute("href");
    cart.locateProductPOM(productName).click();
    String ar = driver.getCurrentUrl();
    Assert.assertEquals(ar.equals(er),true);
    Thread.sleep(1500);
  }
//  @Then("user is redirected to that product details page")
//  public void redirectedToDetailsPage() throws InterruptedException {
//    //cart.featuredProductBTNPOM().click();
//    String er = cart.locateProductPOM().getAttribute("href");
//    String ar = driver.getCurrentUrl();
//   Assert.assertEquals(ar.equals(er),true);
//    Thread.sleep(1500);
//
//  }
  @And("user click on add to cart button from featured product details page")
  public void featuredProductDetailsPageAddCartBTN() throws InterruptedException {
    Select selectProcessor = new Select(cart.processorDDPOM());
    selectProcessor.selectByVisibleText("2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]");
    Thread.sleep(1500);

      Select selectRAM = new Select(cart.ramDDPOM());
    selectRAM.selectByVisibleText("8GB [+$60.00]");
    Thread.sleep(1500);
    cart.hddDDPOM().click();
    Thread.sleep(1500);

   cart.clickedProductAddToCartBTNPOM().click();
  }
  @And("user click on add to cart button from category product details page")
  public void categoryProductDetailsPageAddCartBTN() throws InterruptedException {
    cart.clickedProductAddToCartBTNPOM().click();
    //    String er = "The product has been added to your ";
//     String ar = cart.flashProductAddedPOM().getText();
//    System.out.println(ar);
//     Assert.assertEquals(ar.contains(er),true);
    Thread.sleep(500);

  }
  @Then("navigate to home page")
  public void addedSuccessfully() throws InterruptedException {
//    String er = "The product has been added to your ";
//     String ar = cart.flashProductAddedPOM().getText();
//    System.out.println(ar);
//     Assert.assertEquals(ar.contains(er),true);
    driver.navigate().to("https://demo.nopcommerce.com/");
    Thread.sleep(1500);
  }
  @When("user click on digital downloads from product category menu")
  public void clickDownloadsCategory() throws InterruptedException {
    page.dDownloadsCategoryPOM().click();
  }
  @And("^click \"(.*)\" product$")
  public void downloadsFirstProduct(String productName) throws InterruptedException {
   // cart.firstCategoryProductPOM().click();
    //cart.locateProductPOM(productName).click();
    String er = cart.locateProductPOM(productName).getAttribute("href");
    cart.locateProductPOM(productName).click();
    String ar = driver.getCurrentUrl();
    Assert.assertEquals(ar.equals(er),true);
    Thread.sleep(1500);
  }
  @And("user select shopping cart")
  public void clickShoppingCartIconTopMenu() throws InterruptedException {
    cart.cartMenuBTNPOM().click();
    Thread.sleep(5000);
  }
  @And("^check \"(.*)\" and \"(.*)\"  products are added and quit$")
  public void checkAddedProductsAndQuit(String product1, String product2) throws InterruptedException {
    String ar1 = cart.locateProductPOM(product1).getText();
    String ar2 =  cart.locateProductPOM(product2).getText();
    Assert.assertEquals(ar1.equals(product1),true);
    Assert.assertEquals(ar2.equals(product2),true);
    Thread.sleep(1000);
    driver.quit();
  }



}
