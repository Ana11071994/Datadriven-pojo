package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojoclassadac extends Baseclass {
public Pojoclassadac() {
	PageFactory.initElements(driver, this);
}
	
@FindBy(id="username")	
private WebElement user;
@FindBy(id="password")
private WebElement passwd;
@FindBy(id="login")
private WebElement login;
@FindBy(id="location")
private WebElement loc;
@FindBy(id="hotels")
private WebElement hotel;
@FindBy(id="room_type")
private WebElement room;
@FindBy(id="datepick_in")
private WebElement checkin;	
@FindBy(id="datepick_out")
private WebElement checkout;
@FindBy(id="adult_room")
private WebElement adult;
@FindBy(id="child_room")
private WebElement child;	
@FindBy(id="Submit")
private WebElement search;
public WebElement getUser() {
	return user;
}
public WebElement getPasswd() {
	return passwd;
}
public WebElement getLogin() {
	return login;
}
public WebElement getLoc() {
	return loc;
}
public WebElement getHotel() {
	return hotel;
}
public WebElement getRoom() {
	return room;
}
public WebElement getCheckin() {
	return checkin;
}
public WebElement getCheckout() {
	return checkout;
}
public WebElement getAdult() {
	return adult;
}
public WebElement getChild() {
	return child;
}
public WebElement getSearch() {
	return search;
}




	
	
	
	
	
	
	
	
	
	
	
	
}
