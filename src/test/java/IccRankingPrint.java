import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IccRankingPrint {

	public static void main(String[] args) {
		
		
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.get("https://www.icc-cricket.com/homepage");
		
//		WebElement element = driver.findElement(By.);
//		Actions at = new Actions(driver);
//		at.moveToElement(element);
		
		

	}

}
