package UseCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PremierCas {

	public static void main(String[] args) {
		//chemin chromedriver
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
		//ouverture de chrome
		WebDriver driver = new ChromeDriver();
		//maximiser la fenetre 
		driver.manage().window().maximize();
		//ouvrire URL
		driver.get("https://www.youtube.com/");
		driver.navigate().to("https://www.youtube.com/");
		
	}

}
