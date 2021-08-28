package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1_Editpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//input[@id='email']").sendKeys("sambu.krish@gmail.com");
		WebElement E1 = driver.findElementByXPath("//input[@value='Append ']");
		E1.sendKeys("Append");
		E1.sendKeys(Keys.TAB);
		String E2 = driver.findElementByXPath("//input[@value='TestLeaf']").getAttribute("value");
		System.out.println("The Default text retrived is " +E2 );
		driver.findElementByXPath("//input[@value='Clear me!!']").clear();
		boolean E3 = driver.findElementByXPath("//input[@disabled='true']").isEnabled();
		System.out.println(E3);
		
	
		
		
		
		
		

	}

}
