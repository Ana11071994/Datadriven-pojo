package org.sample;

import java.io.IOException;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
// Q : 4
public class SampleJ2 extends Baseclass {
@BeforeClass
public static void befcls() {
chromebrowser();
geturl("https://www.flipkart.com/account/login");
maximize();
implicitytimeout();
}
@Before
public void bef() {
	Date d = new Date();
	System.out.println(d);
}
@Test
public void test1() {
	String title = driver.getTitle();
	Assert.assertTrue("check title", title.contains("Flipkart"));
	String url = driver.getCurrentUrl();
    System.out.println(url);	
}
@Test
public void test2() throws IOException, InterruptedException {
	SampleJPO2 s = new SampleJPO2();
    WebElement email = s.getUser();
    fillbox(email, "ana@123");
    Assert.assertEquals("ana@123", email.getAttribute("value"));
    WebElement passwd =s.getPasswd();
    fillbox(passwd, "123456");
    Assert.assertEquals("123456", passwd.getAttribute("value"));
    WebElement log =s.getLog();
    log.click();
    
    
    
    
   
}





























}
