package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils {
    public void verifyRegisterMessage(){
        // To verify actual with expected result
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class='result']")),
                "your registration completed","Your registration not successful");
        //message print
        System.out.println("your registration completed");
    }
    public void verifyCommentAddedSuccessfully(){
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class='result']")),
                "News comment is successfully added","Comment not added successfully");
                System.out.println("New comment is successfully added");
    }
    public void verifyCommentPresentInComments() {
        sleep(5000);
        boolean productDisplayed = driver.findElement(By.xpath("//div[@class='comment-content']")).isDisplayed();
        Assert.assertTrue(productDisplayed,"Comments are not displayed");
        System.out.println("Comment are displayed");
        boolean productDisplayed1 =driver.findElement(By.xpath("//span[@class='stat-value']")).isDisplayed();
        Assert.assertTrue(productDisplayed1,"Comments are not Displayed");
        System.out.println("Last comments displayed");

        //  Assert.assertEquals(getTextFromElement(By.linkText("Nice Store1")),"Nice store1","Title ofcommentr not expect" +
      //    System.out.println("Title of comment added successfully");
     //   Assert.assertEquals(getTextFromElement(By.linkText("Very Good Store and Product is woth themoney as well"))))
        System.out.println("Comment added successfully");
    }




    }



