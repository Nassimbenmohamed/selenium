package ExempleCucumberAddinn;

import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class authentiGAT {


	
	
	WebDriver driver;
	
	@Given("ouvriree navigAteurrGAT1")
	public void ouvriree_navig_ateurr_gat1() {
		System.setProperty("webdriver.chrome.driver","src/test/ressource/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	    
	}

	@Given("ouvrire UrLlGAT11 {string}")
	public void ouvrire_ur_ll_gat11(String string) {
	    driver.get(string);
	}

	@When("saisir maaailgat {string}")
	public void saisir_maaailgat(String string) {
	  WebElement maaailgat;
	  maaailgat=driver.findElement(By.xpath("//input[@placeholder='Email']"));
	  maaailgat.sendKeys(string);
	}

	@When("saisir mdpgaT {string}")
	public void saisir_mdpga_t(String string) {
	  WebElement mdpgaT;
	  mdpgaT=driver.findElement(By.xpath("//input[@placeholder='*********']"));
	  mdpgaT.sendKeys(string);
	}

	@When("cliquer sur boutt")
	public void cliquer_sur_boutt() {
		
		WebElement boutt;
		boutt=driver.findElement(By.xpath("//span[@class='p-button-label']"));
		boutt.click();
	   
	}
	@When("cliquer sur le lien")
	public void cliquer_sur_le_lien() {
	    WebElement lien;
	    lien=driver.findElement(By.xpath("//div[@class='portal-bloc-details'][contains(text(),'Cliquez ici pour démarrer votre parcours de souscr')]"));
	    lien.click();
	    
	}
	
	@When("cliquer sur le dropdowndevis")
	public void cliquer_sur_le_dropdowndevis() {
	    
	    WebElement nvdevis;
	    nvdevis=driver.findElement(By.xpath("//span[normalize-space()='Gestion devis']"));
	    nvdevis.click();
	 }

    @When("cliquer sur vouveau devis")
    public void cliquer_sur_vouveau_devis() {
        WebElement nouveaudevis = driver.findElement(By.xpath("//span[normalize-space()='Nouveau devis']"));
        nouveaudevis.click();
    }
    
    @When("cliquer sur le cercle")
    public void cliquer_sur_le_cercle() {
        WebElement cercle;
        cercle=driver.findElement(By.xpath("//div[@class='d-flex gap-2']//div[1]//p-radiobutton[1]//div[1]//div[2]"));
        cercle.click();
    }
    @When("cliquer sur creer")
    public void cliquer_sur_creer() {
        WebElement creer;
        creer=driver.findElement(By.xpath("//span[normalize-space()='Créer prospect']"));
        creer.click();
    }

    @When("choisir une choix")
    public void choisir_une_choix() {
        WebElement choix;
        choix=driver.findElement(By.xpath("///span[@aria-label='PM']"));
        choix.click();
    }

	@When("cliquer sur rechercherrr")
	public void cliquer_sur_rechercherrr() {
	    WebElement recher;
	    recher=driver.findElement(By.xpath("//span[normalize-space()='Rechercher']"));
	    recher.click();
	}

	@When("cliquer sur la ligne")
	public void cliquer_sur_la_ligne() {
	    WebElement ligne;
	    ligne=driver.findElement(By.xpath("//td[normalize-space()='Fares']"));
	    ligne.click();
	}

	@When("cliquer sur le bout select")
	public void cliquer_sur_le_bout_select() {
	    WebElement boutselect;
	   boutselect=driver.findElement(By.xpath("//span[normalize-space()='Sélectionner']"));
	   boutselect.click();
	}
	
	
	    @When("cliquer sur le dropdownliste couverture")
	    public void cliquer_sur_le_dropdownliste_couverture() {
	      WebElement   dropdownlistecouverture;
	      dropdownlistecouverture=driver.findElement(By.xpath("//span[@aria-label='Temporaire']"));
	      dropdownlistecouverture.click();
	         
	      
	    }
	    
	    @When("faire le choixx")
	    public void faire_le_choixx() {
	    	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	    	WebElement reconductible8;
		      reconductible8=driver.findElement(By.xpath("//span[normalize-space()='Reconductible']"));
		      reconductible8.click();
	    }
	    
	    @When("cliquer sur Type d'établissement")
	    public void cliquer_sur_type_d_établissement() {
	        WebElement type;
	        type=driver.findElement(By.xpath("//p-dropdown[@formcontrolname='establishmentType']//span[@role='combobox']"));
	        type.click();
	    
	    }
	    @When("faire le choix")
	    public void faire_le_choix() {
	        WebElement privé;
	        privé=driver.findElement(By.xpath("//li[@aria-label='Privé']"));
	        privé.click();
	    }
	    @When("cliquer sur Type d'activité")
	    public void cliquer_sur_type_d_activité() {
	        WebElement acti;
	        acti=driver.findElement(By.xpath("//p-dropdown[@class='p-element p-inputwrapper custom-dropdown ng-untouched ng-pristine ng-invalid']//span[@role='combobox']"));
	        acti.click();
	    
	    }

	    @When("faire la selc")
	    public void faire_la_selc() {
	      WebElement selc;
	      selc=driver.findElement(By.xpath("//span[normalize-space()='Services']"));
	      selc.click();
	    }
	    
	    @When("cliquer sur Type Sous-activité")
	    public void cliquer_sur_type_sous_activité() {
	        WebElement sousactivité;
	        sousactivité=driver.findElement(By.xpath("//p-dropdown[@formcontrolname='subActivityId']//span[@role='combobox']"));
	        sousactivité.click();
	    }

	    @When("faire la selcc")
	    public void faire_la_selcc() {
	        WebElement selcc;
	        selcc=driver.findElement(By.xpath("//li[@aria-label='Bibliothèque']"));
	        selcc.click();
	    }
	    
	    @When("cliquer sur Nombre des employés de l'établissement")
	    public void cliquer_sur_nombre_des_employés_de_l_établissement() {
	        WebElement nbr;
	        nbr=driver.findElement(By.xpath("//body[1]/gat-root[1]/gat-dashbord[1]/div[1]/gat-devis[1]/gat-new-quote[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[2]/sh-ui-input-group[1]/div[1]/p-inputgroup[1]/div[1]/button[2]/span[1]"));
	        nbr.click();
	    }

	    @When("cliquer sur Y a-t-il des sinistres déclarés dans les cinq dernières années")
	    public void cliquer_sur_y_a_t_il_des_sinistres_déclarés_dans_les_cinq_dernières_années() {
	        // Attendre jusqu'à ce que l'élément soit cliquable
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	        WebElement ouinon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='p-inputswitch-slider']")));
	        
	        // Cliquer sur l'élément de manière forcée
	        JavascriptExecutor executor = (JavascriptExecutor) driver;
	        executor.executeScript("arguments[0].click();", ouinon);
	    }
	    @When("saisis le total")
	    public void saisis_le_total() {
	        WebElement total;
	        total=driver.findElement(By.xpath("//input[@class='p-inputtext p-component p-element input-text ng-untouched ng-pristine ng-invalid']"));
	        total.sendKeys("25");
	    }
	        
	        @When("cliquer sur le tri")
	        public void cliquer_sur_le_tri() {
	            WebElement tri = driver.findElement(By.xpath("//span[@aria-label='1']"));

	            // Utiliser JavaScript pour cliquer sur l'élément
	            JavascriptExecutor executor = (JavascriptExecutor) driver;
	            executor.executeScript("arguments[0].click();", tri);
	        }

	        @When("choisir le nombre")
	        public void cliquer_sur_le_tri5() {
	            WebElement tri = driver.findElement(By.xpath("//li[@aria-label='3']"));

	            // Utiliser JavaScript pour cliquer sur l'élément
	            JavascriptExecutor executor = (JavascriptExecutor) driver;
	            executor.executeScript("arguments[0].click();", tri);
	        }
	        @When("cliquer sur le date")
	        public void cliquer_sur_le_date() {
	            WebElement dateee;
	            dateee=driver.findElement(By.xpath("//input[@role='combobox']"));
	            dateee.click();
	        }

	        @When("choisir date")
	        public void choisir_date() {
	            WebElement choisx;
	            choisx=driver.findElement(By.xpath("//span[normalize-space()='13']"));
	            choisx.click();
	        }

	    @When("cliquer sur suivantt")
	    public void cliquer_sur_suivantt() {
	        WebElement suivantt;
	        suivantt=driver.findElement(By.xpath("//button[@class='p-element main-btn-right-icon p-button p-component']"));
	        suivantt.click();
	    }
	    
	    
	    @When("saisis Dommages corporels")
	    public void saisis_dommages_corporels() {
	        WebElement dommages;
	        dommages=driver.findElement(By.xpath("//p-dropdown[@class='p-element p-inputwrapper custom-dropdown me-2 ng-untouched ng-pristine ng-invalid']//span[@role='combobox']"));
	        dommages.click();
	        
	        WebElement choix50000;
	        choix50000=driver.findElement(By.xpath("//div[contains(text(),'50 000')]"));
	        choix50000.click();
	    }

	    @When("cliquer sur Intoxications alimentaire")
	    public void cliquer_sur_intoxications_alimentaire() {
	       WebElement  Intoxications;
	       Intoxications=driver.findElement(By.xpath("//p-inputswitch[@formcontrolname='isFoodPoisoningPrice']//span[@class='p-inputswitch-slider']"));
	       Intoxications.click();
	    }

	    @When("cliquer sur Incendie - Explosion")
	    public void cliquer_sur_incendie_explosion() {
	        WebElement Incendie;
	        Incendie=driver.findElement(By.xpath("//p-inputswitch[@formcontrolname='isIncendieExplosion']//span[@class='p-inputswitch-slider']"));
	        Incendie.click();
	    }

	    @When("cliquer sur Défense et recours")
	    public void cliquer_sur_défense_et_recours() {
	        WebElement Défense;
	        Défense=driver.findElement(By.xpath("//p-inputswitch[@formcontrolname='isDefenseAppeals']//span[@class='p-inputswitch-slider']"));
	        Défense.click();
	    }

	    @When("cliquer sur Dégâts des eaux")
	    public void cliquer_sur_dégâts_des_eaux() {
	        WebElement degats = driver.findElement(By.xpath("(//div[@class='p-inputswitch p-component'])[1]"));

	        // Attente explicite jusqu'à ce que l'élément soit cliquable
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	        wait.until(ExpectedConditions.elementToBeClickable(degats));

	        // Cliquer sur l'élément en utilisant JavaScript
	        JavascriptExecutor executor = (JavascriptExecutor) driver;
	        executor.executeScript("arguments[0].click();", degats);
	    }
	    

	    @When("cliquer sur Individuelle accident")
	    public void cliquer_sur_individuelle_accident() {
	        WebElement individuelle = driver.findElement(By.xpath("//div[@class='p-inputswitch p-component']//span[@class='p-inputswitch-slider']"));

	        // Cliquer sur l'élément en utilisant JavaScript
	        JavascriptExecutor executor = (JavascriptExecutor) driver;
	        executor.executeScript("arguments[0].click();", individuelle);
	    }

	    @When("cliquer sur Décès accidentel")
	    public void cliquer_sur_décès_accidentel() {
	        WebElement deces = driver.findElement(By.xpath("(//span[@aria-label='1000'])[1]"));

	        // Cliquer sur l'élément en utilisant JavaScript
	        JavascriptExecutor executor = (JavascriptExecutor) driver;
	        executor.executeScript("arguments[0].click();", deces);
	        
	        // Attendez que l'élément du choix 2000 soit visible et cliquable
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	        WebElement choix2000 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@aria-label='2000']//div[contains(text(),'2 000')]")));
	        choix2000.click();
	    }

	    @When("cliquer sur le bouton Suivanttt")
	    public void cliquer_sur_le_bouton_suivanttt() {
	        try {
	            // Attente explicite pour que l'élément soit présent et cliquable
	            WebDriverWait wait = new WebDriverWait(driver, 10);
	            WebElement suivanttt5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Suivant']")));
	            
	            // Cliquer sur l'élément
	            suivanttt5.click();
	        } catch (StaleElementReferenceException e) {
	            // Si une StaleElementReferenceException est levée, essayez de récupérer l'élément à nouveau
	            System.out.println("StaleElementReferenceException : " + e.getMessage());
	            cliquer_sur_le_bouton_suivanttt(); // Appel récursif pour réessayer de cliquer sur l'élément
	        }
	    }

	    @When("cliquer sur suiv")
	    public void cliquer_sur_suiv() {
	        try {
	            // Recherchez à nouveau l'élément juste avant d'interagir avec lui
	            WebDriverWait wait = new WebDriverWait(driver, 10);
	            WebElement suiv5 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Suivant']")));
	            
	            // Attendez que l'élément soit présent et interactif
	            suiv5.click();
	        } catch (StaleElementReferenceException e) {
	            // Si une StaleElementReferenceException est levée, essayez de récupérer l'élément à nouveau
	            System.out.println("StaleElementReferenceException : " + e.getMessage());
	            cliquer_sur_suiv();
	        }
	    }

	    @When("cliquer sur Emettre")
	    public void cliquer_sur_emettre() {
	        WebElement emettre;
	        emettre=driver.findElement(By.xpath("//span[normalize-space()='Emettre']"));
	        emettre.click();
	    }

	    @When("cliquer sur dropdownliste deviss")
	    public void cliquer_sur_dropdownliste_deviss() {
	        try {
	            // Attente explicite pour que l'élément soit présent et cliquable
	            WebDriverWait wait = new WebDriverWait(driver, 10);
	            WebElement deviss = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-bs-target='#collapseOne']")));
	            
	            // Cliquer sur l'élément
	            deviss.click();
	        } catch (StaleElementReferenceException e) {
	            // Si une StaleElementReferenceException est levée, essayez de récupérer l'élément à nouveau
	            System.out.println("StaleElementReferenceException : " + e.getMessage());
	            cliquer_sur_dropdownliste_deviss(); // Appel récursif pour réessayer de cliquer sur l'élément
	        }
	    }
	    

	    @When("cliquer sur gestion devis")
	    public void cliquer_sur_gestion_devis() {
	        WebElement gestiondevis;
	        gestiondevis=driver.findElement(By.xpath("//span[normalize-space()='Gestion devis']"));
	        gestiondevis.click();
	    }

	    @Then("vérifier la ligne")
	    public void vérifier_la_ligne() {
	        WebElement client;
	        client=driver.findElement(By.xpath("//tbody/tr[1]/td[7]/p-tag[1]/span[1]/span[1]"));
	        String texxt5;
	        texxt5=client.getText();
	        Assert.assertEquals("Valide", texxt5);
	        System.out.println("test ok");
	        driver.close();
	    }   
	        
	    }
	    
	   
	


