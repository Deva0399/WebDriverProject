package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.drive","chromedriver");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		List<WebElement> tablerows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		List<WebElement> tablecolumn = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
	    
	    System.out.println("no of columns: "+tablecolumn.size());
	    System.out.println("no of rows: "+tablerows.size());
	    WebElement data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[1]"));
	    System.out.println(data.getText());
		for (int i=2;i<+tablerows.size();i++) {
			WebElement data1 = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td[1]"));
			//WebElement data1 = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[*]/td[1]"));
			System.out.println(data1.getText());
		}
        WebElement elem = driver.findElement(By.xpath("//*[text()='Define an HTML Table']"));
        
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", elem);
        
		

	}

}
