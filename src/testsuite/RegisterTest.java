package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        //verifying and clicking the register button
        WebElement register= driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        register.click();
        String expectedMessage = "Register";
        String actualMessage = driver.findElement(By.xpath("//h1[contains(text(),'Register')]")).getText();
        Assert.assertEquals(" Register word does not match",expectedMessage,actualMessage);
    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        //click the register button
        WebElement register= driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
        register.click();
        //selecting the gender button
        WebElement gender = driver.findElement((By.xpath("//label[contains(text(),'Gender:')]")));
        gender.click();
        //sending firstname field
        WebElement firstName = driver.findElement(By.name("FirstName"));
       firstName.sendKeys("Hi");
       //sending last name value
        WebElement lastName= driver.findElement(By.name("LastName"));
        lastName.sendKeys("Hello");
        //sending the date of birth details
        WebElement dateOfBirthday= driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]"));
        dateOfBirthday.sendKeys("10");
        WebElement monthOfBirthday= driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]"));
        monthOfBirthday.sendKeys("January");
        WebElement yearOfBirth= driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]"));
       yearOfBirth.sendKeys("1990");
       //sending email value
        WebElement emailField= driver.findElement(By.xpath("//input[@id='Email']"));
       emailField.sendKeys("prime123@gmail.com");
       //sending password
        WebElement passwordField= driver.findElement(By.xpath("//input[@id='Password']"));
       passwordField.sendKeys("abcd123");
       //confirming password
        WebElement confirmPassword= driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPassword.sendKeys("abcd123");
        //clicking the register button
        WebElement registerButton= driver.findElement(By.xpath("//button[@id='register-button']"));
       registerButton.click();
    }
    @After
    public void tearDown(){
        closeBrowser();
    }
}
