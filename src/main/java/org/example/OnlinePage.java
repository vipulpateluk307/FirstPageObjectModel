package org.example;

import org.openqa.selenium.By;

public class OnlinePage extends Utils {
    public static void typeComment() {
       // sleep(5000);
        enterText(By.xpath("//input[@class='enter-comment-title']"),"Nice Store1");
enterText(By.id("AddNewComment_commentText"),"good ");
//sleep(5000);
clickOnElements(By.xpath("//button[@class='button-1 news-item-add-comment-button']"));
    }




}
