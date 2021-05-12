package org.example;

import org.openqa.selenium.By;

public class ComputerPage extends Utils {
    public void clickOnSoftware()
    {
        clickOnElements(By.xpath("//ul[@class='sublist']/li[3]/a"));
    }

}
