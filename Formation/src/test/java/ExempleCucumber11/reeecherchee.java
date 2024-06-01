package ExempleCucumber11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class reeecherchee {
	
	WebDriver driver;
	
	@Given("ouVrire navigateur")
	public void ou_vrire_navigateur() {
	   System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
	   driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("ouvrire UrL de google {string}")
	public void ouvrire_ur_l_de_google(String string) {
		driver.get(string);
	    
	}

	@When("Saisir le mot {string}")
	public void saisir_le_mot(String string) {
		
		WebElement barre;
		
		barre=driver.findElement(By.name("q"));
		barre.sendKeys(string);
	    
	}

	@When("cliquer sur Entrerrr")
	public void cliquer_sur_entrerrr() {
		WebElement barre;
		barre=driver.findElement(By.name("q"));
		barre.sendKeys(Keys.ENTER);
		
	    
	}

	@Then("Vérifier le résulttatt attendu contient le mot {string}")
	public void vérifier_le_résulttatt_attendu_contient_le_mot(String string) {
		
		WebElement tunisie;
		
		tunisie=driver.findElement(By.xpath("//img[@class='jfN4p']"));
		String texttt;
		texttt=tunisie.getText();
		
		if(texttt.contains(string)) {
			
			System.out.println("test ok"); 
		} else System.out.println("test ko");
			
		driver.close();
		}
	    
	}


