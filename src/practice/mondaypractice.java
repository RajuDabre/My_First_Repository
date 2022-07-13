package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mondaypractice {
    // This is  the changes
	// This is  the changes
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\RajuChromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

}
