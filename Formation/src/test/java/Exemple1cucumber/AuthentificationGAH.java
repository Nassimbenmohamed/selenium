package Exemple1cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationGAH {
	WebDriver driver;
	
	@Given("ouvrire Navigateur")
	public void ouvrire_navigateur() {
	   System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   
	}

	@Given("ouvrire URL")
	public void ouvrire_url() {
	 driver.get("https://administration.dev.abridia.com/login");   
	}

	@When("Saisir email")
	public void saisir_email() {
	   WebElement email; 
	   email=driver.findElement(By.xpath("//input[@id='mat-input-0']"));
	   email.sendKeys("firas.bensalah@addinn.com");
	}

	@When("Saisir mot de passe")
	public void saisir_mot_de_passe() {
	 WebElement motdepasse;
	 motdepasse=driver.findElement(By.id("mat-input-1"));
	 motdepasse.sendKeys("azerty1234");
	}

	@When("clique bouton connexion")
	public void clique_bouton_connexion() {
	   WebElement boutonlogin;
	   boutonlogin=driver.findElement(By.xpath("//*[@id=\"right-side\"]/admin-authentication/form/div/button"));
	   boutonlogin.click();
	}

	@Then("Vérifier le nom du user")
	public void vérifier_le_nom_du_user() {
		WebElement profil;
		profil=driver.findElement(By.xpath("//b"));
		String text;
		text=profil.getText();
		
		Assert.assertEquals("firas ben salah", text);
		
		System.out.println("test ok");
		
		driver.close();
		
	
	}

}
