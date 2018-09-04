import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mod3UploadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\livingson.remiyathas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://wikisend.com");
		WebElement browse = driver.findElement(By.id("uploadfield"));
		browse.sendKeys("C:\\Users\\livingson.remiyathas\\Desktop\\Selenium\\uploadfile.txt");

	}

}
