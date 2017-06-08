package homeTask2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GmailPage {
	public WebDriver driver;
	public WebElement element;

	@BeforeMethod
	public void beforeMethod() {

		driver = new ChromeDriver();
		String url = "https://mail.google.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@Test
	public void gmailTest() throws InterruptedException {
		
	
		 driver.findElement(By.id("identifierId")).sendKeys("zorianatest@gmail.com");
		 driver.findElement(By.id("identifierNext")).click();
		 driver.findElement(By.name("password")).sendKeys("strange15");
		 
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 element = wait.until(ExpectedConditions.elementToBeClickable(By.id("passwordNext")));
		 driver.findElement(By.id("passwordNext")).click();
		 driver.findElement(By.xpath("//*[contains(@class,'aic')]//*[@role='button']")).click();
		
	}
	
	
	
	@AfterMethod
	public void afterMethod() {
		//driver.quit();

	}
}
