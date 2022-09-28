package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static java.lang.Math.floor;
import static java.lang.Math.random;
import static org.example.stepDefs.Hooks.driver;

public class P04_booking {
    public P04_booking() {PageFactory.initElements(driver,this);}

    @FindBy(className = "hotel-card")
    public List<WebElement> makkahHotel;

//.hotel-card-price[_ngcontent-serverApp-c469] .btn-outline-primary[_ngcontent-serverApp-c469]
    @FindBy(css = "button.btn-block")
    public List<WebElement> makkahHotelbtn;


    @FindBy(css = "button[class='btn btn-outline-primary']")
    public List <WebElement> selectRoombtn;
//           css  div[class='package-title-wrap'] h3[class='package-title']
//                div[class='package-title-wrap'] h3[class='package-title']
    @FindBy(xpath=".//*[@class='package-title-wrap']/h3[@class='package-title']")
    public WebElement hotelName;
    @FindBy(css="div[class='hotel-rooms-item-data'] h3[class='package-title']")
    public  WebElement roomType;
    @FindBy(css="div[class='room-type'] span")
    public List <WebElement> boardType ;

    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    public WebElement confirmRoombtn;
//           button[type='button']

    @FindBy(css = "button[type='button']")
    public WebElement goToselectNextbtn;

    @FindBy(css = "app-umrah-planner-hotels-search-result[class='ng-star-inserted'] button[class='btn btn-outline-primary btn-block ng-star-inserted']")
    public List<WebElement> madinahHotelbtn;

    @FindBy(css="div[class='wizard-sub-tabs-item']")
    public WebElement madinahTab;
    //div[@class='wizard-sub-tabs-item active']
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-shell[1]/div[1]/app-shell[1]/div[1]/app-umrah-planner-search-results[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]")
    public WebElement makkahTab;

//    public WebElement getMakkahtap(){
//        return driver.findElement(By.xpath("//span[normalize-space()='Makkah']"));
//
//    }
    @FindBy(xpath ="//strong[@class='wizard-card-title']")
    public WebElement getHotelName;
                     //div[@class='wizard-rooms-item ng-star-inserted']/span
    @FindBy(xpath="//div[@class='wizard-rooms-item ng-star-inserted']/span")
    public WebElement getRoomType;
    @FindBy(xpath="//div[@class='wizard-rooms-type']/span")
    public WebElement getBoardType;

    public int randomNumber(int size){
        int min =0 ;
        int max =size-1;
        int  random= (int) floor(random() * ( max - min + 1 ) + min);
       return random;
    }

    @FindBy(xpath = "//div[@class='wizard-sub-tabs-wrap ng-star-inserted']/div")
    public List<WebElement> hotelsCard;
//    Transportation locators

    @FindBy(xpath = "//app-umrah-planner-transportation-card//div//div//div//div//button")
    public List<WebElement> transportationbtn;

    @FindBy(xpath = ".//div[@class='col-xs-12']//ul[@class='pagination']/li")
    public List<WebElement> getPagination;
    @FindBy(xpath = ".//div[@class='transportation-card-data']")
    public List<WebElement> getTransportationCard;
    @FindBy(css = "div[class='card-data-title']")
    public List<WebElement> getTransCompanyName;
    @FindBy(css = "div[class='total-price']")
    public List<WebElement> getTransPrice;
    @FindBy(xpath = "")
    public WebElement getTransAddServicebtn;

    @FindBy(css = "div[class='wizard-tab-item active completed'] div[class='wizard-card-body'] span:not([class='normal-btn'])")
    public WebElement getTransCompNameInCart;
    @FindBy(css = "body > app-root:nth-child(5) > app-shell:nth-child(2) > div:nth-child(1) > app-shell:nth-child(3) > div:nth-child(1) > app-umrah-planner-search-results:nth-child(3) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > p:nth-child(2) > app-price:nth-child(1)")
    public WebElement getTotalPriceInCart;
    //    Ground service Locators
    @FindBy(css = "div [class='ground-services-item']")
    public List<WebElement> getGroundserviceCard;
    @FindBy(css = "div[class='ground-services-data-body'] button[class='btn btn-outline-primary']")
    public List<WebElement> getGroundServicebtn;
    @FindBy(css = "div[class='ground-services-data-head'] h3[class='package-title']")
    public List<WebElement> getGroundServiceCompName;
    @FindBy(css = "div[class='address-and-price'] div[class='total-price'] span")
    public List<WebElement> getGroundServicePrice;
    @FindBy(xpath = "div[class='wizard-tab-item active completed'] div[class='small-asset-wrap'] span")
    public WebElement getGroundServiceCompNameIncart;
//    rel xp //button[normalize-space()='Review to checkout']
//    abs xp/html[1]/body[1]/app-root[1]/app-shell[1]/div[1]/app-shell[1]/div[1]/app-umrah-planner-search-results[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[4]/div[1]/button[1]
//    css div[class='wizard-review-tab'] button[class='btn btn-primary']
    @FindBy(css = "div[class='wizard-review-tab'] button[class='btn btn-primary']")
    public WebElement goToReviewbtn;
    




}
