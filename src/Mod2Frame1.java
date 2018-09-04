import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mod2Frame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\livingson.remiyathas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://jqueryui.com/dialog/");
        int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total number of frames in the page- "+size);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@title='Close']")).click();
		
				

	}

}
