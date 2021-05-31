package MouseAndKeyboard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class B_HomeWork {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		WebElement we1=driver.findElement(By.xpath("//span[text()='Branches']"));
		act.moveToElement(we1).perform();
		WebElement we2=driver.findElement(By.xpath("//span[text()='Marathahalli']"));
		act.moveToElement(we2).perform();
		WebElement we3=driver.findElement(By.xpath("//a[text()='Selenium-Training-in-Marathahalli']"));	
		act.moveToElement(we3).perform();
		act.contextClick(we3).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(3000);
	    driver.close();		
	}

}
