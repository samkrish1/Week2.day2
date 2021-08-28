package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assigment2_CreateContact {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Contacts")).click();
			driver.findElement(By.linkText("Create Contact")).click();
			driver.findElementById("firstNameField").sendKeys("Ashwin");
			driver.findElementById("lastNameField").sendKeys("Ashwin");
			driver.findElementById("createContactForm_firstNameLocal").sendKeys("Ashwin");
			driver.findElementById("createContactForm_lastNameLocal").sendKeys("Kumar");
			driver.findElementById("createContactForm_departmentName").sendKeys("ECE");
			driver.findElementById("createContactForm_description").sendKeys("description ");
			driver.findElementById("createContactForm_primaryEmail").sendKeys("sam@gmail.com");
			driver.findElementById("createContactForm_generalStateProvinceGeoId").sendKeys("sam@gmail.com");
			driver.findElement(By.className("smallSubmit")).click();
			driver.findElement(By.linkText("Edit")).click();
WebElement E1 = driver.findElementById("updateContactForm_description");
			E1.clear();
			driver.findElementById("updateContactForm_importantNote").sendKeys("Ashwin");
			driver.findElementByXPath("//input[@value='Update']").click();
			String title = driver.getTitle();
			System.out.println("The tittle of the page is " +title);


	}

}