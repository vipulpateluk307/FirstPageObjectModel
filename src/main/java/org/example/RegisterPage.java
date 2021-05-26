package org.example;

import javafx.animation.KeyFrame;
import org.openqa.selenium.By;

import java.sql.Timestamp;

public class RegisterPage extends Utils {
   private By _gender = By.xpath("//input[@id='gender-male']");
    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _dateOfBirth =By.name("DateOfBirthDay");
    private By _monthOfBirth = By.name("DateOfBirthMonth");
    private By _yearOfBirth = By.name("DateOfBirthYear");
    private By _email = By.id("Email");
    private By _companyName = By.name("Company");
    private By _password = By.name("Password");
    private By _confirmPassword = By.name("ConfirmPassword");
    private By _registerButton = By.name("register-button");
LoadProperty loadProperty = new LoadProperty();
public void enterRegistrationDetails ()
    {
       Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        sleep(5000);
        //click on Male or Female button
        clickOnElement(_gender);
        // Type First Name
        enterText(_firstName,loadProperty.getProperty("firstName"));
        // Type Last Name
        enterText(_lastName,loadProperty.getProperty("LastName"));
        // Select Date
        selectFromDropdownByVisibleText(_dateOfBirth,loadProperty.getProperty("DateOfBirthDay"));
        // Select Month
        selectFromDropdownByVisibleText(_monthOfBirth,loadProperty.getProperty("DateOfBirthMonth"));
        // Select Year
        selectFromDropdownByValue(_yearOfBirth,loadProperty.getProperty("DateOfBirthYear"));
        // type email address
        enterText(_email,loadProperty.getProperty("Email")+timestamp.getTime()+"@test.com");
        //type company name
        enterText(_companyName,loadProperty.getProperty("Company"));
        //type password
        enterText(_password,loadProperty.getProperty("Password"));
        //confirm password
        enterText(_confirmPassword,loadProperty.getProperty("ConfirmPassword"));
        //click on Register
        clickOnElement(_registerButton);

    }

}



