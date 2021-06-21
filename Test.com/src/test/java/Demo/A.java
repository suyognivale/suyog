package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suyog\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.mercurytravels.co.in/");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//span[@class='caret'])[4]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//a[@data-toggle='modal'])[3]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("suyog3121@gmail.com");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Suyog@3121");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//button[@class='btn btn-lg btn-primary modal-btn ajax-submit'])[1]")).click();
	    Thread.sleep(1000);
	    
	    
	}

}
