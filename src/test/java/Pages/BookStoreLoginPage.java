package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookStoreLoginPage {

	WebDriver driver;

	public BookStoreLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public By userName = By.id("userName");
	public By passWord = By.id("password");
	public By loginBtn = By.id("login");

	public void setUserName(String username) {
		driver.findElement(userName).sendKeys(username);
	}

	public void setPassWord(String password) {
		driver.findElement(passWord).sendKeys(password);
	}
	
	public void clickLoginBtn() {
		driver.findElement(loginBtn).click();
	}
}
