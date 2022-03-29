package Scenarioes_1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class Scen_4 {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		String path = System.getProperty("webdriver.chrome.driver", "F:\\1. BBD training\\chromedriver_win32\\chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", path);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
  @Test
  public void f() throws Exception {
		
		driver.navigate().to("https://www.myntra.com/");
		WebElement women =driver.findElement(By.xpath("//*[@class='desktop-navLink']/a[text()='Women']"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(women).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-group='women']//ul[@class='desktop-navBlock']//a[text()='Dresses']")).click();

		/*
		 * WebElement drp = driver.findElement(By.cssSelector("div.sort-sortBy"));
		 * actions.moveToElement(drp).build().perform();
		 * driver.findElement(By.xpath("(//*[@class='sort-label '])[1]")).click();
		 */
		
		//select brand
		driver.findElement(By.xpath("(//*[@class='brand-list']//*[@class='common-checkboxIndicator'])[1]")).click();
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//*[@class='discount-list']//*[@class='common-radioIndicator']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		actions.moveToElement(element).click().build().perform();
		Thread.sleep(3000);

		String originalWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("(//*[@class='results-base']/li/a)[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		//Loop through until we find a new window handle
		for (String windowHandle : windowHandles) {
		    if(!originalWindow.contentEquals(windowHandle)) {
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='size-buttons-buttonContainer']/button")).click();
		driver.findElement(By.xpath("//*[text()='ADD TO BAG']")).click();

		driver.close();
		driver.switchTo().window(originalWindow);
		driver.navigate().refresh();
		WebElement cart = driver.findElement(By.className("desktop-cart"));
		actions.moveToElement(cart).click().build().perform();
		
		WebElement okGotIt = driver.findElement(By.className("itemComponents-base-toolTipCTA"));
		actions.moveToElement(okGotIt).click().build().perform();
		driver.findElement(By.xpath("//button[text()='MOVE TO WISHLIST']")).click();
		
		driver.findElement(By.className("bulkActionStrip-waterMelon")).click();  
		
  
  }


  @AfterMethod
  public void afterMethod() {
	 driver.quit();
  }

}
