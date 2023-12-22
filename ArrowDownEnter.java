package Autosuggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrowDownEnter {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		WebElement searcht = driver.findElement(By.name("q"));
		searcht.sendKeys("laptop");
		Thread.sleep(3000);
		searcht.sendKeys(Keys.ARROW_DOWN);
		searcht.sendKeys(Keys.ARROW_DOWN);	
		searcht.sendKeys(Keys.ARROW_DOWN);
		searcht.sendKeys(Keys.ARROW_DOWN);
		searcht.sendKeys(Keys.ARROW_DOWN);
		searcht.sendKeys(Keys.ENTER);
	}

}
