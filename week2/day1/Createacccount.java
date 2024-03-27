package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Createacccount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Accounts")).click();
driver.findElement(By.linkText("Create Account")).click();
driver.findElement(By.id("accountName")).sendKeys("sakthe");
//driver.findElement(By.xpath("//td[@id='ext-gen601']")).sendKeys("Selenium Automation Tester");

WebElement industry = driver.findElement(By.className("industryEnumId"));
Select sel=new Select(industry);
sel.selectByVisibleText("Computer Software");

WebElement ownership = driver.findElement(By.className("ownershipEnumId"));
Select own = new Select(ownership);
own.selectByVisibleText("S-Corporation");


WebElement employee = driver.findElement(By.id("dataSourceId"));
Select emp = new Select(employee);
emp.selectByValue("4");


WebElement market = driver.findElement(By.id("marketingCampaignId"));
Select mark = new Select(market);
mark.selectByIndex(6);


WebElement state = driver.findElement(By.id("dataSourceId"));
Select st = new Select(state);
st.selectByValue("4");

driver.findElement(By.xpath("//input[@value='Create Account']")).click();

String title = driver.getTitle();
System.out.println(title);
driver.close();
}

}
