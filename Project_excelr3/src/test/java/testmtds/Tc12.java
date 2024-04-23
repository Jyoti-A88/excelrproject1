package testmtds;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Tc12 {
WebDriver driver;
	
	public  Tc12(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}	
	
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")public WebElement homepage;
	@FindBy(xpath = "//a[text()=' Products']")public WebElement products;
	@FindBy (xpath="//div//a[@data-product-id='1']") WebElement addToCart;
	@FindBy (xpath="//button[contains(text(),'Continue Shopping')]") WebElement continueShop;
	@FindBy (xpath="(//a[@data-product-id='2'])[1]") WebElement addToCart2;
	@FindBy (xpath="//a//u[contains(text(),'View Cart')]") WebElement viewCart;
	
	
	
	
	
	public void addProduct(String SearchInput) {
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
	
	products.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	
	
	addToCart.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	continueShop.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	addToCart2.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	viewCart.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
	List<WebElement> firstProduct = driver.findElements(By.id("product-1"));
	List<WebElement> secondProduct = driver.findElements(By.id("product-2"));
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	
	
	map.put(1,"Blue Top");
	map.put(1,"Women > Tops");
	map.put(1,"Rs. 500");
	map.put(1,"1");
	map.put(1,"Rs. 500");
	
	map.put(2,"Men Tshirt");
	map.put(2,"Men > Tshirts");
	map.put(2,"Rs. 400");
	map.put(2,"1");
	map.put(2,"Rs. 400");
	
	for(int i=0;i<firstProduct.size();i++) {
		assertTrue(firstProduct.get(i).getText().contains(map.get(1)));
		assertTrue(secondProduct.get(i).getText().contains(map.get(2)));
		
		
				
	}
	
	
		}
		catch (Exception e) {
			System.out.println("Exception Caught "+ e.getMessage());
		}
		
		}


}
