package seleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenTraining {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
				//System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Selenium webdriver\\browser\\chromedriver_win32\\chromedriver.exe");
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
				//driver.get("https://www.sugarcrm.com/au/request-demo/");
			    driver.get("https://demo.mobiscroll.com/javascript/select/multiple-select");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//String PageSource = driver.getPageSource();
				//System.out.println("PageSource will be " + PageSource);
				//String Title = driver.getTitle();
				//System.out.println("Title is"+ Title);
				//WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
				//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("trimmer");
				//By searchLocator = RelativeLocator.with(By.tagName("input")).toRightOf(By.id("twotabsearchtextbox"));
				//WebElement searchLocator = driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(By.id("twotabsearchtextbox")));
				//searchLocator.click();
				//driver.findElement(By.id("nav-search-submit-button")).click();
//				driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
//				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//				WebElement ddown = driver.findElement(By.id("how-select"));
//				Select select = new Select(ddown);
//				select.selectByValue("Internet");
//				Thread.sleep(4000);
//				select.selectByVisibleText("Word of Mouth/Referral");
//				Thread.sleep(2000);
//				select.selectByIndex(1);
				Thread.sleep(3000);
				WebElement ddown = driver.findElement(By.id("multiple-select-input"));
				Select select = new Select (ddown);
				select.selectByValue("2");
				select.selectByVisibleText("Electronics & Computers");
			}

	}
