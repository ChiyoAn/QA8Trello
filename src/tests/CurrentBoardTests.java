package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CurrentBoardTests extends TestBase {

    @BeforeMethod
    public void initTests() throws InterruptedException {

        WebElement loginIncon = driver.findElement(By.xpath(" //a[contains(text(),'Войти')]"));
        loginIncon.click();
        Thread.sleep(5000);
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

        //open QA Haifa8 board ----

        WebElement qaHaifa8 = driver.findElement(By.xpath("//a[@class = 'board-tile'][.//@Title= 'QA Haifa8']"));
        qaHaifa8.click();
        Thread.sleep(4000);



    }

    @Test
    public void createNewList() throws InterruptedException {

        WebElement addListButton = driver.findElement(By.xpath("//span[@class='placeholder']"));
        addListButton.click();
        Thread.sleep(2000);
        WebElement titleListField = driver.findElement(By.xpath("//input[@name= 'name']"));
        fillField(titleListField, "titleList");
        WebElement addList = driver.findElement(By.xpath("//input[@type= 'submit']"));
        addList.click();
        Thread.sleep(3000);
        WebElement cancelEditList = driver.findElement(By.cssSelector(".js-cancel-edit"));
        cancelEditList.click();
        Thread.sleep(3000);


    }









}
