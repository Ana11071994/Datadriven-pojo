package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo extends Baseclass {
	public Demo() {
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="(//div[@class='trainer-info'])[7]")	
private WebElement annanagar;
@FindBy(xpath="(//div[@class='trainer-info'])[8]")
private WebElement tambaram;
@FindBy(xpath="//h2[text()='\"Call us for course fees and attractive discounts\"']")
private WebElement discount;	
@FindBy(xpath="//h1[text()='No 1 Software Training Institutes in Chennai with Placements']")
private WebElement software;	
@FindBy(xpath="//a[text()='Certifications']")
private WebElement certificate;
@FindBy(xpath="(//h1[text()='SHELL SCRIPTING and PERL SCRIPTING'])[1]")
private WebElement shell;
@FindBy(xpath="(//a[text()='Course Content'])[29]")
private WebElement selenium;
@FindBy(xpath="//strong[text()='Selenium Training in Chennai']")
private WebElement sel;
@FindBy(xpath="//a[text()='COURSES']")
private WebElement course;	
@FindBy(xpath="//a[text()='Java Training ']")
private WebElement java;
@FindBy(xpath="//a[text()='Core Java Training']")
private WebElement core;
@FindBy(xpath="//h2[text()='Java training Reviews from Anitha']")
private WebElement review;
@FindBy(xpath="//a[text()='CAREERS']")
private WebElement career;
@FindBy(xpath="(//p[@class='mail-info'])[13]")
private WebElement careerd;
@FindBy(xpath="(//a[text()='contact@greenstechnologys.com'])[8]")
private WebElement email;
public WebElement getAnnanagar() {
	return annanagar;
}
public WebElement getTambaram() {
	return tambaram;
}
public WebElement getDiscount() {
	return discount;
}
public WebElement getSoftware() {
	return software;
}
public WebElement getCertificate() {
	return certificate;
}
public WebElement getShell() {
	return shell;
}
public WebElement getSelenium() {
	return selenium;
}
public WebElement getSel() {
	return sel;
}
public WebElement getCourse() {
	return course;
}
public WebElement getJava() {
	return java;
}
public WebElement getCore() {
	return core;
}
public WebElement getReview() {
	return review;
}
public WebElement getCareer() {
	return career;
}

}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


