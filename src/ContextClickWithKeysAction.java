import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickWithKeysAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\livingson.remiyathas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.co.in/");
		Actions a = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"primary-header-activity\"]"));
		//a.moveToElement(driver.findElement(By.xpath("//*[@id=\"primary-header-activity\"]"))).contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		//a.contextClick(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		//a.contextClick(element).sendKeys(Keys.ENTER).build().perform();
		a.moveToElement(element);
		a.contextClick(element).build().perform();  /* this will perform right click */
		WebElement elementOpen = driver.findElement(By.linkText("Open link in new tab")); /*This will select menu after right click */
		elementOpen.click();
	}

}
