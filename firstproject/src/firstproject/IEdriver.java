package firstproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","C:/Users/IEDriverServer.exe");
		WebDriver driver =new InternetExplorerDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		
		System.out.println(driver.getTitle());
		System.out.println("test");
		System.out.println("test1");
		System.out.println("test2");
		System.out.println("test3");
		System.out.println("test4");
		System.out.println("hiiiiiiiiiiiiiiiii");
		driver.findElement(By.xpath(("//input[@name='firstname']"))).sendKeys("ABC");
	}

}
