package api.endpoints;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
 		WebDriver driver = new ChromeDriver();
 		List<String> all_links = new ArrayList<>();
// Navigate to BStackDemo Website
		driver.get("https://www.amazon.in/");

// Finding all the available links on webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));

// Iterating each link and checking the response status
		for (WebElement link : links) {
			String url = link.getDomAttribute("href");
			all_links.add(url);

		}
		all_links.parallelStream().forEach(e->verifyLink(e));
		
		driver.quit();
	}

	public static void verifyLink(String url) {
		try {
			URI uri = new URI(url);
			URL link = uri.toURL();
			HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
			httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
			httpURLConnection.connect();

			if (httpURLConnection.getResponseCode() == 200) {
				System.out.println(url + " - " + httpURLConnection.getResponseMessage());
			} else {
				System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
			}
		} catch (Exception e) {
			System.out.println(url + " - " + "is a broken link");
		}
	}
}
