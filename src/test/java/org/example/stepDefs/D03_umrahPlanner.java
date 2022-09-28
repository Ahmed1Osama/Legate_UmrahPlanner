package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.example.pages.P03_home;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.time.LocalDate;

import static org.example.stepDefs.Hooks.driver;

public class D03_umrahPlanner {

    P03_home planner = new P03_home();
    Actions actions = new Actions(driver);
    SoftAssert soft = new SoftAssert();
    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
            .withTimeout(Duration.ofSeconds(30))
            .pollingEvery(Duration.ofSeconds(5))
            .ignoring(NoSuchElementException.class);



    @Given("user go to planner tab")
    public void plannerTab(){
        planner.getPlannerTab.click();
    }

    @When("user select Path")
    public void userSelectPath() {
        planner.getRoute.click();
       int  lSize =  planner.getRouteList.size();
       System.out.println(lSize);
       planner.getRouteList.get(7).click();

    }



    @And("user Fill Guests {string} {string} {string}")
    public void userFillGuests(String arg0, String arg1, String arg2) throws InterruptedException {

        int roomTyp = Integer.parseInt(arg0);
        int roomCo = Integer.parseInt(arg1);
        int aDt = Integer.parseInt(arg2);
        System.out.println(roomTyp);
        System.out.println(roomCo);
        System.out.println(aDt);

        if (roomTyp == 1 && roomCo == 1 && aDt == 2) {
            System.out.println("this is deafult");
        } else if (roomTyp > 1 && roomCo >= 1 && aDt > 2) {
            planner.getGest.click();
            for (int i = 1; i <= roomTyp-2; i++) {
                planner.addADTbtn.click();
            }
            for (int i =1;i<=roomCo-1; i++ ){
                planner.addRoomCountbtn.click();
            }
            for (int i =1;i< aDt-2; i++ ){
                planner.addADTbtn.click();
            }
        }

        }

    @And("Fill Vehicles{string}")
    public void fillVehicles(String arg0) {
      planner.getVehiclebtn.click();
        System.out.println(" this is all available vehicles  "   + planner.getVehiclebtn.getText());

        switch (arg0){
            case "1":planner.getVechile1.click();
                break;
            case "2":planner.getVechile2.click();
                break;
            case "3":planner.getVechile3.click();
                break;
            case "4":planner.getVechile4.click();
                break;
            case "5":planner.getVechile5.click();
                break;
            case "6":planner.getVechile6.click();
                break;
            case "7":planner.getVechile7.click();
                break;

        }
    }


    @And("Fill Nationality{string}")
    public void fillNationality(String arg0) {
        planner.getnationalitybtn.click();
        System.out.println(planner.getnationalitybtn.getText());
        planner.nationality.sendKeys(arg0);
        planner.okNationalitybtn.click();
    }

    @And("Fill Country {string} and Click Search Package")
    public void fillCountryAndClickSearchPackage(String arg0) {
        planner.getCountry.click();
        planner.country.sendKeys(arg0);
        planner.okCountry.click();

    }

    @And("user Fill Spent Nights on {string}and{string}and{string}")
    public void userFillSpentNightsOnAnd(String arg0,String arg2 ,String arg1) throws InterruptedException {

        planner.getnightbtn.click();

        int makkahNight = Integer.parseInt(arg0);
        int madinahNight= Integer.parseInt(arg1);
        System.out.println("the makkah total night is     "+makkahNight);
        System.out.println("the madinah total night is     "+madinahNight);

        if (makkahNight > 5 ) {
            for (int i = 0; i < makkahNight - 5; i++) {
                planner.addMakkahNightbtn.click();
                System.out.println("Total  makkah night is   " + makkahNight);
            }


        } else if (makkahNight < 5){
            for (int i = 0 ; i < 5-makkahNight ; i++){
                planner.minusMakkahNightbtn.click();
                System.out.println("Total  makkah night is   "+ makkahNight);
            }
        }
        if (arg2.equals("no")){
            planner.getMadinahNightbtn.click();
        }
        else {

            if (madinahNight > 5) {
                for (int i = 0; i < madinahNight - 5; i++) {
                    planner.addMadinahNightbtn.click();
                }
                System.out.println("Total  madinah night is   " + madinahNight);

            } else if (madinahNight < 5) {
                for (int i = 0; i < 5 - madinahNight; i++) {
                    planner.minusMadinahhNightbtn.click();
                }
                System.out.println("Total  madinah night is   " + madinahNight);
            }
        }

    }


    @And("user Fill Date{string}{string}{string}")
    public void userFillDate(String arg0, String arg1, String arg2) throws InterruptedException {
        planner.getdate.click();
        System.out.println(planner.getMonth.getText());
        System.out.println(planner.getDay.getText());
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//tr[@class='ng-star-inserted']/td[@class='ng-star-inserted' ]/span[contains(text(),"+arg0+") and not(@class='is-other-month ng-star-inserted') and not(@class='disabled is-other-month ng-star-inserted')]")));
//        driver.findElement(By.xpath(".//tr[@class='ng-star-inserted']/td[@class='ng-star-inserted' ]/span[contains(text(),"+arg0+") and not(@class='is-other-month ng-star-inserted') and not(@class='disabled is-other-month ng-star-inserted')]")).click();

        while (true){
            String currentMonth= planner.getMonth.getText();
            String curryear  = planner.getYear.getText();
            String day = arg0;
              if (arg1.equals(currentMonth) && arg2.equals(curryear) ){
                  break;
            }else {
                  wait.until(ExpectedConditions.elementToBeClickable(planner.forwardDaybtn)).click();
              }
        }
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//tr[@class='ng-star-inserted']/td[@class='ng-star-inserted' ]/span[contains(text(),"+arg0+") and not(@class='is-other-month ng-star-inserted') and not(@class='disabled is-other-month ng-star-inserted')]"))).click();
    }

    @Then("user go to Search result Page")
    public void userGoToSearchResultPage() throws InterruptedException {
        planner.searchbtn.click();
       String actualResult =driver.getCurrentUrl();
       String expectedresult="https://b2c.stg.legateonline.com/en/umrah/planner/results?";
//        https://b2c.stg.legateonline.com/en/umrah/planner/results?
        soft.assertEquals(actualResult,expectedresult);

    }
}

