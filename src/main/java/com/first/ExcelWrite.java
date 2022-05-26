package com.first;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\ExcelData\\Excel\\Framework.xlsx");
	    Workbook wb = new XSSFWorkbook();
	    Sheet cs = wb.createSheet("Day 1");
	    Row r = cs.createRow(1);
	    Cell c = r.createCell(1);
	    c.setCellValue("AutoBotz Esports");
	    FileInputStream stream = new FileInputStream(f);
		
		
	}

}
