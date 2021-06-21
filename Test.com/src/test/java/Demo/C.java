package Demo;

import java.awt.Dimension;
import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C 
{
public static void main(String[] args) throws InterruptedException 
{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\suyog\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.mercurytravels.co.in/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    String Title=driver.getTitle();
    System.out.println(Title);
    org.openqa.selenium.Dimension count=driver.findElement(By.tagName("a")).getSize();
    System.out.println(count);
    int count1=driver.findElements(By.tagName("a")).size();    
	System.out.println(count1);
	java.util.List<WebElement> li = driver.findElements(By.tagName("a"));
	System.out.println(li);
	String s=driver.findElement(By.xpath("(//a[@class='ind_link font14'])[2]")).getText();
	System.out.println(s);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	driver.close();
	
	
	
	
	
	
	
}

	


}
