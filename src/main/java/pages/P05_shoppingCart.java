package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P05_shoppingCart {

    public WebElement flashProductAddedPOM(){
        return Hooks.driver.findElement(By.cssSelector("div[id=\"bar-notification\"] > p[class=\"content\"]"));

    }


    public WebElement clickedProductAddToCartBTNPOM(){

        return Hooks.driver.findElement(By.cssSelector("div[class=\"add-to-cart-panel\"] > button[class=\"button-1 add-to-cart-button\"]"));

    }
    public WebElement processorDDPOM(){

        return Hooks.driver.findElement(By.id("product_attribute_1"));

    }
    public WebElement ramDDPOM(){
        return Hooks.driver.findElement(By.id("product_attribute_2"));
    }
    public WebElement hddDDPOM(){
        return Hooks.driver.findElement(By.id("product_attribute_3_7"));
    }

    public WebElement cartMenuBTNPOM(){

        return Hooks.driver.findElement(By.className("ico-cart"));
    }
}
