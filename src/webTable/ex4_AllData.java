package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_AllData {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Downloads/web_table%20(1).html");
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++){
				if(i==1) {
				String text =	driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]//th["+j+"]")).getText();
				System.out.println(text+" ");
				}
				else {
					String text2 =	driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]//td["+j+"]")).getText();
					System.out.println(text2+" ");
					
				}
				
			}
			System.out.println();
		}
		
		driver.quit();
	}
	

}
