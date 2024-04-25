package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class data {
	
	String firstname;
	String lastname;
	Double pincode;
	XSSFCell cell;
	XSSFSheet sh;
	XSSFWorkbook wb;
	File src = new File("C:\\Users\\ar83\\Desktop\\Data.xlsx");
	
	
	public void readExcel() throws IOException
	{
		
		FileInputStream fis= new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		sh = wb.getSheetAt(0);
	}
	public  String get_FirstName() throws IOException
	{
		readExcel();
		
		String first= sh.getRow(1).getCell(0).getStringCellValue();
		return first;
	}
	public  String get_LastName() throws IOException
	{
		readExcel();
		String last= sh.getRow(1).getCell(1).getStringCellValue();
		return last;
	}
	public String get_PostalCode() throws IOException
	{
		readExcel();
		int post= (int) sh.getRow(1).getCell(2).getNumericCellValue();
		String postcode = String.valueOf(post);
		return postcode;
	}
	public void writedata(int i) throws IOException {
	readExcel();
	cell=sh.getRow(0).createCell(3);
    XSSFCell cellvalue=sh.getRow(1).createCell(3);
    cell.setCellValue("account number");
    cellvalue.setCellValue(i);
	FileOutputStream fos=new FileOutputStream(src);
	wb.write(fos);
	wb.close();
		
	}  

}
