package UseCase11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class Rightclique1 {

	public static void main(String[] args) {
		// chemin chrome driver
		
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe" );
		
		//Ouvrir Navigateur
		
		WebDriver driver = new ChromeDriver();
		
		// Maximaze fenetre
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Ouvrir URL
		
		driver.get("https://demoqa.com/buttons");
		
		//identification des element 
		
		WebElement Doubleclick,Rightclick;
		
		// Declaration des element
		
		Doubleclick=driver.findElement(By.id("doubleClickBtn"));
		Rightclick=driver.findElement(By.id("rightClickBtn"));
		
		// Action
		
		Actions action = new Actions(driver);
		action.doubleClick(Doubleclick).perform();
		action.contextClick(Rightclick).perform();
		
		//Vérification resultat attendu 
		
		WebElement message1,message2;
		message1=driver.findElement(By.id("doubleClickMessage"));
		message2=driver.findElement(By.id("rightClickMessage"));
		
		String text1,text2;
		text1=message1.getText();
		text2=message2.getText();
		
		Assert.assertEquals("You have done a double click", text1);
		Assert.assertEquals("You have done a right click", text2);
		
		System.out.println("test ok");
		driver.close();

	}

}
