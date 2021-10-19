package amazon.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Automationpracticesignin {

	WebDriver driver;
	utilityautomation1 au;

	@BeforeTest

	public void initializingBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\moham\\Desktop\\Library\\chromedriver.exe");

		driver = new ChromeDriver();

		au = new utilityautomation1(driver);

		driver.get("http://automationpractice.com/index.php");
		System.out.println("User nevigated to automationpractice.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test(priority = 1)

	public void validatesigninlink() {

		au.getSigninlink().click();
	}

	@Test(priority = 2)

	@Parameters({ "emailaddress" })

	public void emailaddress(String emailaddress) {
		au.getemailaddress().sendKeys(emailaddress);
		au.getCreateanaccount().click();
		Assert.assertTrue(au.getCreateanaccount().isDisplayed());

	}

//	@Test(priority = 3)
//
//	@Parameters({ "emailaddress1" })
//
//	public void emailaddress1(String emailaddress1) {
//		au.getemailaddress().sendKeys(emailaddress1);
//		au.getCreateanaccount().click();
//	}

	@Test(priority = 4)

	public void Createanaccount() {

		WebElement gettitle = driver.findElement(By.name("id_gender"));
		gettitle.click();

	}

	@Test(priority = 5)

	@Parameters({ "firstname", "lastname", "password" })

	public void Createanaccount2(String firstname, String lastname, String password) {

		au.getfirstname().sendKeys(firstname);
		au.getlastname().sendKeys(lastname);
		au.getpassword().sendKeys(password);

	}

	@Test(priority = 6)
	@Parameters({ "selectDay" })
	public void day(String selectDay) {

		Select day = new Select(au.getday());

		day.selectByValue(selectDay);
	}

	@Test(priority = 7)

	@Parameters({ "selectMonth" })

	public void month(String selectMonth) {

		Select month = new Select(au.getBirthMonth());

		month.selectByValue("1");
	}

	@Test(priority = 8)
	@Parameters({ "selectYear" })
	public void year(String selectYear) {

		Select year = new Select(au.getyear());
		year.selectByIndex(12);

	}

	@Test(priority = 9)

	@Parameters({ "address", "city", "state", "zipcode" })

	public void address(String address, String city, String state, String zipcode) {

		au.getaddress().sendKeys(address);
		au.getcity().sendKeys(city);
		au.getstate().sendKeys(state);
		au.getzipcode().sendKeys(zipcode);
	}

	@Test(priority = 10)

	@Parameters({ "mobilephone" })

	public void mobilephone(String mobilephone) {

		au.getmobilephone().sendKeys(mobilephone);

	}

	@Test(priority = 11)

	public void registerbutton() {

		au.getRegisterbutton().click();

	}

	@AfterTest

	public void Closingbrowser() {

		driver.close();
	}

}
