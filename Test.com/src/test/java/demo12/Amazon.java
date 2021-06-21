package demo12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon
{
 public static void main(String[] args) throws InterruptedException
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\suyog\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwiA_cXO_ajxAhVKnUsFHcg0AP8YABAAGgJzZg&ae=2&ohost=www.google.com&cid=CAESQOD2PpH8D0-HGeQ9u_Q3tb2aHhXZIPhQN6wMBiE7ubH_ISEkflZoCYClbthAYq7peSR7B84jNYo7fexvdYj831o&sig=AOD64_1FkXNj6Bvl8DLUkyb6xzrA-lOvDA&q&nis=1&adurl&ved=2ahUKEwi-1b3O_ajxAhUGxDgGHaUiAsQQ0Qx6BAgCEAE");
     Thread.sleep(3000);
     driver.manage().window().maximize();
     Thread.sleep(3000);
     driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("OnePlus9pro mobiles");
     Thread.sleep(3000);
     driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[2]")).click();
     Thread.sleep(3000);
     
 }
}
