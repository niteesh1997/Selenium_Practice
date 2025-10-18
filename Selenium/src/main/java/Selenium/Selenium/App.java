package Selenium.Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App
{
	protected static WebDriver driver; 
	public static void initializeDriver() {
	        if (driver == null) {
	            driver = new ChromeDriver();
	            driver.manage().window().maximize();
	        }
	    }
	
	public static void getText(List<WebElement> list) {
		
		for(WebElement ele:list) {
			click(ele);
		}
		Set<String> windows= driver.getWindowHandles();
		String parent= driver.getWindowHandle();
		for (String handle : windows) {
            if (!handle.equals(parent)) {
                driver.switchTo().window(handle);
                System.out.println("Switched to new window: " + driver.getTitle());
                driver.close();
            }
        }
	}
	
	public static void get(String URL)
	{
		driver.get(URL);
		
	}
	
	public static void click(String path) {
		driver.findElement(By.xpath(path)).click();
	}
	public static void click(WebElement ele) {
		ele.click();
	}
    public static void main( String[] args )
    {
    	
    }
    public static void load(String path) {
    	By locator = By.xpath(path); // change to your element locator
        int maxRetries = 10; // maximum refresh attempts
        int attempts = 0;
        boolean found = false;
		
		while (attempts < maxRetries) {
            try {
                WebElement element = driver.findElement(locator);
                System.out.println(element +" found!");
                found = true;
                break; // exit loop if found
            } catch (Exception e) {
                System.out.println("Element not found, refreshing... attempt: " + (attempts + 1));
                driver.navigate().refresh();
                attempts++;
                try {
                    Thread.sleep(2000); // wait for page to load
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        }

	}
}
