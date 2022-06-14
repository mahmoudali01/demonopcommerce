package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.P01_register;
import pages.P02_login;
import pages.P03_homePage;

public class D04_searchStepDef {
    P03_homePage  page =new P03_homePage();
    P02_login login = new P02_login();
    P01_register register = new P01_register();



    @When("^user enter invalid product name as \"(.*)\"$")
    public void searchInvalidProduct(String name) throws InterruptedException {
        page.searchProduct(name);
        Thread.sleep(2000);
    }
    @Then("user is redirected to a page with no products")
    public void redirectionToEmptyPage() throws InterruptedException {
        String er = "No products were found that matched your criteria.";
        String ar = page.noSearchResultPom().getText();
        System.out.println(ar);

        Assert.assertEquals(ar.contains(er),true);
//        driver.navigate().to("https://demo.nopcommerce.com/");

        Thread.sleep(2000);
    }

    @When("^enter valid product full name as \"(.*)\" and click enter$")
    public void searchProduct(String name) throws InterruptedException {
        page.searchProduct(name);
        Thread.sleep(2000);
    }
    @Then("^user is redirected to a page contains \"(.*)\" product$")
    public void checkTheSearchedProductReturned(String searched) throws InterruptedException {
        String er = "Apple MacBook Pro 13-inch";
        String ar = page.searchedProductPom(searched).getText();
        System.out.println(ar);
        Assert.assertEquals(ar.contains(searched),true);
        Thread.sleep(2000);

    }
    @When("^enter valid product partial name as \"(.*)\" and click enter$")
    public void searchProductPartial(String name) throws InterruptedException {
        page.searchProduct(name);
        Thread.sleep(2000);

    }
    @When("^enter SKU: \"(.*)\" and click enter$")
    public void searchProductSKU(String sku) throws InterruptedException {
        page.searchProduct(sku);
        Thread.sleep(2000);

    }
    @When("choose register from header")
    public void clickRegisterMenuBTN() throws InterruptedException {
        register.registerMenuBTN().sendKeys(Keys.ENTER);
    }
    @And("^register \"(.*)\" \"(.*)\" \"(.*)\" \"(.*)\" \"(.*)\" \"(.*)\"$")
    public void register(String gender,String fname , String lname ,String email , String password ,String confirm) throws InterruptedException {
        register.regisrationSteps(gender,fname, lname, email, password, confirm);
        Thread.sleep(2000);
    }

    @And("register and continue pressed")
    public void registerAndContinue() throws InterruptedException {
        register.registerBTN().click();
        page.continueButtonPOM().click();
    }
    @When("choose login from header")
    public void clickLoginMenuBTN() throws InterruptedException {
        login.loginMenuBTN().click();
    }
    @And("^login  \"(.*)\" \"(.*)\"$")
    public void login(String email ,String password) throws InterruptedException {
        login.loginSteps(email,password);
        Thread.sleep(2000);
    }

    @And("login pressed")
    public void clickLoginBTN() throws InterruptedException {
        login.passElementPOM().sendKeys(Keys.ENTER);
    }
    @And("roll back to home")
    public void rollBack(){
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }

}