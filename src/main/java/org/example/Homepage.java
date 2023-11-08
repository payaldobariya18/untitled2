package org.example;

import org.openqa.selenium.By;

public class Homepage extends Utils {

    public void clickOnRegisterButton() {
        clickonelements(By.xpath("//a[text()=\"Register\"]"));

    }

    public void clickOnLoginButton() {
        clickonelements(By.className("ico-login"));//click on login button
    }

    public void clickOnElectonics() {
        clickonelements(By.xpath("//h2[@class=\"title\"]/a[@href=\"/electronics\"]"));
    }

    public void clickOnSearchButton() {
        clickonelements(By.xpath("//div[@class=\"header-lower\"]/div[2]/form/button"));
    }

    public void clickOnVoteButton() {
        clickonelements(By.id("vote-poll-1"));
    }

    public void verifyUsershouldAbleToCaptureAlertMessage() {
        String alertMessage = driver.switchTo().alert().getText();
        System.out.println(alertMessage);
    }

    public void clickOnCurrencybox() {
        clickonelements(By.id("customerCurrency"));

    }

    public void clickOnDetailsButton() {
        clickonelements(By.xpath("//div[@class=\"buttons\"]//a[@href=\"/nopcommerce-new-release\"]"));
    }

    public void typeNikeInSearchStoreBox() {
        typetext(By.id("small-searchterms"), "Nike");

    }
    public void clickOnComputers(){
        clickonelements(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/computers\"]"));
    }


}




//String alertMessage = driver.switchTo().alert().getText();