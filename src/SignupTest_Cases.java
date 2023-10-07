import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SignupTest_Cases extends Parameters {
	

	
	WebDriver driver = new ChromeDriver();
	
	SoftAssert myAssertion=new SoftAssert();

	
	@BeforeTest
	public void Setup() throws InterruptedException {
		driver.get(URL);
		driver.manage().window().maximize();
		
		WebElement createAccount = driver.findElement(By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']"));
		
		createAccount.click();
		
		Thread.sleep(3000);
		
		
	}

	
	@Test()
	public void SignUp()  throws InterruptedException{
		
		WebElement firstnameField = driver.findElement(By.id("firstname"));
		WebElement lastnameField = driver.findElement(By.id("lastname"));
		WebElement emailField= driver.findElement(By.id("email_address"));
		
		WebElement passwordField = driver.findElement(By.id("password"));
		WebElement passwordconfField = driver.findElement(By.id("password-confirmation"));
		WebElement LoginButton=driver.findElement(By.cssSelector("button[title='Create an Account']"));
		
		
		firstnameField.sendKeys(firstName);
		lastnameField.sendKeys(lastName);
		emailField.sendKeys(Email);
		passwordField.sendKeys(Password);
		passwordconfField.sendKeys(Password);
		LoginButton.click();
		
		Thread.sleep(4000);
		String ActualMsg = driver.findElement(By.className("message-success")).getText();
		myAssertion.assertEquals(ActualMsg,registerMsg);
		myAssertion.assertAll();

		
	}

	@AfterTest

	public void PostTest() {
      //driver.close();
	}

}