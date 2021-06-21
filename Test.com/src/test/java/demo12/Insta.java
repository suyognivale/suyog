package demo12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suyog\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.instagram.com/accounts/login/");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//div[@class='                     Igw0E     IwRSH      eGOV_         _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    '])[1]")).click();
	    Thread.sleep(3000);
	    
	   
	}
	
}
