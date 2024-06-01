package UseCase11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Premiercas12 {

	public static void main(String[] args) {
		// chemin chromedriver
		
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
		
		// ouvrir chrome
		
		WebDriver driver = new ChromeDriver();
		
		//maximiser la fenetre 
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//ouvrire URL
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// declaration des element 
		
		WebElement user,mdp,bouton;
		
		// identification des element 
		
		user=driver.findElement(By.name("username"));
		mdp=driver.findElement(By.name("password"));
		bouton=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		
		// Action
		
		user.sendKeys("Admin");
		mdp.sendKeys("admin123");
		bouton.click();
		
		//Vérification de resultat attendu 
		
		WebElement profil;
		profil=driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
		String text;
		text= profil.getText();
		Assert.assertEquals("Test 5 user",text);
		System.out.println("test ok");
		driver.close();
		
		

	}

}
