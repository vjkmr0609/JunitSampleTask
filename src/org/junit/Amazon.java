package org.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	static WebDriver driver;
	static long startTime;
	//static String first;
	@BeforeClass
public static void beforeClass() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\aruna\\eclipse-workspace\\JUnit\\Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.amazon.in/");
     Thread.sleep(3000);
	 
	}
	@Before
public void beforeTime() {
		startTime = System.currentTimeMillis();

	}
	@AfterClass
public static void afterClass() {
		driver.quit();	
	}
	@After
	public void afterMethod() {
		long endTime = System.currentTimeMillis();
		System.out.println("That took " + (endTime - startTime) + " milliseconds");

	}
	@Test
	public void a1() throws InterruptedException {
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Oneplus nord 2",Keys.ENTER);	

	}
	@Test
	public void a2() {
	WebElement mobile= driver.findElement(By.partialLinkText("OnePlus Nord 2 5G"));	
    System.out.println(mobile.getText());
	}
}
