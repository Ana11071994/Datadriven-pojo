package org.sample;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
// Q : 1
public class SampleJ1 extends Baseclass {
@BeforeClass
public static void befcls() {
	chromebrowser();
	geturl("https://www.facebook.com/");
	maximize();

}
@Test
	public void test1() {
	String title = driver.getTitle();
	Assert.assertTrue("check title",title.contains("Facebook"));
	System.out.println(title);
	String url = driver.getCurrentUrl();
	System.out.println(url);
	}
@Test
	public void test2() {
		WebElement user = driver.findElement(By.id("email"));
		fillbox(user, "ana@123");
		Assert.assertEquals("ana@123",user.getAttribute("value"));
		WebElement passwd = driver.findElement(By.id("pass"));
		fillbox(passwd, "123456");
		Assert.assertEquals("123456", passwd.getAttribute("value"));
		WebElement log = driver.findElement(By.name("login"));
		log.click();
	}
@AfterClass
public static void aftcls() {
	driver.quit();

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
