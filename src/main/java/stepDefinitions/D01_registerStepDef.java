package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.P01_register;
import pages.P02_login;

public class D01_registerStepDef {
    WebDriver driver = null;
    P01_register register;
    @Given("user open browser and navigates to home page for registration")
    public void userNavigationToHomePage() throws InterruptedException {
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");

        register =new  P01_register(driver);
        Thread.sleep(1000);


    }
    @When("^user navigate to register page and enter first name \"(.*)\" last name \"(.*)\" email \"(.*)\" password \"(.*)\" confirm pass \"(.*)\"$")
    public void fillRegistrationForm(String fname , String lname ,String email , String password ,String confirm) throws InterruptedException {
        register.regisrationSteps(fname, lname,email,password,confirm);

    }
    @And("click REGISTER")
    public void clickRegisterBtn()
    {
        register.registerBTN().click();
    }

    @Then("error message with the required fields")
    public void errorRequiredFields() throws InterruptedException {
        String er ="First name is required.";
        String ar = register.flashMsgOfAllRequiredFields().get(0).getText();
        System.out.println(ar);
        Assert.assertEquals(ar.contains(er),true);
        Thread.sleep(2000);
        driver.quit();
    }
    @Then("wrong email message")
    public void errorWrongEmail() throws InterruptedException {
        String er ="Wrong email";
        String ar = register.flashWrongEmail().getText();
        System.out.println(ar);
        Assert.assertEquals(ar.contains(er),true);
        Thread.sleep(2000);
        driver.quit();
    }
    @Then("error the password should be at least 6 characters")
    public void shortPassword() throws InterruptedException {
        String er ="Password must meet the following rules:\nmust have at least 6 characters";
        String ar = register.flashPasswordShort().getText();
        System.out.println(ar);
        Assert.assertEquals(ar.contains(er),true);
        Thread.sleep(2000);
        driver.quit();
    }
    @Then("error confirm password don't match the password")
    public void unMatch() throws InterruptedException {
        String er ="The password and confirmation password do not match.";
        String ar = register.flashPasswordNotMatch().getText();
        System.out.println(ar);
        Assert.assertEquals(ar.contains(er),true);
        Thread.sleep(2000);
        driver.quit();
    }
    @Then("registered successfully then click on logout")

    public void successRegister() throws InterruptedException {
        Assert.assertTrue(register.logoutBTN().isDisplayed());
        register.logoutBTN().click();
        driver.quit();
    }
    @Then("error already registered email")
    public void alreadyRegistered() throws InterruptedException {
        String er ="The specified email already exists";
        String ar = register.alreadyLogin().getText();
        System.out.println(ar);
        Assert.assertEquals(ar.contains(er),true);
        //  Assert.assertTrue(ar.contains(er));
        Thread.sleep(2000);
        driver.quit();
    }
}