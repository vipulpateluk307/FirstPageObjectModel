package org.example;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest {

    // object
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultpage = new RegisterResultPage();
    SearchNike searchNike = new SearchNike();
    OnlinePage onlinepage = new OnlinePage();
    ComputerPage computerpage = new ComputerPage();
    Software software = new Software();


    @Test
    public void userShowIdBeAbleToLoginSuccessfully(){
        //click on register button
        homePage.clickOnRegisterButton();
        //enter registration details
        registerPage.enterRegistrationDetails();
        // verify registration success message
        registerResultpage.verifyRegisterMessage();

    }
    @Test
    public void userShouldBeAbleToChangeTheCurrency(){
        homePage.clickOnCurrencyField();
    }
@Test
    public void userShouldBeAbleToSearchProductSuccessfully()
{
    //typing name in search field
    homePage.typeInSearchField();
    //clicking search button after typing product name
    searchNike.searchNikeName();
}
@Test
    public void addToCartButtonShouldBePresentInAllProduct() {
    //checking add to cart button is present or not
    homePage.addToCartButtonShouldBePresent();
    computerpage.clickOnSoftware();
    software.clickOnSoftwareButton();
}
@Test
    public void commentMessageAddedSuccessfully()
{
    homePage.commentAddedWithTitleAndComment();
    OnlinePage.typeComment();
    registerResultpage.verifyCommentAddedSuccessfully();
    registerResultpage.verifyCommentPresentInComments();

}

}
