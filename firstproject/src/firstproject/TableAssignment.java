package firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		WebElement table = driver.findElement(By.id("product"));
		System.out.println("number of rows");
		System.out.println(table.findElements(By.xpath("//table[@id='product']/tbody/tr")).size());
		System.out.println("number of col");
		System.out.println(table.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size());
	
		System.out.println(table.findElement(By.xpath("//table[@id='product']/tbody/tr[3]")).getText());
	}

}
