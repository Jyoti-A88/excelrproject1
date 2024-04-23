package testmtds;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Tc22 {

WebDriver driver;
	
	public  Tc22(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}	
	
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")public WebElement homepage;
	
	@FindBy(xpath = "//h2[contains(text(),'recommended items')]")public WebElement recommendedItems;
	
	@FindBy(xpath = "//body/section[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")public WebElement addToCart;
	@FindBy(xpath = "//body[1]/section[2]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]/i[1]")public WebElement arrow;
	@FindBy(xpath = "//u[contains(text(),'View Cart')]")public WebElement viewCart;
	
	
	
	public void recommendedProd(String SearchInput) {
		try {
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "Automation Excercise";
			Assert.assertNotEquals(ActualTitle, ExpectedTitle);


	if(homepage.isDisplayed()) {
		System.out.println("User landed to homepage successfully");
	}
	else {
		System.out.println("User is not in homepage");
	}
	
	recommendedItems.isDisplayed();
	System.out.println(recommendedItems.getText());
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();", recommendedItems);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	System.out.println("Recommended items displayed successfully");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	arrow.click();

	//private WebDriverWait wait;
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	WebElement addToCart=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/section[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")));
	
	addToCart.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	viewCart.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	
	
	WebElement productName = driver.findElement(By.xpath("//a[contains(text(),'Blue Top')]"));
	System.out.println("Recommended product "+productName.getText()+" is addedd to cart");
	
	
		}

		catch (Exception e) {
			System.out.println("Exception Caught "+ e.getMessage());
		}
			}


}
