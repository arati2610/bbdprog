package tests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Base.Base_Test;
import Pages.CartPage;
import Pages.DressesPage;
import Pages.LandingPage;

public class Scen_6 extends Base_Test {

	@Test
	public void f() throws Exception {
		LandingPage lp = new LandingPage(driver);
		DressesPage dp = new DressesPage(driver);
		CartPage cp = new CartPage(driver);

//navigate to myntra
		driver.navigate().to("https://www.myntra.com/");

//to open menu of women section to mouse hover
		Actions actions = new Actions(driver);
		actions.moveToElement(lp.womenOption()).build().perform();
		Thread.sleep(1000);
//select dresses option		
		lp.dressesOption().click();
		// select brand
		dp.brandOption().click();
//selenium not provide element for Scroll down, so used javascript executor to 	scrolldown and click discount option
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dp.discountOption());
		actions.moveToElement(dp.discountOption()).click().build().perform();
//after selecting dresses page it switches to another page so need to handle it
		String originalWindow = driver.getWindowHandle();
		dp.firstDressOption().click();
// getting all window handles in set
		Set<String> windowHandles = driver.getWindowHandles();
		// Loop through until we find a new window handle
		for (String windowHandle : windowHandles) {
			if (!originalWindow.contentEquals(windowHandle)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}
		Thread.sleep(3000);
		// to slecting size and add to cart
		driver.findElement(By.xpath("//*[@class='size-buttons-buttonContainer']/button")).click();
		driver.findElement(By.xpath("//*[text()='ADD TO BAG']")).click();
//new window closed
		driver.close();
		driver.switchTo().window(originalWindow);
		driver.navigate().refresh();
		// dresses page open

		actions.moveToElement(dp.cartOption()).click().build().perform();
		actions.moveToElement(cp.okGotItOption()).click().build().perform();
		cp.MoveTohishListOption().click();
		cp.MoveTohishListOption2().click();

	}

}
