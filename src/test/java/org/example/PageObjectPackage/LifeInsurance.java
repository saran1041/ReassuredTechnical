package org.example.PageObjectPackage;

import org.apache.commons.io.FileUtils;
import org.example.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class LifeInsurance extends DriverFactory {

    @FindBy(xpath = "//button[@id='LifeInsurance_LifeInsurance_CookieBanner_Close']")
    WebElement cookie;                          //element for handling cookie

    @FindBy(xpath = "//a[@id='LifeInsurance_LifeInsurance_LifeHeroBlock_GetAQuoteCTA']")
    WebElement getAQuote;                       //element for Get a quote

    @FindBy(xpath = "//input[@id='LifeInsurance_YourDetails_YourDetails_WhoToCover_JM']")
    WebElement justMyself;                      //element for single quote

    @FindBy(xpath = "//input[@id='LifeInsurance_YourDetails_YourDetails_YourTitle_MR']")
    WebElement titleMr;                         //element for title - Mr

    @FindBy(xpath = "//input[@id='LifeInsurance_YourDetails_YourDetails_YourFirstName']")
    WebElement firstName;                       //element for first name

    @FindBy(xpath = "//input[@id='LifeInsurance_YourDetails_YourDetails_YourLastName']")
    WebElement surname;                         //element for surname

    @FindBy(xpath = "//select[@id='LifeInsurance_YourDetails_YourDetails_YourDateOfBirth_Day']")
    WebElement day;                             //element for day box to select date of birth

    @FindBy(xpath = "//select[@id='LifeInsurance_YourDetails_YourDetails_YourDateOfBirth_Month']")
    WebElement month;                           //element for month box to select date of birth

    @FindBy(xpath = "//select[@id='LifeInsurance_YourDetails_YourDetails_YourDateOfBirth_Year']")
    WebElement year;                            //element for year box to select date of birth

    @FindBy(xpath = "//input[@id='LifeInsurance_YourDetails_YourDetails_YourSmoke_NO']")
    WebElement noSmoking;

    @FindBy(xpath = "//input[@id='LifeInsurance_YourDetails_YourLifeCover_CoverType_LT']")
    WebElement levelTerm;

    @FindBy(xpath = "//input[@id='LifeInsurance_YourDetails_YourLifeCover_TermYears']")
    WebElement coverTerm;

    @FindBy(xpath = "//input[@id='LifeInsurance_YourDetails_YourLifeCover_CoverAmount']")
    WebElement coverAmount;

    @FindBy(xpath = "//input[@id='LifeInsurance_YourDetails_YourLifeCover_CriticalIllnessCover_YES']")
    WebElement criticalIllnessYes;

    @FindBy(xpath = "//input[@id='LifeInsurance_YourDetails_YourLifeCover_CriticalIllnessCoverType_A']")
    WebElement additionalType;

    @FindBy(xpath = "//input[@id='LifeInsurance_YourDetails_YourLifeCover_CriticalIllnessAmount']")
    WebElement additionalAmount;

    @FindBy(xpath = "//input[@id='LifeInsurance_YourDetails_YourContactDetails_EmailAddress']")
    WebElement email;

    @FindBy(xpath = "//input[@id='LifeInsurance_YourDetails_YourContactDetails_PhoneNumber']")
    WebElement phoneNumber;

    @FindBy(xpath = "//input[@id='LifeInsurance_YourDetails_YourContactDetails_Address_HouseNumberOrName']")
    WebElement houseNumber;

    @FindBy(xpath = "//input[@id='LifeInsurance_YourDetails_YourContactDetails_Address_Postcode']")
    WebElement postcode;

    @FindBy(xpath = "//button[@id='Address_FindMyAddress']")
    WebElement findAddress;

    @FindBy(xpath = "//input[@id='LifeInsurance_YourDetails_ContactPreferences_ContactPreferences_doNotContact']")
    WebElement doNotContact;

    @FindBy(xpath = "//input[@id='LifeInsurance_YourDetails_TheLegalBit_AcceptTermsAndConditions']")
    WebElement confirm;

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/section[9]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
    WebElement findAQuote;

    //@FindBy(xpath = "//button[@id='LifeInsurance_YourQuotes_Filter_CriticalIllnessCover_Remove']")
    //WebElement removeCritical;

    @FindBy(xpath = "//button[@id='LifeInsurance_YourQuotes_Filter_FilterResults_UpdateResults']")
    WebElement updateResult;

    public void scrollPageMethod() throws InterruptedException {             //method to scroll down the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200);");
        Thread.sleep(500);
    }

    public void cookieMethod() throws InterruptedException {                 //method to handle cookie
        Thread.sleep(1000);
        cookie.click();
    }

    public void currentURLAssertion() throws InterruptedException {          //method to assert given URL
        Thread.sleep(1000);
        String actual = driver.getCurrentUrl();
        Assert.assertThat(actual, Matchers.containsString("life-insurance"));
    }

    public void getAQuoteMethod() throws InterruptedException {              //method to click on Get a quote
        getAQuote.click();
    }


    public void lifeInsuranceHeader() throws InterruptedException {          //method to assert Life Insurance header
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement lifeInsuranceTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/div[1]/div[2]/h1[1]")));
        String actual = lifeInsuranceTitle.getText();
        Assert.assertThat(actual, Matchers.containsString("insurance"));
    }

    public void singleQuoteMethod() throws InterruptedException {            //method to click on 'Just Myself'
        Thread.sleep(1000);
        justMyself.click();
    }

    public void titleMethod(){                                                //method to click on title
        titleMr.click();
    }

    public void firstNameMethod() throws InterruptedException {              //method to input valid first name
        Thread.sleep(500);
        firstName.sendKeys("Insurance");
    }

    public void lastNameMethod() throws InterruptedException {               //method to input valid surname
        Thread.sleep(500);
        surname.sendKeys("Quote");
    }

    public void dateOfBirthMethod() throws InterruptedException {            //method to select date using Select class method
        Thread.sleep(500);
        Select dayObj = new Select(day);
        dayObj.selectByIndex(5);                 //selected date by index

        day.sendKeys(Keys.TAB);                 //used tab key to go to next element - month

        Thread.sleep(500);
        Select monthObj = new Select(month);
        monthObj.selectByVisibleText("January");    //selected month by visible text

        month.sendKeys(Keys.TAB);               //used tab key to go to next element - year

        Thread.sleep(500);
        Select yearObj = new Select(year);
        yearObj.selectByValue("1980");          //selected year by value
    }

    public void smokingMethod() throws InterruptedException {
        noSmoking.click();
        Thread.sleep(500);
    }

    public void coverTypeMethod() throws InterruptedException {
        levelTerm.click();
        Thread.sleep(500);
    }

    public void coverTermMethod() throws InterruptedException {
        coverTerm.sendKeys("20");
        Thread.sleep(500);
    }

    public void coverAmountMethod() throws InterruptedException {
        coverAmount.sendKeys("250000");
        Thread.sleep(500);
    }

    public void criticalIllnessMethod() throws InterruptedException {
        criticalIllnessYes.click();                 //to click on yes for critical illness cover
        Thread.sleep(500);
    }

    public void criticalIllnessTypeMethod() throws InterruptedException {
        additionalType.click();                    //to click on addition type critical illness
        Thread.sleep(500);
    }

    public void additionalAmountMethod() throws InterruptedException {
        additionalAmount.sendKeys("15000");     //entered amount additional critical illness cover
        Thread.sleep(500);
    }

    public void emailMethod() throws InterruptedException {
        email.sendKeys("widecem309@mailreds.com");      //entered provided email
        Thread.sleep(500);
    }

    public void phoneNumberMethod() throws InterruptedException {
        phoneNumber.sendKeys("07812120038");            //entered provided phone number
        Thread.sleep(500);
    }

    public void houseNumberMethod() throws InterruptedException {
        houseNumber.sendKeys("7");
        Thread.sleep(500);
    }

    public void postcodeMethod() throws InterruptedException {
        postcode.sendKeys("RG1 6NY");
        Thread.sleep(500);
    }

    public void findAddressMethod() throws InterruptedException {
        findAddress.click();
        Thread.sleep(500);
    }

    public void contactPreferenceMethod() throws InterruptedException {
        doNotContact.click();
        Thread.sleep(500);
    }

    public void confirmMethod() throws InterruptedException {
        confirm.click();
        Thread.sleep(500);
    }

    public void findAQuoteMethod() throws InterruptedException {
        findAQuote.click();
        Thread.sleep(500);
    }

    public void removeCriticalMethod() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver,20);
        WebElement removeCritical = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='LifeInsurance_YourQuotes_Filter_CriticalIllnessCover_Remove']")));
        removeCritical.click();
    }

    public void updateResultMethod() throws InterruptedException {
        Thread.sleep(1000);
        updateResult.click();
    }

    public void screenshotWithCritical() throws IOException, InterruptedException {
        Thread.sleep(15000);
        TakesScreenshot screenshot = ((TakesScreenshot) driver);
        File sourcefile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destinationFolder = new File("C:\\withCritical.png");
        FileUtils.copyFile(sourcefile,destinationFolder);
    }

    public void screenshotWithoutCritical() throws IOException, InterruptedException {
        Thread.sleep(15000);
        TakesScreenshot screenshot = ((TakesScreenshot) driver);
        File sourcefile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destinationFolder = new File("C:\\withoutCritical.png");
        FileUtils.copyFile(sourcefile,destinationFolder);
    }
}
