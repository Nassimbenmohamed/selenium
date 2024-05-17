package UseCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysEvents {

	public static void main(String[] args) {
		// chemin chromedriver 
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
		
		//Ouvrire navigateur
		WebDriver driver = new ChromeDriver();
		
		//Maximaze 
		driver.manage().window().maximize();
		
		//Sleep
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//ouvrire URL
		
		driver.get("https://demoqa.com/text-box");
		
		//declaration des element 
		
		WebElement  FullName,Email;
		
		//identification des element
		
		FullName=driver.findElement(By.id("userName"));
		Email=driver.findElement(By.id("userEmail"));
		
		//action
		FullName.sendKeys("Bonjour");
		Actions action = new Actions(driver);
		action.keyDown(FullName,Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
		action.keyDown(Email,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

	}

}
