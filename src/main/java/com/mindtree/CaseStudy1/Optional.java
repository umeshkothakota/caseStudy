package com.mindtree.CaseStudy1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Optional {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/");
		List<WebElement> listFramesLinkText = driver.findElements(By.xpath("//*[contains(text(),'Frames')]"));
		int countFrameText = listFramesLinkText.size();
		System.out.println(countFrameText);
		for(int k=0; k<countFrameText; k++) {
			System.out.println(listFramesLinkText.get(k).getText());
		}
		driver.quit();
	}

}
