package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

import java.util.ArrayList;

public class P01_register {

    public WebElement genderMaleElementPom(){
        return Hooks.driver.findElement(By.id("gender-male"));
    }
    public WebElement genderFemaleElementPom(){
        return Hooks.driver.findElement(By.id("gender-female"));
    }

    public WebElement fnameElementPOM(){
        return Hooks.driver.findElement(By.id("FirstName"));
    }
    public WebElement lnameElementPOM(){
        return Hooks.driver.findElement(By.id("LastName"));
    }
    public WebElement emailElementPOM(){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement passElementPOM(){

        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement confirmPassElementPOM(){

        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement registerBTN(){

        return Hooks.driver.findElement(By.id("register-button"));
    }
    public WebElement registerMenuBTN(){

        return Hooks.driver.findElement(By.className("ico-register"));
    }
    public WebElement logoutBTN(){

        return Hooks.driver.findElement(By.className("ico-logout"));
    }
    public ArrayList<WebElement> flashMsgOfAllRequiredFields(){
        ArrayList<WebElement> requiredFields = new  ArrayList<WebElement>();
        requiredFields.add(Hooks.driver.findElement(By.id("FirstName-error")));
        requiredFields.add(Hooks.driver.findElement(By.id("LastName-error")));
        requiredFields.add(Hooks.driver.findElement(By.id("Email-error")));
        requiredFields.add(Hooks.driver.findElement(By.id("Password-error")));
        requiredFields.add(Hooks.driver.findElement(By.id("ConfirmPassword-error")));
        return requiredFields;
    }
    public WebElement flashWrongEmail(){
        return Hooks.driver.findElement(By.id("Email-error"));
    }
    public WebElement flashPasswordShort(){
        return Hooks.driver.findElement(By.id("Password-error"));
    }
    public WebElement flashPasswordNotMatch(){
        return Hooks.driver.findElement(By.id("ConfirmPassword-error"));
    }


    public WebElement alreadyLogin(){

        return Hooks.driver.findElement(By.className("message-error"));
    }

    public void regisrationSteps(String gender,String fname , String lname ,String email , String password ,String confirm) throws InterruptedException {
        registerMenuBTN().click();
        fnameElementPOM().clear();
        lnameElementPOM().clear();
        emailElementPOM().clear();
        if(gender.equals("male")){
            genderMaleElementPom().click();
        }
        if(gender.equals("female")){
            genderFemaleElementPom().click();
        }
        fnameElementPOM().sendKeys(fname);
        Thread.sleep(500);

        lnameElementPOM().sendKeys(lname);
        Thread.sleep(500);

        emailElementPOM().sendKeys(email);
        Thread.sleep(500);

        passElementPOM().sendKeys(password);
        Thread.sleep(500);

        confirmPassElementPOM().sendKeys(confirm);
        Thread.sleep(500);

    }
}