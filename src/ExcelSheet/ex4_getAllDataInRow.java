package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex4_getAllDataInRow {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("D:\\aniket dibbe docs\\seleniumData.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		int cellLastIdx = sh.getRow(0).getLastCellNum();
		for(int i=0;i<cellLastIdx;i++) {
			String value = sh.getRow(0).getCell(i).getStringCellValue();
			System.out.println(value+" ");

		}
		
		

	}

}
