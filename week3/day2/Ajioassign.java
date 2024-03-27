package week3.day2;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajioassign {
	
	
	
	public static void main(String[] args) throws InterruptedException {
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS)
		driver.findElement(By.name("searchVal")).sendKeys("Bags");
		driver.findElement(By.xpath("//button[@type='submit']/span")).click();
		//To the left  of the screen under " Gender" click the "Men"
		Thread.sleep(2000);
		//driver.findElement(By.id("Men")).click();
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		 //Print the count of the items Found. 
		String text = driver.findElement(By.className("length")).getText();
		System.out.println("count of items found is :"+ text);
		
		//Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> brandlist = driver.findElements(By.className("brand"));
		Set<WebElement> brandlistunique = new HashSet<>(brandlist);
//		System.out.println("Brandlist:"+brandlist);
		for (WebElement brand : brandlistunique) {
			
			String text2 = brand.getText();
			System.out.println(text2);
			
		}
		// Get the list of names of the bags and print it
		
		List<WebElement> BagsList= driver.findElements(By.className("facet-body"));
		for(WebElement Bags : BagsList) 
		{
			String  text3= Bags.getText();
			System.out.println(text3);
			}
		}
	}
	


