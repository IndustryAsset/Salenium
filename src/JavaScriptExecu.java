import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecu {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\livingson.remiyathas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.co.in/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500);");
		WebElement element = driver.findElement(By.linkText("Add your property to Expedia"));
			
		js.executeScript("window.scrollBy(0,-1500);");
		
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		

	}

}
