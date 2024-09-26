package firstPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;



public class FirstScript {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Kari\\Documents\\Selinium\\geckodriver.exe");
		 
		WebDriver driver = new FirefoxDriver();
		
		//Set implicit wait of 10 seconds
		//This is required for managing waits in selenium webdriver
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		//Launch sampleSiteForSelenium
		driver.get("http://www.artoftesting.com/sampleSiteForSelenium.html");

		//Fetch the text "This is sample text!" and print it on console
		//Use the id of the div to locate it and then fecth text using getText() method
		String sampleText = driver.findElement(By.id("idOfDiv")).getText();
		System.out.println(sampleText);
			
		//Waiting for 3 seconds just for user to efficiently check automation
		//Its not mandatory though
		Thread.sleep(2000);
			
		//Using linkText locator to find the link and then using click() to click on it
		driver.findElement(By.linkText("This is a link")).click();
			
		Thread.sleep(2000);
		
		//Finding textbox using id locator and then using send keys to write in it
		driver.findElement(By.id("fname")).sendKeys("Kuldeep Rana");
			
		Thread.sleep(2000);
		
		//Clear the text written in the textbox
		driver.findElement(By.id("fname")).clear();
			
		Thread.sleep(2000);
		
		//Clicking on button using click() command
		driver.findElement(By.id("idOfButton")).click();
		
		//Javascript scroll down
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		Thread.sleep(2000);
			
		//Find radio button by name and check it using click() function
		driver.findElement(By.id("male")).click();
			
		Thread.sleep(2000);
			
		//Find checkbox by cssSelector and check it using click() function
		driver.findElement(By.className("Automation")).click();
				
		Thread.sleep(2000);
			
		//Using Select class for for selecting value from dropdown
		Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
		dropdown.selectByVisibleText("Database Testing");
		
		jse.executeScript("window.scrollBy(0,250)");
		Thread.sleep(50000);
		
		//Close the browser
		driver.close();

		}
	}

