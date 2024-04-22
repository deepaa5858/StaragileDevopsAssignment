package com.AmazonApplication;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DockerTest_AmazonApplication {
	WebDriver driver;

	@Parameters({ "bname" })
	@Test
	public void browserTest(String bname) throws MalformedURLException, InterruptedException {
		if (bname.equalsIgnoreCase("chrome")) {
			ChromeOptions op = new ChromeOptions();
			driver = new RemoteWebDriver(new URL("http://localhost:4444"), op);
			System.out.println("Connection established with chrome browser");
		}
		if (bname.equalsIgnoreCase("firefox")) {
			FirefoxOptions op = new FirefoxOptions();
			driver = new RemoteWebDriver(new URL("http://localhost:4444"), op);
			System.out.println("Connection established with chrome browser");
		}
		if (bname.equalsIgnoreCase("edge")) {
			EdgeOptions op = new EdgeOptions();
			driver = new RemoteWebDriver(new URL("http://localhost:4444"), op);
			System.out.println("Connection established with chrome browser");
		}
		Thread.sleep(5000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		System.out.println("Application executing parallely");
		driver.quit();

	}
}
