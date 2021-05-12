package org.example;

import org.openqa.selenium.By;

public class Software extends Utils {
    public void clickOnSoftwareButton() {
        list(By.xpath("//h2[@class='product-title']"));
        if(getTextFromElement(By.xpath("//button[@class='button-2 product-box-add-to-cart-button']")).contains("add to cart"));

    else

        {
        System.out.println(getTextFromElement(By.xpath("//h2[@class='product-title]")).contains("Add to cart"));
    }

}}