package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Utils extends BasePage {
    public static void waitForClickable(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    // Method for click on elements
    public static void clickOnElements(By by) {
        driver.findElement(by).click();
    }

    // method for enter text
    public static void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    // method for select from dropdown by visible text
    public static void selectFromDropdownByVisibleText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    // method for select from dropdown by index
    public static void selectFromDropdownByIndex(By by, String index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(Integer.parseInt(index));
    }
    // method for select from dropdown by value
    public static void selectFromDropdownByValue(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }
    //method for gettext from element
    public static String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }
    //method for timestamp
    public static String timeStamp(By by){
        return driver.findElement(by).getText();
    }
    // method for wait for clickable
    public static void waitForClickable1(By by,int time)
    {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    // method for wait element to be visible
    public static void waitForElementToBeVisible(By by,int time){
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public static void list(By by){
        List<WebElement> productList = driver.findElements(by);
        for (WebElement element: productList){
            System.out.println(element.getText());
        }
    }
    public static void sleep(int time){
        try {
            Thread.sleep(time);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }



}



