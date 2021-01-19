package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.automationpractice.webpages.BrowserSetup;
import com.automationpractice.webpages.MyAccount;
import com.automationpractice.webpages.MyStore_Homepage;
import com.automationpractice.webpages.Order_Page;
import com.automationpractice.webpages.Tshirts_Page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class OrderTShirt
{ 
	public static WebDriver driver;
	@Given("User is on My Store page")
	public void user_is_on_my_store_page() 
	{
		BrowserSetup c=new BrowserSetup();
		c.browser_is_open();
		driver=BrowserSetup.driver;
	}

	@When("User Navigate to T-Shirts Page")
	public void user_navigate_to_t_shirts_page() throws InterruptedException 
	{
		MyStore_Homepage t =new MyStore_Homepage(driver);
		t.ClickonTshirt();
				
	}

	@Then("User Add T-shirt To cart")
	public void user_add_t_shirt_to_cart() throws InterruptedException
	{
		Tshirts_Page t1=new Tshirts_Page(driver);
		t1.ScrolltoTShirt();
		t1.MoveToTshirt();
		t1.ClickonAddTocart();
		t1.ClickonCheckOut();
	}

	@Then("User verify order History for T-Shirt")
	public void user_verify_order_history_for_t_shirt()
	{
		
		Order_Page Order =new Order_Page(driver);
		Order.ScrolltoProceedtocheckout();
		Order.Summary_Proceedtocheckout();
		MyAccount account=new MyAccount(driver);
		account.ScrolltoEmail();
		account.EnterEmailID();
		account.EnterPassword();
		account.ClickonSignIninorder();
		Order.ScrolltoProceedtocheckout();
		Order.Summary_Proceedtocheckout();
		Order.ScroltoCheckbox();
		Order.ShippingClickoncheckbox();
		Order.ClickonShippingcheckout();
		Order.ScrolltoPayBywire();
		Order.ClickonPayBywire();
		Order.ScrolltoConfirmorder();
		Order.ClickonConfirmorder();
		String Refrencenumber=Order.Clickontext();
		
		MyAccount m=new MyAccount(driver);
		m.clickonMyAccount();
		m.ClickOnOrderHistory();
		String OrderRefrence1=m.OrderRefrencetext();
		Assert.assertEquals(Refrencenumber, OrderRefrence1);
		
		BrowserSetup Browser=new BrowserSetup();
		Browser.Close_Browser();
		
	}

}
