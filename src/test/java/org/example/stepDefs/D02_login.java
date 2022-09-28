package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.example.pages.P02_login;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import java.time.Duration;
import static org.example.stepDefs.Hooks.driver;

public class D02_login {
    P02_login login = new P02_login();
    SoftAssert soft = new SoftAssert();
    Actions actions = new Actions(driver);
    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
            .withTimeout(Duration.ofSeconds(60))
            .pollingEvery(Duration.ofSeconds(5))
            .ignoring(NoSuchElementException.class);

    @Given("user go to login page")
    public void loginPage(){
        login.getLoginbtn.click();
    }

    @When("user enter valid {string}and{string}")
    public void userEnterValidAnd(String arg0, String arg1)  {
        login.getEmailtxt.sendKeys(arg0);
        login.getPassWordtxt.sendKeys(arg1);
        login.getOkLoginbtn.click();

    }



    @Then("user login successfully")
    public void userLoginSuccessfully() {
        wait.until(ExpectedConditions.elementToBeClickable(login.accountIcon.get(1)));
        actions.moveToElement(login.accountIcon.get(1)).perform();
        login.accountIcon.get(1).click();
        String actualResult =  driver.getCurrentUrl();
        System.out.println("this is the booking page "+actualResult);
        String defaultStatus = "https://b2c.stg.legateonline.com/en/home";
       Assert.assertNotEquals(actualResult,defaultStatus);
           }


    @When("user enter invalid {string}and{string}")
    public void userEnterInvalidAnd(String arg0, String arg1) {
        login.getEmailtxt.sendKeys(arg0);
        login.getPassWordtxt.sendKeys(arg1);
        login.getOkLoginbtn.click();

    }

    @Then("user couldn't login successfull")
    public void userCouldnTLoginSuccessfull() {
        actions.moveToElement(login.accountIcon.get(0));
        String actualResult = login.accountIcon.get(0).getText();
        System.out.println(actualResult);
        String defaultStatus = "My Account\n" + "(current)";
        Assert.assertEquals(actualResult,defaultStatus);

    }

   }
