package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

import static org.example.stepDefs.Hooks.driver;


public class D01_registerStepDef {

    P01_register register = new P01_register();
    SoftAssert soft = new SoftAssert();
    Actions actions = new Actions(driver);
    public static int Selectedphonekey;
    List<WebElement> PhoneKey;


    @Given("user go to register page")
    public void goToRegisterPage()
    {
        register.getMyaccountbtn.click();
        register.getCreateAccbtn.click();
        System.out.println("this is test the environment ");
    }

    @When("user enter Full name{string}")
    public void userEnterFullName(String arg0)
    {
        register.getUserFNameTxt.sendKeys(arg0);

    }

    @And("user enter Email{string}")
    public void userEnterEmail(String arg0)
    {
        register.getUserEmailTxt.sendKeys(arg0);
    }

    @And("user enter Phone Number{string}")
    public void userEnterPhoneNumber(String arg0)
    {
        register.getkeyList.click();
        PhoneKey = register.getPhoneKeyList;
        int listSize=register.getPhoneKeyList.size();
        System.out.println(listSize);
        System.out.println(register.getPhoneKeyList.get(3).getText());
        Selectedphonekey=3;
        System.out.println(Selectedphonekey);
        register.getPhoneKeyList.get(3).click();
        register.getGetPhonetxt.sendKeys(arg0);


    }

    @And("user enter Password {string} and confirmed{string}")
    public void userEnterPasswordAndConfirmed(String arg0, String arg1)
    {
        register.getPasswordTxt.sendKeys(arg0);
        register.getConfPassText.sendKeys(arg1);

    }
    @And("user agree on terms and conditions.")
    public void userAgreeOnTermsAndConditions()
    {
        register.getTermsAndConditions.click();
    }

    @Then("user logon successfuly")
    public void userLogonSuccessfuly()
    {
        String actualResult = register.accountIcon.getText();
        System.out.println(register.accountIcon.getText());
        String defaultStatus = "My Account\n" + "(current)";
        Assert.assertEquals(actualResult,defaultStatus);
        Assert.assertTrue(true, actualResult);
    }


}
