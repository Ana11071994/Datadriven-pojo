package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
// Q : 11
public class day1 extends Baseclass {
	public static void main(String[] args) throws IOException {
	chromebrowser();
	implicitytimeout();
	geturl("https://my.naukri.com/account/register/basicdetails");
	maximize();
	WebElement name = driver.findElement(By.id("name"));
	fillbox(name, readexcelsheet5(0, 1));
	WebElement mail = driver.findElement(By.id("email"));
	fillbox(mail, readexcelsheet5(1, 1));
	WebElement passwd = driver.findElement(By.id("password"));
	fillbox(passwd, readexcelsheet5(2, 1));
	WebElement mobno = driver.findElement(By.id("mobile"));
	fillbox(mobno, readexcelsheet5(3, 1));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}