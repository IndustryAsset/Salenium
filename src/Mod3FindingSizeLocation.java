import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mod3FindingSizeLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\livingson.remiyathas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
        WebElement googleSearchButton = driver.findElement(By.name("btnK"));
        Point p = googleSearchButton.getLocation();
        Dimension d = googleSearchButton.getSize();
        System.out.println(p.x +"---"+p.y);
        System.out.println(d.height +"---"+d.width);   

		
	}

}
