
package pages;

        import org.openqa.selenium.By;
        import org.openqa.selenium.Keys;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import stepDefinitions.Hooks;

        import java.util.ArrayList;

public class P03_homePage {


    public WebElement currencyDropDownListPOM(){return Hooks.driver.findElement(By.id("customerCurrency"));}
    public WebElement pricePOM(){return Hooks.driver.findElement(By.className("prices"));}
    public WebElement searchPOM(){return Hooks.driver.findElement(By.className("search-box-text"));}

    public WebElement continueButtonPOM(){return Hooks.driver.findElement(By.className("buttons"));}
    public WebElement computersCategoryPOM(){return Hooks.driver.findElement(By.cssSelector("a[href=\"/computers\"]"));}
    public WebElement electronicsCategoryPOM(){return Hooks.driver.findElement(By.cssSelector("a[href=\"/electronics\"]"));}
    public WebElement apparelCategoryPOM(){return Hooks.driver.findElement(By.cssSelector("a[href=\"/apparel\"]"));}
    public WebElement dDownloadsCategoryPOM(){return Hooks.driver.findElement(By.cssSelector("a[href=\"/digital-downloads\"]"));}
    public WebElement booksCategoryPOM(){return Hooks.driver.findElement(By.cssSelector("a[href=\"/books\"]"));}
    public WebElement jewelryCategoryPOM(){return Hooks.driver.findElement(By.cssSelector("a[href=\"/jewelry\"]"));}
    public WebElement giftCategoryPOM(){return Hooks.driver.findElement(By.cssSelector("a[href=\"/gift-cards\"]"));}
   // public WebElement appleProductPom(){return this.driver.findElement(By.className("product-title"));}
    public WebElement noSearchResultPom(){return Hooks.driver.findElement(By.className("no-result"));}
//    public WebElement sliderControlPom(){return this.driver.findElement(By.className("nivo-control"));}
//    public WebElement sliderControlNumPom(String sliderNum){return this.driver.findElement(By.linkText(sliderNum));}
//  public WebElement inactiveSliderControlPom(){return this.driver.findElement(By.className("nivo-control"));}
public WebElement selectedSliderControlPom(String sliderNum){return Hooks.driver.findElement(By.linkText(sliderNum));}

    public WebElement activeSliderControlPom(){return Hooks.driver.findElement(By.className("nivo-control"));}

//   public WebElement shownSliderImagePom(){return this.driver.findElement(By.className("nivo-slider"));}
   //public WebElement shownSliderImagePom(){return this.driver.findElement(By.className("nivo-imageLink"));}
    public WebElement firstSliderImagePom(){return Hooks.driver.findElement(By.cssSelector("img[src=\"https://demo.nopcommerce.com/images/thumbs/0000079_banner_1.jpg\"]"));}

    public WebElement secondSliderImagePom(){return Hooks.driver.findElement(By.cssSelector("img[src=\"https://demo.nopcommerce.com/images/thumbs/0000080_banner_2.jpg\"]"));}

    public WebElement shownImgPom(){return Hooks.driver.findElement(By.cssSelector("img[class=\"nivo-main-image\"]"));}


    public WebElement searchedProductPom(String searched){return Hooks.driver.findElement(By.linkText(searched));}
    public WebElement locateProducts(String name){
        return Hooks.driver.findElement(By.linkText(name));
    }
    public WebElement cartCountPOM(){
        return Hooks.driver.findElement(By.className("cart-qty"));
    }
    public WebElement wishlistCountPOM(){
        return Hooks.driver.findElement(By.className("wishlist-qty"));
    }

    public WebElement rssPom(){return Hooks.driver.findElement(By.cssSelector("li[class=\"rss\"] > a[href=\"/news/rss/1\"]"));}

    public WebElement facebookPom(){return Hooks.driver.findElement(By.cssSelector("li[class=\"facebook\"] > a[href=\"http://www.facebook.com/nopCommerce\"]"));}

    public WebElement twitterPom(){return Hooks.driver.findElement(By.cssSelector("li[class=\"twitter\"]  > a[href=\"https://twitter.com/nopCommerce\"]"));}
    public WebElement youtubePom(){return Hooks.driver.findElement(By.cssSelector("li[class=\"youtube\"] > a[href=\"http://www.youtube.com/user/nopCommerce\"]"));}


    public void searchProduct(String id){
        searchPOM().clear();
        searchPOM().sendKeys(id);
        searchPOM().sendKeys(Keys.RETURN);
    }


}