package firstproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption1")).click();
	String val = driver.findElement(By.id("checkBoxOption1")).getAttribute("value");
	Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
	s.selectByValue(val);
	//val.eq
	driver.findElement(By.id("name")).sendKeys(val);
	driver.findElement(By.id("alertbtn")).click();
	String text= driver.switchTo().alert().getText();
	if(text.contains(val)) 
	{
		
		System.out.println("text verified");
	}
		else
		{
			System.out.println("text not there");
	}
	}

}
