package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.P02_login;

public class D02_loginStepDef {
    WebDriver driver = null;
    P02_login login;

    @Given("user open browser and navigates to home page")
    public void userNavigationToLoginPage() throws InterruptedException {
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");

        login =new P02_login(driver);
        Thread.sleep(1000);


    }
    @When("^user navigate to login page and enter email \"(.*)\" password \"(.*)\"$")
    public void enterValidCredentials(String email,String password)
    {
        login.loginSteps(email, password);

    }
    @And("user click on login button")
    public void clickLoginBtn()
    {
        login.passElementPOM().sendKeys(Keys.ENTER);
    }
    @Then("user log in successfully and redirected to homepage")
    public void successLogin() throws InterruptedException {

        Assert.assertTrue(login.logoutBTN().isDisplayed());
    }
    @Then("error message login was unsuccessful")
    public void error_login() throws InterruptedException {
        String er ="Login was unsuccessful. Please correct the errors and try again.\nNo customer account found";
        String ar = login.flashMsgFailLogin().getText();
        System.out.println(ar);
        Assert.assertEquals(ar.contains(er),true);
        //  Assert.assertTrue(ar.contains(er));
        Thread.sleep(2000);
        driver.quit();
    }
    @Then("error message wrong email")
    public void wrong_Email() throws InterruptedException {
        String er ="Wrong email";
        String ar = login.flashMsgWrongEmail().getText();
        System.out.println(ar);

        Assert.assertEquals(ar.contains(er),true);
        //Assert.assertTrue(ar.contains(er));
        Thread.sleep(2000);
        driver.quit();

    }
    @Then("error message please enter email")
    public void enter_Email() throws InterruptedException {
        String er ="Please enter your email";
        String ar = login.flashMsgEnterEmail().getText();
        System.out.println(ar);

        Assert.assertEquals(ar.contains(er),true);
        //Assert.assertTrue(ar.contains(er));
        Thread.sleep(2000);
        driver.quit();

    }
}