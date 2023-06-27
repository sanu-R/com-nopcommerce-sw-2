package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {


    @Before
    public void setUp() {
        openBrowser();

    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() throws InterruptedException {
        //Find the Login link and click on the ‘Login’ link
        driver.findElement(By.linkText("Log in")).click();

        //Holding the screen
        Thread.sleep(2000);

        //1.2 Verify the text ‘Welcome, Please Sign In!’
        String expectedText = "Welcome, Please Sign In!";
        String actualText = driver.findElement(By.xpath("//div[@class='page-title']")).getText();
        Assert.assertEquals("Welcome text not displayed in login page", expectedText, actualText);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //Find the Login link and click on the ‘Login’ link
        WebElement longinLink = driver.findElement(By.linkText("Log in"));
        longinLink.click();

        // Enter valid username
        driver.findElement(By.id("Email")).sendKeys("Aarel123@gmail.com");

        //Enter valid password
        driver.findElement(By.name("Password")).sendKeys("aral123");

        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[text() ='Log in']")).click();

        //Verify the ‘Log out’ text is display
        String expectedMessage = "Log out";
        String actualMessage = driver.findElement(By.xpath("//a[text()='Log out']")).getText();
        Assert.assertEquals("Error message is not displayed", expectedMessage, actualMessage);


    }

    @Test
    public void verifyTheErrorMessage() {
        // Click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //Enter invalid username
      //  WebElement writeEmail = driver.findElement(By.xpath("//input[@id='Email']"));
      //  writeEmail.sendKeys("rol1234@gmail.com");
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("rel123@gmail.com");

        //Enter invalid password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("arl123");

        //Click on Login button
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        //Verify the error message Login was unsuccessful.
        //Please correct the errors and try again. No customer account found

        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals("Error message not displayed", expectedMessage, actualMessage);


    }

    @After
    public void close() {
        closeBrowser();
    }

}

