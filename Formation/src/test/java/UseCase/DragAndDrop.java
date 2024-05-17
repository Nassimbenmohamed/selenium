package UseCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class DragAndDrop {

	private static final String Actions = null;

	public static void main(String[] args) throws InterruptedException {
		// chemin de chromedriver
		System.setProperty("webdriver.chrome.driver", "src/test/ressource/chromedriver.exe");

		//ouvrire chrome
		WebDriver driver=new ChromeDriver();
		
		//maximizer la fenetre 
		driver.manage().window().maximize();
		
		//ouvrire l'URL
		driver.get("https://demoqa.com/droppable");
		
		//Sleep
		Thread.sleep(10000);
		
		// Declaration des element
		
		WebElement article;
		WebElement panier;
		
		
		//identification des element
		
		article= driver.findElement(By.id("draggable"));
	    panier=driver.findElement(By.id("droppable"));
		
		//Action
	    Actions action = new Actions(driver);
	    
	    action.dragAndDrop(article, panier).perform();
	    
	    //Sleep
	    Thread.sleep(5000);
	    
	    //resultat a verifier 
	    
	    WebElement message;
	    
	    message=driver.findElement(By.id("droppable"));
	    
	    String text;
	    
	    text =message.getText();
	    
	    Assert.assertEquals("Dropped!",text);
	    System.out.println("test ok");
	    
	    //close navigateur
	    driver.close();
	    
	   
		
		
	}

}
