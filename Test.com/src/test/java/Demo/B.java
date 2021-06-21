package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\suyog\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
    Thread.sleep(3000);
    
   
}
}
