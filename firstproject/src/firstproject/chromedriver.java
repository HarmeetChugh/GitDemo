package firstproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromedriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//driver.get("http://www.google.com");
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//input[contains(@ id ,'mail')]")).sendKeys("harmeet");
	driver.findElement(By.xpath("//div [@class='_5dbb']/div[1]/input ")).sendKeys("chugh");
	//*[@id="email"]
	//driver.findElement(By.xpath(("//div[@class='RNNXgdivb']div/div[2]//input"))).sendKeys("harmeet");
		driver.manage().window().maximize();
	//driver.findElement(By.xpath(("//*[@class='RNNXgb']div/div[2]/div/input"))).sendKeys("dvdhajgjh");

		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hello");
	System.out.println("hellllllllllooooooooooo");
	System.out.println("hhiiiiiiiiii");
	}

}
