package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P02_login {
   // private WebDriver driver;
//    public P02_login(WebDriver driver) {
//        this.driver = driver;
//    }

    public WebElement usernameElementPOM(){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement passElementPOM(){

        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement flashMsgWrongEmail(){

        return Hooks.driver.findElement(By.id("Email-error"));
    }
    public WebElement flashMsgEnterEmail(){
        return Hooks.driver.findElement(By.id("Email-error"));
    }
    public WebElement flashMsgFailLogin(){

        return Hooks.driver.findElement(By.className("message-error"));
    }

    public WebElement loginMenuBTN(){

        return Hooks.driver.findElement(By.className("ico-login"));
    }
    public WebElement logoutBTN(){

        return Hooks.driver.findElement(By.className("ico-logout"));
    }

    public void loginSteps(String email , String password) throws InterruptedException {
        loginMenuBTN().click();
        usernameElementPOM().clear();
        usernameElementPOM().sendKeys(email);
        Thread.sleep(500);
        passElementPOM().sendKeys(password);
        Thread.sleep(500);

    }
}