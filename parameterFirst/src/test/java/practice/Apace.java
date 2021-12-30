package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Apace {

	
	@Test
	public void getData() throws IOException
	{	
	
	File file=new File(System.getProperty("user.dir")+"//xlfile//monu.xlsx");
	
	System.out.println(file.getName());
	
	FileInputStream fis=new FileInputStream(file);
	
	XSSFWorkbook book=new XSSFWorkbook(fis);
	
	XSSFSheet sheet=book.getSheet("sheet1");
	
	                    int rows=     sheet.getPhysicalNumberOfRows();
	
	int cols=                    sheet.getRow(0).getPhysicalNumberOfCells();
	
	
	
	for(int i=0;i<rows;i++)
	{
		       XSSFRow row=       sheet.getRow(i);
		for(int j=0;j<cols;j++)
		{
			
		XSSFCell cell=	row.getCell(j);
			
		switch(cell.getCellType())
		
		{
		
		case STRING:   
			
			System.out.print(cell.getStringCellValue());
			break;
			
case NUMERIC:   
			
			System.out.print(cell.getNumericCellValue());
			break;
			
			
			default:
				System.out.println("please enter correct data");
		}
		
		}
		System.out.println();
	}
	}
}
