package firstproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Assignment_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.xpath("//div[@id='content']/a[2]")).click();
				
        WebDriverWait w=new WebDriverWait(driver,10);
        w.until(ExpectedConditions.elementToBeClickable(By.id("results")));
        System.out.println(driver.findElement(By.id("results")).getText());
  
	}

}
