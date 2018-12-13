package com.amazon;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class testTheHomePage extends baseTestTheHomePage {

    public static void main(String[] args) throws InterruptedException {

        // Create a new instance of the Firefox driver
        WebDriver driver = new ChromeDriver();

        //Launch the Online Store Website
        driver.get("http://www.amazon.com");

        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");

        //Wait for 5 Sec
        sleep(5000);

        // Close the driver
        driver.quit();
    }

    @Test
    public void SAPSFCreateNewEmployee() throws InterruptedException {
        GetGlobalVariables();
        // Start a new Chrome browser instance and maximize the browser window
        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        System.out.println("***maximised the browser window");
        // Navigate to the SAPstore.com home page
        driver.get("https://pmsalesdemo8.successfactors.com/login?company=SFPART016109#/login");
        System.out.println("***navigated to website");
        sleep(3000);

//        Login to Success Factors
        driver.findElement(By.id("__input1-inner")).sendKeys("crichardson");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("__input2-inner")).sendKeys("Zag2018!");

//        Click on the Login button
//        driver.findElement(By.id("__button2-content")).click();
//        $(byText("Log in")).click();
        driver.findElement(By.id("__button2")).click();
        sleep(10000);


        // Type "Add New Employee" in the search field
        driver.findElement(By.id("bizXSearchField-I")).sendKeys(valueToBeSearched2);
        System.out.println("***typed the search item");
        sleep(3000);

//        Send the Enter Key twice
        WebElement textbox = driver.findElement(By.id("bizXSearchField-I"));
        sleep(3000);
        textbox.sendKeys(Keys.RETURN);
        sleep(3000);
        textbox.sendKeys(Keys.RETURN);
        // Click on the search button
//        driver.findElement(By.xpath("//input[@value='Go']")).click();
//        driver.findElement(By.xpath("//*[@id='submit-search']")).click();
        System.out.println("***clicked on the search button");
        sleep(3000);

//        Add new employee details
//        driver.findElement(By.id("__box0")).setValue;
        sleep(5000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("__input0-inner")).sendKeys("James");
        sleep(5000);
        driver.findElement(By.id("__input0-inner")).sendKeys(Keys.TAB);
//        Actions action = new Actions(driver);
//        action.moveToElement("__input1-inner");
        sleep(5000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("__input1-inner")).sendKeys("Tiberius");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        action.moveToElement((By.id("__input2-inner"));
        driver.findElement(By.id("__input2-inner")).sendKeys("Kirk");
        sleep(5000);



//
// close the browser
        driver.quit();
        System.out.println("***closed down browser");

    }



    //    public static String USERNAME = "robertoureta4";
    public static String USERNAME = "robert1049";
    //    public static String AUTOMATE_KEY = "djqU7LpGsAeKWFcx93hB";
    public static String AUTOMATE_KEY = "jHiuD4CFHSS3AB8sQQN3";
    public static String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    @Test
    public void SAPSuccessFactorsCreateNewEmployeeViaBrowserStack() throws MalformedURLException, InterruptedException {
        GetGlobalVariables();

//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("browserName", "iPhone");
//        caps.setCapability("device", "iPhone 8 Plus");
//        caps.setCapability("realMobile", "true");
//        caps.setCapability("os_version", "11.0");
//        caps.setCapability("browserstack.debug", "true");

//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("browser", "Firefox");
//        caps.setCapability("browser_version", "63.0");
//        caps.setCapability("os", "Windows");
//        caps.setCapability("os_version", "10");
//        caps.setCapability("resolution", "1024x768");


//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("browser", "Chrome");
//        caps.setCapability("browser_version", "62.0");
//        caps.setCapability("os", "Windows");
//        caps.setCapability("os_version", "10");
//        caps.setCapability("resolution", "1024x768");


        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "IE");
        caps.setCapability("browser_version", "11.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("resolution", "1024x768");


//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("browser", "IE");
//        caps.setCapability("browser_version", "11.0");
//        caps.setCapability("os", "Windows");
//        caps.setCapability("os_version", "10");
//        caps.setCapability("resolution", "1280x1024");


//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("browserName", "android");
//        caps.setCapability("device", "Samsung Galaxy S8 Plus");
//        caps.setCapability("realMobile", "true");
//        caps.setCapability("os_version", "7.0");

        java.net.URL browserStackURL = new URL(URL);
        WebDriver driver = new RemoteWebDriver(browserStackURL, caps);
        driver.manage().window().maximize();
//        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//        driver.get("http://www.google.com");

        driver.get("https://pmsalesdemo8.successfactors.com/login?company=SFPART016109#/login");
        sleep(10000);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.id("__input1-inner")).sendKeys("crichardson");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("__input2-inner")).sendKeys("Zag2018!");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("__button2-content")).click();
        sleep(7000);
        // Type "Add New Employee" in the search field
        driver.findElement(By.id("bizXSearchField-I")).sendKeys(valueToBeSearched2);
        System.out.println("***typed the search item");
        sleep(5000);

