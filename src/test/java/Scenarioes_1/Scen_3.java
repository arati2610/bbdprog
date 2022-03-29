/*Scenario: 3
For above scenario 2 if you used xpath\or id then try to take automate using other locators like
relative xpath\absolute xpath, by.id,by.name etc wherever possible.*/

package Scenarioes_1;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scen_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

				System.setProperty("webdriver.chrome.driver", "F:\\1. BBD training\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get(" https://in.yahoo.com");
//x path to relative xpath
				String text = driver.findElement(By.xpath("//*[@id='bd']/ol[2]/li/div/div/ul/li/div[1]/h4")).getText();
				if (text.equals("Trending Now")) {
					System.out.println("Text is verified : Trending Now");
				} else {
					System.out.println("Text is incorrect : Trending Now");
				}

				System.out.println("Links under Trading now");
				List<WebElement> tredNowLinks = driver.findElements(By.xpath("//div[starts-with(@class,'compList')]//a"));
				List<String> linknames = new ArrayList<String>();
				
				for (int i = 0; i < tredNowLinks.size(); i++) {
					String linktext = tredNowLinks.get(i).getText();
					linknames.add(linktext);
				}
				
				for (int i = 0; i < linknames.size(); i++) {
					WebElement ele = driver.findElement(By.xpath("//div[starts-with(@class,'compList')]//a[text()='"+linknames.get(i)+"']"));
					ele.click();
					Thread.sleep(2000);
					driver.navigate().back();
				}
				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[text()='COVID-19 Updates']")).click();
			    System.out.println(driver.findElement(By.xpath("//*[@class='dd coronavirusTable']//tbody/tr/td[1]")).getText());
			    System.out.println(driver.findElement(By.xpath("//*[@class='dd coronavirusTable']//tbody/tr[1]/td[2]")).getText());
			    System.out.println(driver.findElement(By.xpath("//*[@class='dd coronavirusTable']//tbody/tr[1]/td[4]")).getText());
				driver.quit();

			}



	}


