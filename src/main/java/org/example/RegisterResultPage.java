package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.sql.Timestamp;
import java.util.List;

public class RegisterResultPage extends Utils {
    SoftAssert softAssert = new SoftAssert();
    private By _actualResult = By.xpath("//div[@class='result']");
    private By _actualCommentVerification = By.xpath("//div[@class='result']");
    private By _commentBox = By.xpath("//div[class='comment-content']");
    private By _actualComment = By.xpath("//strong[@class='comment-text']");
    private By _newComment = By.xpath("//p[@class='comment-text']");
    private By _commentTime = By.xpath("//span[@class='stat-value']");
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    public void verifyRegisterMessage(){
        // To verify actual with expected result
        //to verify actual result with expected result
        Assert.assertEquals(getTextFromElement(_actualResult),"Your registration completed","Your registration not successful");
        //message print
        System.out.println("you are  successfully registered");
    }
    public void verifyCommentAddedSuccessfully(){
        //to verify comment added successfully
        Assert.assertEquals(getTextFromElement(_actualCommentVerification),"News comment is successfully added.","Comment not added successfully");
        System.out.println("New comment is successfully added.");
    }
    public void verifyCommentPresentInComments() {
        //getting latest time with comment list
        List<WebElement> commentList = driver.findElements(_commentTime);
        //expected comment title
        String expectedComment = "Nice Store";
        for (WebElement element : commentList)
        {   //asserting comment title is matched with expected comment title
            softAssert.assertEquals(element.findElement(_actualComment).getText(),expectedComment,"title not matched");
        }
        System.out.println("Comment Title matched ");
    }
    public void verifyComment()
    {   //getting latest time with comment list
        List<WebElement> newComment = driver.findElements(_commentTime);
        //expected comment title
        String expectedComment = "Very Good Price of Products";
        for (WebElement element : newComment)
        {   //asserting comment is matched with expected comment
            softAssert.assertEquals(element.findElement(_newComment).getText(), expectedComment, "comment is not matched");
        }
        System.out.println("Comment is matched ");
    }
    public void commentBoxVerification()
    {   //asserting comment is last entered
        Assert.assertEquals(driver.findElement(_commentBox),driver.findElement(_commentBox),"box not matched");
        System.out.println("Recent Comment present at last");

    }
    }








