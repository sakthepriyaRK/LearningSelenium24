package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Sakthe");
		
		driver.findElement(By.name("lastname")).sendKeys("K");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("123456789");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("sakthe@123");
		
		WebElement birthdaydate=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select birthday=new Select(birthdaydate);
		birthday.selectByValue("9")	;
		
		
		WebElement birthdaymonth=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select birthdaymon=new Select(birthdaymonth);
		birthdaymon.selectByValue("11");
		Thread.sleep(3000);

		WebElement birthdayyear=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select birthdayyea=new Select(birthdayyear);
		birthdayyea.selectByValue("1992");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
}}

