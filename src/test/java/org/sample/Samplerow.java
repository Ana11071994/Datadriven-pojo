package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Samplerow {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\Kannan\\eclipse-workspace\\Details\\excel\\Book1.xlsx");
	FileInputStream fin = new FileInputStream(f);
	Workbook book = new XSSFWorkbook(fin);
	Sheet sh = book.getSheet("Sheet1");
	Row r = sh.createRow(12);
	Cell c = r.createCell(0);
	c.setCellValue("anand");
	
	
}
}
