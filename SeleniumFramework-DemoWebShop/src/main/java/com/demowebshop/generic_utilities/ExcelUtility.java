package com.demowebshop.generic_utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	public String readDataFromSpecificCell(String sheetName,int rowNum,int cellNum) throws FileNotFoundException, IOException {
		XSSFWorkbook workbook=new XSSFWorkbook(new FileInputStream(FrameworkConstants.excelFilepath));
		String cellData = workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		workbook.close();
		return cellData;
	}
	
}
