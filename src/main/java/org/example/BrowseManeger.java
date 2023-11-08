package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowseManeger extends Utils{

    public static void openBrowser() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        // setting for chrome browser run
        driver = new ChromeDriver();
        // implicitly wait for each command
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // maximize full web screen
        driver.manage().window().maximize();
        //open url
        driver.get("https://demo.nopcommerce.com/");
    }


    public static void closeBrowser() {
        driver.quit();
    }












}
