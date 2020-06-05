package firstproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.cleartrip.com");
		Select s = new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("4");
		Select p = new Select(driver.findElement(By.id("Childrens")));
		p.selectByIndex(3);
		driver.findElement(By.cssSelector("#DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		//driver.findElement(By.xpath("//*[@id=\"MoreOptionsLink\"]/strong")).click();
		driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();//a[@id="MoreOptionsLink"]
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Air Canada");
		driver.findElement(By.id("SearchBtn")).click();
		
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
	}

}
