package UseCase11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysEventCopierColler {

	public static void main(String[] args) {
		// chemoin de chrome driver
		
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
		
		// ouvrir navigateur
		
		WebDriver driver = new ChromeDriver();
		
		// Maximaze fenetre et time
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//ouvrire URL
		
		driver.get("https://demoqa.com/text-box");
		
		// declaration des element 
		
		WebElement user,mdp;
		
		//identification des element 
		
		user=driver.findElement(By.id("userName"));
		mdp=driver.findElement(By.id("userEmail"));
		
		// Actions
		
		user.sendKeys("nassim");
		Actions action = new Actions(driver);
		action.keyDown(user,Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
		action.keyDown(mdp, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	}

}
