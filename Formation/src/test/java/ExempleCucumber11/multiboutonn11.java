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

public class multiboutonn11 {
	WebDriver driver;
	
	@Given("ouvrire navi")
	public void ouvrire_navi() {
		
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	@Given("ouvrire URRRL {string}")
	public void ouvrire_urrrl(String string) {
		
		driver.get(string);
	    
	}

	@When("saisir usssernaime {string}")
	public void saisir_usssernaime(String string) {
		
		WebElement username;
		username=driver.findElement(By.name("username"));
		username.sendKeys(string);
	    
	}

	@When("sAisir mdtp {string}")
	public void s_aisir_mdtp(String string) {
		WebElement mdp;
		mdp=driver.findElement(By.name("password"));
	    mdp.sendKeys(string);
	}

	@When("cliquerr sUr le BOuton loguer")
	public void cliquerr_s_ur_le_b_outon_loguer() {
		WebElement boutonlogiin;
		boutonlogiin=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		boutonlogiin.click();
	}

	@Then("Vérifier le message ko {string}")
	public void vérifier_le_message_ko(String string) {
		WebElement profil;
		profil= driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));
		String text;
		text = profil.getText();
		
		
		Assert.assertEquals(string, text);
		System.out.println("test ok");
		driver.close();
		
	}


}
