package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class NikePage extends Utils{

      String expectedWord = "Nike";
    public void VerifyNikeWordOnEachProduct(){
        String actualProductNAme = getTextFromElement(By.xpath("//h2[@class=\"product-title\"]"));
        Assert.assertTrue(actualProductNAme.contains(expectedWord),"Product does not contain Nike word");

    }

}
