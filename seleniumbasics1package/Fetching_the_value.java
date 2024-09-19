package seleniumbasics1package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetching_the_value 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream f1=new FileInputStream("C:\\Users\\sandh\\eclipse-workspace\\seleniumbasics1\\DDT\\Sandhya.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		Sheet s1=				w1.getSheet("login");
		Row r1=				s1.getRow(1);
			Cell c1=		r1.getCell(1);
		String password=	c1.getStringCellValue();
			System.out.println(password);
			
			Row r2=				s1.getRow(1);
			Cell c2=		r2.getCell(0);
		String username=	c2.getStringCellValue();
			System.out.println(username);	
			
//one of the way to fetch the value from the excel sheet//
}

}
