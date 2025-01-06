package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_getAllDataInTable {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Downloads/web_table%20(1).html");
		Thread.sleep(2000);
		for(int i=1;i<=3;i++) {   //this is for outer row
			for(int j=1;j<=3;j++) {
				if(i==1)
				{
					String text1 =	driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]//th["+j+"]")).getText();
					System.out.print(text1+" ");
				}
				else {
					String text2 =driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]//td["+j+"]")).getText();
					System.out.print(text2+" ");
				}
			
			}
		
		}
		System.out.println();
	}

}
