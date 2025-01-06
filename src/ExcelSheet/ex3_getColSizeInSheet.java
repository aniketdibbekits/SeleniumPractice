package ExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex3_getColSizeInSheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("D:\\aniket dibbe docs\\seleniumData.xlsx");
		int rowsize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum()-1;
		//if we are starting from 0 th row then col index will be last col = totalcol-1
		System.out.println(rowsize);
	}

}
