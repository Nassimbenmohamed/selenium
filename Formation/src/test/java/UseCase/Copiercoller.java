package UseCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Copiercoller {

	public static void main(String[] args) {
		// Chemin chromedriver
		
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
		
		//ouvrire chrome
		
		WebDriver driver = new ChromeDriver();
		
		//Maximiser fenetre 
		
		driver.manage().window().maximize(); 
		
		//Sleep
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//ouvrire URL 
		driver.get("https://www.facebook.com/?locale=fr_FR");
		
		//declaration des variable
		WebElement Bouton,Prenom,nom;Email;confirmation,jour,annee,gener,sinscrire
		
		//identification des element 
		
		Bouton=driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		
		//action
		
		Bouton.click();
		
		Prenom=driver.findElement(By.xpath("//input[@name='firstname']"));
		
		Prenom.sendKeys("Nassim");
		
		
		
		
		

	}

}
