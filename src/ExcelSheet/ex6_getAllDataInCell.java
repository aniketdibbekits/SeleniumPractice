package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex6_getAllDataInCell {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("D:\\aniket dibbe docs\\seleniumData.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		int rowIdx = sh.getLastRowNum();
		for(int i=0;i<rowIdx;i++) {
			String value = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value+" ");
		}
		
		
	}

}
