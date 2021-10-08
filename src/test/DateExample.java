package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.drive","chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
		driver.switchTo().frame(0);
		
		WebElement date= driver.findElement(By.xpath("//*[@id='datepicker']"));
		//date.sendKeys("03/04/1999");
		date.click();
		WebElement arrow = driver.findElement(By.xpath("//a[@title='Next']"));
		WebElement month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		String smonth=month.getText();
		while(!smonth.equals("January")){
			arrow.click();
			arrow = driver.findElement(By.xpath("//a[@title='Next']"));
			month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
			smonth=month.getText();		
			}
		
		WebElement day= driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()='3']"));
		day.click();
		
	}

}
