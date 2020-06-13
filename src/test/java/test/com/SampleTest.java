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
public class SampleTest {
    
    private WebDriver driver;
    private String baseUrl;
    
    public SampleTest() {
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
    }
    
    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testGoogle() throws Exception {
        driver.get(baseUrl);
        
        driver.findElement(By.className("gLFyf")).clear();
        driver.findElement(By.className("gLFyf")).sendKeys("java");
        driver.findElement(By.className("gLFyf")).submit();
//         driver.findElement(By.xpath("//input[@type=\"text\"]")).clear();
//        driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("java");
//        driver.findElement(By.xpath("//input[@type=\"text\"]")).submit();
   Thread.sleep(2000);
    // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oracle");
        // driver.findElement(By.name("site-search")).submit();
    }
}

        

