package com.mindtree.CaseStudy1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
		WebElement demoSoftware = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/a/div[2]/span"));
		demoSoftware.click();
		WebElement visitWebsite = driver.findElement(By.xpath(
				"a[@href='https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwj3_KjRgJeFAxWjC4MDHSTGAPgYABABGgJzZg&ase=2&gclid=EAIaIQobChMI9_yo0YCXhQMVowuDAx0kxgD4EAAYASAAEgKu0_D_BwE&ohost&cid=CAASAuRo&sig=AOD64_3t_rN2O0BsVtI78SpEH5igdhYPFw&q&nis=6&adurl=https://uk.smartresultsnow.net/ar?q%3Dsoftware%2520for%2520production%26o%3D1672602%26rch%3Dch1%26clid%3Damg-smartresultsnow%26utm_source%3Dg%26utm_medium%3Dgcpc%26ct%3D%26campaignid%3D21093251484%26agid%3D158513467846%26adid%3D693594076005%26kwid%3Dkwd-2768346092%26gclid%3D%7Bgclid%7D%26akid%3D1_21093251484_158513467846_kwd-2768346092_s_9062075%26gad_source%3D5&nb=8&rurl=https%3A%2F%2Fsyndicatedsearch.goog%2F&nm=8&nx=188&ny=58&is=405x1249']"));
		visitWebsite.click();

	}

}