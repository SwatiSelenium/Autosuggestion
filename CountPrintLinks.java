package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountPrintLinks {

// program to count and print all the links present in website
	
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement  searcht = driver.findElement(By.id("twotabsearchtextbox"));
		searcht.sendKeys("mobiles");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count = links.size();
		System.out.println(count);
		for (int i=0; i<count; i++)
		{
			
			WebElement autoptions = links.get(i);
			String url = autoptions.getAttribute("href"); // getattribute method is used to print links.
			System.out.println(url);
		}

	}

}
