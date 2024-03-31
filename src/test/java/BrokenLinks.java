package Test.ExcelReading;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws MalformedURLException {
		

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count=0;
		for(WebElement element : links)
		{
			String url = element.getAttribute("href");
			if(url==null || url.isEmpty())
			{
				System.out.println("url is empty");
				continue;
			}
			
			URL link = new URL(url);
			
			
			
			try {
				HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
				httpconn.connect();
				if(httpconn.getResponseCode()>=400)
				{
					++count;
					//System.out.println(httpconn.getResponseCode()+ " is ="+ " Broken link");
				}
				
			} catch (Exception e) {
				 
				 
			}
			
		
		}
		
		
		System.out.println(count);
		
		
		
		
		
		
		
		
		
	}
}
