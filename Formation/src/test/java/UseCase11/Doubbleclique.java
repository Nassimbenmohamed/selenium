package UseCase11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class Doubbleclique {

	public static void main(String[] args) {
		// chemin chromedriver
		
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
		
		//ouvrir chrome
		
		ChromeDriver driver = new ChromeDriver();
		
		//maximaze fenetre 
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// Ouvrir URL
		
		driver.get("https://demoqa.com/buttons");
		
		//identification des element
		
		WebElement Doubleclick;
		
		// Declaration des element
		
		Doubleclick=driver.findElement(By.id("doubleClickBtn"));
		
		
		// Actions
		Actions action = new Actions(driver);
		action.doubleClick(Doubleclick).perform();
		
		//Vérification resultat attendu 
		
		WebElement message;
		message=driver.findElement(By.id("doubleClickMessage"));
		String text;
		text=message.getText();
		Assert.assertEquals("You have done a double click",text);
		System.out.println("Test ok");
		driver.close();
		
		
		

	}

}
