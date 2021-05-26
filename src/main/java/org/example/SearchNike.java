package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SearchNike extends Utils {
    private By _itemBoxesField = By.className("item-box");
    private By _productNameField = By.cssSelector("h2.product-title");

    public void searchNikeName()
    {   //finding number of items
        List<WebElement> webElementList = driver.findElements(_itemBoxesField);
        int count =0;
        //item list
        for (WebElement element : webElementList)
        {   //checking condition if product title name contains Nike word
            if (element.findElement(_productNameField).getText().contains("Nike"))
            {   //print the product title when above condition becomes true
                System.out.println(element.findElement(_productNameField).getText());
                //counting with actual product title
                count++;
            } else
            {   //when product title does not contains Nike word
                System.out.println("no matches");
            }
        }
        //asserting count of total product title which contains Nike word, with available product title.
        Assert.assertEquals(count, webElementList.size(), "Nike word should be present in " + webElementList.size() + " but it is present in " + count + "\n");
        System.out.println("Nike word is present in all product title");
    }


}
