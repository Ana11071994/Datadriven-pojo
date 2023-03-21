package org.sample;

import java.util.Date;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
// Q: 1

public class PJada extends Baseclass{
	@BeforeClass
	public static void befcls() {
		chromebrowser();
		geturl("http://www.adactin.com/HotelApp/");
		maximize();
		}
		
	@Before	
	public void bef() {
		Date d = new Date();
		System.out.println(d);

	}
	@Test
	public void t1() {
		String title = driver.getTitle();
		Assert.assertTrue("check title",title.contains("Adactin"));
		String url = driver.getCurrentUrl();
		System.out.println(url);

	}
	
	@Test
	public void t2() {
		Pojoclassadac p = new Pojoclassadac();
		WebElement user = p.getUser();
		implicitytimeout();
		fillbox(user, "ANAND1994");
		WebElement passwd = p.getPasswd();
		fillbox(passwd, "19U9J5");
		WebElement login = p.getLogin();
		click(login);

	}
	@Test
	public void t3() {
		
		Pojoclassadac p = new Pojoclassadac();
		implicitytimeout();
		WebElement loc = p.getLoc();
		selectindex(loc, 1);
		WebElement hotel = p.getHotel();
		selectindex(hotel, 2);
		WebElement room = p.getRoom();
		selectindex(room, 3);
		WebElement checkin = p.getCheckin();
		fillbox(checkin, "23/09/2022");
		WebElement checkout = p.getCheckout();
		fillbox(checkout, "24/09/2022");
		WebElement adult = p.getAdult();
		selectindex(adult, 1);
		WebElement child = p.getChild();
		selectindex(child, 0);
		WebElement search = p.getSearch();
		click(search);

	}
	@AfterClass
	public static void aftc() {
		driver.quit();

	}
	
	
	
	
	


}



























