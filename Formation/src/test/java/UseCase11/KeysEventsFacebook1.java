package UseCase11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class KeysEventsFacebook1 {

	public static void main(String[] args) {
		// chemoin de chrome driver
		
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
		
		// ouvrir navigateur
		
		WebDriver driver = new ChromeDriver();
		
		// Maximaze fenetre et time
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//ouvrire URL
		
		driver.get("https://www.facebook.com/?locale=fr_FR");
		
		//declaration des element 
		
		WebElement bouton,firstname,lastname,mail,confirmation,motdepasse,jour,mois,annee,genere,sinscrire;
		
		//identification  des element 
		bouton=driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		//action
		bouton.click();
		// identification des element 
		
		//identification des element
		bouton=driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		firstname=driver.findElement(By.name("firstname"));
		lastname=driver.findElement(By.name("lastname"));
		mail=driver.findElement(By.name("reg_email__"));
		confirmation=driver.findElement(By.name("reg_email_confirmation__"));
		motdepasse=driver.findElement(By.name("reg_passwd__"));
		jour=driver.findElement(By.name("birthday_day"));
		mois=driver.findElement(By.name("birthday_month"));
		annee=driver.findElement(By.name("birthday_year"));
		genere=driver.findElement(By.xpath("//label[normalize-space()='Homme']"));
		sinscrire=driver.findElement(By.xpath("//button[@name='websubmit']"));
		
		// action
		
		firstname.sendKeys("nassim");
		lastname.sendKeys("BM");
		mail.sendKeys("nassim@gmail.com");
		
		Actions action = new Actions(driver);
		
		action.keyDown(mail,Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
		action.keyDown(confirmation,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		motdepasse.sendKeys("nassim123");
		
		Select select = new Select(jour);
		select.selectByValue("25");
		
		Select select1 = new Select(mois);
		select1.selectByValue("4");
		
		Select select2= new Select(annee);
		select2.selectByValue("1999");
		
		genere.click();
		
		sinscrire.click();
		
		//Resultat attendu 
		
		System.out.println("testok");
		driver.close();
		
		
		

	}

}
