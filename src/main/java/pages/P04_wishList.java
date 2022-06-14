package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P04_wishList {



    public WebElement addToWishlistBTNPOM(){

        return Hooks.driver.findElement(By.cssSelector("div[class=\"add-to-wishlist\"] > button[class=\"button-2 add-to-wishlist-button\"]"));
    }

    public WebElement wishlistMenuBTNPOM(){
        return Hooks.driver.findElement(By.className("ico-wishlist"));
    }
}
