package seleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenTraining {
	
	public static WebDriver driver;
	
	    @BeforeMethod
		public void launchDriver() {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "D:\\Trainings\\Selenium webdriver\\browser\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
			//driver.get("https://www.sugarcrm.com/au/request-demo/");
		   // driver.get("https://demo.mobiscroll.com/javascript/select/multiple-select");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	//@SuppressWarnings("deprecation")
	
	@Test
	public void Test1() {
			driver.navigate().to("https://www.youtube.com");
			System.out.println("Page Title 1 : "+ driver.getTitle() );
	}
	
	@Test
	public void Test2() {
		driver.navigate().to("https://www.youtube.com");
		System.out.println("Page Title 2 : "+ driver.getTitle() );
	}
	
	@Test
	public void Test3() {
		driver.navigate().to("https://www.youtube.com");
		System.out.println("Page Title 3 : "+ driver.getTitle() );
	}
	
	@AfterMethod
	public void quitborwser() {
		driver.quit();
	}

	}
