package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel2 {

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
		XSSFRow secondRow = sheet.getRow(1);
		XSSFRow thirdRow = sheet.getRow(2);
		XSSFRow forthRow = sheet.getRow(3);
		
		//Step 6 Call getCell(int CellNum) to navigate into a specific cell of the row
		XSSFCell firstCell = firstRow.getCell(0);
		
		//Step 7 Converting object to String
		//first Row
		String firstCellData = firstCell.getStringCellValue();
		String secondCellData = firstRow.getCell(1).getStringCellValue();
		String thirdCellData = firstRow.getCell(2).getStringCellValue();
		String forthCellData = firstRow.getCell(3).getStringCellValue();

		//second Row
		String firstCellData1 = secondRow.getCell(0).toString();
		String secondCellData1 = secondRow.getCell(1).getStringCellValue();
		String thirdCellData1 = secondRow.getCell(2).toString();
		String forthCellData1 = secondRow.getCell(3).getStringCellValue();

		//third Row
		String firstCellData2 = thirdRow.getCell(0).toString();
		String secondCellData2 = thirdRow.getCell(1).getStringCellValue();
		String thirdCellData2 = thirdRow.getCell(2).toString();
		String forthCellData2 = thirdRow.getCell(3).getStringCellValue();
		
		//second Row
		String firstCellData3 = forthRow.getCell(0).toString();
		String secondCellData3 = forthRow.getCell(1).getStringCellValue();
		String thirdCellData3 = forthRow.getCell(2).toString();
		String forthCellData3 = forthRow.getCell(3).getStringCellValue();
		
		//Step 8 print the data
		System.out.println(firstCellData);
		System.out.println("---> "+firstCellData1);
		System.out.println(secondCellData);
		System.out.println("---> "+secondCellData1);
		System.out.println(thirdCellData);
		System.out.println("---> "+thirdCellData1);
		System.out.println(forthCellData);
		System.out.println("---> "+forthCellData1);

		System.out.println(firstCellData);
		System.out.println("---> "+firstCellData2);
		System.out.println(secondCellData);
		System.out.println("---> "+secondCellData2);
		System.out.println(thirdCellData);
		System.out.println("---> "+thirdCellData2);
		System.out.println(forthCellData);
		System.out.println("---> "+forthCellData2);
		
		System.out.println(firstCellData);
		System.out.println("---> "+firstCellData3);
		System.out.println(secondCellData);
		System.out.println("---> "+secondCellData3);
		System.out.println(thirdCellData);
		System.out.println("---> "+thirdCellData3);
		System.out.println(forthCellData);
		System.out.println("---> "+forthCellData3);
		
		workbook.close();
	}

}
