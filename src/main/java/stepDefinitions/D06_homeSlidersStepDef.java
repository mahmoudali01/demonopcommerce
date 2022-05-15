package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.P01_register;
import pages.P02_login;
import pages.P03_homePage;

public class D06_homeSlidersStepDef {
P03_homePage page;
WebDriver driver = null;

@Given("browser opened and in home page")
    public void navigationToHome() throws InterruptedException {
    String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", chromePath);
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://demo.nopcommerce.com/");
    page =new P03_homePage(driver);
    Thread.sleep(1000);
}
 @When("user enter slider control")
    public void enterSliderController() throws InterruptedException {
    page.sliderControlPom().click();
     Thread.sleep(1000);

 }
//   @Then("user is switched to that slider")
//    public void switchSlider(){
//     page.sliderControlPom().click();
//   }
    @When("user enter the other slider control")
    public void enterOtherSlider() throws InterruptedException {
        page.sliderControlPom().click();
        Thread.sleep(1000);

    }
    @When("user click slider")
    public void clickSlider()  {
        page.shownSliderImagePom().click();

    }
    @Then("the page is refreshed")
    public void pageRefresh() throws InterruptedException {
        Thread.sleep(2000);

        driver.quit();
    }
}
