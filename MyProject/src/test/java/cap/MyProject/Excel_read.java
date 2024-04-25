package cap.MyProject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_read {

	public static void main(String[] args) throws IOException {
		
			FileInputStream fis=new FileInputStream("C:\\Users\\ar83\\Excel\\Employe.xlsx");
			XSSFWorkbook s=new XSSFWorkbook(fis);
			XSSFSheet sh=s.getSheet("Sheet1");
			XSSFRow r=sh.getRow(0);
			XSSFCell c=r.getCell(1);
			String ad=c.getStringCellValue();
			System.out.println(ad);

	}

}
