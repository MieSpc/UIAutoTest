package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

public class Demo_1 {
    private static WebDriver driver;
    private static File file;

    @BeforeTest
    public void beforeMethod(){
        file = new File("driver\\chromedriver.exe");
        System.setProperty("Webdriver.chrome.driver",file.getAbsolutePath());
        System.out.println(file.getAbsoluteFile());

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void afterMethod(){
        System.out.println("Page Title is:"+driver.getTitle());
//        driver.quit();
    }

    @Test
    public void OpenBaiduTest(){
        driver.get("https://www.bilibili.com");
        WebElement inputSearchWord = driver.findElement(By.cssSelector("#nav_searchform > input"));
        inputSearchWord.sendKeys("runningman");
        WebElement clickSearchBotton = driver.findElement(By.cssSelector("#nav_searchform > div"));

    }
}
