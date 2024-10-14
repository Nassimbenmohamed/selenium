package UseCase;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ListDeroulant {

	public static void main(String[] args) {
		// chemin de navigateur 
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
		
		// ouvrire chrome
		
		WebDriver driver = new ChromeDriver();
		
		//maximaze 
		driver.manage().window().maximize();
		
		//time
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//URL
		driver.get("https://demoqa.com/select-menu");
		
		//declarationdes elements
		WebElement List;
		
		//identificationdes element 
		List=driver.findElement(By.id("oldSelectMenu"));
		
		//Action
		Select s =new Select(List);
		
		s.selectByValue("7");
		
		
		
		
		
		
	}

}
