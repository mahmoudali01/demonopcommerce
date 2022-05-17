package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
 @When("^user click slider control \"(.*)\"$")
    public void enterSliderController(String num) throws InterruptedException {
     String er = page.inactiveSliderControlPom(num).getText();
     page.inactiveSliderControlPom(num).click();
     Thread.sleep(3000);

 }
   @Then("^user is switched to slider image \"(.*)\"$")
    public void switchSlider(String sliderImgNum){
//     String actual = page.activeSliderControlPom().getText();
//       Assert.assertEquals(actual.equals(sliderNum),true);
    //   String er = "https://demo.nopcommerce.com/images/thumbs/0000079_banner_1.jpg";
       String ar = page.firstSliderImagePom().getAttribute("src");
     System.out.println(ar);
      Assert.assertEquals(ar.equals(sliderImgNum),true);
   }

//    @When("user click slider image")
//    public void clickSlider()  {
//        page.shownSliderImagePom().click();
//
//    }
//    @Then("the page is refreshed")
//    public void pageRefresh() throws InterruptedException {
//        Thread.sleep(2000);
//
//        driver.quit();
//    }
//    @Then("^user is switched to slider number \"(.*)\"$")
//    public void switchSlider(String sliderNum) throws InterruptedException {
//        String er = "https://demo.nopcommerce.com/images/thumbs/0000079_banner_1.jpg";
//        String ar = page.shownSliderImagePom().getAttribute("src");
////       System.out.println(ar);
//        Assert.assertEquals(ar.equals(er),true);
//    }
}
