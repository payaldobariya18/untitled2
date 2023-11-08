package org.example;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest{
   Homepage homepage = new Homepage();

   RegisterPage registerPage = new RegisterPage();
   RegisterPageResult registerPageResult= new RegisterPageResult();

   LogInPage logInPage= new LogInPage();

   CategoriesPage categoriesPage = new CategoriesPage();

   Utils utils = new Utils();
   CurrencyResult currencyResult=new CurrencyResult();
  DetailCommentPage detailCommentPage=new DetailCommentPage();

  NikePage nikePage = new NikePage();
  ComputersPage computersPage= new ComputersPage();





@Test
 public void VerifyUserShouldAbleToRegisterSuccessfully() {
    //click on register button
    homepage.clickOnRegisterButton();
    //verify user is on registerPage
    registerPage.verifyUserOnRegisterPage();
    //enter registration details
    registerPage.enterRegistrationDetails();    //verify user registered successfully
    registerPageResult.verifyUserRegisterSuccessfully();


}
 @Test
 public void verifyUserShouldAbleToLoginSuccessfully(){
    homepage.clickOnLoginButton();
    //enter login details
     logInPage.verifyUserShouldBeAbleTOLogIn();
    //verify user login successfully
    // logInPage.verfyUserLogInSuccessfully();


}
@Test
public void VerifyRegisteredUserShouldeEfferAProductToAFriend(){
    //click on login button
    homepage.clickOnLoginButton();
    //user logged in successfully
    logInPage.verifyUserShouldBeAbleTOLogIn();
    //click on electonics
    homepage.clickOnElectonics();
    //click on camera&photo
    categoriesPage.clickOnCameraAndPhoto();
    //click on NikonDS5500DSLR
    categoriesPage.clickOnNikonDS5500DSLR();
    //click on email a friend button
    categoriesPage.clickOnemailAFriendButton();
    //enter friend'a email adress
    categoriesPage.enterAFriendEmail();
    //enter a message
    categoriesPage.enterPersonalMessage();
    //sent a mail
    categoriesPage.clickOnSENDEMAILbutton();
    //verify user sent a message successfully
   categoriesPage.verifyUserShouldMailSuccessfully();


 }
@Test
public void verifyUserShouldAbleToHandleAlertOnSearchButton(){
    //click on search button
    homepage.clickOnSearchButton();
    //click on 'ok' button of the alert
   utils.acceptAlertbutton();
}
@Test
public void verifyUserShouldAbleToCaptureAlertMessageFromVoteButton(){
    //click on vote button
    homepage.clickOnVoteButton();
    //capture alert message
    homepage.verifyUsershouldAbleToCaptureAlertMessage();

}
@Test
public void verifyUserShouldAbleToChangeCurrency(){
    //click on currency box
    homepage.clickOnCurrencybox();
    //chnge currency
    currencyResult.CurrencyChange();

}
@Test
public void verifyUserShouldAbleTOAddCommentSuccessfully(){
    //click on details button
    homepage.clickOnDetailsButton();
    //enter title in title box
    detailCommentPage.enterTitle();
    //type comment in comment box
    detailCommentPage.enterComment();
    //click on NEW COMMENT button
    detailCommentPage.clickOnNEWCOMMENTButton();
    //verifyUserAddCommentSuccessfully
    detailCommentPage.verifyUserAddCommentSuccessfully();
}@Test
public void verifyUserSearchedProductContainsNikeWord(){
    //Type Nike
    homepage.typeNikeInSearchStoreBox();
    //Click on Search button
    homepage.clickOnSearchButton();
    //Verify Showed products contain Nike word
    nikePage.VerifyNikeWordOnEachProduct();
}
@Test
public void verifyUserShouldAbleToCheckoutSuccessfully(){
    //click on login button
    homepage.clickOnLoginButton();
    //user logged in successfully
    logInPage.verifyUserShouldBeAbleTOLogIn();
    //click on Computers
    homepage.clickOnComputers();
    //click on notebooks
    computersPage.clickOnNoteBooks();
    //click on Apple MacBookPro 13-inch
    computersPage.clickOnAppleMacBookPro13Inch();
    //click on Add to cart button
    computersPage.ClickOnAddToCartButton();
    //click on shoppingcart button
    computersPage.clickOnShoppingCartButton();
    //click on checkbox button
    computersPage.clickOnCheckBoxButton();
    //click on CHECHOUT button
    computersPage.clickOnCHECKOUTButton();
    //enter cheout details
    computersPage.checkoutDetails();
    //click on continue button
    computersPage.clickOnContinueButton();
    //click on again continue button
    computersPage.clickonAgainContinueButton();
    //click on creditcard
    computersPage.clickOnCreditcard();
    //click on continue
    computersPage.clickOnContinue();
    computersPage.enterPaymentDetails();









}









}








