package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1_Link {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//a[contains (text(),'Go to Home Page')]").click();
		driver.navigate().back();
		driver.get("http://leafground.com/pages/Button.html");
		driver.navigate().back();
		WebElement E1 = driver.findElementByXPath("//a[contains (text(),'Verify am I broken?')]");
		E1.click();
		String E2 = driver.getTitle();
		System.out.println("The title is " + E2);
		driver.navigate().back();
		int size = driver.findElements(By.tagName("a")).size();
		System.out.println("Number of links in the page is" +size);
		driver.findElementByXPath("(//a[contains (text(),'Go to Home Page')])[2] ").click();
		
        }
		

	}

