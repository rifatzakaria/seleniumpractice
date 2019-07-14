package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zrifa\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver myChrome = new ChromeDriver();
		
//launch web page
		myChrome.get("https://www.demo.iscripts.com/multicart/demo/");
		
//login
		myChrome.findElement(By.xpath("//*[@id='dLabellogin']")).click();
		
//sign up
		myChrome.findElement(By.xpath("//*[@id=\"jqSignup\"]")).click();
		
//email field
		myChrome.findElement(By.xpath("//*[@id=\"txtEmail\"]")).sendKeys("iffatfarzana@gmail.com");
		
//user name field		
		myChrome.findElement(By.xpath("//*[@id=\"txtUserName\"]")).sendKeys("farzana");

//password field
		myChrome.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("iffat");
		
//re enter password	field	
		myChrome.findElement(By.xpath("//*[@id=\"txtCnfPassword\"]")).sendKeys("iffat");
		
//first name field	
		myChrome.findElement(By.xpath("//*[@id=\"txtFirstName\"]")).sendKeys("iffat");
		
//last name	field	
		myChrome.findElement(By.xpath("//*[@id=\"txtLastName\"]")).sendKeys("farzana");
		
//address field		
		myChrome.findElement(By.xpath("//*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[7]/input")).sendKeys("43rd ave");
		
//create account
		myChrome.findElement(By.xpath("//*[@id=\"btnRegister\"]")).click();
		
		
		 
		  
		  try { Thread.sleep(2000); } catch (InterruptedException e) {
		  e.printStackTrace(); }
		  
		  String expectedUserName = "IFFAT FARZANA";
		  String actualUserName =  myChrome.findElement(By.xpath("//*[@id=\"dLabel\"]/span")).getText();
		  
		  
		  if (expectedUserName.equalsIgnoreCase(actualUserName)) {
		  System.out.println("test passed"); } else {
		  System.out.println("test failed"); }
		 
		myChrome.close();

	}

}
