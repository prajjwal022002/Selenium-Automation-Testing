package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {

		//Step 1 Create the Object of File class(java.io)
		File file=new File("C:\\Users\\ASUS SSD\\Documents\\UserDetails.xlsx");
		
		//Step 2 Create the object of FileInputStream(java.io) and handle FileNotFoundException
		 FileInputStream fis=new FileInputStream(file);
		
		//Step 3 Create the Object of XSSFWorkbook class(from Apache POI) and IOException
		//Helps to open a workbook in a Excel file
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		// step 4 Call getSheet(String SheetName) to navigate into a particular sheet
		XSSFSheet sheet = workbook.getSheet("UserDetails");
		
		//Step 5 Call getRow(int-rowNum) to navigate into row of specific no
		XSSFRow firstRow = sheet.getRow(0);
		
		//Step 6 Call getCell(int CellNum) to navigate into a specific cell of the row
		XSSFCell firstCell = firstRow.getCell(0);
		
		//Step 7 Converting object to String
		String firstCellData = firstCell.getStringCellValue();
		
		//Step 8 print the data
		System.out.println(firstCellData);
		workbook.close();
	}

}
