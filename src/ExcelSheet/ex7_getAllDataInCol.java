package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex7_getAllDataInCol {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("D:\\aniket dibbe docs\\seleniumData.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		int lastRowIndex = sh.getLastRowNum();
		for(int i=0;i<lastRowIndex;i++) {
			Cell c = sh.getRow(i).getCell();
			CellType type = c.getCellType();
			if(type==CellType.STRING)
			{
				System.out.println(c.getStringCellValue());
			}
			else if(type==CellType.NUMERIC)
			{
				System.out.println(c.getNumericCellValue());
			
			
			}
			else if(type==CellType.BOOLEAN)
			{
				System.out.println(c.getBooleanCellValue());
			
			
			}
		
	}
	}

}
