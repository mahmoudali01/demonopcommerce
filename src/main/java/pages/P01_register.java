package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class P01_register {
    private WebDriver driver;
    public P01_register(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement fnameElementPOM(){
        return this.driver.findElement(By.id("FirstName"));
    }
    public WebElement lnameElementPOM(){
        return this.driver.findElement(By.id("LastName"));
    }
    public WebElement emailElementPOM(){
        return this.driver.findElement(By.id("Email"));
    }
    public WebElement passElementPOM(){

        return this.driver.findElement(By.id("Password"));
    }
    public WebElement confirmPassElementPOM(){

        return this.driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement registerBTN(){

        return this.driver.findElement(By.id("register-button"));
    }
    public WebElement registerMenuBTN(){

        return this.driver.findElement(By.className("ico-register"));
    }
    public WebElement logoutBTN(){

        return this.driver.findElement(By.className("ico-logout"));
    }
    public ArrayList<WebElement> flashMsgOfAllRequiredFields(){
        ArrayList<WebElement> requiredFields = new  ArrayList<WebElement>();
        requiredFields.add(this.driver.findElement(By.id("FirstName-error")));
        requiredFields.add(this.driver.findElement(By.id("LastName-error")));
        requiredFields.add(this.driver.findElement(By.id("Email-error")));
        requiredFields.add(this.driver.findElement(By.id("Password-error")));
        requiredFields.add(this.driver.findElement(By.id("ConfirmPassword-error")));
        return requiredFields;
    }
    public WebElement flashWrongEmail(){
        return this.driver.findElement(By.id("Email-error"));
    }
    public WebElement flashPasswordShort(){
        return this.driver.findElement(By.id("Password-error"));
    }
    public WebElement flashPasswordNotMatch(){
        return this.driver.findElement(By.id("ConfirmPassword-error"));
    }


    public WebElement alreadyLogin(){

        return this.driver.findElement(By.className("message-error"));
    }

    public void regisrationSteps(String fname , String lname ,String email , String password ,String confirm){
        registerMenuBTN().click();
        fnameElementPOM().clear();
        lnameElementPOM().clear();
        emailElementPOM().clear();
        fnameElementPOM().sendKeys(fname);
        lnameElementPOM().sendKeys(lname);
        emailElementPOM().sendKeys(email);
        passElementPOM().sendKeys(password);
        confirmPassElementPOM().sendKeys(confirm);
    }
}