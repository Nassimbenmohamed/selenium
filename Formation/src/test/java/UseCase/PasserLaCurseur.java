package UseCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PasserLaCurseur {

	public static void main(String[] args) throws InterruptedException {
		// chemin de chromedriver
		
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
		
		//ouvrire chrome
		
		WebDriver driver = new ChromeDriver();
		
		//maximiser la fenetre
		
		driver.manage().window().maximize();
		
		//ouvrire l'URL
		driver.get("https://demoqa.com/menu#");
		
		//Sleep
		Thread.sleep(5000);
		
		//declaration des element 
		
		WebElement MainItem2;
		
		//identification des element 
		
		MainItem2=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
		
		//Action
		
		Actions action =new Actions(driver);
		
		action.moveToElement(MainItem2).perform();
		System.out.println("test ok");
		
		//close navigateur
		driver.close();
		
		
		

	}

}
