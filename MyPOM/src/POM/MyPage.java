package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyPage {

	WebDriver driver;
	
	public void launchBrowser()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\GIRISH\\Downloads\\geckodriver-v0.17.0-win32\\geckodriver.exe");
	
	driver= new FirefoxDriver();
	
	}
	public void login()
	{
		driver.get("http://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("meeragirish@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("crack11plus");;
		driver.findElement(By.id("loginbutton")).click();
		//driver.findElement(By.)).click();
	//public void closedriver()
	//{
		//driver.quit();
	//}
}
}
