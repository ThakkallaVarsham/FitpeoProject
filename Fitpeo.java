package RobotPack;

import java.util.List;

import javax.swing.JSlider;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fitpeo {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("WebDriver.Chrome.driver", "C:\\SeleniumSoftware\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(); 
			driver.manage().window().maximize();
			driver.get("https://www.fitpeo.com/");
			
			Actions A = new Actions(driver);
			
			driver.findElement(By.xpath("//div[contains(text(), 'Revenue Calculator')]")).click();
			Thread.sleep(2000);
			((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 450)");	     
			Thread.sleep(3000);
			WebElement slider =	driver.findElement(By.xpath("//span[@data-index = '0']"));
			
			 A.clickAndHold(slider).moveByOffset(400, 820).release().perform();
			 Thread.sleep(3000);
			 ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 450)");	
			driver.findElement(By.xpath("//input[@id=':R57alklff9da:']")).clear();
			
			driver.findElement(By.xpath("//input[@id=':R57alklff9da:']")).sendKeys("560");
			// driver.findElement(By.xpath("(//input[@class ='PrivateSwitchBase-input css-1m9pwf3'] )[1]"));
			
			List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

	        // Select specific checkboxes by index, for example, selecting the first and third checkboxes
	        if (!checkboxes.get(1).isSelected()) {  // Select the first checkbox
	            checkboxes.get(1).click();
	        }

	        if (!checkboxes.get(2).isSelected()) {  // Select the third checkbox
	            checkboxes.get(2).click();
	        }

	}

}
