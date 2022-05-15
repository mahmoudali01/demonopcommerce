package pages;

import org.openqa.selenium.By;
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
    public WebElement continueButtonPOM(){return this.driver.findElement(By.className("buttons"));}
    public WebElement computersCategoryPOM(){return this.driver.findElement(By.cssSelector("a[href=\"/computers\"]"));}
    public WebElement electronicsCategoryPOM(){return this.driver.findElement(By.cssSelector("a[href=\"/electronics\"]"));}
    public WebElement apparelCategoryPOM(){return this.driver.findElement(By.cssSelector("a[href=\"/apparel\"]"));}
    public WebElement dDownloadsCategoryPOM(){return this.driver.findElement(By.cssSelector("a[href=\"/digital-downloads\"]"));}
    public WebElement booksCategoryPOM(){return this.driver.findElement(By.cssSelector("a[href=\"/books\"]"));}
    public WebElement jewelryCategoryPOM(){return this.driver.findElement(By.cssSelector("a[href=\"/jewelry\"]"));}
    public WebElement giftCategoryPOM(){return this.driver.findElement(By.cssSelector("a[href=\"/gift-cards\"]"));}






}
