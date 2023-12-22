package Autosuggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingKeys {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement  username = driver.findElement(By.id("1"));
		username.sendKeys("Swati");
		username.sendKeys(Keys.CONTROL+"a");
		username.sendKeys(Keys.CONTROL+"c");
	
		WebElement  fname = driver.findElement(By.id("3"));
		fname.sendKeys(Keys.CONTROL+ "v");
	}

}
