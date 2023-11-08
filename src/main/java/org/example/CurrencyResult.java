package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CurrencyResult extends Utils{


    public void CurrencyChange(){
        Select selectCurrency = new Select(driver.findElement(By.id("customerCurrency")));
        selectCurrency.selectByVisibleText("Euro");  //Dropdown Month

    }



}
