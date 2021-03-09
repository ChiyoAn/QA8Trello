package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    WebDriver driver = new ChromeDriver();


    @BeforeMethod
    public void startApp() throws InterruptedException {

//----Driver initialization. Open Trello application

        driver.get("https://trello.com/");
        Thread.sleep(2000);


    }


    @AfterMethod
    public void tearDown(){
        driver.quit();



    }

    public void fillField(WebElement element, String value) {
        element.clear();
        element.click();
        element.sendKeys(value);
    }



}
