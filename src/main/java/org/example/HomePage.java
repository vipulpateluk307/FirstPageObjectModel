package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Utils {
    LoadProperty loadProperty = new LoadProperty();
    private By _clickOnRegister = By.cssSelector("a.ico-register");
    private By _currencyName = By.id("customerCurrency");
    private By _listOfPrice = By.xpath("//span[@class='price actual-price']");
    private By _searchTerm = By.id("small-searchterms");
    private By _clickOnSearch = By.xpath("//button[@type='submit']");
    private By _clickOnComputer = By.linkText("Computers");
    private By _clickOnTitle = By.linkText("New online store is open");
    private By _clickOnNewOnline = By.cssSelector(".news-head:first-of-type>a");

    private By _facebookButton = By.cssSelector("li.facebook");

    public void clickOnRegisterButton() {

        // waitForClickable(By.linkText("Register"),5000);
        // click on Register button
        clickOnElement(_clickOnRegister);
    }

    public void verifyCurrencySymbolFromEachPrice() {
        //getting name of currency selected
        String currencyNameSelected = getSelectedTextFromDropdown(_currencyName);
        //getting currency symbol
        String expectedCurrencySymbol = getCurrencySymbol(currencyNameSelected);
        //list of product price
        List<WebElement> priceList = driver.findElements(_listOfPrice);
        //item list
        for (WebElement element : priceList) {
            String actualCurrencySymbol = element.getText().substring(0, 1);
            //asserting actual currency symbol with expected currency symbol
            Assert.assertEquals(actualCurrencySymbol, expectedCurrencySymbol, "Actual currency symbol not matching with expected currency symbol");
        }
        //print output
        System.out.println("Currency Verified Successfully" + currencyNameSelected + "as" + expectedCurrencySymbol);
    }

    public void clickOnCurrencyField() {
        //select currency
        selectFromDropdownByVisibleText(_currencyName, loadProperty.getProperty("currency"));
    }

    public void typeInSearchField() {
        // product name
        enterText(_searchTerm, loadProperty.getProperty("searchTerm"));
        // clicking on search
        clickOnElement(_clickOnSearch);
    }

    public void addToCartButtonShouldBePresent() {
        //clicking product category
        clickOnElement(_clickOnComputer);
        //  sleep(5000);
        //clicking on product sub-category
        //   clickOnElement(By.xpath("//ul[@class='sublist']/li[3]/a"));
    }

    public void commentAddedWithTitleAndComment() {
        //clicking on title
        clickOnElement(_clickOnTitle);
    }

    public void popUpWindowHandelingForFacebook() {
        //click on facebook
        clickOnElement(_facebookButton);
    }
    public void alertHandelingForSearch(){
        //click on search button
        clickOnElement(_clickOnSearch);
        //switch to alert
        Alert alert = driver.switchTo().alert();
        //capture alert message
        String alertMessage = driver.switchTo().alert().getText();
        //verify the message
        Assert.assertEquals(alertMessage,"Please enter some search keyword","Entered text does not found");
        //print alert message
        System.out.println(alertMessage);
        //accept alert
        alert.accept();
    }
    public void commentForNewOnlineStore()
    {
        // click on New online store
        clickOnElement(_clickOnNewOnline);
    }
}
