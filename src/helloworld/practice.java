package helloworld;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class practice {
    public static void main(String[] args) {

        // Set up WebDriver
//        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the website
            driver.get("https://www.flipkart.com/");

            // Simulate manually fetching cookies after successful login
            Cookie sessionCookie = new Cookie("AMCV_17EB401053DAF4840A490D4C%40AdobeOrg", "-227196251%7CMCIDTS%7C20077%7CMCMID%7C45916295400192476873052852618994270432%7CMCAAMLH-1734973886%7C12%7CMCAAMB-1735197183%7CRKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y%7CMCOPTOUT-1734599583s%7CNONE%7CMCAID%7CNONE");

            // Add cookie to browser session
            driver.manage().addCookie(sessionCookie);

            // Refresh to apply cookies
            driver.navigate().refresh();

            // Validate by navigating to a logged-in page
            driver.get("https://www.flipkart.com/viewcart?exploreMode=true&preference=FLIPKART");

            // Example: Check profile page element
            WebElement profileName = driver.findElement(By.id("profileName"));
            System.out.println("Logged in as: " + profileName.getText());
            Thread.sleep(5000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
