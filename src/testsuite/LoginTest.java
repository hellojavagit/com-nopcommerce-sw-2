package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In!";
        //clicking on login link
        WebElement loginLink = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
        loginLink.click();
        //checking the welcome text
        String actualMessage = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]")).getText();
        Assert.assertEquals("Welcome Message not matching", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        WebElement loginLink = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
        loginLink.click();
        // sending the email to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("nopcommerce@gmail.com");
        // sending  the password to password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("nopcom3");
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();
        String expectedMessage = "Log out";
        String actualLogoutMessage = driver.findElement(By.xpath("//a[normalize-space()='Log out']")).getText();
        Assert.assertEquals("Log out element does not match",expectedMessage,actualLogoutMessage);
    }

    @Test
    public void verifyTheErrorMessage() {
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        WebElement loginLink = driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
        loginLink.click();
        // sending the email to email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("nopcommerce@gmail.com");
        // sending  the password to password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("nopcom3");
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();
        String actualMessage = driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")).getText();
        Assert.assertEquals("Login is not Successfull", expectedMessage, actualMessage);

    }

    @After
    public void tearDown() {
       closeBrowser();
    }

}

