package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P05_shoppingCart {
    private WebDriver driver;
    public P05_shoppingCart(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement firstFeaturedProductPOM(){
        return this.driver.findElement(By.cssSelector("h2[class=\"product-title\"] > a[href=\"/build-your-own-computer\"]"));
    }
    public WebElement firstCategoryProductPOM(){
        return this.driver.findElement(By.cssSelector("h2[class=\"product-title\"] > a[href=\"/if-you-wait-donation\"]"));
    }

    public WebElement clickedProductAddToCartBTNPOM(){

        //return this.driver.findElement(By.cssSelector("button[class=\"button-1 add-to-cart-button\"]"));
        return this.driver.findElement(By.cssSelector("div[class=\"add-to-cart-panel\"] > button[class=\"button-1 add-to-cart-button\"]"));

        //return this.driver.findElement(By.cssSelector("div[class=\"page product-details-page\"] > button[class=\"button-1 add-to-cart-button\"]"));


    }
    public WebElement processorDDPOM(){

        //return this.driver.findElement(By.cssSelector("button[class=\"button-1 add-to-cart-button\"]"));
        return this.driver.findElement(By.id("product_attribute_1"));

        //return this.driver.findElement(By.cssSelector("div[class=\"page product-details-page\"] > button[class=\"button-1 add-to-cart-button\"]"));


    }
    public WebElement ramDDPOM(){
        return this.driver.findElement(By.id("product_attribute_2"));
        //return this.driver.findElement(By.cssSelector("div[class=\"page product-details-page\"] > button[class=\"button-1 add-to-cart-button\"]"));


    }
    public WebElement hddDDPOM(){
        return this.driver.findElement(By.id("product_attribute_3_7"));
        //return this.driver.findElement(By.cssSelector("div[class=\"page product-details-page\"] > button[class=\"button-1 add-to-cart-button\"]"));


    }

//    public WebElement firstDownloadsProductBTNPOM(){
//
//        //return this.driver.findElement(By.cssSelector("button[class=\"button-1 add-to-cart-button\"]"));
//        //return this.driver.findElement(By.cssSelector("div[class=\"add-to-cart\"] > button[class=\"button-1 add-to-cart-button\"]"));
//
//        return this.driver.findElement(By.cssSelector("div[class=\"page product-details-page\"] > button[class=\"button-1 add-to-cart-button\"]"));
//
//
//    }
    public WebElement cartMenuBTNPOM(){

        return this.driver.findElement(By.className("ico-cart"));
    }
}
