
//188.Print user name,password from excel sheet using FileInputStream class

package seleniumbasics1package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ass_188 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream f1=new FileInputStream("C:\\Users\\sandh\\eclipse-workspace\\seleniumbasics1\\DDT\\Sandhya.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
//successfully fetched the data from excel sheet
		String username=w1.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		String password=w1.getSheet("login").getRow(1).getCell(1).getStringCellValue();
//gave an empty cell ---null pointer exception
		/*String username1=w1.getSheet("login").getRow(2).getCell(2).getStringCellValue();
		String password1=w1.getSheet("login").getRow(1).getCell(1).getStringCellValue();*/
		
		FileInputStream f2=new FileInputStream("D:\\Users\\sandh\\eclipse-workspace\\seleniumbasics1\\DDT\\Sandhya.xlsx");
		Workbook w2=WorkbookFactory.create(f1);
//gave wrong location---file not found exception
		
		String username2=w2.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		String password2=w2.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(username);
	       System.out.println(password);
	       
	      /* System.out.println(username1);
	       System.out.println(password1);
	       
	       System.out.println(username2);
	       System.out.println(password2); */

	}

}
