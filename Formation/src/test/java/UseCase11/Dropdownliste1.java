package UseCase11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownliste1 {

	public static void main(String[] args) {
		// Declaration chromedriver
				System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
				
				// ouvrir chrome
				
				WebDriver driver = new ChromeDriver();
				
				//Maximaze fenetre
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				// Ouvrir URL
				driver.get("https://demoqa.com/select-menu");
				
				// declaration des element 
				
				WebElement list;
				
				//identification des element 
				
				list=driver.findElement(By.id("oldSelectMenu"));
				
				//Action
				
				Select select = new Select(list);
				select.selectByValue("7");
				
				System.out.println("testok");
				

	}

}
