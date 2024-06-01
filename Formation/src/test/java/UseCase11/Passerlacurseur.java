package UseCase11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Passerlacurseur {

	public static void main(String[] args) {
		// chemin chromedriver
		
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
		
		// Ouvrire navigateur
		
		WebDriver driver = new ChromeDriver();
		
		//Maximaze fenetre 
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Ouvrire URL
		
		driver.get("https://demoqa.com/menu#");
		
		// Declaration des element
		
		WebElement mainItem2;
		
		//identification des element 
		
		mainItem2=driver.findElement(By.xpath("//a[normalize-space()='Main Item 2']"));
		
		// Action
		
		Actions action =new Actions(driver);
		action.moveToElement(mainItem2).perform();
		System.out.println("test ok");
		driver.close();
		

	}

}
