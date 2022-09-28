package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;
    @Before
    public static void openBroeser(){
//        create bridge

        System.setProperty("webdriver.chrome.driver","C:\\Users\\NOTEBOOK\\Desktop\\Legate_UmrahPlanner\\drivers\\chromedriver.exe");
//       create object from driver

        driver = new ChromeDriver();

//        mange driver
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        navigate to  Url
        driver.get("https://b2c.stg.legateonline.com/en/home");

    }
    @After
    public static void quitBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();

    }
}
