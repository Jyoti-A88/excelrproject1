package testcases;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import testmtds.Testcase1;
import testmtds.Testcase2;
import testmtds.Ts3;
import testmtds.Tc4;
import testmtds.Tc5;
import testmtds.Tc6;
import testmtds.Tc7;
import testmtds.Tc8;
import testmtds.Tc9;
import testmtds.Tc10;
import testmtds.Tc11;
import testmtds.Tc12;
import testmtds.Tc13;
import testmtds.Tc14;
import testmtds.Tc15;
import testmtds.Tc16;
import testmtds.Tc17;
import testmtds.Tc18;
import testmtds.Tc19;
import testmtds.Tc20;
import testmtds.Tc21;
import testmtds.Tc22;
import testmtds.Tc23;
import testmtds.Tc24;
import testmtds.Tc25;
import testmtds.Tc26;

public class TS_1 {
	WebDriver driver;
	Testcase1 pagefactory;
	Testcase2 pagefactory1;
	Ts3 pagefactory2;
	Tc4 pagefactory4;
	Tc5 pagefactory5;
	Tc6 pagefactory6;
	Tc7 pagefactory7;
	Tc8 pagefactory8;
	Tc9 pagefactory9;
	Tc10 pagefactory10;
	Tc11 pagefactory11;
	Tc12 pagefactory12;
	Tc13 pagefactory13;
	Tc14 pagefactory14;
	Tc15 pagefactory15;
	Tc16 pagefactory16;
	Tc17 pagefactory17;
	Tc18 pagefactory18;
	Tc19 pagefactory19;
	Tc20 pagefactory20;
	Tc21 pagefactory21;
	Tc22 pagefactory22;
	Tc23 pagefactory23;
	Tc24 pagefactory24;
	Tc25 pagefactory25;
	Tc26 pagefactory26;

	@BeforeTest

	public void beforetest() {

		driver = new ChromeDriver();
		driver.get("http://automationexercise.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();

		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("C:\\Users\\user\\Downloads\\AdBlock-—-best-ad-blocker.crx"));
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		driver = new ChromeDriver(options);

	}

	@Test(priority = 1)
	public void loginpage() {
		pagefactory = new Testcase1(driver);
		pagefactory.loginPage("login");

	}

	@Test(priority = 2)
	public void loginpage1() {
		pagefactory1 = new Testcase2(driver);
		pagefactory1.validlogin("login");

	}

	@Test(priority = 3)
	public void loginpagenew() {
		pagefactory2 = new Ts3(driver);
		pagefactory2.invalidlogin("login");

	}

	@Test(priority = 4)
	public void logoutpage() {
		pagefactory4 = new Tc4(driver);
		pagefactory4.logout("logout");

	}

	@Test(priority = 5)
	public void existingUserCheck() {
		pagefactory5 = new Tc5(driver);
		pagefactory5.existingMail("logout");

	}

	@Test(priority = 6)
	public void clickContactUs() {
		pagefactory6 = new Tc6(driver);
		pagefactory6.contactUs("contact");
	}

	@Test(priority = 7)
	public void testcasepage() {
		pagefactory7 = new Tc7(driver);
		pagefactory7.testCases("testcasepage");

	}

	@Test(priority = 8)
	public void productDescr() {
		pagefactory8 = new Tc8(driver);
		pagefactory8.productDetails("product description");

	}

	@Test(priority = 9)
	public void search() {
		pagefactory9 = new Tc9(driver);
		pagefactory9.searchProduct("search");

	}

	@Test(priority = 10)
	public void subscribe() {
		pagefactory10 = new Tc10(driver);
		pagefactory10.subscription("subscribe");
	}

	@Test(priority = 11)
	public void subscribeCart() {
		pagefactory11 = new Tc11(driver);
		pagefactory11.subscriptionCart("subscribe");
	}

	@Test(priority = 12)
	public void add() {
		pagefactory12 = new Tc12(driver);
		pagefactory12.addProduct("subscribe");

	}

	@Test(priority = 13)
	public void view() {
		pagefactory13 = new Tc13(driver);
		pagefactory13.viewProduct(" view product description");
	}

	@Test(priority = 14)
	public void placeOrder() {
		pagefactory14 = new Tc14(driver);
		pagefactory14.placeOrder14("place order");

	}

	@Test(priority = 15)
	public void placeOrder1() {
		pagefactory15 = new Tc15(driver);
		pagefactory15.placeOrder15("place order");

	}

	@Test(priority = 16)
	public void placeOrder2() {
		pagefactory16 = new Tc16(driver);
		pagefactory16.placeOrder16("place order");

	}

	@Test(priority = 17)
	public void removeProd() {
		pagefactory17 = new Tc17(driver);
		pagefactory17.removeProduct("remove product");

	}

	@Test(priority = 18)
	public void category() {
		pagefactory18 = new Tc18(driver);
		pagefactory18.viewCategory("view category");

	}

	@Test(priority = 19)
	public void brands() {
		pagefactory19 = new Tc19(driver);
		pagefactory19.viewBrands("view brands");

	}

	@Test(priority = 20)
	public void saree() {
		pagefactory20 = new Tc20(driver);
		pagefactory20.searchProd("saree");

	}

	@Test(priority = 21)
	public void sareereview() {
		pagefactory21 = new Tc21(driver);
		pagefactory21.reviewProd("review");

	}

	@Test(priority = 22)
	public void rec() {
		pagefactory22 = new Tc22(driver);
		pagefactory22.recommendedProd("recommended items");

	}

	@Test(priority = 23)
	public void badd() {
		pagefactory23 = new Tc23(driver);
		pagefactory23.billingAddress("billing address");

	}

	@Test(priority = 24)
	public void downloadInvoice() {
		pagefactory24 = new Tc24(driver);
		pagefactory24.downloadInvoice("download Invoice");

	}

	@Test(priority = 25)
	public void scrollWithArrow() {
		pagefactory25 = new Tc25(driver);
		pagefactory25.scrollWithArrow("scroll with arrow");

	}

	@Test(priority = 26)
	public void scrollWithoutArrow() {
		pagefactory26 = new Tc26(driver);
		pagefactory26.scrollWithOutArrow("scroll without arrow");

	}

	@AfterTest
	public void afterTest() {
		driver.close();

	}

}
