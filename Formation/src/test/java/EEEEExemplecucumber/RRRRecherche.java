package EEEEExemplecucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RRRRecherche {

	WebDriver driver;
	
	@Given("ovvrrire navigateur")
	public void ovvrrire_navigateur() {
	   System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	}

	@Given("Ovvrrirree URL google {string}")
	public void ovvrrirree_url_google(String string) {
	   driver.get(string);
	}

	@When("Saaaiiissiirr le nom {string}")
	public void saaaiiissiirr_le_nom(String string) {
	   WebElement BBBarre;
	   
	   BBBarre=driver.findElement(By.xpath("//textarea[@title='Rechercher']"));
	   BBBarre.sendKeys(string);
	}

	@When("ccccliquerr actionnn")
	public void ccccliquerr_actionnn() {
	  WebElement EEntrer;
	  EEntrer=driver.findElement(By.xpath("//textarea[@title='Rechercher']"));
	  EEntrer.sendKeys(Keys.ENTER);
	}

	@Then("Vérrrriiffieer le phrases {string}")
	public void vérrrriiffieer_le_phrases(String string) {
	  WebElement textt;
	  
	  textt=driver.findElement(By.xpath("//div[@role='heading'][normalize-space()='Tunisie']"));
	  
	  String message;
	  
	  message=textt.getText();
	  
	  if(message.contains(string)) {
	  System.out.println("Test ok");
	  }
	  else System.out.println("test ko");
	  driver.close();
	  
	}
}
