package firstproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Multiple_windows_assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com");
		System.out.println("before switching");
		System.out.println("Title of parent is "+ driver.getTitle()); 
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		Set<String> index= driver.getWindowHandles();
		Iterator<String> it = index.iterator();
		String parentindex = it.next();
		String childindex = it.next();
		driver.switchTo().window(childindex);
		System.out.println("after switching");
		System.out.println("Title of child is "+ driver.getTitle());
		System.out.println("Text of child is " +driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
		System.out.println("switching back");
		driver.switchTo().window(parentindex);		
		System.out.println("Title of parent is "+ driver.getTitle());
		System.out.println("Text of parent is " +driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
	}

}
