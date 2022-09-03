package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {
    String basUrl = "https://www.saucedemo.com/";

    @Before

    public void setUp(){

        openBrowser(basUrl);
    }
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){

        //* Enter “standard_user” username

        /*WebElement EnterUsername = driver.findElement(By.xpath("//input[@id='user-name']"));
        EnterUsername.sendKeys("standard_user");
        */
        sendKeysToElement(By.xpath("//input[@id='user-name']"),"standard_user");



        //* Enter “secret_sauce” password
        /*WebElement EnterPassword = driver.findElement(By.xpath("//input[@id='password']"));
        EnterPassword.sendKeys("secret_sauce");*/
        sendKeysToElement(By.xpath("//input[@id='password']"),"secret_sauce");



        //* Click on ‘LOGIN’ button

        /*WebElement ClickLogin = driver.findElement(By.xpath("//input[@type='submit']"));;
        ClickLogin.click();*/
        clickOnElement(By.xpath("//input[@type='submit']"));



        //* Verify the text “PRODUCTS”
        /*WebElement VerifyTest = driver.findElement(By.xpath("//span[@class='title']"));
        VerifyTest.getText();*/
        getTextFromElement(By.xpath("//span[@class='title']"));


    }

    @Test

    public void verifyThatSixProductsAreDisplayedOnPage(){

        //* Enter “standard_user” username

        /*WebElement EnterUSername = driver.findElement(By.xpath("//input[@id='user-name']"));
        EnterUSername.sendKeys("standard_user");*/
        sendKeysToElement(By.xpath("//input[@id='user-name']"),"standard_user");



        //* Enter “secret_sauce” password

       /* WebElement EnterPassword = driver.findElement(By.xpath("//input[@id='password']"));
        EnterPassword.sendKeys("secret_sauce");*/
        sendKeysToElement(By.xpath("//input[@id='password']"),"secret_sauce");

        //* Click on ‘LOGIN’ button
        /*WebElement ClickLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        ClickLogin.click();*/
        clickOnElement(By.xpath("//input[@type='submit']"));

        //* Verify that six products are displayed on page
       /* WebElement VerifyText = driver.findElement(By.xpath("//div[@class='inventory_list']"));
        VerifyText.getText();*/
        getTextFromElement(By.xpath("//div[@class='inventory_list']"));


    }
    @After
    public void tearDown(){

        //closeBrowser();
    }
}
