package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class P03_home {

    public P03_home() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = ".//*[@aria-controls='umrah-planner-tab']")
    public WebElement getPlannerTab;

    @FindBy(xpath = "//*[@id=\"umrah-planner-tab\"]/app-umrah-planner-search-box/div/div[1]/div[1]/div[1]/input")
    public WebElement getRoute;

    @FindBy(xpath = "//*[@id=\"umrah-planner-tab\"]/app-umrah-planner-search-box/div/div[1]/div[1]/div[2]/ul/li")
    public List<WebElement> getRouteList;

//  Room pop up screen Controllers
    @FindBy(xpath = "//*[@id=\"umrah-planner-tab\"]/app-umrah-planner-search-box/div/div[1]/div[4]/div[1]/input")
    public WebElement getGest;

    @FindBy(xpath = "//*[@id=\"room-no-0\"]/div[1]/div[2]/button[2]")
    public WebElement addADTbtn;

    @FindBy(xpath = "//*[@id=\"umrah-planner-tab\"]/app-umrah-planner-search-box/div/div[1]/div[4]/div[2]/section/button[1]")
    public WebElement addRoombtn;

    @FindBy(xpath = "//*[@id=\"room-no-1\"]/div[1]/div[2]/button[1]")
    public WebElement minusADTbtn;

    @FindBy(xpath = "//*[@id=\"umrah-planner-tab\"]/app-umrah-planner-search-box/div/div[1]/div[4]/div[2]/section/button[2]")
    public WebElement removeRoombtn;

    @FindBy(xpath = "//*[@id=\"room-no-0\"]/div[2]/div[2]/button[1]")
    public WebElement minusRoomCountbtn;

    @FindBy(xpath = "//*[@id=\"room-no-0\"]/div[2]/div[2]/button[2]")
    public WebElement addRoomCountbtn;


