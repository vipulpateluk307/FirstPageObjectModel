package org.example;

import org.openqa.selenium.By;

public class ComputerPage extends Utils {

    LoadProperty loadProperty = new LoadProperty();
    private By _clickOnSoftware = By.xpath("//ul[@class='sublist']/li[3]/a");

    public void clickOnSoftware() {
        //adding wait for element to load
        //   waitForClickable(By.id("newsletter-subscribe-button"),50);
        sleep(50);
        //clicking on sub category software
        clickOnElement(_clickOnSoftware);


    }

}
