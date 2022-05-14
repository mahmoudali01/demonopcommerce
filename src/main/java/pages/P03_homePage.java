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
//  public WebElement pricePOM(){return this.driver.findElement(By.className("price actual-price"));}

    public WebElement continueButtonPOM(){return this.driver.findElement(By.className("buttons"));}
//   public WebElement continueButtonPOM(){return this.driver.findElement(By.className("button-1 register-continue-button"));}



}
