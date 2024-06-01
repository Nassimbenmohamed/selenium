package ExempleCucumber11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Authentificaaationn11 {
	
	WebDriver driver;
	
	@Given("ouvrire navigateuur")
	public void ouvrire_navigateuur() {
		
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("ouvrire UURL")
	public void ouvrire_uurl() {
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("Saisiir username")
	public void saisiir_username() {
		
		WebElement username;
		username=driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		
	   
	}

	@When("Saisiir mdp")
	public void saisiir_mdp() {
		WebElement mdp;
		mdp=driver.findElement(By.name("password"));
	    mdp.sendKeys("admin123");
	}

	@When("cliquuer sur le bouton logiin")
	public void cliquuer_sur_le_bouton_logiin() {
		
		WebElement boutonlogiin;
		boutonlogiin=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		boutonlogiin.click();

	    
	}

	@Then("Vérefier le nom du proffile")
	public void vérefier_le_nom_du_proffile() {
		//verification resultat attendu
				WebElement profil;
				profil= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
				String text;
				text = profil.getText();
				
				
				Assert.assertEquals("manda user", text);
				System.out.println("test ok");
	    
	}

}
