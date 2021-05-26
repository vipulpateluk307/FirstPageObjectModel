package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Software extends Utils {
    private By _itemBoxesField = By.className("item-box");
    private By _addToCartButtonField = By.cssSelector("button.button-2.product-box-add-to-cart-button");
    private By _productNameField = By.cssSelector("h2.product-title");

     public void verifyAddToCartButtonPresent()
    {   //finding number of items
        List<WebElement> webElementList = driver.findElements(_itemBoxesField);
        int count = 0, noButton = 0;
        //getting list of item box
        for (WebElement element : webElementList)
        {
            if (element.findElements(_addToCartButtonField).size() == 1)
            {
                count++;
            }
            if (element.findElements(_addToCartButtonField).size() != 1)
            {
                noButton++;
                System.out.println("In"+element.findElement(_productNameField).getText()+": Add to Cart Button is not present");
            }
        }
        //asserting expected with actual size
        Assert.assertEquals(count, webElementList.size(),"Add to cart button should be "+ webElementList.size()+ " but it is "+count+"\n");
        System.out.println("Add to Cart Button present in each product on this Page");
    }
}