package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.drive","chromedriver");
		WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
		driver.switchTo().frame("frame-bottom");
		WebElement element = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
		System.out.println(element.getText());
		
		driver.switchTo().defaultContent();
		//driver.switchTo().frame("frame-top");
		//WebElement element2 = driver.findElements(By.xpath("//frame[@name='frame-left']"));
		//System.out.println(element2.getText());
		
		

	}

}
