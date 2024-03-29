package dataprovide;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class Data {

	public static WebDriver driver;;

	
	
	private static void browserlaunch() {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

	}

	@BeforeClass
	private static void waitline() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@BeforeMethod
	private static void url_Launch() {
		driver.get("http://adactinhotelapp.com/");
	}

	@Test(dataProvider = "MyDataProvider")
	private static void Login_page( String name,String pass) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@id='login']")).click();
	}

	@DataProvider 
	private Object[][] MyDataProvider() {

		return new Object[][] {
			{ "Kumar12", "asdw1"},
			{ "Ramesh", "AFGE4" }, 
			{ "Babu", "GHJKJ" },
			{ "rajfernanto", "TC02CG" }
			};

	}

	@AfterClass
	private static void roombooking() throws InterruptedException {
		// location
		WebElement loc = driver.findElement(By.xpath("//select[@id='location']"));
		Select location = new Select(loc);
		List<WebElement> options = location.getOptions();
		int size = options.size();
		System.out.println(size);
		location.selectByIndex(2);

		// hotels
		WebElement findElement1 = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select hotel = new Select(findElement1);
		// hotel.selectByIndex(2);
		hotel.selectByVisibleText("Hotel Creek");
		// room type

		WebElement findElement2 = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select room_type = new Select(findElement2);
		room_type.selectByIndex(2);

		// Number of Rooms

		WebElement findElement3 = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select NumberofRooms = new Select(findElement3);
		NumberofRooms.selectByIndex(6);

		// check in date

		driver.findElement(By.xpath("//input[@id='datepick_in']")).sendKeys("17/12/2023");

		// checkout date
		driver.findElement(By.xpath("//input[@id='datepick_out']")).sendKeys("18/12/2023");

		// adult

		WebElement findElement4 = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select adult = new Select(findElement4);
		adult.selectByIndex(2);

		// children

		WebElement findElement5 = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select child = new Select(findElement5);
		child.selectByVisibleText("2 - Two");

		// submit
		driver.findElement(By.xpath("//input[@id='Submit']")).click();

		// NextBytes page
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();

		driver.findElement(By.xpath("//input[@id='continue']")).click();

		// NextBytes page _3

		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("raji");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("anjappan");

		driver.findElement(By.xpath("//textarea[@id='address']"))
				.sendKeys("4/262 meenavar colony middle street poompuhar");
		driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("6754879034275876");

		WebElement card_type = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select card = new Select(card_type);
		card.selectByIndex(2);

		WebElement month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select monthSelect = new Select(month);
		monthSelect.selectByVisibleText("June");

		WebElement date = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));

		Select yearSelect = new Select(date);
		yearSelect.selectByValue("2025");

		driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("6789");

		driver.findElement(By.xpath("//input[@id='book_now']")).click();

		Thread.sleep(10000);
	}

	@AfterTest
	private static void logout() {
		driver.findElement(By.xpath("//input[@id='logout']")).click();

		driver.findElement(By.xpath("//a[text()='Click here to login again']")).click();
	}

	@AfterSuite
	private static void browserclose() {
		driver.close();
	}

}
