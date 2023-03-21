package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SampleJPO2 extends Baseclass{
public SampleJPO2() {
	PageFactory.initElements(driver,this);
}

@FindBy(xpath="(//input[@type='text'])[2]")
private WebElement user;
@FindBy(xpath="//input[@type='password']")
private WebElement passwd;
@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
private WebElement log;
public WebElement getUser() {
	return user;
}
public WebElement getPasswd() {
	return passwd;
}
public WebElement getLog() {
	return log;
}














}
