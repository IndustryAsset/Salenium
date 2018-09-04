import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mod1SlidingandSlicing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\livingson.remiyathas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/resources/demos/slider/default.html");
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		Actions a = new Actions(driver);
		a.dragAndDropBy(slider, 190, 0).perform();

	}

}
