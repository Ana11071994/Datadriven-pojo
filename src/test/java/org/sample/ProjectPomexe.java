package org.sample;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class ProjectPomexe extends Baseclass {
public static void main(String[] args) throws IOException {
	chromebrowser();
	geturl("https://www.jeanswest.com.au/");
	maximize();
	implicitytimeout();
	ProjectPojo p = new ProjectPojo();
	WebElement acc = p.getAcc();
	acc.click();
	WebElement email = p.getEmail();
	fillbox(email,readexcelsheet5(0, 1));
	WebElement passwd = p.getPasswd();
	fillbox(passwd, readexcelsheet5(1, 1));
	WebElement login = p.getLogin();
	login.click();
	WebElement first = p.getFirst();
	first.click();
	WebElement women = p.getWomen();
	mouseover(women);
	WebElement dress1 = p.getDress1();
	dress1.click();
	WebElement midi = p.getMidi();
	midi.click();
	WebElement size = p.getSize();
	mouseover(size);
	WebElement size1 = p.getSize();
	size1.click();
	WebElement cart = p.getCart();
	mouseover(cart);
	WebElement cart1 = p.getCart1();
	cart1.click();
	WebElement first1 = p.getFirst1();
	first1.click();
	WebElement men = p.getMen();
	mouseover(men);
	WebElement shirt = p.getShirt();
	shirt.click();
	WebElement stripe = p.getStripe();
	stripe.click();
	WebElement size1a = p.getSize1();
	size1a.click();
	WebElement cart1a = p.getCart1a();
	mouseover(cart1a);
	WebElement cart2a = p.getCart2a();
	cart2a.click();
	WebElement cartlist = p.getCartlist();
	cartlist.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
