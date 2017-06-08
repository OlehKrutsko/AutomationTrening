package homeTask2;

import static org.testng.Assert.assertTrue;

import java.util.List;
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

public class WebDriverGooglePage {
	public WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {

		driver = new ChromeDriver();
		String url = "https://www.google.com.ua/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	}

	@Test
	public void mainTest() {
		WebElement element = driver.findElement(By.id("lst-ib"));
		element.sendKeys("English");
		element.submit();

		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));
		List<WebElement> findElements = driver.findElements(By.xpath("//*[@id='rso']//h3/a"));

		System.out.println("Links:");
		System.out.println("");
		
		
		for (WebElement webElement : findElements) {
			System.out.println(webElement.getAttribute("href"));
		}

		System.out.println("");
		System.out.println("Titles:");
		System.out.println("");
		
		
		for (WebElement webElement : findElements) {
			System.out.println(webElement.getAttribute("text"));
			assertTrue(webElement.getText().toLowerCase().contains("English".toLowerCase()), "title doesn't contain "+webElement.getText());
		}
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();

	}

}