package testsuite;

import browserfactory.BaseTest;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {


    @Before
    public void setUp() {
        openBrowser();
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {

        //click on the ‘Computers’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']")).click();

        //Verify the text ‘Computers'
        String expectedMessage = "Computers";
        String actualMessage = driver.findElement(By.xpath("//h1[text()='Computers']")).getText();
        Assert.assertEquals("Computer text not found ", expectedMessage, actualMessage);

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //click on the ‘Electronics’ Tab
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']")).click();

        //Verify the text ‘Electronics'
        String expectedText = "Electronics";
        String actualText = driver.findElement(By.xpath("//h1[text()='Electronics']")).getText();
        Assert.assertEquals("Electronics text not found ", expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {

        //click on the ‘Apparel’ Tab
        WebElement clickApparel = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/apparel']"));
        clickApparel.click();

        //Verify the text ‘Apparel’
        String expectedText = "Apparel";
        String actualText = driver.findElement(By.xpath("//h1[text()='Apparel']")).getText();
        Assert.assertEquals(" Apparel text not found .", expectedText, actualText);


    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        //click on the ‘Digital downloads’ Tab
        WebElement digitalDown = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/digital-downloads']"));
        digitalDown.click();

        //Verify the text 'Digital downloads’
        String expectedText = "Digital downloads";
        String actualText = driver.findElement(By.xpath("//h1[text()='Digital downloads']")).getText();
        Assert.assertEquals(" Digital downloads text not found. ", expectedText, actualText);


    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {

        //click on the ‘Books’ Tab
        WebElement bookPage = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/books']"));
        bookPage.click();

        //Verify the text ‘Books’
        String expectedText = "Books";
        String actualText = driver.findElement(By.xpath("//h1[text()='Books']")).getText();
        Assert.assertEquals("Books text not found", expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //click on the ‘Jewelry’ Tab
        WebElement jewlery =driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']"));
        jewlery.click();

        //Verify the text ‘Jewelry’
        String expectedText = "Jewelry";
        String actualText = driver.findElement(By.xpath("//h1[text()='Jewelry']")).getText();
        Assert.assertEquals("Jewelry text not found",expectedText,actualText);

    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        //click on the ‘Gift Cards’ Tab
        WebElement giftCard = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']"));
        giftCard.click();

        //Verify the text ‘Gift Cards’
        String expectedText = "Gift Cards";
        String actualText = driver.findElement(By.xpath("//h1[text()='Gift Cards']")).getText();
        Assert.assertEquals("Gift Card text not found",expectedText,actualText);


    }


    @After
    public void tearDown() {
        closeBrowser();
    }
}
