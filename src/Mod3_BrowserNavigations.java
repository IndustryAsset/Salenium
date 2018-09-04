import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mod3_BrowserNavigations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\livingson.remiyathas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Navigation method1
		//String URL = "https://www.google.com";
		//driver.navigate().to(URL);
		
		
		//Navigation Method2
		// driver.navigate().to("https://www.google.com");
		
		//Simple Method to go to URL
		driver.get("https://www.google.com");
		

	}

}
