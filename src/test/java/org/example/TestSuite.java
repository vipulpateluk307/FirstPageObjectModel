package org.example;

import org.testng.annotations.Test;
public class TestSuite extends BaseTest {
    //Creating object
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    SearchNike searchNike = new SearchNike();
    NewOnlinePage newOnlinePage = new NewOnlinePage();
    ComputerPage computerPage = new ComputerPage();
    Software softwarePage = new Software();
    FaceBookPage faceBookPage = new FaceBookPage();
    NewOnlineStorePage newOnlineStorePage = new NewOnlineStorePage();


    @Test
    public void userShouldBeAbleToRegisterSuccessfully() {
        //click on register button
        homePage.clickOnRegisterButton();
        //enter registration details
        registerPage.enterRegistrationDetails();
        //verify registration success message
        registerResultPage.verifyRegisterMessage();
    }

    @Test
    public void userShouldBeAbleToChangeTheCurrency() {   //verifying currency symbol
        homePage.verifyCurrencySymbolFromEachPrice();
        //click on currency field
        homePage.clickOnCurrencyField();
        //verifying currency symbol
        homePage.verifyCurrencySymbolFromEachPrice();
    }

    @Test
    public void userShouldBeAbleToSearchProductSuccessfully() {   //typing name in search field
        homePage.typeInSearchField();
        //clicking search button after typing product name
        searchNike.searchNikeName();
    }

    @Test
    public void addToCartButtonShouldBePresentInAllProduct() {
        //checking add to cart button is present or not
        homePage.addToCartButtonShouldBePresent();
        //clicking on software
        computerPage.clickOnSoftware();
        //checking add to cart button is present
        softwarePage.verifyAddToCartButtonPresent();
    }

    @Test
    public void commentMessageAddedSuccessfully() {
        //clicking on title
        homePage.commentAddedWithTitleAndComment();
        //typing title and comment
        newOnlinePage.typeComment();
        //checking comment added successfully
        registerResultPage.verifyCommentAddedSuccessfully();
        //checking comment added in comments section
        registerResultPage.verifyCommentPresentInComments();
        //verifying comment
        registerResultPage.verifyComment();
        //verifying comment box
        registerResultPage.commentBoxVerification();
    }

    @Test
    public void userShouldAbleToHandelFacebookPopWindow() {
        //click on facebook
        homePage.popUpWindowHandelingForFacebook();
        //get text from facebook page
        faceBookPage.windowHandle_Facebook();


    }
    @Test
    public void userShouldAbleToGetTheAlertMessage(){
        //get Alert message
        homePage.alertHandelingForSearch();
    }
    @Test
    public void userShouldAbleToCommentInNewOnlineStore(){
        // navigate to  news online detail page
         homePage.commentForNewOnlineStore();

        //fill comments details
        newOnlineStorePage.fillCommentDetails();


        //verify comment added success message
        newOnlineStorePage.verifyCommentAddedSuccessMessage();

        //verify comment present in comment list
        newOnlineStorePage.verifyCommentPresentInCommentList();

        //verify added comment is at last in comment list
        newOnlineStorePage.verifyAddedCommentsAtLastInTheList();

    }
}