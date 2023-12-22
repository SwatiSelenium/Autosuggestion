package Autosuggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggEnter {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement  searcht = driver.findElement(By.name("q"));
		searcht.sendKeys("Maharashtra");
		searcht.sendKeys(Keys.ENTER);
	}

}
