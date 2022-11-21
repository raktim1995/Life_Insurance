import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartPrice {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
	     driver.findElement(By.xpath("//button[text()='✕']")).click();
	
		WebElement ele = driver.findElement(By.xpath("//div[text()='Electronics']"));
		
		Actions as= new Actions(driver);
		as.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("//a[text()='Computer Peripherals']")).click();
		
		driver.findElement(By.xpath("//div[@data-id='PROGJYPVGJ6WCJTB']")).click();
		String title = driver.getTitle();
		
		//String patialwindow = "brother DCP-T426W Multi-function WiFi Color Printer for Home Usage - brother : Flipkart.com";
		
		Set<String> set=driver.getWindowHandles();
		Iterator<String>it = set.iterator();
		while(it.hasNext())
		{
			String wid=it.next();
			driver.switchTo().window(wid);
			String currentwindowhandel=driver.getCurrentUrl();
			if(currentwindowhandel.contains(title))
			{
				break;
			}
			
		}
		
		String price = driver.findElement(By.xpath("//span[text()='PLAY Latest MP1 Pro 1080P Projector, 6000 lm Full HD Led Advance Projector (6000 lm) Portable Projector']/ancestor::div[@class='aMaAEs']/descendant::div[@class='_30jeq3 _16Jk6d']")).getText();
		
		System.out.println(price);
		
		
		
		
		

	}

}
