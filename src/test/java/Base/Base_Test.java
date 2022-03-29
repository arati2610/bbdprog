package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test {

	public WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		String path = System.getProperty("webdriver.chrome.driver",
				"F:\\1. BBD training\\chromedriver_win32\\chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", path);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
