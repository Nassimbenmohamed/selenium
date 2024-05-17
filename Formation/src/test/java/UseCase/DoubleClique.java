package UseCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DoubleClique {

	public static void main(String[] args) throws InterruptedException {
		
		// chemin de chromedriver
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
		
		//ouvrire chrome
		WebDriver driver = new ChromeDriver();
		
		//Maximiser la fenetre 
		driver.manage().window().maximize();
		
		//ouvrire l'URL
		driver.get("https://demoqa.com/buttons");
		
		//Sleep
		
		Thread.sleep(5000);
		
		//Declaration des element 
		WebElement DoubleCliqueME,RightClickME;
		
		//identification des element
		DoubleCliqueME=driver.findElement(By.id("doubleClickBtn"));
		RightClickME=driver.findElement(By.id("rightClickBtn"));
		
		// Actions
		
		Actions action = new Actions(driver);
		
		action.doubleClick(DoubleCliqueME).perform();
		action.contextClick(RightClickME).perform();
		
		//Sleep
		Thread.sleep(10000);
		
		//Vérification des resultat attendu
		WebElement message;
		WebElement message2;
		message= driver.findElement(By.id("doubleClickMessage"));
		message2=driver.findElement(By.id("rightClickMessage"));
		
		String text;
		String text2;
		text=message.getText();
		text2=message2.getText();
		
		Assert.assertEquals("You have done a double click", text);
		Assert.assertEquals("You have done a right click", text2);
		
		System.out.println("Test ok");
		
		//close navigateur
		driver.close();
		
	}

}
