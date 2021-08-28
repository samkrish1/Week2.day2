package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Usingxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains (text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains (text(),'Create Lead')]")).click();
		driver.findElement(By.xpath("//input[@class ='inputBox']")).sendKeys("Abcd");
		
		WebElement elements = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		Select dropdown3 = new Select(elements);
		dropdown3.selectByVisibleText("Automobile");
	
	}

}
