package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P02_login {
    private WebDriver driver;
    public P02_login(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement usernameElementPOM(){
        return this.driver.findElement(By.id("Email"));
    }
    public WebElement passElementPOM(){

        return this.driver.findElement(By.id("Password"));
    }
    public WebElement flashMsgWrongEmail(){

        return this.driver.findElement(By.id("Email-error"));
    }
    public WebElement flashMsgEnterEmail(){
        return this.driver.findElement(By.id("Email-error"));
    }
    public WebElement flashMsgFailLogin(){

        return this.driver.findElement(By.className("message-error"));
    }

    public WebElement loginBTN(){

        return this.driver.findElement(By.className("ico-login"));
    }
    public WebElement logoutBTN(){

        return this.driver.findElement(By.className("ico-logout"));
    }

    public void loginSteps(String username , String password){
        loginBTN().click();
        usernameElementPOM().clear();
        usernameElementPOM().sendKeys(username);
        passElementPOM().sendKeys(password);
          //passElementPOM().sendKeys(Keys.ENTER);
    }
}
