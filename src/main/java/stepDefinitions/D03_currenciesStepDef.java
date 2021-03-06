package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.P01_register;
import pages.P02_login;
import pages.P03_homePage;


public class D03_currenciesStepDef {

    P03_homePage  page =new P03_homePage();
    P02_login login = new P02_login();
    P01_register register = new P01_register();



    @When("^user select \"(.*)\" then the featured product prices is switched to Euro$")
    public void selectEuro(String euro) throws InterruptedException {
        Select selectEuro = new Select(page.currencyDropDownListPOM());
        selectEuro.selectByVisibleText(euro);
        String er = "€";
        String ar = page.pricePOM().getText();
        Assert.assertEquals(ar.contains(er),true);
        Thread.sleep(2000);

    }
    @And("^user select \"(.*)\" then the featured product prices is switched US dollar$")
    public void selectUSDollar(String dollar) throws InterruptedException {
        Select selectDollar = new Select(page.currencyDropDownListPOM());
        selectDollar.selectByVisibleText(dollar);
        String er = "$";
        String ar = page.pricePOM().getText();
        Assert.assertEquals(ar.contains(er),true);
        Thread.sleep(2000);


    }
    @And("^user click on login button then enter email \"(.*)\" password \"(.*)\"$")
    public void login(String email ,String password) throws InterruptedException {
        login.loginSteps(email,password);
        Thread.sleep(2000);
    }
    @And("press login button")
    public void clickLoginBTN() throws InterruptedException {
     login.passElementPOM().sendKeys(Keys.ENTER);
    }
    @And("user click on register from top menu")
    public void chooseRegisterFromTopMenu() throws InterruptedException {
    register.registerMenuBTN().click();
    }
    @And("^enter gender \"(.*)\" first name \"(.*)\" last name \"(.*)\" email \"(.*)\" password \"(.*)\" confirm pass \"(.*)\"$")
    public void userFillRegistrationForm(String gender,String fname , String lname ,String email , String password ,String confirm) throws InterruptedException {
   register.regisrationSteps(gender,fname, lname, email, password, confirm);

    }
    @And("press REGISTER")
    public void pressREGISTERButoon() throws InterruptedException {

     register.registerBTN().click();
    }
    @And("user click on continue button")
    public void pressContinueButton() throws InterruptedException {
   page.continueButtonPOM().click();

    }
}
