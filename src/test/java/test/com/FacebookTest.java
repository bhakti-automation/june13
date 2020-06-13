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

/**
 *
 * @author virad
 */
public class FacebookTest {
    
    private WebDriver driver;
    private String baseUrl;
    
    public FacebookTest() {
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
        baseUrl = "https://www.facebook.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    
    @After
    public void tearDown() {
        driver.quit();
    }

   // @Test
    public void testGoogle() throws Exception {
        driver.get(baseUrl);
        
        
     driver.findElement(By.xpath("//input[@type=\"email\"]")).clear();
        driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("abc@abc.com");
        driver.findElement(By.xpath("//input[@type=\"email\"]")).submit();
         driver.findElement(By.xpath("//input[@type=\"password\"]")).clear();
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("helloworld");
        driver.findElement(By.xpath("//input[@type=\"password\"]")).submit();
   Thread.sleep(2000);
    
    }
    @Test
    public void testCSS() throws InterruptedException {
         driver = new ChromeDriver();
        //Maximize browser window   
        driver.manage().window().maximize();
     
       driver.get("https://www.facebook.com/"); 
       // Here Tag = input and Class = email 
       driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Software Testing Material");
        String  title = driver.getTitle();
         assertEquals("Facebook - Log In or Sign Up", title);
    }
}

        

