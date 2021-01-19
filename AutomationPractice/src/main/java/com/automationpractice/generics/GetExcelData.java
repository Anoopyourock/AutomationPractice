package com.automationpractice.generics;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetExcelData
{
	static Workbook wb;
	public static String readexceldata(String sheet,int rownum,int cellnum)
	{
		try 
		{
			WorkbookFactory.create(new FileInputStream(AutoConstant.Excelpath));
		} 
		catch (Exception e) 
		{		
		}
		
		return wb.getSheet(sheet).getRow(rownum).getCell(cellnum).getStringCellValue().toString();
	
	
	}
	
	
	
}
