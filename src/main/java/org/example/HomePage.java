package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utils {
    public void clickOnRegisterButton(){

      // waitForClickable(By.linkText("Register"),5000);
       // click on Register button
        clickOnElements(By.linkText("Register"));
    }
    public void clickOnCurrencyField(){
        //select currency
        selectFromDropdownByVisibleText(By.id("customerCurrency"), "Euro");
        // all available price with the currency
       List<WebElement> featuredProductList = driver.findElements(By.xpath("//span[@class='price actual-price']"));
   //product with currency
        for (WebElement element : featuredProductList)
        {
            System.out.println(element.getText());
        }
        System.out.println();
        // selecting currency
        selectFromDropdownByVisibleText(By.id("customerCurrency"),"US Dollar");
        // all available product price with currency
         List<WebElement> featuredProductList1 = driver.findElements(By.xpath("//span[@class=]"));
        //product with currency
        for (WebElement element : featuredProductList1){
            System.out.println(element.getText());
        }
    }
    public void typeInSearchField() {
        // product name
        enterText(By.id("small-searchterms"), "Nike");
        // clicking on search
        clickOnElements(By.xpath("//button[@type='submit']"));

    }

    public void addToCartButtonShouldBePresent(){
        //clicking product category
        clickOnElements(By.linkText("Computers"));
      //  sleep(5000);
        //clicking on product sub-category
     //   clickOnElement(By.xpath("//ul[@class='sublist']/li[3]/a"));
    }
public void commentAddedWithTitleAndComment(){
        //clicking on title
    clickOnElements(By.linkText("New online store is open"));
}

}
