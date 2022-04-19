package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUP()

    {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        //verifying the expected and actual messages by using xpath as locator
        String expectedMessage = "Computers";
        String atualMessage = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]")).getText();
        Assert.assertEquals("Computers element does not match",expectedMessage,atualMessage);
        driver.navigate().to("https://demo.nopcommerce.com/computers");

    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully()
    {
        String expectedMessage = "Electronics";
        String atualMessage = driver.findElement(By.linkText("Electronics")).getText();
        Assert.assertEquals("Electronics words does not match",expectedMessage,atualMessage);
        driver.navigate().to("https://demo.nopcommerce.com/electronics");
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        String expectedMessage = "Apparel";
        String atualMessage = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]")).getText();
        Assert.assertEquals("Apparel element does not match",expectedMessage,atualMessage);
        driver.navigate().to("http://demo.nopcommerce.com/Apparel");


    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        String expectedMessage = "Digital downloads";
        String atualMessage = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[4]/a[1]")).getText();
        Assert.assertEquals("Digital Downloads element does not match",expectedMessage,atualMessage);
        //navigating to digital downloads page
        driver.navigate().to("https://demo.nopcommerce.com/digital-downloads");

    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        String expectedMessage = "Books";
        String atualMessage = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]")).getText();
        Assert.assertEquals("Books element does not match",expectedMessage,atualMessage);
        //navigating to Books page
        driver.navigate().to("https://demo.nopcommerce.com/books");

    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully()
    {
        String expectedMessage = "Jewelry";
        String atualMessage = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]")).getText();
        Assert.assertEquals("Jewelry element does not match",expectedMessage,atualMessage);
        //navigating to Jewelry page
        driver.navigate().to("https://demo.nopcommerce.com/jewelry");

    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        String expectedMessage = "Gift Cards";
        String atualMessage = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]")).getText();
        Assert.assertEquals("Gift Cards element does not match", expectedMessage, atualMessage);
        //navigates to giftcards page
        driver.navigate().to("https://demo.nopcommerce.com/gift-cards");
    }
    @After
    public void tearDown(){
       closeBrowser();
    }

}
