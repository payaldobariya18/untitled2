package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BrowseManeger{
    @BeforeMethod
    public void setUp(){
        openBrowser();
    }
   // @AfterMethod
    public void tearDown(){
        closeBrowser();
    }


}
