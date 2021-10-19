package amazon.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class utilityautomation1 {
	
	
	
	WebDriver driver;
	
	public utilityautomation1(WebDriver driver) {
		
		this.driver=driver;
	}
	

	
	public WebElement getSigninlink() {
		
		WebElement Signinlink = driver.findElement(By.linkText("Sign in"));
		return Signinlink;
	}

	
	public WebElement getEmailaddress() {
		
		WebElement Emailaddress = driver.findElement(By.xpath("//*[@id=\"create-account_form\"]/div/div[2]/label"));
		return Emailaddress;
	}


	public WebElement getCreateanaccount() {
		
		WebElement Createanaccount = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
		return Createanaccount;
	}
	
	
	public WebElement getfirstname() {
		
		WebElement firstname = driver.findElement(By.id("customer_firstname"));
		return firstname;
		
	}
	
	public WebElement getlastname() {
	
	WebElement lastname = driver.findElement(By.id("customer_lastname"));
	return lastname;
	
	}
	
	public WebElement getemailaddress() {
	
	WebElement emailaddress= driver.findElement(By.xpath("//*[@id=\"email_create\"]"));
	return emailaddress;
	}
	

	public WebElement getpassword() {

	WebElement password= driver.findElement(By.name("passwd"));
	return password;
	}



	public WebElement getday() {

	WebElement day= driver.findElement(By.xpath("//*[@id=\"days\"]"));
	return day;
	}


	public WebElement getBirthMonth() {

		WebElement BirthMonth = driver.findElement(By.xpath("//*[@id=\"months\"]"));
		return BirthMonth;
	}
	

	public WebElement getyear() {

		WebElement year= driver.findElement(By.xpath("//*[@id=\"years\"]"));
		return year;
	}
				

	public WebElement getaddress() {

		WebElement address= driver.findElement(By.id("address1"));
		return address;
	}


	public WebElement getcity() {

		WebElement city= driver.findElement(By.name("city"));
		return city;
	}

	public WebElement getstate() {

		WebElement state= driver.findElement(By.xpath("//*[@id=\"id_state\"]"));
		return state;
	}

	public WebElement getzipcode() {

		WebElement zipcode= driver.findElement(By.name("postcode"));
		return zipcode;
	}
	

	public WebElement getmobilephone() {

		WebElement mobilephone= driver.findElement(By.id("phone_mobile"));
		return mobilephone;
	}
	


	public WebElement getassignanaddress() {

		WebElement assignanaddress= driver.findElement(By.id("alias"));
		return assignanaddress;
	}
	

	public WebElement getRegisterbutton() {

		WebElement Registerbutton= driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span"));
		return Registerbutton;
}



	
	
}



