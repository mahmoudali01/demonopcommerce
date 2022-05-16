package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P04_wishList {
    private WebDriver driver;
    public P04_wishList (WebDriver driver) {
        this.driver = driver;
    }

    public WebElement locateWishlistItems(String name){
        return this.driver.findElement(By.linkText(name));
    }


    public WebElement addToWishlistBTNPOM(){

        return this.driver.findElement(By.cssSelector("div[class=\"add-to-wishlist\"] > button[class=\"button-2 add-to-wishlist-button\"]"));
    }

    public WebElement wishlistMenuBTNPOM(){
        return this.driver.findElement(By.className("ico-wishlist"));
    }
}
