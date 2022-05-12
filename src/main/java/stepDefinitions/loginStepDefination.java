package stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.loginPage;


public class loginStepDefination {
    WebDriver driver = null;
    loginPage login;
//    @Given("user navigates to login page")
//    public void user_navigates_to_login_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("user enter a valid username and password")
//    public void user_enter_a_valid_username_and_password() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @When("user click on login button")
//    public void user_click_on_login_button() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("user log in successfully and redirected to homepage")
//    public void user_log_in_successfully_and_redirected_to_homepage() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Given("user navigates to login page")
//    public void user_navigates_to_login_page() throws InterruptedException {
//        // Write code here that turns the phrase above into concrete actions
//      //  throw new io.cucumber.java.PendingException();
//        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver", chromePath);
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//        driver.navigate().to("https://the-internet.herokuapp.com/login");
//        login =new loginPage(driver);
//        Thread.sleep(3000);
////
//    }
//    @When("user enter a valid username and password")
//    public void user_enter_a_valid_username_and_password() {
//           login.loginSteps( "tomsmith", "SuperSecretPassword!");
//
//    }
//    @When("user click on login button")
//    public void user_click_on_login_button() {
//        login.passElementPOM().sendKeys(Keys.ENTER);
//    }
//    @Then("user log in successfully and redirected to homepage")
//    public void user_log_in_successfully_and_redirected_to_homepage() throws InterruptedException {
//        String er ="You logged into a secure area!";
//        String ar = login.flashPOM().getText();
//        Assert.assertEquals(ar.contains(er),true);
//        Assert.assertTrue(ar.contains(er));
//        Thread.sleep(5000);
//    }

    @Given("user navigates to login page")
    public void userNavigationToLoginPage() throws InterruptedException {
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://the-internet.herokuapp.com/login");
        login =new loginPage(driver);
        Thread.sleep(3000);


    }
    @When("user enter a valid username and password")
    public void enterValidCredentials()
    {
        login.loginSteps( "tomsmith", "SuperSecretPassword!");

    }
    @And("user click on login button")
    public void clickLoginBtn()
    {
        login.passElementPOM().sendKeys(Keys.ENTER);
    }
    @Then("user log in successfully and redirected to homepage")
    public void loginAndRedirection() throws InterruptedException {
        String er ="You logged into a secure area!";
        String ar = login.flashPOM().getText();
        Assert.assertEquals(ar.contains(er),true);
        Assert.assertTrue(ar.contains(er));
        Thread.sleep(5000);
    }
}