// Vehicles list  controller
    @FindBy(xpath = "//*[@id=\"umrah-planner-tab\"]/app-umrah-planner-search-box/div/div[1]/div[5]/div[1]/div/ng-select")
    public WebElement getVehiclebtn;

    @FindBy(xpath= "/html/body/app-root/app-shell/div/app-home/app-home-main-header/section/app-search-box-container/div/div/div/div[6]/app-umrah-planner-search-box/div/div[1]/div[5]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
    public WebElement getVechile1;

    @FindBy(xpath= "/html/body/app-root/app-shell/div/app-home/app-home-main-header/section/app-search-box-container/div/div/div/div[6]/app-umrah-planner-search-box/div/div[1]/div[5]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[2]")
    public WebElement getVechile2;

    @FindBy(xpath= "/html/body/app-root/app-shell/div/app-home/app-home-main-header/section/app-search-box-container/div/div/div/div[6]/app-umrah-planner-search-box/div/div[1]/div[5]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[3]")
    public WebElement getVechile3;

    @FindBy(xpath= "/html/body/app-root/app-shell/div/app-home/app-home-main-header/section/app-search-box-container/div/div/div/div[6]/app-umrah-planner-search-box/div/div[1]/div[5]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[4]")
    public WebElement getVechile4;

    @FindBy(xpath= "/html/body/app-root/app-shell/div/app-home/app-home-main-header/section/app-search-box-container/div/div/div/div[6]/app-umrah-planner-search-box/div/div[1]/div[5]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[5]")
    public WebElement getVechile5;

    @FindBy(xpath= "/html/body/app-root/app-shell/div/app-home/app-home-main-header/section/app-search-box-container/div/div/div/div[6]/app-umrah-planner-search-box/div/div[1]/div[5]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[6]")
    public WebElement getVechile6;

    @FindBy(xpath= "/html/body/app-root/app-shell/div/app-home/app-home-main-header/section/app-search-box-container/div/div/div/div[6]/app-umrah-planner-search-box/div/div[1]/div[5]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[7]")
    public WebElement getVechile7;



//    nationality  list controller
    @FindBy(xpath = "//*[@id=\"umrah-planner-tab\"]/app-umrah-planner-search-box/div/div[1]/div[5]/div[2]/div/ng-select")
    public WebElement getnationalitybtn;

    @FindBy(xpath = "//*[@id=\"umrah-planner-tab\"]/app-umrah-planner-search-box/div/div[1]/div[5]/div[2]/div/ng-select/div/div/div[2]/input")
    public WebElement nationality;

    @FindBy(xpath = "/html/body/app-root/app-shell/div/app-home/app-home-main-header/section/app-search-box-container/div/div/div/div[6]/app-umrah-planner-search-box/div/div[1]/div[5]/div[2]/div/ng-select/ng-dropdown-panel/div/div[2]/div")
    public WebElement okNationalitybtn;
// country controller
    @FindBy(xpath = "/html/body/app-root/app-shell/div/app-home/app-home-main-header/section/app-search-box-container/div/div/div/div[6]/app-umrah-planner-search-box/div/div[1]/div[6]/div/ng-select/div/div/div[2]/input")
    public WebElement country;
    @FindBy (xpath = "//*[@id=\"umrah-planner-tab\"]/app-umrah-planner-search-box/div/div[1]/div[6]/div/ng-select/div")
    public WebElement getCountry;
    @FindBy(xpath = "/html/body/app-root/app-shell/div/app-home/app-home-main-header/section/app-search-box-container/div/div/div/div[6]/app-umrah-planner-search-box/div/div[1]/div[6]/div/ng-select/ng-dropdown-panel/div/div[2]/div")
    public WebElement okCountry;

//    night controller
    @FindBy(xpath = "//*[@id=\"umrah-planner-tab\"]/app-umrah-planner-search-box/div/div[1]/div[3]")
    public WebElement getnightbtn;

    @FindBy(xpath = "//*[@id=\"umrah-planner-tab\"]/app-umrah-planner-search-box/div/div[1]/div[3]/div[2]/div[1]/div[2]/button[1]")
    public WebElement minusMakkahNightbtn;

    @FindBy(xpath = "//*[@id=\"umrah-planner-tab\"]/app-umrah-planner-search-box/div/div[1]/div[3]/div[2]/div[1]/div[2]/button[2]")
    public WebElement addMakkahNightbtn;

    @FindBy(id=".//input[@id='include-hotel-SA4']")
    public WebElement selectMadinah;

//                    //*[@id="include-hotel-SA4"]
//                  .//*[@id='include-hotel-SA4']
//  ElementClickInterceptedException:
//  element click intercepted: Element <input _ngcontent-serverapp-c363="" type="checkbox" class="custom-control-input ng-untouched ng-pristine ng-valid" id="include-hotel-SA4">
//  is not clickable at point    Other element would receive the click
    @FindBy(css = "label[for='include-hotel-SA4'] span")
    public WebElement getMadinahNightbtn;

    @FindBy(xpath = "//*[@id=\"umrah-planner-tab\"]/app-umrah-planner-search-box/div/div[1]/div[3]/div[2]/div[2]/div[2]/button[1]")
    public WebElement minusMadinahhNightbtn;

    @FindBy(xpath = "//*[@id=\"umrah-planner-tab\"]/app-umrah-planner-search-box/div/div[1]/div[3]/div[2]/div[2]/div[2]/button[2]")
    public WebElement addMadinahNightbtn;

//    date controller
    @FindBy(xpath = "/html/body/app-root/app-shell/div/app-home/app-home-main-header/section/app-search-box-container/div/div/div/div[6]/app-umrah-planner-search-box/div/div[1]/div[2]/div/input")
    public WebElement getdate;
///html/body/app-root/app-shell/div/app-home/app-home-main-header/section/app-search-box-container/div/div/div/div[6]/app-umrah-planner-search-box/div/div[1]/div[2]/div/bs-datepicker-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[1]/bs-datepicker-navigation-view/button[2]
    @FindBy(css = ".bs-datepicker-head button.ng-star-inserted")
    public WebElement getMonth;
    @FindBy(xpath = "//*[@id=\"umrah-planner-tab\"]/app-umrah-planner-search-box/div/div[1]/div[2]/div/bs-datepicker-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[1]/bs-datepicker-navigation-view/button[3]")
    public WebElement getYear;
    @FindBy(xpath = ".//*[@class='selected ng-star-inserted']")
    public WebElement getDay;

// prev monthbtn   //*[@id="umrah-planner-tab"]/app-umrah-planner-search-box/div/div[1]/div[2]/div/bs-datepicker-container/div/div/div/div/bs-month-calendar-view/bs-calendar-layout/div[1]/bs-datepicker-navigation-view/button[1]
// forward monthbtn//*[@id="umrah-planner-tab"]/app-umrah-planner-search-box/div/div[1]/div[2]/div/bs-datepicker-container/div/div/div/div/bs-month-calendar-view/bs-calendar-layout/div[1]/bs-datepicker-navigation-view/button[3]
// prev daybtn  //*[@id="umrah-planner-tab"]/app-umrah-planner-search-box/div/div[1]/div[2]/div/bs-datepicker-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[1]/bs-datepicker-navigation-view/button[1]
// forward daybtn //*[@id="umrah-planner-tab"]/app-umrah-planner-search-box/div/div[1]/div[2]/div/bs-datepicker-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[1]/bs-datepicker-navigation-view/button[4]

   @FindBy(xpath = "//*[@id=\"umrah-planner-tab\"]/app-umrah-planner-search-box/div/div[1]/div[2]/div/bs-datepicker-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[1]/bs-datepicker-navigation-view/button[1]")
   public WebElement prevDaybtn;
   @FindBy(xpath = ".//button[@class='next']")
   public WebElement forwardDaybtn;
//                   //*[@id="umrah-planner-tab"]/app-umrah-planner-search-box/div/div[1]/div[2]/div/bs-datepicker-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[2]/table/tbody/tr
   @FindBy(xpath = "//*[@id=\"umrah-planner-tab\"]/app-umrah-planner-search-box/div/div[1]/div[2]/div/bs-datepicker-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[2]/table/tbody/tr")
    public List<WebElement> dayRow;
   @FindBy(xpath = "//*[@id=\"umrah-planner-tab\"]/app-umrah-planner-search-box/div/div[1]/div[2]/div/bs-datepicker-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[2]/table/tbody/tr[1]/td")
    public List<WebElement> dayColumn;
   @FindBy(className = "//*[@id=\"umrah-planner-tab\"]/app-umrah-planner-search-box/div/div[1]/div[2]/div/bs-datepicker-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[1]/bs-datepicker-navigation-view/button[4]/span")
    public WebElement nxtbtn;
   @FindBy(className = ".//*[@class='previous']")
    public WebElement prevbtn;
   @FindBy(xpath = "//*[@id=\"umrah-planner-tab\"]/app-umrah-planner-search-box/div/div[1]/div[2]/div/bs-datepicker-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[2]/table/tbody/tr/td")
   public WebElement daytable ;
   @FindBy(xpath = "//*[@id=\"umrah-planner-tab\"]/app-umrah-planner-search-box/div/div[2]/button")
    public WebElement searchbtn;


// booking page
    @FindBy(className = "hotel-card")
    public List<WebElement> avalibleHotels;









}