//        Send the Enter Key twice
        WebElement textbox = driver.findElement(By.id("bizXSearchField-I"));
        sleep(3000);
        textbox.sendKeys(Keys.RETURN);
        sleep(3000);
        textbox.sendKeys(Keys.RETURN);
        // Click on the search button
//        driver.findElement(By.xpath("//input[@value='Go']")).click();
//        driver.findElement(By.xpath("//*[@id='submit-search']")).click();
        System.out.println("***clicked on the search button");
        sleep(10000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("__input0-inner")).sendKeys("James");
        sleep(5000);
        driver.findElement(By.id("__input0-inner")).sendKeys(Keys.TAB);
//        Actions action = new Actions(driver);
//        action.moveToElement("__input1-inner");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("__input1-inner")).sendKeys("Tiberius");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        action.moveToElement((By.id("__input2-inner"));
        driver.findElement(By.id("__input2-inner")).sendKeys("Kirk");
        sleep(5000);
//
        driver.quit();
    }

    @Test
    public void SAPSFCreateNewEmployeeViaBrowserStack() throws MalformedURLException, InterruptedException {
        GetGlobalVariables();

//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("browserName", "iPhone");
//        caps.setCapability("device", "iPhone 8 Plus");
//        caps.setCapability("realMobile", "true");
//        caps.setCapability("os_version", "11.0");
//        caps.setCapability("browserstack.debug", "true");

//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("browser", "Firefox");
//        caps.setCapability("browser_version", "63.0");
//        caps.setCapability("os", "Windows");
//        caps.setCapability("os_version", "10");
//        caps.setCapability("resolution", "1024x768");


//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("browser", "Chrome");
//        caps.setCapability("browser_version", "62.0");
//        caps.setCapability("os", "Windows");
//        caps.setCapability("os_version", "10");
//        caps.setCapability("resolution", "1024x768");


        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "IE");
        caps.setCapability("browser_version", "11.0");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("resolution", "1024x768");


//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("browser", "IE");
//        caps.setCapability("browser_version", "11.0");
//        caps.setCapability("os", "Windows");
//        caps.setCapability("os_version", "10");
//        caps.setCapability("resolution", "1280x1024");


//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("browserName", "android");
//        caps.setCapability("device", "Samsung Galaxy S8 Plus");
//        caps.setCapability("realMobile", "true");
//        caps.setCapability("os_version", "7.0");

        java.net.URL browserStackURL = new URL(URL);
        WebDriver driver = new RemoteWebDriver(browserStackURL, caps);
        driver.manage().window().maximize();
//        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//        driver.get("http://www.google.com");

        driver.get("https://pmsalesdemo8.successfactors.com/login?company=SFPART016109#/login");
        sleep(10000);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.id("__input1-inner")).sendKeys("crichardson");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("__input2-inner")).sendKeys("Zag2018!");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("__button2-content")).click();
        sleep(7000);
        // Type "Add New Employee" in the search field
        driver.findElement(By.id("bizXSearchField-I")).sendKeys(valueToBeSearched2);
        System.out.println("***typed the search item");
        sleep(5000);

//        Send the Enter Key twice
        WebElement textbox = driver.findElement(By.id("bizXSearchField-I"));
        sleep(3000);
        textbox.sendKeys(Keys.RETURN);
        sleep(3000);
        textbox.sendKeys(Keys.RETURN);
        // Click on the search button
//        driver.findElement(By.xpath("//input[@value='Go']")).click();
//        driver.findElement(By.xpath("//*[@id='submit-search']")).click();
        System.out.println("***clicked on the search button");
        sleep(10000);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("__input0-inner")).sendKeys("James");
        System.out.println("***typed in First Name");
        sleep(5000);
        driver.findElement(By.id("__input0-inner")).sendKeys(Keys.TAB);
//        Actions action = new Actions(driver);
//        action.moveToElement("__input1-inner");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("__input1-inner")).sendKeys("Tiberius");
        System.out.println("***typed in Middle Name");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        action.moveToElement((By.id("__input2-inner"));
        driver.findElement(By.id("__input2-inner")).sendKeys("Kirk");
        System.out.println("***typed in Last Name");
        sleep(5000);
//
        driver.quit();
    }

}
