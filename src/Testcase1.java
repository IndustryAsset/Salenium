import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\livingson.remiyathas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.co.in");
		WebElement dd = driver.findElement(By.xpath("//select[@id='hotel-1-adults-hp-hotel']"));
		Select select = new Select(dd);
		select.
	}

}
