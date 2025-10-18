package Selenium.Selenium;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class browserWindowPopup extends App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initializeDriver();
		get("https://www.flipkart.com/");
		click("//img[@alt='Mobiles & Tablets']");
		String parent=driver.getWindowHandle();
		load("(//img[@class='DByuf4'])[1]");
		List <WebElement> list= new ArrayList<WebElement>();
		List <WebElement> list2= new ArrayList<WebElement>();
		
		list=driver.findElements(By.xpath("//a[contains(text(),'Apple')]"));
		getText(list);
		
		driver.switchTo().window(parent);
		
		list2=driver.findElements(By.xpath("//a[contains(text(),'Motorola')]"));
		getText(list2);
	}

}
