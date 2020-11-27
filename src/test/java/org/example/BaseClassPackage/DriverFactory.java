package org.example.BaseClassPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver;

    public DriverFactory(){
        PageFactory.initElements(driver,this);
    }

    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://life-journey.comparethemarket.com/?AFFCLIE=CM01&wip=5fc0d8a5803a821f862dc934");
        //the reason I have not given URL because reCaptcha is not allowing Selenium
        driver.manage().window().maximize();
    }

    public void closeBrowser() throws InterruptedException {
        driver.quit();
    }
}
