package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class LogInPage extends Utils {
    String expectedLoginMessage = "Log out";


    public void verifyUserShouldBeAbleTOLogIn() {

        typetext(By.xpath("//input[@id=\"Email\"]"), email);//enter email adress

        typetext(By.className("password"), password);//enter password

        clickonelements(By.xpath("//button[contains(@class, 'login-button')]")); //click on login button for login successfully and on screen it shows logout


    }

//    public void verfyUserLogInSuccessfully() {
//
//        String actualLoginMessage = getTextFromElement(By.xpath("//a[@class=\"ico-logout\"]"));
//        Assert.assertEquals(actualLoginMessage, expectedLoginMessage, "User should not login successfully");


    }

