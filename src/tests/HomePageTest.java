package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    @Test
    public void applicationTest(){
        System.out.println("Title " + driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "Trelloo", "The title of the application is not 'Trello' ");


    }

}
