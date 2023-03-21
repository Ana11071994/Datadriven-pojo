package org.sample;

import org.openqa.selenium.WebElement;
// Q :5
public class Exeada extends Baseclass {
public static void main(String[] args) {
	chromebrowser();
	geturl("http://www.adactin.com/HotelApp/");
	Pojoclassadac p = new Pojoclassadac();
	WebElement user = p.getUser();
	implicitytimeout();
	fillbox(user, "ANAND1994");
	WebElement passwd = p.getPasswd();
	fillbox(passwd, "19U9J5");
	WebElement login = p.getLogin();
	click(login);
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
}
