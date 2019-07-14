package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zrifa\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver myChrome = new ChromeDriver();

		myChrome.get("https://www.demo.iscripts.com/multicart/demo/");
//login
		myChrome.findElement(By.xpath("//*[@id='dLabellogin']")).click();
//username & password		
		myChrome.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("user");
		myChrome.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("pass");
//login button		
		myChrome.findElement(By.xpath("//*[@id=\"jqLogin\"]")).click();
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		String expectedUserName = "James Williams";
		String actualUserName = myChrome.findElement(By.xpath("//*[@id=\"dLabel\"]/span")).getText();
		
		
		if (expectedUserName.equalsIgnoreCase(actualUserName))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		
		myChrome.close();

	}

}
