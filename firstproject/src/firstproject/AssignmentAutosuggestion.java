package firstproject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentAutosuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		 driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Uni");
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
		int i=0;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script =" return document.getElementById(\"autocomplete\").value;";
		String text =(String)js.executeScript(script);
				Thread.sleep(1000);
		while(!text.equalsIgnoreCase("United States (USA)"))
				{
			i++;
					driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
			text =(String)js.executeScript(script);
			
			if(i>7)
			{
			 break;
			
			}
			
	}
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.ENTER);
String val =(String)js.executeScript(script);
		if(val.equalsIgnoreCase("United States (USA)"))
		{
			System.out.println("verified");
		
		}
		else
		{
		System.out.println("not verified");
		}

	}

}
