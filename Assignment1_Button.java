package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1_Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
		driver.findElementByXPath("//button[@id='home']").click();
		driver.navigate().back();
		Point location = driver.findElementByXPath("//button[@id='position']").getLocation();
		int x=location.getX();
		int y =location.getY();
		System.out.println("The position of the x and y is " + x);
		System.out.println("The position of the x and y is " + y);
		String cssValue = driver.findElementByXPath("//button[@id='color']").getCssValue("color");
		System.out.println("Color of the butto  is " +cssValue);
		Dimension size = driver.findElementByXPath("//button[@id='size']").getSize();
		System.out.println("The size of the button is " +size);
			

	}

}
