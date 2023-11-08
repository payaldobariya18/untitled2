package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class DetailCommentPage extends Utils{
    String expectedCommentSuccessMessage = "News comment is successfully added.";

    public void enterTitle(){
        //enter title
        typetext(By.id("AddNewComment_CommentTitle"),"JOseph");}
    public void enterComment(){
        //type comment
        typetext(By.className("enter-comment-text"),"This is very useful website for shopping purpose");}

    public void clickOnNEWCOMMENTButton(){
        //click on NEW COMMENT button
        clickonelements(By.xpath("//button[@name=\"add-comment\"]"));
    }
    public void verifyUserAddCommentSuccessfully(){
        String actualCommentSuccessMessage = getTextFromElement(By.xpath("//div[@class=\"result\"]"));
        Assert.assertEquals(actualCommentSuccessMessage,expectedCommentSuccessMessage,"News comment is not added.");


    }



}
