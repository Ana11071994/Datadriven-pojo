package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
// Q : 2
public class sample {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\Kannan\\eclipse-workspace\\Details\\excel\\Book1.xlsx");
	FileInputStream fin = new FileInputStream(f);
	Workbook book = new XSSFWorkbook(fin);
	Sheet sh = book.getSheet("Sheet1");
	Row r = sh.getRow(0);
	int totalrows = sh.getPhysicalNumberOfRows();
	System.out.println(totalrows);
	int numberOfCells = r.getPhysicalNumberOfCells();
		int totalcells = totalrows*numberOfCells;
		System.out.println(totalcells);
		
		
}
}
