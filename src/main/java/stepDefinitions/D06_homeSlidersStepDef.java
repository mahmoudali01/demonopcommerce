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
 @When("^user click inactive slider control \"(.*)\"$")
    public void enterSliderController(String num) throws InterruptedException {
     String er = page.inactiveSliderControlPom(num).getText();
     System.out.println(er);

     page.inactiveSliderControlPom(num).click();
     Thread.sleep(500);
//     String ar = page.activeSliderControlPom().getText();
//     System.out.println(ar);
//     Assert.assertEquals(ar.equals(er),true);
     Thread.sleep(1000);

 }
//   @Then("^user is switched to slider number \"(.*)\"$")
//    public void switchSlider(String sliderNum){
//     String actual = page.selectedSliderControlPom().getText();
//       Assert.assertEquals(actual.equals(sliderNum),true);
//   }
    @When("^user click the other slider control \"(.*)\"$")
    public void enterOtherSlider(String num) throws InterruptedException {
        String er = page.inactiveSliderControlPom(num).getText();
        System.out.println(er);

        page.inactiveSliderControlPom(num).click();
        Thread.sleep(500);
//        String ar = page.activeSliderControlPom().getText();
//        System.out.println(ar);
//        Assert.assertEquals(ar.equals(er),true);
        Thread.sleep(1000);

    }
    @When("user click slider image")
    public void clickSlider()  {
        page.shownSliderImagePom().click();

    }
    @Then("the page is refreshed")
    public void pageRefresh() throws InterruptedException {
        Thread.sleep(2000);

        driver.quit();
    }
}
