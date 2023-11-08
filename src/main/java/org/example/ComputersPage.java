package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ComputersPage extends Utils{

   public void clickOnNoteBooks(){
       clickonelements(By.xpath("//h2[@class=\"title\"]//a[@href=\"/notebooks\"]"));
   }
    public void clickOnAppleMacBookPro13Inch(){
        clickonelements(By.xpath("//h2[@class=\"product-title\"]//a[@href=\"/apple-macbook-pro-13-inch\"]"));
    }

  public void ClickOnAddToCartButton(){
      clickonelements(By.id("add-to-cart-button-4"));
  }
  public void clickOnShoppingCartButton(){
      //waitForElementtobeDisappear(By.xpath("//p[@class=\"content\"]"),10);
      clickonelements(By.className("cart-label"));
  }
  public void clickOnCheckBoxButton(){
      clickonelements(By.id("termsofservice"));
  }
  public void clickOnCHECKOUTButton(){
      clickonelements(By.id("checkout"));
  }
  public void checkoutDetails(){
       //enter first name
//      typetext(By.id("BillingNewAddress_FirstName"), "Nick");//enter firstname
//      //enter Last name
//      typetext(By.id("BillingNewAddress_LastName"), "Jonas");//enter lastname
//      //select country
      Select selectCountry = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
      selectCountry.selectByVisibleText("Angola");  //Dropdown Month
      //enter cityanme
      typetext(By.id("BillingNewAddress_City"),"London");
      //enter adreess
      typetext(By.id("BillingNewAddress_Address1"),"123 somewhere else ");
      //enter postal code
      typetext(By.id("BillingNewAddress_ZipPostalCode"),"56yu90");
      //enter phonenumber
      typetext(By.id("BillingNewAddress_PhoneNumber"),"07984539023");
   }
  public void clickOnContinueButton(){
       clickonelements(By.xpath("(//button[@name=\"save\"])[1]"));
  }
  public void clickonAgainContinueButton(){
       clickonelements(By.xpath("//div[@id=\"checkout-step-shipping-method\"]/form/div[2]/button"));

  }
  public void clickOnCreditcard(){
       clickonelements(By.xpath("//img[@src=\"https://demo.nopcommerce.com/Plugins/Payments.Manual/logo.jpg\"]"));
  }
  public void clickOnContinue(){
       clickonelements(By.xpath("(//button[@name=\"save\"])[2]"));

  }
  public void enterPaymentDetails(){
      //select card
      Select selectCreditCard = new Select(driver.findElement(By.id("CreditCardType")));
      selectCreditCard.selectByVisibleText("Master card");
      //type card holder name
      typetext(By.id("CardholderName"),"Nick Jonas");
      //type card number
      typetext(By.id("CardNumber"),"6767674589238709");
      //exp date
      Select selectMonth = new Select(driver.findElement(By.id("ExpireMonth")));
      selectMonth.selectByIndex(5);
      Select selectYear= new Select(driver.findElement(By.id("ExpireYear")));
      selectYear.selectByValue("2024");
      //cardcode
      typetext(By.id("CardCode"),"789");}
  public void clickOnLastContinueButton(){

       clickonelements(By.xpath("(//div[@class=\"buttons\"]//button[@type=\"button\"])[12]"));







  }

  }




