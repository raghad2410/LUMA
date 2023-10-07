import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Login_Test_Cases extends Parameters {
	

	
	WebDriver driver = new ChromeDriver();
	
	SoftAssert myAssertion=new SoftAssert();

	
	@BeforeTest
	public void Setup() throws InterruptedException {
		driver.get(URL);
		driver.manage().window().maximize();
		
		WebElement createAccount = driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]"));
		
		createAccount.click();
		
		Thread.sleep(3000);
		
		
	}

	
	@Test()
	public void Login()  throws InterruptedException{
		
		
		WebElement emailField= driver.findElement(By.id("email"));
		
		WebElement passwordField = driver.findElement(By.name("login[password]"));
		WebElement LoginButton=driver.findElement(By.id("send2"));
		
		
		
		emailField.sendKeys(Email);
		passwordField.sendKeys(Password);
		LoginButton.click();
		
		Thread.sleep(4000);
		String ActualMsg = driver.findElement(By.cssSelector("div[class='panel header'] span[class='logged-in']")).getText();
		myAssertion.assertEquals(ActualMsg,welcomeMsg);
		myAssertion.assertAll();

		
	}

	@AfterTest

	public void PostTest() {
      //driver.close();
	}

}