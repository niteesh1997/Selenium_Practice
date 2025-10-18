package Selenium.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Alert alert=driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();
		
	}
}
