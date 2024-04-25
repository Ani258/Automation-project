package ebay.com.labdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataTable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        File file =new File("C:\\Users\\ar83\\javawork\\labdemo\\Exceldata\\test1.xlsx");
		
		FileInputStream fis= new FileInputStream(file);
		XSSFWorkbook w=new XSSFWorkbook(fis);
		XSSFSheet s=w.getSheet("TestSheet");
		
		int rowCount=s.getPhysicalNumberOfRows();
		
		for(int i=0;i<rowCount;i++)
		{
			Row r=s.getRow(i);
			int cellCount=r.getPhysicalNumberOfCells();
			for(int j=0;j<cellCount;j++)
		    {
		    	Cell c=r.getCell(j);
		    	String cellValue=getCellValue(c);
		    	System.out.println("||"+cellValue);
		    }
		    System.out.println();
	}
	        w.close();
	        fis.close();
    }
    public static String getCellValue(Cell c)
    {
    	switch(c.getCellType())
    	{
    	case STRING:
    		return c.getStringCellValue();
    	case NUMERIC:
    		return String.valueOf(c.getStringCellValue());
    	case BOOLEAN:
    		return c.getStringCellValue();
    		
    	default:
    		return c.getStringCellValue();
    		
    	}

    }
}    
