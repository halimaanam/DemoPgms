import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class java1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	String url="https://www.google.com/";
	
	driver.get(url);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	String title=driver.getTitle();
	System.out.println(title);
	
	}
}
