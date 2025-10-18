package Selenium.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class fileUpload extends App{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initializeDriver();	
		get("https://practice.expandtesting.com/upload");
		driver.findElement(By.xpath("//input[@id='fileInput']")).sendKeys("C:\\Users\\cool\\Downloads\\NiteeshkumarHanchanalResume-1.pdf");
		
		get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[@onClick='jsAlert()']")).click();
		Alert alert = driver.switchTo().alert();
		alert.getText();
		alert.accept();
		
		driver.findElement(By.xpath("//button[@onClick='jsConfirm()']")).click();
		alert.accept();
		
		String text = driver.findElement(By.xpath("//p[@id='result']")).getText();
		if (text.equals("You clicked: Ok"))
		{
			System.out.println("correct execution");
		}
		else
			System.out.println("wrong");
	
		driver.findElement(By.xpath("//button[@onClick='jsConfirm()']")).click();
		alert.dismiss();
		
		String text2 = driver.findElement(By.xpath("//p[@id='result']")).getText();
		if (text2.equals("You clicked: Cancel"))
		{
			System.out.println("correct execution");
		}
		else
			System.out.println("wrong");
		
		driver.findElement(By.xpath("//button[@onClick='jsPrompt()']")).click();
		alert.sendKeys("Hi How are You");
		alert.accept();
		
		String text3 = driver.findElement(By.xpath("//p[@id='result']")).getText();
		if (text3.equals("You entered: Hi How are You"))
		{
			System.out.println("correct execution");
		}
		else
			System.out.println("wrong");
	}

}
