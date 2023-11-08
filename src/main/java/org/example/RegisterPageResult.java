package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPageResult extends Utils{
String expectedRegistrationSuccessMessage = "Your registration completed";

public void verifyUserRegisterSuccessfully(){
 String actualRegisterationSuccessMessage = getTextFromElement(By.xpath("//div[@class=\"result\"]"));
    Assert.assertEquals(actualRegisterationSuccessMessage,expectedRegistrationSuccessMessage,"Your registration is not completed");


}









}
