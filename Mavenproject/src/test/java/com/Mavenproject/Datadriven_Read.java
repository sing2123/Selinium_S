package com.Mavenproject;

import java.io.File;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class Datadriven_Read {
	public static void name() {
		File f = new ("C:\\Users\\sivaranjani\\eclipse-workspace\\New\\Mavenproject\\src\\test\\java\\com\\Mavenproject\\Project Excel.xlsx");
	FileInputStream fis = new FileInputStream(f);	
	Workbook W = new XSSWorkbook(fis);
	Sheet sheetAt = w.getSheetAt(0);
	Row row = sheetAt.getRow(1);
	Cell cell = row.getcellType();
	if(CellType.equals(CellType.STRING)) {
		String value = cell.getStringCellValue();
		System.out.println(value);
	} else if (cellType.equals(CellType.NUMERIC)) {
		double value = cell.getNumericCellValue();
		int num = (int) value;
		System.out.println(num);
		
		for (int j =0;j< numberOfCells;j++) {
			Cell cell = row.getCell(j);
			CellType cellType = cell.getCellType();
			if(cellType.equals(CellType.STRING)) {
				String value = cell.getStringCellValue();
				System.out.println(value);
				
			}
			else if(cellType.equals(CallType.NUMERIC)) {
				double value = cell.getNumericCellValue();
				int n = (int) value;
				System.out.println(n);
			}
		}

}
	}

public static void main(String[] args) {
	read_Particular_Data();
	read_All_Data();
	
}

private static void read_All_Data() {
	// TODO Auto-generated method stub
	
}

private static void read_Particular_Data() {
	// TODO Auto-generated method stub
	
}
	
}

