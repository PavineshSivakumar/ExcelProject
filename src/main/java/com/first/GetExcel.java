package com.first;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetExcel {
	public static void main(String[] args) throws IOException {
		File loc = new File("C:\\Users\\ELCOT\\eclipse-workspace\\ExcelData\\Excel\\Framework.xlsx");
		FileInputStream f = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(f);
		Sheet s = w.getSheet("BGMI");
		Row r = s.getRow(2);
		Cell c = r.getCell(1);
		//System.out.println(c);
		for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {
			Row r1 = s.getRow(i);
			for (int j = 0; j <r1.getPhysicalNumberOfCells(); j++) {
				Cell c2 = r1.getCell(j);
				System.out.println(c2);
				
			}
			
		}
	}

}
