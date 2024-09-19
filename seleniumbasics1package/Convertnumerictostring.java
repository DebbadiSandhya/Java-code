package seleniumbasics1package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Convertnumerictostring {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream f1=new FileInputStream("C:\\Users\\sandh\\eclipse-workspace\\seleniumbasics1\\DDT\\Sandhya.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		// gave numeric value exception is illegal state exception//
		String username=w1.getSheet("login").getRow(2).getCell(0).getStringCellValue();
	String Password=NumberToTextConverter.toText(w1.getSheet("login").getRow(2).getCell(1).getNumericCellValue());
		//String password=w1.getSheet("login").getRow(2).getCell(1).getStringCellValue();
		
		System.out.println(username);
	       System.out.println(Password);
	       
	}

}
