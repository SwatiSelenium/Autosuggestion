package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoAmazon {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement  searcht = driver.findElement(By.id("twotabsearchtextbox"));
		searcht.sendKeys("watches");
		Thread.sleep(2000);
		List<WebElement> autos = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count = autos.size();
		System.out.println(count);
		autos.get(count-3).click();
	}

}
