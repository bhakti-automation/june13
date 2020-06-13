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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author virad
 */
public class CVSTest {

    private WebDriver driver;
    private String baseurl;

    public CVSTest() {
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

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        // baseurl="https://www.cvs.com/pharmacy/";

    }

    @After
    public void tearDown() {
        driver.quit();
    }

    // @Test
    public void TestLoginPage() throws InterruptedException {
        driver.get(baseurl);
        driver.findElement(By.id("userEmail")).clear();
        driver.findElement(By.id("userEmail")).sendKeys("shetabhakti@yahoo.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("Jaymataki");
        driver.findElement(By.xpath("//input[@id='rememberme']")).click();
        driver.findElement(By.className("hero-signin")).click();

        Thread.sleep(3000);

    }

    @Test

    public void TestBeautyPage() throws InterruptedException {
        driver.get("https://www.cvs.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.findElement(By.xpath("//span[text()='Shop Online']")).click();
        //driver.findElement(By.xpath("//a[text()='Beauty']")).click();
        driver.findElement(By.linkText("Beauty")).click();
        // WebElement e=  driver.findElement(By.xpath("//p[text()='Beauty Services']"));
        //WebElement e = driver.findElement(By.linkText("Beauty Services"));
        
        driver.findElement(By.xpath("//p[text()='Perfume & Cologne']")).click();
        driver.findElement(By.xpath("//p[text()='Perfume for Women']")).click();
        driver.findElement(By.xpath("//div[contains(text(),'D & G Light Blue by Dolce & Gabbana Eau de Toilett')]")).click();
        //driver.findElement(By.className("css-901oao r-jwli3a r-1i10wst r-vw2c0b r-rjixqe r-q4m81j")).click();
       // driver.findElement(By.xpath("//input[@type='text' and  @placeholder= 'Search']")).click();
        //driver.findElement(By.xpath("//input[@type='text' and  @placeholder= 'Search']")).sendKeys("versace");
       //driver.findElement(By.xpath("Versace Bright Crystal by Gianni Versace Eau de Toilette Spray, 1.7 OZ")).click();


//This will scroll the page till the element is found		
      //  js.executeScript("arguments[0].scrollIntoView();", e);
       // driver.findElement(By.linkText("Beauty Services")).click();

        // This  will scroll down the page by  1000 pixel vertical
       // js.executeScript("window.scrollBy(0,1200)");

        //This will scroll the web page till end.		
       // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        Thread.sleep(4000);

    }
    // @Test

    public void TestPhoto() throws InterruptedException {
        driver.get("https://www.cvs.com/");
        driver.findElement(By.linkText("Photo")).click();
        Thread.sleep(5000);
    }

}
