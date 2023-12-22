package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// program to print all autosuggestion names and count

public class AutoSuggNames 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement  searcht = driver.findElement(By.id("twotabsearchtextbox"));
		searcht.sendKeys("mobiles");
		Thread.sleep(2000);
		List<WebElement> autos = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count = autos.size();
		System.out.println(count);
		for (int i=0; i<count; i++)
		{
			WebElement autoptions = autos.get(i);
			String names = autoptions.getText();
			System.out.println(names);
		}
	}
}
