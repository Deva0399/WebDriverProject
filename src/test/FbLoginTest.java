package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.drive","chromedriver");
		WebDriver driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		WebElement Header = driver.findElement(By.xpath("//h2"));
        if(Header.isDisplayed())	{
        	System.out.println("header is displayed");
        	System.out.println(Header.getText());
        }else {
        	System.out.println("header is not displayed");
        }
   
		WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
		UserName.sendKeys("abc@gmail.com");
		System.out.println(UserName.getAttribute("placeholder"));
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
	    password.sendKeys("123@frdgh");
		WebElement Loginbutton = driver.findElement(By.xpath("//*[@name='login']"));
		Loginbutton.click();
		

	}

}
