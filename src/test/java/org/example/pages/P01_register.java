package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class P01_register {


    public P01_register() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "/html/body/app-root/app-shell/div/app-header/nav/div/div/form/ul/li[1]/a")
    public WebElement getMyaccountbtn;

    @FindBy(xpath = "/html/body/modal-container/div/div/app-login-signup-modal/div/div/app-login-register/div/div/div[1]/form/div[5]/a")
    public WebElement getCreateAccbtn;

    @FindBy(xpath = "//input[@placeholder='Full Name']")
    public WebElement getUserFNameTxt;

    @FindBy(xpath = "/html/body/modal-container/div/div/app-login-signup-modal/div/div/app-login-register/div/div/form/div[3]/input")
    public WebElement getUserEmailTxt;
    @FindBy(xpath = "/html/body/modal-container/div/div/app-login-signup-modal/div/div/app-login-register/div/div/form/div[4]/app-phone-input/div/div/div/div[1]")
    public WebElement getkeyList;

    @FindBy(xpath=".//*[@role='listbox']/li")
    public List<WebElement> getPhoneKeyList;

    @FindBy(xpath = ".//*[@type='tel']")
    public WebElement getGetPhonetxt;

    @FindBy(xpath = "/html/body/modal-container/div/div/app-login-signup-modal/div/div/app-login-register/div/div/form/div[5]/input")
    public WebElement getPasswordTxt;

    @FindBy(xpath = "/html/body/modal-container/div/div/app-login-signup-modal/div/div/app-login-register/div/div/form/div[6]/input")
    public WebElement getConfPassText;

    @FindBy(xpath = "/html/body/app-root/app-shell/div/app-header/nav/div/div/form/ul/li[1]")
    public WebElement accountIcon;

    @FindBy(css = "label[for='agreement']")
    public WebElement getTermsAndConditions;

//    .//*[@id='toast-container']

}
