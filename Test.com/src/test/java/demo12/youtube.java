package demo12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suyog\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.youtube.com/");
	    Thread.sleep(3000);
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@id='search']")).sendKeys("marathi movies 2021");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//yt-icon[@class='style-scope ytd-searchbox'])[2]")).click();
	    Thread.sleep(3000);
	    driver.close();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
	
}
