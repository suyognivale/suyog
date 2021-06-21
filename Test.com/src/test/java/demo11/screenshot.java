package demo11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

public class screenshot 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suyog\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.mercurytravels.co.in/");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    WebElement w=driver.findElement(By.id("themes"));
	    Select s1=new Select(w);
	    s1.selectByVisibleText("visa-free");
	    
	    Actions a=new Actions(driver);
	    a.moveToElement(driver.findElement(By.id("dphh1"))).clickAndHold().build().perform();
	    
	    
	    
	    Thread.sleep(3000);
	    
	    
	    File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFileToDirectory(scr, new File("D:\\Java 2\\Test.com\\ss\\abc.pnj"));
	    
	    
	    
	    
	    
	    
	    
	    
	}
	
}
