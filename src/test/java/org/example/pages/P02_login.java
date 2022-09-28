package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class P02_login {
    public P02_login() { PageFactory.initElements(driver,this); }

    @FindBy(xpath = "/html/body/app-root/app-shell/div/app-header/nav/div/div/form/ul/li[1]/a")
    public WebElement getLoginbtn;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement getEmailtxt;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement getPassWordtxt;
    @FindBy(xpath = "//button[@class='btn btn-block btn-primary']")
    public WebElement getOkLoginbtn;
//             .navbar-nav.primary-nav li  .//ul[@class='navbar-nav primary-nav']/li
    @FindBy(xpath= ".//ul[@class='navbar-nav primary-nav']/li")
    public List<WebElement> accountIcon;

}
