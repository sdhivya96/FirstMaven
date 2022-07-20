
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstMaven {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\San\\eclipse-workspace\\FirstMaven\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
        driver.get("https://amazon.in/");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("rolex");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        driver.findElement(By.xpath("//img[@alt = 'Rolex GMT-Master 16750 Watch Review']")).click();
        Set<String>allTabs = driver.getWindowHandles();
        List<String>allTabsList = new ArrayList<String>(allTabs);
        driver.switchTo().window(allTabsList.get(1));
        System.out.println("Price of Rolex GMT-Master Wrist Watch:"+driver.findElement(By.xpath("//span[@id='kindle-price']")).getText());
        TakesScreenshot ts = (TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\San\\eclipse-workspace\\FirstMaven\\Screenshot\\Rolex.jpeg");
        FileUtils.copyFile(src, dest);
        
        
        
        
        
        
        
        
        
	}

}
