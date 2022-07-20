import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonScroll {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement pageName = driver.findElement(By.xpath("//span[text()='Best Sellers in Computers & Accessories']"));
		WebElement productName = driver.findElement(By.xpath("//img[@alt='STRIFF Adjustable Laptop Stand Patented Riser Ventilated Portable Foldable Compatible with MacBook Notebook Tablet Tray...']"));
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false);",pageName );
		js.executeScript("arguments[0].scrollIntoView(true);",productName );
		
	}}


