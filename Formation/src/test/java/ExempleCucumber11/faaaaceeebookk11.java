package ExempleCucumber11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class faaaaceeebookk11 {
	
	WebDriver driver;
	
	@Given("ouvrire navigateeuuuur")
	public void ouvrire_navigateeuuuur() {
		
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	}

	@Given("ouvrire URL de facebook1 {string}")
	public void ouvrire_url_de_facebook1(String string) {
	    driver.get(string);
	}

	@When("cliquer sur le bouton sinscrirre")
	public void cliquer_sur_le_bouton_sinscrirre() {
		
		WebElement bouton;
		bouton=driver.findElement(By.xpath("//a[normalize-space()='Créer nouveau compte']"));
		bouton.click();
	    
	}

	@When("saisir firtname {string}")
	public void saisir_firtname(String string) {
		
		WebElement firstname;
		firstname=driver.findElement(By.name("firstname"));
		firstname.sendKeys(string);
	    
	}

	@When("saisir lastname {string}")
	public void saisir_lastname(String string) {
		WebElement lastname;
		lastname=driver.findElement(By.name("lastname"));
		lastname.sendKeys(string);
	    
	}

	@When("saisir mail {string}")
	public void saisir_mail(String string) {
		WebElement mail;
		mail=driver.findElement(By.name("reg_email__"));
		mail.sendKeys(string);
	    
	}

	@When("saisir confirmation")
	public void saisir_confirmation() {
		
		WebElement mail,confirmation;
		mail=driver.findElement(By.name("reg_email__"));
		confirmation=driver.findElement(By.name("reg_email_confirmation__"));
		Actions action =new Actions(driver);
		action.keyDown(mail,Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
        action.keyDown(confirmation, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	    
	}

	@When("saisir mdp {string}")
	public void saisir_mdp(String string) {
		
		WebElement mdp;
		mdp=driver.findElement(By.name("reg_passwd__"));
		mdp.sendKeys(string);
	    
	}

	@When("choisir jour {string}")
	public void choisir_jour(String string) {
		WebElement jour;
		jour=driver.findElement(By.id("day"));
		Select select = new Select(jour);
		select.selectByValue(string);
		
	    
	}

	@When("choisir mois {string}")
	public void choisir_mois(String string) {
		WebElement mois;
		mois=driver.findElement(By.id("month"));
		Select select = new Select (mois);
		select.selectByValue(string);
	    
	}

	@When("choisir année {string}")
	public void choisir_année(String string) {
		WebElement année;
		année=driver.findElement(By.id("year"));
		Select select =new Select(année);
		select.selectByValue(string);
	    
	}

	@When("choisir genere {string}")
	public void choisir_genere(String string) {
		
		WebElement genere;
		genere=driver.findElement(By.xpath("//label[normalize-space()='Homme']"));
		genere.click();
	
	}

	@When("cliquer sur le bouton sinscriree")
	public void cliquer_sur_le_bouton_sinscriree() {
		WebElement bouton;
		bouton=driver.findElement(By.xpath("//button[@name='websubmit']"));
		bouton.click();
	    
	}

	@Then("la creation se faitte avec succée")
	public void la_creation_se_faitte_avec_succée() {
		System.out.println("test ok");
		driver.close();
	    
	}

}
