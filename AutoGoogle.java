package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoGoogle {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");	
		driver.manage().window().maximize();
		WebElement searchtext =	driver.findElement(By.name("q")); // search bar
		searchtext.sendKeys("Solar System");
		Thread.sleep(1000);
		List<WebElement> autosuggestion =driver.findElements(By.xpath("//div[@class ='OBMEnb']/ul/li")); // autosuggetion Xpath
		int countofautos = autosuggestion.size(); // storing no of Autosuggestions
		System.out.println(countofautos);  	// printing count
		autosuggestion.get(countofautos-2).click(); // clicking on suggestion using indexing
	//	autosuggestion.get(0).click(); // not generic code, but one of the way to do 
	}

}
