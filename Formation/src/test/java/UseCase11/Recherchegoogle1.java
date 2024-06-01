package UseCase11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Recherchegoogle1 {

	public static void main(String[] args) {
		// Declaration chromedriver
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
		
		// ouvrir chrome
		
		WebDriver driver = new ChromeDriver();
		
		//Maximaze fenetre
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// Ouvrir URL
		driver.get("https://www.google.com/");
		
		//Declaration des element 
		
		WebElement barre;
		
		//identification des element
		
		barre=driver.findElement(By.name("q"));
		
		//actions
		
		barre.sendKeys("tunisie");
		barre.sendKeys(Keys.ENTER);
		
		//resultat attendu 
		
		WebElement url;
		String urlobtenu;
		urlobtenu=driver.getCurrentUrl();
		if(urlobtenu.contains("tunisie")) { 
	    System.out.println("testok");}
		else {System.out.println("testko");}
	    driver.close();
		}
        
	}


