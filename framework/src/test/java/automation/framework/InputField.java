package automation.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputField {
	public static void main(String args[]) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://wm.divami.com/login");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin@divami.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Naveen@123");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
//    driver.findElement(By.id("gsc-i-id2")).click();

	}
}
