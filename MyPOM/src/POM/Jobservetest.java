package POM;

import static org.junit.Assert.*;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Jobservetest {
MyPage mypage = new MyPage();

	@Test
	public void test() {
		mypage.launchBrowser();
		mypage.driver.get("http://jobserve.com");
		mypage.driver.findElement(By.xpath("html/body/form/div[4]/div[1]/div[7]/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/span/span/span")).click();;
	mypage.driver.findElement(By.id("txtKey")).click();
	List<WebElement> links=mypage.driver.findElements(By.tagName("a"));
	System.out.println("Total links are"+links.size());
	for(int i=0;i<links.size();i++)
	{
		WebElement ele=links.get(i);
		String url= ele.getAttribute("href");
		System.out.println(url);
		verifyLinkActive(url);
	}
	}
	
	public void verifyLinkActive(String linkurl)
	{
		try
		{
		URL url = new URL(linkurl);
		HttpURLConnection httpurlconnect= (HttpURLConnection)url.openConnection();
		httpurlconnect.setConnectTimeout(3000);
		httpurlconnect.connect();
		if(httpurlconnect.getResponseCode()==200)
		{
			System.out.println(linkurl+" - "+httpurlconnect.getResponseMessage());
			
		}
		if(httpurlconnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
		{
			System.out.println(linkurl+" - "+httpurlconnect.getResponseMessage()+" - "+HttpURLConnection.HTTP_NOT_FOUND);
		}
		}
		catch (Exception e)
		{
		}
		
		}
		
		
		
	
	@After
	public void closeBrowser()
	{
		System.out.println("closing the browser");
		mypage.driver.close();
	}

	
	

}
