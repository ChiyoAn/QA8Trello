package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
   WebDriver driver = new ChromeDriver();


   @BeforeMethod
   public void initTest() throws InterruptedException {

//----Driver initialization. Open Trello application

       driver.get("https://trello.com/");
       Thread.sleep(2000);
       WebElement loginIncon = driver.findElement(By.xpath(" //a[contains(text(),'Войти')]"));
       loginIncon.click();
       Thread.sleep(5000);


   }







    @Test
    public void loginNegativeLoginIncorrect() throws InterruptedException {


        WebElement loginField = driver.findElement(By.xpath("//input[@id='user']"));
        fillField(loginField, "123");
        Thread.sleep(2000);
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        fillField(passwordField, "qqq");
        Thread.sleep(3000);
        driver.findElement(By.id("login")).click();

        System.out.println("qqqq" + driver.findElements(By.className("error-message")).get(1).getText() );
        Thread.sleep(2000);


    }


    @Test
    public void loginPositiveTest() throws InterruptedException {


        WebElement loginField = driver.findElement(By.xpath("//input[@id='user']"));
        fillField(loginField, "obertbd@gmail.com");
        Thread.sleep(2000);
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        fillField(passwordField, "KbyfBydthc94");
        Thread.sleep(3000);
        driver.findElement(By.id("login")).click();
        Thread.sleep(10000);
        WebElement boardsButton = driver.findElement(By.className("MEu8ZECLGMLeab"));
        System.out.println("boardsButton: " + boardsButton.getText());
        Thread.sleep(2000);



    }
    @Test
    public void loginWithNotCorrectPassword() throws InterruptedException {

        WebElement loginField = driver.findElement(By.xpath("//input[@id='user']"));
        fillField(loginField, "obertbd@gmail.com");
        Thread.sleep(2000);
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        fillField(passwordField, "qqqwerertfd");
        Thread.sleep(3000);
        driver.findElement(By.id("login")).click();
        Thread.sleep(2000);


        System.out.println("Error: " + driver.findElement(By.className("forgotLink")).getText());
        System.out.println("Error2 " + driver.findElement(By.xpath("//p[@class='error-message']")).getText() );

        Thread.sleep(2000);


    }
















}
