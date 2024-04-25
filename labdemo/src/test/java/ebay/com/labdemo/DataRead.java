package ebay.com.labdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;


public class DataRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File loc=new File("C:\\Users\\ar83\\javawork\\labdemo\\Exceldata\\test2.xls");
		/*
		//read the input
		FileInputStream fis=new FileInputStream(loc);
		
		HSSFWorkbook w=new HSSFWorkbook(fis);
		
		Sheet s=w.getSheet("TestSh1");
		
		//rows
		Row r=s.getRow(0);
		
		//cells
		Cell c=r.getCell(1);
		System.out.println(c);
		
		w.close();
		fis.close(); */
		
		
		//using string to get value 
		/*
        FileInputStream fis=new FileInputStream(loc);
		
		HSSFWorkbook w=new HSSFWorkbook(fis);

		
		HSSFSheet s=w.getSheetAt(0);
		String cellValue = s.getRow(0).getCell(1).getStringCellValue();
		System.out.println(cellValue);
		 
		 w.close();
		 fis.close();   */
		
        
		FileInputStream fis=new FileInputStream(loc);
		HSSFWorkbook w=new HSSFWorkbook(fis);
        HSSFSheet s=w.getSheetAt(0);
        
        //using for loop
        int rows=s.getLastRowNum();
        int cols=s.getRow(0).getLastCellNum();
        
        System.out.println(rows);
        System.out.println(cols);
        
        w.close();
        fis.close();

		
		
		 
		
		

	}

}
