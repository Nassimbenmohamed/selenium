package UseCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class recherchegoogle {

	public static void main(String[] args) {
		// chemain chromedriver
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
		
		//ouvrire Navigateur
		
		WebDriver driver = new ChromeDriver();
		
		// maximaze
		driver.manage().window().maximize();
		
		//time
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//ouvrire URL
		driver.get("https://www.google.com/");
		
		// declaration des element 
		WebElement barre;
		
		//identification des element
		barre=driver.findElement(By.name("q"));
		
		//action
		barre.sendKeys("Tunisie");
		barre.sendKeys(Keys.ENTER);
		
		//verification de resultat
		
		String URLobtenu;
		
		URLobtenu=driver.getCurrentUrl();
		
		if(URLobtenu.contains("Tunisie")) {
		
		System.out.println("testok");}
		
		else {System.out.println("test ko");}
		
	}

}
