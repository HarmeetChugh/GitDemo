package firstproject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.ksrtc.in");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
	
	int i=0;
		//driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		//System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script =" return document.getElementById(\"fromPlaceName\").value;";
		String text =(String)js.executeScript(script);
		//System.out.println(text);
		
		while( !text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
				{
			i++;
			//BENGALURU INTERNATION AIRPORT
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			text =(String)js.executeScript(script);
			//System.out.println(text);
			if(i>5)
			{
				//System.out.println("val not present");
			 break;
			
			}
			
	}
		if(i>5)
		{
			System.out.println("val not present");
		
		}
		else
		{
		System.out.println(text + " is present in the autosuggestive list");
		}
	}

}
