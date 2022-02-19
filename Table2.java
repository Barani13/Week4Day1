package Week4Day1;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table2 {
public static void main(String[] args) {
	
	

	WebDriverManager.chromedriver().setup();
ChromeDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.leafground.com/pages/sorttable.html");
WebElement table=driver.findElement(By.id("table_id"));
List<WebElement> list1=table.findElements(By.xpath("//table/tbody/tr/td[2]"));

List<String> list2=new LinkedList<String>();

for (WebElement names : list1) {
	
	String name=names.getText();
	list2.add(name);
	System.out.println(name);
}

driver.findElement(By.xpath("//th[text()='Name']")).click();
List<WebElement> list3=driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

List<String> list4=new LinkedList<String>();
for (WebElement names2 : list3) {
	String name2=names2.getText();
	list4.add(name2);
	System.out.println(name2);
}
if (list2.equals(list4) == true) {
    System.out.println(" Both List are equal");
}
else

{
    System.out.println(" Both List are not equal");
}

}
}
