package UseCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Authentification {

	public static void main(String[] args) throws InterruptedException {
		// chemin de chromedriver
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
		
		//ouvrire chrome
		WebDriver navigateur = new ChromeDriver();

		//maximiser le fenetre 
		navigateur.manage().window().maximize();
		
		//ouvrir URL
		navigateur.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//sleep
		Thread.sleep(5000);
		
		//declaration des element
		WebElement user,mdp,bouton;
		
		//identification des elements 
		user= navigateur.findElement(By.name("username"));
		mdp= navigateur.findElement(By.name("password"));
		bouton=navigateur.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		
		//actions
		user.sendKeys("Admin");
		mdp.sendKeys("admin123");
		bouton.click();
		//Sleep
		Thread.sleep(5000);
		
		//verification resultat attendu
		WebElement profil;
		profil= navigateur.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
		String text;
		text = profil.getText();
		
		
		Assert.assertEquals("manda user", text);
		System.out.println("test ok");
		
		//close navigateur
		navigateur.close();
		
	}

}
