package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex2_getRowSizeInSheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("D:\\aniket dibbe docs\\seleniumData.xlsx");
		int rowsize = WorkbookFactory.create(file).getSheet("Sheet2").getLastRowNum()+1;
		
		System.out.println(rowsize);
	}

}
