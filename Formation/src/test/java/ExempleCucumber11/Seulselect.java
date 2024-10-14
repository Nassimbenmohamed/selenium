package ExempleCucumber11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Seulselect {
	
	WebDriver driver;
	
	@Given("navigateur")
	public void navigateur() {
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}

	@Given("URL")
	public void url() {
	   driver.get("https://demoqa.com/select-menu");
	}

	@When("cliquer sur le select")
	public void cliquer_sur_le_select() {
		
		WebElement sel;
		sel=driver.findElement(By.xpath("//div[@class='col-md-6 col-sm-12']//div//select"));
		Select sel1=new Select(sel);
		sel1.selectByVisibleText("Purple");
	    
	}

	@When("choisir")
	public void choisir() {
	    
	}

	@Then("Vérifier")
	public void vérifier() {
	    
	}

}
