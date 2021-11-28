package com.automation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;


public class mainClass {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Navan\\eclipse-workspace\\SeleniumDemo\\src\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("login")).click();
		
		driver.findElement(By.xpath("//input[@name='email_create']")).sendKeys("m9q@g.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		// Create an account page
		Thread.sleep(6000);
		
		// Your Personal Information
		driver.findElement(By.id("id_gender1")).click();

		driver.findElement(By.xpath("//input[@name='customer_firstname']")).sendKeys("Test Navan");
		driver.findElement(By.xpath("//input[@name='customer_lastname']")).sendKeys("Bye Tanjeem");

		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("123456");

		driver.findElement(By.id("days")).click();
		Select day = new Select(driver.findElement(By.id("days")));
		day.selectByVisibleText("6  ");
		
		driver.findElement(By.id("months")).click();
		Select month = new Select(driver.findElement(By.id("months")));
		month.selectByVisibleText("December ");
		
		driver.findElement(By.id("years")).click();
		Select year = new Select(driver.findElement(By.id("years")));
		year.selectByVisibleText("1994  ");
		
		driver.findElement(By.id("uniform-newsletter")).click();
		driver.findElement(By.id("uniform-optin")).click();

		
		// Your Address
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Address");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Last Address");
		
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("X Company");

		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Dhanmondi");
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("Banani");

		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Dhaka");
		
		driver.findElement(By.id("id_state")).click();
		Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByVisibleText("Arizona");
		
		driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("12056");

		driver.findElement(By.id("id_country")).click();
		Select country = new Select(driver.findElement(By.id("id_country")));
		country.selectByVisibleText("United States");

		driver.findElement(By.id("other")).sendKeys("Additional informatio added here: My name is Navan");

		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("880188");

		driver.findElement(By.xpath("//input[@name='phone_mobile']")).sendKeys("8801682868869");
		driver.findElement(By.xpath("//input[@name='alias']")).sendKeys("Alias");

		driver.findElement(By.id("submitAccount")).click();
		
		
		// Logging out from first account
		driver.findElement(By.className("logout")).click();

		
		
		
		
		// Registeting with second user
		
		driver.findElement(By.className("login")).click();
		
		driver.findElement(By.xpath("//input[@name='email_create']")).sendKeys("m7b@g.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		// Create an account page
		Thread.sleep(3000);
		
		// Your Personal Information
		driver.findElement(By.id("id_gender1")).click();

		driver.findElement(By.xpath("//input[@name='customer_firstname']")).sendKeys("Test Hossain");
		driver.findElement(By.xpath("//input[@name='customer_lastname']")).sendKeys("Second User");

		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("123456");

		driver.findElement(By.id("days")).click();
		Select day2 = new Select(driver.findElement(By.id("days")));
		day2.selectByVisibleText("18  ");
		
		driver.findElement(By.id("months")).click();
		Select month2 = new Select(driver.findElement(By.id("months")));
		month2.selectByVisibleText("December ");
		
		driver.findElement(By.id("years")).click();
		Select year2 = new Select(driver.findElement(By.id("years")));
		year2.selectByVisibleText("1965  ");
		
		driver.findElement(By.id("uniform-newsletter")).click();
		driver.findElement(By.id("uniform-optin")).click();

		
		// Your Address
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Address Second ");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Last Ad Second");
		
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("Y Company");

		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Mohammadpur");
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("Murpur");

		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Chittagong");
		
		driver.findElement(By.id("id_state")).click();
		Select state2 = new Select(driver.findElement(By.id("id_state")));
		state2.selectByVisibleText("Arizona");
		
		driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("12058");

		driver.findElement(By.id("id_country")).click();
		Select country2 = new Select(driver.findElement(By.id("id_country")));
		country2.selectByVisibleText("United States");

		driver.findElement(By.id("other")).sendKeys("Additional informatio added here: My name is Tanjeem");

		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("880188");

		driver.findElement(By.xpath("//input[@name='phone_mobile']")).sendKeys("8801682868869");
		driver.findElement(By.xpath("//input[@name='alias']")).sendKeys("Alias for second user");

		driver.findElement(By.id("submitAccount")).click();
		
		
		// Clicking on Home icon

		driver.findElement(By.cssSelector("a[title=\"Return to Home\"]")).click();

		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.cssSelector("img[title=\"Faded Short Sleeve T-shirts\"]"));

        //This will scroll the page Horizontally till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        
        // Selecting Product
        driver.findElement(By.cssSelector("img[title=\"Faded Short Sleeve T-shirts\"]")).click();
        
        // Clicking on Add to cart in product page
//        driver.findElement(By.cssSelector("button[title=\"Add to cart\"]")).click();

        
//		driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
		Thread.sleep(6000);

        driver.findElement(By.xpath(".//*[@id='add_to_cart']/span")).click();


	}

}




//WebElement Element = driver.findElement(By.linkText("Auto Testing"));

