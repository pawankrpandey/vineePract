package test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class AutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

	WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://airconvertpdftojpg.com/");
		driver.findElement(By.cssSelector("[class*='g-btn--choose']")).click();
		Thread.sleep(1000);
	    Runtime.getRuntime().exec("E:\\fileupload.exe");
		
		
	}

}
