package com.Datadriven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Read {
	public static void read_Particular_Data() throws Throwable {
		File f = new File("C:\\Users\\sivaranjani\\eclipse-workspace\\New\\Mavenproject\\Project Excel.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			String value = cell.getStringCellValue();
			System.out.println(value);
		}
		String value = cell.getStringCellValue();
		System.out.println(value);}
		else if (cellType.equals(CellType.NUMERIC)) {
		double value = cell.getNumericCellValue();
		int num = (int) value1;
		 System.out.println(num);
		
	}
}
}


