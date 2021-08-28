package week2.day2;

import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Assignment1_Dropdown {
	


		public static void main(String[] args) {
			// TODO Auto-generated method stub

			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leafground.com/pages/Dropdown.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement drop1 = driver.findElement(By.id("dropdown1"));
			Select D2 = new Select(drop1);
			D2.selectByIndex(4);
			WebElement drop2 = driver.findElement(By.name("dropdown2"));
			Select D3 = new Select(drop2);
			D3.selectByVisibleText("Appium");
			WebElement drop3 = driver.findElement(By.id("dropdown3"));
			Select D4 = new Select(drop3);
			D4.selectByValue("3");
			driver.findElementByXPath("(//option[@selected='selected'])[5]").click();
			WebElement S1 = driver.findElement(By.className("dropdown"));
			int listSize = ((Select) S1).getOptions().size();
			System.out.println("List size: " +listSize); 
			WebElement drpdown = driver.findElement(By.className("example"));
			Select D1 = new Select(drpdown);
			D1.selectByIndex(3);
		}
		

	}

	