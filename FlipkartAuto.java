//not working // ask
//program to select 3rd option in autosuggestion from flipkart
package Autosuggestion;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAuto {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");	
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[.='✕']")).click();
		WebElement searchtf = driver.findElement(By.name("q"));
		searchtf.sendKeys("sandals");
		Thread.sleep(2000);
		List<WebElement> auto3 = driver.findElements(By.xpath("//form[@class='_2M8cLY header-form-search']/ul/li[3]"));
		Thread.sleep(2000);
		int count = auto3.size();
		System.out.println(count);
		auto3.get(4).click();
	}

}

//   //form[@class='_2M8cLY header-form-search']/ul/li[3]