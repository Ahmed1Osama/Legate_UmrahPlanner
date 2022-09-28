package org.example.stepDefs;

import io.cucumber.java.en.And;
import org.example.pages.P04_booking;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

import static org.example.stepDefs.Hooks.driver;

public class D04_booking {

    P04_booking booking = new P04_booking();
    Actions actions = new Actions(driver);
    SoftAssert softAssert = new SoftAssert();

    List <WebElement> selectedMkHotel;
    List <WebElement> selectedMDHotel;
    List <WebElement> selectedHotelRoombtn;
    List <WebElement> selectedBoardtype;
    List <WebElement> selectedMdHotelRoombtn;
    List <WebElement> selectedMdRoomtyp;
    int selectMkRandom;
    int selectMDRandom;
    int selectRandomRoom;
    int selectMdRandomRoom;
    String hotelMkNameText;
    String roomMkTypeText ;
    String boardMkTypeText;
    int transRandom;
    int groundRandom;
    List<WebElement> transListbtn;
    List<WebElement> transCompNamList;
    List<WebElement> transCompPriceList;
    List<WebElement> groundservicList;
    List<WebElement> groundServicelistbtn;
    List<WebElement> groundServiceNameList;
    List<WebElement> groundServicePriceList;
    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
            .withTimeout(Duration.ofSeconds(80))
            .pollingEvery(Duration.ofSeconds(5))
            .ignoring(NoSuchElementException.class);

    @And("select Makkah Hotel Room")
    public void selectMakkahHotel()  {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.btn-block")));
        selectedMkHotel =booking.makkahHotelbtn;
        int  count  = booking.makkahHotel.size();
        int  count1 = booking.makkahHotelbtn.size();
        System.out.println(count1);
        System.out.println(count);
//        for (int  i = 0 ; i < count;i++){
//            System.out.println(booking.makkahHotel.get(i).getText()+"\n"+"********"+i+"******"+"\n");
//        }
        selectMkRandom =booking.randomNumber(count1);
        actions.moveToElement(selectedMkHotel.get(selectMkRandom)).perform();
        selectedMkHotel.get(selectMkRandom).click();
        selectedHotelRoombtn= booking.selectRoombtn;
        int roombtnCount=booking.selectRoombtn.size();
        selectRandomRoom=booking.randomNumber(roombtnCount);
        actions.moveToElement(selectedHotelRoombtn.get(selectRandomRoom)).perform();
        selectedHotelRoombtn.get(selectRandomRoom).click();
        booking.confirmRoombtn.click();
        selectedBoardtype =booking.boardType;
//        wait.until(ExpectedConditions.invisibilityOf(booking.hotelName));
        hotelMkNameText= booking.hotelName.getText();
        roomMkTypeText = booking.roomType.getText();
        boardMkTypeText= selectedBoardtype.get(selectRandomRoom).getText();
        System.out.println(hotelMkNameText);
        System.out.println(roomMkTypeText);
        System.out.println(boardMkTypeText);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='button']")));
        booking.goToselectNextbtn.click();

    }

    @And("select Madinah Hotel Room")
    public void selectMadinahHotelRoom() {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("app-umrah-planner-hotels-search-result[class='ng-star-inserted'] button[class='btn btn-outline-primary btn-block ng-star-inserted']")));
        selectedMDHotel = booking.madinahHotelbtn;
        int countMh = selectedMDHotel.size();
        System.out.println(countMh);
//        int sr= booking.randomNumber(10);
//        System.out.println("this is should be changed every time  \n   " + sr);
        selectMDRandom = booking.randomNumber(countMh);
        actions.moveToElement(selectedMDHotel.get(selectMDRandom)).perform();
        selectedMDHotel.get(selectMDRandom).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[class='btn btn-outline-primary']")));
        selectedMdHotelRoombtn= booking.selectRoombtn;
        int roombtnCount=booking.selectRoombtn.size();
        selectMdRandomRoom=booking.randomNumber(roombtnCount);
        actions.moveToElement(selectedHotelRoombtn.get(selectMdRandomRoom)).perform();
        selectedMdHotelRoombtn.get(selectMdRandomRoom).click();
        booking.confirmRoombtn.click();
