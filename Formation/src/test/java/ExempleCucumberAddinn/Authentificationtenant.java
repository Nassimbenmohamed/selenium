package ExempleCucumberAddinn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Authentificationtenant {
	
	WebDriver driver;
	
	
	@Given("ouvrire navigAteur")
	public void ouvrire_navig_ateur() {
		
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	    
	}

	@Given("ouvrire UrL {string}")
	public void ouvrire_ur_l(String string) {
		
		driver.get(string);
	    
	}

	@When("saisis lEmail Adress {string}")
	public void saisis_l_email_adress(String string) {
		
		WebElement EmailAdress;
		EmailAdress=driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
		EmailAdress.sendKeys(string);
	    
	}

	@When("saisis le Password de tenant {string}")
	public void saisis_le_password_de_tenant(String string) {
		
		WebElement Password;
		Password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		Password.sendKeys(string);
	    
	}

	@When("cliquer SUR le bouton Sig In")
	public void cliquer_sur_le_bouton_sig_in() {
		
		WebElement bouton;
		bouton=driver.findElement(By.xpath("//button[normalize-space()='Se connecter']"));
		bouton.click();
	    
	}

	@Then("Vérifier le nom de proFil")
	public void vérifier_le_nom_de_pro_fil() {
		
		WebElement profil;
		profil=driver.findElement(By.xpath("//b[normalize-space()='Ahmed Bensalem']"));
		String text;
		text=profil.getText();
		
		Assert.assertEquals("Ahmed Bensalem", text);
		System.out.println("test ok");
		
		driver.close();
	}


}
