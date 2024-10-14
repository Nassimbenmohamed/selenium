package EEEEExemplecucumber;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AAAAAuthentification {

	 WebDriver driver;
	 
	@Given("OooUVrire navigateur")
	public void ooo_u_vrire_navigateur() {
	    System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}

	@Given("ooovrire URL")
	public void ooovrire_url() {
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  
	}

	@When("ssaisis le adrees")
	public void ssaisis_le_adrees() {
		WebElement aaadress;
		
		aaadress= driver.findElement(By.xpath("//input[@placeholder='Username']"));
		aaadress.sendKeys("Admin");
		
	    
	}

	@When("ssaisis le mdp")
	public void ssaisis_le_mdp() {
		WebElement mmmdp;
		mmmdp=driver.findElement(By.name("password"));
		mmmdp.sendKeys("admin123");
	    
	}

	@When("cccliquer sur le bouton")
	public void cccliquer_sur_le_bouton() {
		WebElement BBBouton;
		BBBouton=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		BBBouton.click();
	    
	}

	@Then("VVVerifier le profil")
	public void vv_verifier_le_profil() {
		
		WebElement PPProfil;
		PPProfil=driver.findElement(By.xpath("//p[normalize-space()='manda user']"));
		
		String nom;
		nom=PPProfil.getText();
		Assert.assertEquals("manda user", nom);
		System.out.println("Test Ok");
		driver.close();
	   
	}

}
