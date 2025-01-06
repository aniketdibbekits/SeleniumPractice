package helloworld;

import org.openqa.selenium.chrome.ChromeDriver;

public class helloworld {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		driver.quit();
	}

}
