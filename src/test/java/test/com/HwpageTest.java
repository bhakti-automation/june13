/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author virad
 */
public class HwpageTest {

    private WebDriver driver;
    private String baseUrl;

    public HwpageTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:\\QA\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testPage() throws Exception {
        driver.get(baseUrl);
        driver.get("https://docs.google.com/forms/d/1-FJm4QQT6MZDVeHofRDUWEuxysMDElvJrj86oryom04/viewform?edit_requested=true");
        //Select s = new Select();
        //driver.findElement(By.xpath("//input[@value='Reading']")).click();
        // driver.findElement(By.xpath(//input[@value='Reading']))
        driver.findElements(By.xpath("//span[@dir='auto']")).get(2).click();
        driver.findElement(By.xpath("//textarea[@tabindex='0']")).sendKeys("it is working good");
        driver.findElement(By.name("entry.1696159737")).sendKeys("we can have more elements by name");
        driver.findElement(By.name("entry.485428648")).sendKeys("BHakti Sheta");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("bhakti@abc.com");
        driver.findElement(By.xpath("//Span[contains(text(),'Submit')]")).click();

        Thread.sleep(3000);

    }
    // @Test

    public void testCSS() throws InterruptedException {
        driver = new ChromeDriver();
        //Maximize browser window   
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        // Here Tag = input and Class = email 
        driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Software Testing Material");
        String title = driver.getTitle();
        assertEquals("Facebook - Log In or Sign Up", title);
    }
}


