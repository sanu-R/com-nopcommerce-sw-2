package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class RegisterTest extends BaseTest {


    @Before
    public void setUp() {
        openBrowser();
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //click on the ‘Register’ link
        WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
        register.click();

        //Verify the text ‘Register’
        String expectedText = "Register";
        String actualText = driver.findElement(By.xpath("//h1[text()='Register']")).getText();
        Assert.assertEquals("Register text is not found", expectedText, actualText);


    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //click on the ‘Register’ link
        WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
        register.click();

        //  Select gender radio button
        driver.findElement(By.xpath("//input[@id='gender-female']")).click();

        //find the first name and write
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Rita");

        //Enter Last name
        driver.findElement(By.id("LastName")).sendKeys("Smith");

        // Select day
        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("13");

        //Select Month
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("May");


        //Select Year
        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("1947");


        //Enter Email address
        driver.findElement(By.id("Email")).sendKeys("Aarel123@gmail.com");


        //Enter Password
        driver.findElement(By.id("Password")).sendKeys("aral123");

        //Enter Confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("aral123");

        //Click on REGISTER button
        driver.findElement(By.id("register-button")).click();


        //Add Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Verify the text Your registration completed
        String expectedText = "Your registration completed";
        String actualText = driver.findElement(By.xpath("//div[@class='result']")).getText();
        Assert.assertEquals("Your registration have not been completed", expectedText, actualText);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}