//        wait.until(ExpectedConditions.invisibilityOf(booking.hotelName));
        String hotelMDNameText= booking.hotelName.getText();
        String roomMDTypeText=booking.roomType.getText();
        String boardMDTypeText= selectedBoardtype.get(selectMdRandomRoom).getText();
        System.out.println(hotelMDNameText);
        System.out.println(roomMDTypeText);
        System.out.println(boardMDTypeText);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='button']")));
        booking.goToselectNextbtn.click();
        booking.madinahTab.isDisplayed();
        String madinahTabText =booking.madinahTab.getText();
        wait.until(ExpectedConditions.visibilityOf(booking.getHotelName));
        String hotelNameInCart  =booking.getHotelName.getText();
        String roomTypeInCart   =booking.getRoomType.getText();
        String boardTypeInCart  =booking.getBoardType.getText();
        System.out.println("\n this is Madinah hotel shopping cart data"+"\n");
        System.out.println(madinahTabText);
        System.out.println(hotelNameInCart);
        System.out.println(roomTypeInCart);
        System.out.println(boardTypeInCart);
        actions.moveToElement(booking.hotelsCard.get(0)).click();
        System.out.println("\n this is Makkah hotel shopping cart data"+"\n");
        String makkahTabText =booking.makkahTab.getText();
        String hotelMkNameInCart  =booking.getHotelName.getText();
        String roomMkTypeInCart   =booking.getRoomType.getText();
        String boardMkTypeInCart  =booking.getBoardType.getText();
        System.out.println(makkahTabText);
        System.out.println(hotelMkNameInCart);
        System.out.println(roomMkTypeInCart);
        System.out.println(boardMkTypeInCart);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > app-root:nth-child(5) > app-shell:nth-child(2) > div:nth-child(1) > app-shell:nth-child(3) > div:nth-child(1) > app-umrah-planner-search-results:nth-child(3) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > app-umrah-planner-transportations-search-result:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > app-umrah-planner-transportation-card:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > button:nth-child(1)")));
//        validate madinah selection
        softAssert.assertEquals(hotelMDNameText,hotelNameInCart);
        softAssert.assertEquals(roomMDTypeText,roomTypeInCart);
        softAssert.assertEquals(boardMDTypeText,boardTypeInCart);
//        validate makkah selection
        softAssert.assertEquals(hotelMkNameText,hotelMkNameInCart);
        softAssert.assertEquals(roomMkTypeText,roomMkTypeInCart);
        softAssert.assertEquals(boardMkTypeText,boardMkTypeInCart);

    }

    @And("select Transportation")
    public void selectTransportation() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//app-umrah-planner-transportation-card[1]//div[1]//div[2]//div[3]//div[2]//button[1]")));
        wait.until(ExpectedConditions.visibilityOfAllElements(booking.transportationbtn));
        int transCount = booking.transportationbtn.size();
        System.out.println("this is the number of transportation company    "+transCount);
        int pageSize= booking.getPagination.size();
        System.out.println("this is the number of page    "+pageSize);
        transListbtn =booking.transportationbtn;
        transCompNamList =booking.getTransCompanyName;
        transCompPriceList =booking.getTransPrice;
        transRandom=booking.randomNumber(transCount);
        System.out.println("this is the selected index         " + transRandom);
        actions.moveToElement(transListbtn.get(transRandom)).perform();
        actions.moveToElement(transCompNamList.get(transRandom));
        String companyNam=transCompNamList.get(transRandom).getText();
        actions.moveToElement(transCompPriceList.get(transRandom));
        String price= transCompPriceList.get(transRandom).getText();
        transListbtn.get(transRandom).click();
        wait.until(ExpectedConditions.elementToBeClickable(booking.goToselectNextbtn)).click();

//        String TrcompNameInCart=booking.getTransCompNameInCart.getText();
        System.out.println("this is the selected company name on cart  "+booking.getTotalPriceInCart.getText());
        System.out.println("this is the selected trans Price    " + price);
        System.out.println("this is the selected company Name    "+companyNam);

    }

    @And("select Ground Service")
    public void selectGroundService() {
        groundservicList       =booking.getGroundserviceCard;
        groundServicelistbtn   =booking.getGroundServicebtn;
        groundServiceNameList  =booking.getGroundServiceCompName;
        groundServicePriceList =booking.getGroundServicePrice;
        int groundCount = groundServicelistbtn.size();
        groundRandom=booking.randomNumber(groundCount);
        System.out.println("this is the  ground service cards List size "+groundservicList.size());
        System.out.println("this is all available ground services List size "+groundCount);
        System.out.println("this is all ground service company names List size "+groundServiceNameList.size());
        System.out.println("this is ground service Price"+groundServicePriceList.size());
        wait.until(ExpectedConditions.visibilityOfAllElements(groundServicelistbtn));
        actions.moveToElement(groundServicelistbtn.get(groundRandom)).click();
        String groundServiceCompanyName =groundServiceNameList.get(groundRandom).getText();
        String groundServicePrice =groundServicePriceList.get(groundRandom).getText();
        System.out.println("this is the selected ground company "+groundServiceCompanyName);
        System.out.println("this is the selected ground Price   "+groundServicePrice);
        wait.until(ExpectedConditions.elementToBeClickable(booking.goToReviewbtn)).click();

    }
}
