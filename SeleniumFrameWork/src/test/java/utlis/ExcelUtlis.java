package utlis;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtlis
{
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelUtlis(String excelPath, String sheetName) 
	{
		try {

			workbook = new XSSFWorkbook(excelPath);
			sheet=workbook.getSheet(sheetName);	
		}
		catch (IOException exp) {

			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}


	public static int getRowCount()
	{
		int rowCount=0;
		
		try {

		   rowCount=sheet.getPhysicalNumberOfRows();
			System.out.println("No of Rows:"+rowCount);

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	return rowCount;	
		
	}


	public static int getColCount()
	{
		int Colcount=0;
		try {

			Colcount=	sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of Cols:"+Colcount);

		} catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
		return Colcount;
	}


	public static String getCellDataString(int rowNum,int colNum) 
	{
		String cellData=null;
		
		try {

			cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(cellData);

		} catch (Exception exp)

		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
		return cellData;
	}


	public static Double getCellDataNumber(int rowNum,int colNum) 
	{
		Double cellData=null;
		try {

			sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellData);

		} catch (Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return cellData;
	}

}
