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
P03_homePage page=new P03_homePage();


 @When("^user click slider control \"(.*)\"$")
    public void enterSliderController(String num) throws InterruptedException {
     String er = page.selectedSliderControlPom(num).getText();
     System.out.println(er);
     page.selectedSliderControlPom(num).click();
     Thread.sleep(200);

 }
   @Then("^user is switched to slider image \"(.*)\"$")
    public void switchSlider(String sliderImg){

       String ar = page.shownImgPom().getAttribute("src");
     System.out.println(ar);
      Assert.assertEquals(sliderImg.equals(ar),true);
   }
//    @Then("^user is switched to second slider image \"(.*)\"$")
//    public void switchsecondSlider(String sliderImgNum){
//        String test = page.shownImgPom().getAttribute("src");
//        System.out.println(test);
//        String ar = page.secondSliderImagePom().getAttribute("src");
//        System.out.println(ar);
//        Assert.assertEquals(test.equals(sliderImgNum),true);
//    }


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
