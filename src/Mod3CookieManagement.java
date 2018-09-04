import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mod3CookieManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\livingson.remiyathas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
        Cookie name = new Cookie("mycookie", "123456789123");
        driver.manage().addCookie(name);
        Set<Cookie> cookiesList =  driver.manage().getCookies();
        for(Cookie getcookies :cookiesList) {
            System.out.println(getcookies );
        }
		//driver.manage().deleteCookieNamed("123456789123");
        //driver.manage().deleteAllCookies();
	}

}
