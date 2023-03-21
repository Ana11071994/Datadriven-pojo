package org.sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProjectDatadriven extends Baseclass {
public static void main(String[] args) throws IOException {
	chromebrowser();
	geturl("https://www.jeanswest.com.au/");
	maximize();
	WebElement acc = driver.findElement(By.xpath("//i[@class='icon-myaccount']"));
	acc.click();
	implicitytimeout();
	WebElement email = driver.findElement(By.xpath("(//input[@name='loginEmail'])[1]"));
	fillbox(email, readexcelsheet5(0, 1));
	WebElement passwd = driver.findElement(By.xpath("//input[@name='loginPassword']"));
	fillbox(passwd, readexcelsheet5(1, 1)); 
    WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
    login.click();
    WebElement first = driver.findElement(By.xpath("//a[@id='new']"));
    first.click();
    WebElement women = driver.findElement(By.xpath("(//li[@class='nav-item dropdown'])[2]//a[@id='women']"));
    mouseover(women);
    WebElement dress1 = driver.findElement(By.xpath("(//a[text()='Dresses'])[1]"));
    dress1.click();
    WebElement midi = driver.findElement(By.xpath("(//a[@class='link'])[1]"));
    midi.click();
    WebElement size = driver.findElement(By.xpath("//a[@title='Select Size 10']"));
    mouseoverclick(size);
    WebElement cart = driver.findElement(By.xpath("//button[@class='add-to-cart btn btn-custom']"));
    mouseover(cart);
    WebElement cart1 = driver.findElement(By.xpath("//button[@class='add-to-cart btn btn-custom']"));
    cart1.click();
    WebElement first1 = driver.findElement(By.xpath("//a[@id='new']"));
    first1.click();
    WebElement men = driver.findElement(By.xpath("(//li[@class='nav-item dropdown'])[3]"));
    mouseover(men);
    WebElement shirt = driver.findElement(By.xpath("(//a[text()='Shirts'])[1]"));
    shirt.click();
    WebElement stripe = driver.findElement(By.xpath("(//a[@class='link'])[2]"));
    stripe.click();
    WebElement size1 = driver.findElement(By.xpath("//a[@title='Select Size M']"));
    size1.click();
    WebElement cart1a = driver.findElement(By.xpath("//button[@class='add-to-cart btn btn-custom']"));
    mouseover(cart1a);
    WebElement cart2a = driver.findElement(By.xpath("//button[@class='add-to-cart btn btn-custom']"));
    cart2a.click();
    WebElement cartlist = driver.findElement(By.xpath("(//i[@class='minicart-icon icon-bag'])[1]"));
    cartlist.click();
    
    
}
}
