package stepdefination;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.automationpractice.webpages.BrowserSetup;
import com.automationpractice.webpages.MyAccount;
import com.automationpractice.webpages.identity_page;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PersonalInformation 
{
	public static WebDriver driver;
	@When("User siginito account")
	public void user_siginito_account() 
	{ 
		this.driver=BrowserSetup.driver;
		MyAccount account =new MyAccount(driver);
		account.ClickOnSignin();
		account.ScrolltoEmail();
		account.EnterEmailID();
		account.EnterPassword();
		account.ClickonSignIninorder();
	}

	@Then("User Click on my personal information on My Account page")
	public void user_click_on_my_personal_information_on_my_account_page() {
		MyAccount account =new MyAccount(driver);
		
		account.ClickOnMyPersonalInformation();
	}

	@Then("User Enter details in key and value and save them")
	public void user_enter_details_in_key_and_value_and_save_them(DataTable credentials) {
		List<List<String>> data=credentials.asLists(String.class);
		String Firstname=data.get(0).get(1);
		String lastname=data.get(1).get(1);
		String Oldpassword=data.get(2).get(1);
		String newpassword=data.get(3).get(1);
		String confirmpassword=data.get(4).get(1);
		
		identity_page identity =new identity_page(driver);
		identity.EnterFirstName(Firstname);
		identity.Enterlastname(lastname);
		identity.EnterOldpassword(Oldpassword);
		identity.EnterNewPassowrd(newpassword);
		identity.Confirmationpassword(confirmpassword);
		identity.ClickonSave();
		
		BrowserSetup Browser=new BrowserSetup();
		Browser.Close_Browser();
		
	}

}
