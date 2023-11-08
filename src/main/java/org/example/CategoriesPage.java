package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CategoriesPage extends Utils {

   String expecteSuccessMessage = "Your message has been sent.";

   public void clickOnCameraAndPhoto() {

      clickonelements(By.xpath("//h2[@class=\"title\"]//a[@href=\"/camera-photo\"]"));

   }

   public void clickOnNikonDS5500DSLR() {
      clickonelements(By.xpath("//div[@class=\"picture\"]//a[@href=\"/nikon-d5500-dslr\"]"));

   }

   public void clickOnemailAFriendButton() {
      clickonelements(By.xpath("//div[@class=\"email-a-friend\"]//button[@type=\"button\"]"));

   }

   public void enterAFriendEmail() {
      typetext(By.id("FriendEmail"), "aashutosh@gmail.com");
   }

   public void enterPersonalMessage() {
      typetext(By.id("PersonalMessage"), "It's a very useful item and is available on half price ");
   }

   public void clickOnSENDEMAILbutton() {
      clickonelements(By.xpath("//div[@class=\"buttons\"]//button[@type=\"submit\"]"));
   }

   public void verifyUserShouldMailSuccessfully() {

      String actualSuccessMessage = getTextFromElement(By.className("result"));
      Assert.assertEquals(actualSuccessMessage,expecteSuccessMessage,"Your message is not sent");
      System.out.println(actualSuccessMessage);

   }
}