package org.example;

import org.openqa.selenium.By;

public class NewOnlinePage extends Utils
{   LoadProperty loadProperty = new LoadProperty();
    private By _commentTitle = By.xpath("//input[@class='enter-comment-title']");
    private By _comment = By.id("AddNewComment_CommentText");
    private By _clickOnButton = By.xpath("//button[@name='add-comment']");
    public void typeComment()
    {
//        waitForClickable(By.id("newsletter-email"),5000);
        sleep(5000);
        //entering comment title
        enterText(_commentTitle,loadProperty.getProperty("commentTitle"));
        //entering comment
        enterText(_comment,loadProperty.getProperty("comment"));
//        waitForClickable(By.id("newsletter-email"),5000);
        sleep(5000);
        //clicking on new comment button
        clickOnElement(_clickOnButton);
    }

}
