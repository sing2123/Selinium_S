package com.Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Datadriven_Write {
public static void write_Data() throws Throwable {
	File f = new File("C:\\Users\\sivaranjani\\eclipse-workspace\\New\\Mavenproject\\Project Excel.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fis);
	Sheet createSheet = w.createSheet("Data");
	Row createRow = createSheet.createRow(0);
	Cell createCell = createRow.createCell(0);
	w.getSheet("Data").getRow(0).createCell(1).setCellValue("143");
	w.getSheet("Data").createRow(1).createCell(0).setCellValue("kj");
	w.getSheet("Data").getRow(1).createCell(1).setCellValue("888");
	w.getSheet("Data").createRow(2).createCell(0).setCellValue("Siva");
	w.getSheet("Data").getRow(0).createCell(1).setCellValue("111");
	w.getSheet("Data").createRow(1).createCell(0).setCellValue("Ranjani");
	w.getSheet("Data").getRow(1).createCell(1).setCellValue("898");
	w.getSheet("Data").createRow(2).createCell(0).setCellValue("madhu");
	w.getSheet("Data").getRow(2).createCell(1).setCellValue("786");
	w.getSheet("Data").createRow(3).createCell(0).setCellValue("Nelson");
	w.getSheet("Data").getRow(3).createCell(1).setCellValue("235");
	FileOutputStream fos = new FileOutputStream(f);
	w.write(fos);
	w.close();	
}
public static void main(String[] args) throws Throwable {
	
	write_Data();
	
}

	
}


