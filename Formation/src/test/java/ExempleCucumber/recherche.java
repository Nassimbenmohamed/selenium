package ExempleCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class recherche {
	
	
	WebDriver driver; 
	
	@Given("ouvrire navigateurr")
	public void ouvrire_navigateurr() {
	System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	}

	@Given("ouvrire URL de google {string}")
	public void ouvrire_url_de_google(String string) {
	   driver.get(string); 
	}

	@When("Saisir le mot  {string}")
	public void saisir_le_mot(String string) {
	  WebElement barre;
	  barre=driver.findElement(By.name("q"));
	  barre.sendKeys(string);
	}

	@When("cliquer sur entrer")
	public void cliquer_sur_entrer() {
		WebElement barre;
		  barre=driver.findElement(By.name("q"));
		  barre.sendKeys(Keys.ENTER);
	}

	@Then("verifier que la resultat contient le mot {string}")
	public void verifier_que_la_resultat_contient_le_mot(String string) {
	    WebElement text;
	    text=driver.findElement(By.id("result-stats"));
	    String message;
	    message= text.getText();
	    
	    if(message.contains(string)) {
	    	System.out.println("test ok");
	    }else  System.out.println("test ko");
	    driver.close();
	    
	    }
	    
	}
	



