package Week4Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AppearText {
public static void main(String[] args) throws InterruptedException {
	
	//http://www.leafground.com/pages/appear.html
	WebDriverManager.chromedriver().setup();
ChromeDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.leafground.com/pages/appear.html");
WebElement Text=driver.findElement(By.id("btn"));
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
String text = Text.getText();
System.out.println("The text is"+" "+text);
}
}
