package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day1a extends Baseclass{
public Day1a() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="email")
private WebElement user;
@FindBy(id="pass")
private WebElement pass;
public WebElement getUser() {
	return user;
}
public WebElement getPass() {
	return pass;
}

}

