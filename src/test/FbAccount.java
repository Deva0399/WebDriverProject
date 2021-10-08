package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.drive","chromedriver");
		WebDriver driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
        WebElement account= driver.findElement(By.xpath("//*[contains(text(),'Create New Account')]"));
        account.click();
        
        WebElement Fname = driver.findElement(By.xpath("//input[@name='firstname']"));
        Fname.sendKeys("Deva");
        
        WebElement Lname = driver.findElement(By.xpath("//input[@name='lastname']"));
        Lname.sendKeys("Dharshni");
        
        WebElement Email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        Email.sendKeys("Dharshni@gmail.com");
        
        WebElement Password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        Password.sendKeys("shgt12234");
        
        WebElement Day = driver.findElement(By.xpath("//*[@id='day']"));
        Select ddDay = new Select(Day);
        ddDay.selectByVisibleText("3");
        //ddDay.selectByValue("12");
        //ddDay.selectByIndex(3);
        
        WebElement Month = driver.findElement(By.xpath("//*[@id='month']"));
        Select month = new Select(Month);
        month.selectByValue("4");
        
        WebElement Year = driver.findElement(By.xpath("//*[@id='year']"));
        Select year = new Select(Year);
        year.selectByIndex(0);
        
        WebElement Female = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
        Female.click();
        if(Female.isSelected()) {
        	System.out.println("Radio button is selected");
        }else {
        	System.out.println("Radio button is not selected");
        }
        List<WebElement> Months = driver.findElements(By.xpath("//select[@id='month']/option"));
        
        for(int i=1;i<=Months.size();i++) {
            
            WebElement data = driver.findElement(By.xpath("//select[@id='month']/option[" + i + "]"));
            System.out.println(data.getText());
        }
        

	}

}
