package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class P03_homePage {
    private WebDriver driver;
    public P03_homePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement currencyDropDownListPOM(){return this.driver.findElement(By.id("customerCurrency"));}
   public WebElement pricePOM(){return this.driver.findElement(By.className("prices"));}
    public WebElement searchPOM(){return this.driver.findElement(By.className("search-box-text"));}

    public WebElement continueButtonPOM(){return this.driver.findElement(By.className("buttons"));}
    public WebElement computersCategoryPOM(){return this.driver.findElement(By.cssSelector("a[href=\"/computers\"]"));}
    public WebElement electronicsCategoryPOM(){return this.driver.findElement(By.cssSelector("a[href=\"/electronics\"]"));}
    public WebElement apparelCategoryPOM(){return this.driver.findElement(By.cssSelector("a[href=\"/apparel\"]"));}
    public WebElement dDownloadsCategoryPOM(){return this.driver.findElement(By.cssSelector("a[href=\"/digital-downloads\"]"));}
    public WebElement booksCategoryPOM(){return this.driver.findElement(By.cssSelector("a[href=\"/books\"]"));}
    public WebElement jewelryCategoryPOM(){return this.driver.findElement(By.cssSelector("a[href=\"/jewelry\"]"));}
    public WebElement giftCategoryPOM(){return this.driver.findElement(By.cssSelector("a[href=\"/gift-cards\"]"));}
    public WebElement appleProductPom(){return this.driver.findElement(By.className("product-title"));}
    public WebElement noSearchResultPom(){return this.driver.findElement(By.className("no-result"));}
    public WebElement sliderControlPom(){return this.driver.findElement(By.className("nivo-control"));}
    public WebElement shownSliderImagePom(){return this.driver.findElement(By.className("nivo-imageLink"));}
//    public WebElement rssPom(){return this.driver.findElement(By.cssSelector("div[class=\"social\"] > a[href=\"/news/rss/1\"]"));}
//
//    public WebElement facebookPom(){return this.driver.findElement(By.cssSelector("div[class=\"social\"] > a[href=\"http://www.facebook.com/user/nopCommerce\"]"));}
//
//    public WebElement twitterPom(){return this.driver.findElement(By.cssSelector("div[class=\"social\"]  > a[href=\"http://www.twitter.com/user/nopCommerce\"]"));}
//    public WebElement youtubePom(){return this.driver.findElement(By.cssSelector("div[class=\"social\"] > a[href=\"http://www.youtube.com/user/nopCommerce\"]"));}


    public WebElement rssPom(){return this.driver.findElement(By.cssSelector("li[class=\"rss\"] > a[href=\"/news/rss/1\"]"));}

    public WebElement facebookPom(){return this.driver.findElement(By.cssSelector("li[class=\"facebook\"] > a[href=\"http://www.facebook.com/nopCommerce\"]"));}

    public WebElement twitterPom(){return this.driver.findElement(By.cssSelector("li[class=\"twitter\"]  > a[href=\"https://twitter.com/nopCommerce\"]"));}
    public WebElement youtubePom(){return this.driver.findElement(By.cssSelector("li[class=\"youtube\"] > a[href=\"http://www.youtube.com/user/nopCommerce\"]"));}


    public void searchProduct(String id){
        searchPOM().clear();
        searchPOM().sendKeys(id);
        searchPOM().sendKeys(Keys.RETURN);
   }


}
