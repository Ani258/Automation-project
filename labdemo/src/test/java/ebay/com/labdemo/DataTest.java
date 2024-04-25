package ebay.com.labdemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file =new File("C:\\Users\\ar83\\javawork\\labdemo\\Exceldata\\test1.xlsx");
		
		FileOutputStream fos= new FileOutputStream(file);
		
		XSSFWorkbook w=new XSSFWorkbook();
		
		XSSFSheet sheet=w.createSheet("TestSheet");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("xyz");
		sheet.getRow(0).createCell(1).setCellValue("12345");
		
		XSSFSheet s=w.createSheet("TestSh1");
		s.createRow(0);
		s.getRow(0).createCell(0).setCellValue("abc");
		s.getRow(0).createCell(1).setCellValue("3244243");
		
		w.write(fos);
		w.close(); 
		
		
       /* File file =new File("C:\\Users\\ar83\\javawork\\labdemo\\Exceldata\\test2.xls");
		
		FileOutputStream fos= new FileOutputStream(file);
		
		HSSFWorkbook w=new HSSFWorkbook();
		
		HSSFSheet sheet=w.createSheet("TestSheet");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("hello");
		sheet.getRow(0).createCell(1).setCellValue("world");
		
		HSSFSheet s=w.createSheet("TestSh1");
		s.createRow(0);
		s.getRow(0).createCell(0).setCellValue("welcome");
		s.getRow(0).createCell(1).setCellValue("capgemini");
		
		w.write(fos);
		w.close();   */

				

	}

}
