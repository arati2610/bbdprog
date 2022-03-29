//Scenario: 1s
//Open browser.Maximize the browser window.Navigate to “http://qatechhub.com”.
//Print the title of the Page.Print the current URL.Navigate to the Facebook page (https://www.facebook.com)
//Navigate back to the QA Tech Hub website.Print the URL of the current page.Navigate forward.Reload the page.Close the Browser.

package Scenarioes_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scen_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\1. BBD training\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qatechhub.com");
	    driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String curl=driver.getCurrentUrl();
		System.out.println("current url is:"+ curl);
		//driver.get("https://www.facebook.com");
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(5000);
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.quit();

	}

}
