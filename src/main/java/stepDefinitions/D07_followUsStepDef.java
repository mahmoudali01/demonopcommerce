package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.P03_homePage;

import java.util.ArrayList;

public class D07_followUsStepDef {
    P03_homePage page = new P03_homePage();


    @When("user click facebook icon from the footer")
    public void clickFacebook() throws InterruptedException {
        page.facebookPom().click();
        Thread.sleep(1000);

    }
    @Then("user is redirected to facebook")
    public void redirectToFacebook() throws InterruptedException {
        String er = "https://www.facebook.com/nopCommerce";
        Thread.sleep(4000);
        ArrayList<String> tabs = new ArrayList<String> (Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
         String ar = Hooks.driver.getCurrentUrl();
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
        // String er = page.facebookPom().getAttribute("href");
        Assert.assertEquals(ar.equals(er),true);
    }
    @When("user click twitter icon from the footer")
    public void clickTwitter() throws InterruptedException {
        page.twitterPom().click();
        Thread.sleep(1000);

    }
    @Then("user is redirected to twitter")
    public void redirectToTwitter() throws InterruptedException {
        String er = "https://twitter.com/nopCommerce";
        Thread.sleep(4000);
        ArrayList<String> tabs = new ArrayList<String> (Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        String ar = Hooks.driver.getCurrentUrl();
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
        // String er = page.twitterPom().getAttribute("href");
        Assert.assertEquals(ar.equals(er),true);

    }
    @When("user click youtube icon from the footer")
    public void clickYoutube() throws InterruptedException {
        page.youtubePom().click();
        Thread.sleep(1000);

    }
    @Then("user is redirected to youtube")
    public void redireectToYoutube() throws InterruptedException {
        String er = "https://www.youtube.com/user/nopCommerce";
        Thread.sleep(4000);
        ArrayList<String> tabs = new ArrayList<String> (Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        String ar = Hooks.driver.getCurrentUrl();
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
        // String er = page.youtubePom().getAttribute("href");
        Assert.assertEquals(ar.equals(er),true);
        Thread.sleep(3000);
    }
    @When("user click rss icon from the footer")
    public void rssClick() throws InterruptedException {
        page.rssPom().click();
        Thread.sleep(1000);

    }
    @Then("user is redirected to rss")
    public void rssRedirect() throws InterruptedException {
        String ar = Hooks.driver.getCurrentUrl();
        Thread.sleep(3000);
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        String er = page.rssPom().getAttribute("href");
        Assert.assertEquals(ar.equals(er),true);
    }
}
