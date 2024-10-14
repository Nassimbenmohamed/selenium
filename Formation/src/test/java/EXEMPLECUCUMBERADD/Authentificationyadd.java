package EXEMPLECUCUMBERADD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STLang;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Authentificationyadd {
    WebDriver driver;
    
	@Given("Ouvrire nav")
	public void ouvrire_nav() {
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    
	}

	@Given("ouvrire UURll")
	public void ouvrire_uu_rll() {
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    new WebDriverWait(driver, 10).until(ExpectedConditions.titleContains("OrangeHRM"));
	}

	    
	

	@When("Saaisis user")
	public void saaisis_user() {
	    
	    WebElement ussser = driver.findElement(By.name("username"));
	    ussser.sendKeys("Admin");
	    
	   
	}

	@When("saaisis mdp")
	public void saaisis_mdp() {
	    WebElement mdpppp;
	    
	    mdpppp=driver.findElement(By.name("password"));
	    mdpppp.sendKeys("admin123");
	}
	
	
	@When("cliquer sur le bouton ccnxx")
	public void cliquer_sur_le_bouton_ccnxx() {
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    WebElement bouTiton;
	    bouTiton = driver.findElement(By.xpath("//button[normalize-space()='Login']")); // fixed
	    bouTiton.click();
	}

	

	@Then("Vérifierle nom du prpofil")
	public void vérifierle_nom_du_prpofil() {
	    WebElement profilllname;
	    profilllname=driver.findElement(By.xpath("//p[normalize-space()='manda user']"));


	    String nom;
	    nom = profilllname.getText();
	    Assert.assertEquals("manda user", nom);
	    
	}
}

