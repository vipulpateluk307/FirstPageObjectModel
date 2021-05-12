package org.example;

import javafx.animation.KeyFrame;
import org.openqa.selenium.By;

import java.sql.Timestamp;

public class RegisterPage extends Utils {




    public void enterRegistrationDetails()
    {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        sleep(5000);
        //click on Male or Female button
        clickOnElements(By.xpath("//input[@id='gender-male']"));
        // Type First Name
        enterText(By.id("FirstName"),"vipul");
        // Type Last Name
        enterText(By.id("LastName"),"patel");
        // Select Date
        selectFromDropdownByVisibleText(By.name("DateOfBirthDay"),"30");
        // Select Month
        selectFromDropdownByIndex(By.name("DateOfBirthMonth"),3);
        // Select Year
        selectFromDropdownByValue(By.name("DateOfBirthYear"),"2021");
        // type email address

        enterText(By.id("Email"),"vipul"+timestamp.getTime()+"@gmail.com");
        //type company name
        enterText(By.name("Company"),"hello");
        //type password
        enterText(By.name("Password"), "123456");
        //confirm password
        enterText(By.name("ConfirmPassword"),"123456");
        //click on Register
        clickOnElements(By.id("register-button"));
       waitForClickable(By.id("newsletter-subscribe-button"),5000);



    }

}



