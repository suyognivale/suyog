package Demo123;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindoHandle 
{
public static void main(String[] aegs) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\suyog\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	
	String Login=driver.findElement(By.xpath("//span[@class='_36KMOx']/span")).getText();
	System.out.println(Login);
	
	boolean True=driver.findElement(By.xpath("//span[@class='_36KMOx']/span")).isDisplayed();
	
	if(True)
	{
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	}
	else
	{
		String Parent=driver.getWindowHandle();
		System.out.println(Parent);
		
		Set<String> li= driver.getWindowHandles();
		System.out.println(li);
		Thread.sleep(3000);
		
	}
	Thread.sleep(3000);
	
	
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
}
}
