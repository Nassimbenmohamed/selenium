package UseCase11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class Draganddrop1 {

	public static void main(String[] args) {
		// Declaration chromedriver
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
		
		// ouvrir chrome
		
		WebDriver driver = new ChromeDriver();
		
		//Maximaze fenetre
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// Ouvrir URL
		driver.get("https://demoqa.com/droppable");
		
		//declaration des element 
		
		WebElement Dragme,Draghere;
		
		//identification des element 
		Dragme=driver.findElement(By.id("draggable"));
		Draghere=driver.findElement(By.id("droppable"));
		
		//actions
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(Dragme,Draghere).perform();
		
		//resultat attendu 
		
		WebElement message3;
		message3=driver.findElement(By.xpath("//p[normalize-space()='Dropped!']"));
		String text;
		text=message3.getText();
		
		Assert.assertEquals("Dropped!", text);
		System.out.println("testok");
		driver.close();
		
		
		
	}

}
