package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1_Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//img[@src ='../images/home.png']").click();
		driver.navigate().back();
		driver.findElementByXPath("//img[@src='../images/keyboard.png']").click();
		driver.navigate().back();
		WebElement E1 = driver.findElementByXPath("//img[@src ='../images/abcd.jpg']");
		if (E1.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("The image is broken");
		}
		else	
		{
				
				System.out.println("The image is not broken");
			}
		driver.findElementByXPath("//img[@src ='../images/keyboard.png']").sendKeys(Keys.ENTER);
		
		}
	}
