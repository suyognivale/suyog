package Demo123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alart
{
 public static void main(String[] args) throws InterruptedException
 {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\suyog\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	 driver.manage().window().maximize();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	 Thread.sleep(3000);
	 driver.switchTo().alert().accept();
	 Thread.sleep(3000);
	 
	 
 }
}
