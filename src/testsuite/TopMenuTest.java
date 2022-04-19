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
    public void userShouldNavigateToComputerPageSuccessfully()
    {
      
        //finding the computers element and clicking
        WebElement computersElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
        computersElement.click();
        //verifying the expected and actual messages by using xpath as locator
        String expectedMessage = "Computers";
        String actualMessage = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]")).getText();
        Assert.assertEquals("Computers element does not match", expectedMessage, actualMessage);
    

    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        String expectedMessage = "Electronics";
        //verifying the electronics tab and clicking
        WebElement electronics = driver.findElement(By.linkText("Electronics"));
        electronics.click();
        //verifying the text Electronics
        String actualMessage = driver.findElement(By.xpath("//h1[normalize-space()='Electronics']")).getText();
        Assert.assertEquals("Electronics words does not match", expectedMessage, actualMessage);
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        //verifying the Apparel element tab and clicking
        WebElement apparelElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']"));
        apparelElement.click();
        //verifying the text Apparel
        String expectedMessage = "Apparel";
        String actualMessage = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]")).getText();
        Assert.assertEquals("Apparel element does not match",expectedMessage,actualMessage);
       
    }

    

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        //clicking the digitaldownloads tab
        WebElement digitalDownloads = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']"));
        digitalDownloads.click();
        //verifying the text Digital downloads
        String expectedMessage = "Digital downloads";
        String atualMessage = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[4]/a[1]")).getText();
        Assert.assertEquals("Digital Downloads element does not match",expectedMessage,atualMessage);
        

    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
         //finding the Books element and clicking
        WebElement booksElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Books']"));
        booksElement.click();
        //verifying the text Books
        String expectedMessage = "Books";
        String actualMessage = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]")).getText();
        Assert.assertEquals("Books element does not match",expectedMessage,actualMessage);
        //navigating to Books page
        //driver.navigate().to("https://demo.nopcommerce.com/books");

    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully()
    {   
        //finding the jewellery tab present or not
        WebElement jewelleryElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']"));
        jewelleryElement.click();
        //verifying the text Jewelry
        String expectedMessage = "Jewelry";
        String actualMessage = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]")).getText();
        Assert.assertEquals("Jewelry element does not match",expectedMessage,actualMessage);
       }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        //clicking the Giftcards element on page
        WebElement giftcardsElement = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']"));
        giftcardsElement.click();
        //verifying the text Gift Cards
        String expectedMessage = "Gift Cards";
        String actualMessage = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]")).getText();
        Assert.assertEquals("Gift Cards element does not match", expectedMessage, actualMessage);
        //navigates to giftcards page
        //driver.navigate().to("https://demo.nopcommerce.com/gift-cards");
    }
    @After
    public void tearDown(){
       closeBrowser();
    }

}
