package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.drive","chromedriver");
		
		//System.setProperty("webdriver.gecko.drive","geckodriver");
		
		//WebDriver driver1 = new FirefoxDriver();
		
		WebDriver driver = new ChromeDriver();
		
		//driver1.get("https://www.simplilearn.com/");
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("abc@gmail.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Deva@123");
		WebElement LoginButton = driver.findElement(By.name("btn_login"));
		LoginButton.click();
		WebElement Forgotpass = driver.findElement(By.partialLinkText("Forgot "));
		Forgotpass.click();
		WebElement Rememberme = driver.findElement(By.id("remember-me"));
		Rememberme.click();
		
		Thread.sleep(5000);
		
		
		driver.quit();
		//driver.close();

	}

}
