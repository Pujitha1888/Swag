package SwagLabs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;

	@Test(priority = 0)
	public void LoginValid() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement Username=driver.findElement(By.xpath("//input[@ id='user-name']"));
		Username.sendKeys("standard_user");
		WebElement Password=driver.findElement(By.xpath("//input[@ id='password']"));
		Password.sendKeys("secret_sauce");
		WebElement Login=driver.findElement(By.xpath("//input[@ id='login-button']"));
		Login.click();
		
	}
		
	//////invalid user & password
	@Test(priority=1)
		public void InvalidUser() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/v1/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			WebElement Username=driver.findElement(By.xpath("//input[@ id='user-name']"));
			Username.sendKeys("standard_user1");
			WebElement Password=driver.findElement(By.xpath("//input[@ id='password']"));
			Password.sendKeys("secret_sauce1");
			WebElement Login=driver.findElement(By.xpath("//input[@ id='login-button']"));
			Login.click();
	}
	//////Locked out
	@Test(priority=2)
	public void LockedOut() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement Username=driver.findElement(By.xpath("//input[@ id='user-name']"));
		Username.sendKeys("locked_out_user");
		WebElement Password=driver.findElement(By.xpath("//input[@ id='password']"));
		Password.sendKeys("secret_sauce1");
		WebElement Login=driver.findElement(By.xpath("//input[@ id='login-button']"));
		Login.click();
}
///////Add to cart
	@Test(priority=3)
	public void Cart() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/inventory.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement Bag=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
		Bag.click();
		WebElement Add=driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
		Add.click();
	}
	/////check logo
	@Test(priority=4)
	public void logo() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/v1/inventory-item.html?id=4");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	WebElement Logo=driver.findElement(By.xpath("//a[@ class='shopping_cart_link fa-layers fa-fw']"));
	Logo.click();
	}
	/////Checkout Button
	@Test(priority=5)
	public void Checkout() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/cart.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement Checkout=driver.findElement(By.xpath("//a[@ class='btn_action checkout_button']"));
		Checkout.click();
	}
	//////Details
	@Test(priority=6)
	public void Details() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/v1/checkout-step-one.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	WebElement Firstname=driver.findElement(By.id("first-name"));
	Firstname.sendKeys("Pujitha");
	WebElement Lastname=driver.findElement(By.id("last-name"));
	Lastname.sendKeys("Reddy");
	WebElement code=driver.findElement(By.id("postal-code"));
	code.sendKeys("530044");
	WebElement Continue=driver.findElement(By.xpath("//input[@ class='btn_primary cart_button']"));
	Continue.click();
	}
	///Finish
	@Test(priority=7)
	public void Finished() {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com/v1/checkout-step-two.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	WebElement Finish=driver.findElement(By.xpath("//a[text()='FINISH']"));
	Finish.click();
	}
	
		
	}
