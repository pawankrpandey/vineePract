package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		//for window authentication pop up.
		//http://username:password@siteURL.
		Thread.sleep(2000);
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Basic Auth"));
		

	}

}
