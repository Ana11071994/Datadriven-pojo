package org.sample;
// Q: 3
import org.openqa.selenium.WebElement;

public class Greensexe extends Baseclass {
	public static void main(String[] args) {
chromebrowser();
geturl("http://www.greenstechnologys.com/");
Demo d = new Demo();
WebElement annanagar = d.getAnnanagar();
	scrollpage(annanagar);
	WebElement tambaram = d.getTambaram();
	gettext(tambaram," a");	
	WebElement discount = d.getDiscount();
	scrollpage(discount);
	WebElement software = d.getSoftware();
	gettext(software, "a");
	WebElement certificate = d.getCertificate();
	certificate.click();
	WebElement shell = d.getShell();
	scrollpage(shell);
	WebElement selenium = d.getSelenium();
	selenium.click();
	WebElement sel = d.getSel();
	gettext(sel, "a");
	WebElement course = d.getCourse();
	mouseover(course);
	WebElement java = d.getJava();
	mouseover(java);
	WebElement core = d.getCore();
    core.click();
    WebElement review = d.getReview();
    gettext(review, "a");
    WebElement career2 = d.getCareer();
    scrollpage(career2);
	WebElement career = d.getCareer();
	career.click();

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
