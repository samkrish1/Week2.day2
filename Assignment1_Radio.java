package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1_Radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//input[@id='yes']").click();
		WebElement RB = driver.findElementByCssSelector("input[value='1']");
		if (RB.isSelected()) 
		{
			System.out.println("The default selected value is yes ");
		}
		
		else
		{
			System.out.println("The default selected value is No ");
		}
			
	} 
	
	}

