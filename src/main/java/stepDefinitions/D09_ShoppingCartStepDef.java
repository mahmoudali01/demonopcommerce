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
  @When("user scroll to featured products and click on first product")
  public void clickFeaturedFirstProduct() throws InterruptedException {
    cart.firstFeaturedProductPOM().click();
  }
  @Then("user is redirected to that product details page")
  public void redirectedToDetailsPage() throws InterruptedException {
    //cart.featuredProductBTNPOM().click();
    Thread.sleep(1500);

  }
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
  }
  @Then("the product is added successfully and navigate to home page")
  public void addedSuccessfully() throws InterruptedException {
    //cart.featuredProductBTNPOM().click();
    driver.navigate().to("https://demo.nopcommerce.com/");

    Thread.sleep(1500);

  }
  @When("user click on digital downloads from product category menu")
  public void clickDownloadsCategory() throws InterruptedException {
    page.dDownloadsCategoryPOM().click();
  }
  @And("click on first available product")
  public void downloadsFirstProduct() throws InterruptedException {
    cart.firstCategoryProductPOM().click();
  }
  @And("user select shopping cart")
  public void clickShoppingCartIconTopMenu() throws InterruptedException {
    cart.cartMenuBTNPOM().click();
    Thread.sleep(5000);
  }
  @And("added products is there and quit")
  public void checkAddedProductsAndQuit() throws InterruptedException {
     driver.quit();
  }



}
