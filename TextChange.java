package Week4Day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextChange {
	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/pages/TextChange.html");
	
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Click ME!']")));
     WebElement alert =  driver.findElement(By.xpath("//button[text()='Click ME!']"));
	
	alert.click();
	Alert alert1=driver.switchTo().alert();
	String text = alert1.getText();
    alert1.accept();
    
    if(text.contains("Click ME!"))
    {
 		  System.out.println(text +" Text is verified" );
    }
    else
 	   
 	   System.out.println("Text is not verified" );
	} 
}
