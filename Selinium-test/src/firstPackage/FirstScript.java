package firstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstScript {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Kari\\Documents\\Selinium\\geckodriver.exe");
		 
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
	}
}
