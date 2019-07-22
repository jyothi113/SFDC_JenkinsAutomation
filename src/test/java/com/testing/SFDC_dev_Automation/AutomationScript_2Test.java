package com.testing.SFDC_dev_Automation;

import java.util.Set;

import org.openqa.selenium.By;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
public class AutomationScript_2Test extends ReusableScript {
	
	/*public static void main(String[] args) throws InterruptedException{
		initialize_driver();
		TC_02_Login();
		launchURL();
		TC_01_LoginErrorMessage();
		TC_03_RememberMe();
		TC_04A_ForgotPassword();
		TC_04B_ForgotPassword();
		ReusableScriptTest.reports.endTest(logger);
	}	*/
		
		
		@Test(priority=1)
		public static void TC_01_LoginErrorMessage(){
			CreateTestScriptReport("LoginErrorMessage");
			launchURL();
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			passWord.clear();
			
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
		}
		
		
		@Test(priority=2)
		public static void TC_02_Login(){
		CreateTestScriptReport("Login");
		
		launchURL();
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
		
		WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
		enterText(passWord, "Salesforce123*","PassWord" );
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
		ClickButton(loginButton,"Login");
	}
		
		@Test(priority=3)
		public static void TC_03_RememberMe() throws InterruptedException{
			CreateTestScriptReport("RemeberMe");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
			
			WebElement RemembermeCheckbox =driver.findElement(By.xpath("//input[@id='rememberUn']"));
			selectCheckBox(RemembermeCheckbox,"RememberMe");
			
			
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			
			
			WebElement UserMenudropdown = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
			Dropdown(UserMenudropdown,"userName");
			
			Thread.sleep(4000);
			//Actions UserNameLabellink = new Actions(driver);
			//UserNameLabellink.moveToElement(UserMenudropdown).build().perform();
			
			
			WebElement logOutButton = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
			ClickButton(logOutButton,"Logout");	
		}
		
		@Test(priority=4)
		public static void TC_04A_ForgotPassword() throws InterruptedException{
			CreateTestScriptReport("04A_ForgotPassword");
			
			launchURL();
			
			WebElement forgotPassWord = driver.findElement(By.xpath("//a[@id='forgot_password_link']"));
			ClickButton(forgotPassWord,"ForgotPassword");
			
			
			System.out.println("Salesforce Forgot Password page is displayed");
				
		
			WebElement UserNameinForgotPassword = driver.findElement(By.id("un"));
			enterText(UserNameinForgotPassword,"jyothi.t113-uv7d@force.com","email" );
				
				WebElement ContinueButton = driver.findElement(By.xpath("//input[@id='continue']"));
				ClickButton(ContinueButton,"Continue");
				System.out.println("Password Reset message is dispalyed and email is sent");
		}
		@Test(priority=5)
		public static void TC_04B_ForgotPassword(){
			CreateTestScriptReport("04B_ForgotPassword");
			
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "123","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "22131","PassWord" );
			
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
		}
		
		
		@Test(priority=6)
		public static void TC_05_UserMenuDropDown() throws InterruptedException{
			CreateTestScriptReport("TC_05_UserMenuDropDown");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
	
			WebElement UserMenudropdown = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
			Dropdown(UserMenudropdown,"userName");
			
			WebElement MyProfile = driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
			HighlightElement(MyProfile,"MyProfile");
			
			WebElement MySettings = driver.findElement(By.xpath("//a[contains(text(),'My Settings')]"));
			HighlightElement(MySettings,"MySettings");

			WebElement DeveloperConsole = driver.findElement(By.xpath("//a[@class='debugLogLink menuButtonMenuLink']"));
			HighlightElement(DeveloperConsole,"DeveloperConsole");
			
			WebElement Logout = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
			HighlightElement(Logout,"Logout");
			
		}
		
		

		@Test(priority=8)
		public static void TC_07_MySettings() throws InterruptedException{
			CreateTestScriptReport("TC_07_MySettings");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
	
			WebElement UserMenudropdown = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
			Dropdown(UserMenudropdown,"userName");
			
			WebElement MySettings = driver.findElement(By.xpath("//a[contains(text(),'My Settings')]"));
			ClickButton(MySettings,"MySettings");
			Thread.sleep(2000);
	
			WebElement Personallink = driver.findElement(By.xpath("//div[@id='PersonalInfo']//a[@class='header setupFolder']"));
			ClickButton(Personallink,"Personallink");
			
			WebElement LoginHistory = driver.findElement(By.xpath("//span[@id='LoginHistory_font']"));
			ClickButton(LoginHistory,"LoginHistory");

			WebElement DownloadLoginHistory = driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]"));
			ClickButton(DownloadLoginHistory,"DownloadLoginHistory");
			
			WebElement DisplayLayout = driver.findElement(By.xpath("//span[@id='DisplayAndLayout_font']"));
			ClickButton(DisplayLayout,"DisplayLayout");
			
			WebElement CustomizeMyTabs = driver.findElement(By.xpath("//span[@id='CustomizeTabs_font']"));
			ClickButton(CustomizeMyTabs,"CustomizeMyTabs");
	
			WebElement CustomApp = driver.findElement(By.id("p4"));
			Thread.sleep(3000);
			SelectFromList(CustomApp,"Salesforce Chatter","CustomApp");
			
			
			WebElement reports = driver.findElement(By.xpath("//option[contains(text(),'Reports')]"));
			ClickButton(reports,"reports");
			
			WebElement AddButton = driver.findElement(By.xpath("//img[@class='rightArrowIcon']"));
			ClickButton(AddButton,"AddButton");
			
			WebElement Email = driver.findElement(By.xpath("//div[@id='EmailSetup']//a[@class='header setupFolder']"));
			ClickButton(Email,"Email");
			
			WebElement MyEmailSettings = driver.findElement(By.xpath("//a[@id='EmailSettings_font']"));
			ClickButton(MyEmailSettings,"MyEmailSettings");
			
			WebElement salesForceradiobutton = driver.findElement(By.xpath("//input[@id='use_external_email1']"));
			ClickButton(salesForceradiobutton,"salesForceradiobutton");
			
			WebElement EmailName = driver.findElement(By.xpath("//input[@id='sender_name']"));
			ClearText(EmailName,"EmailName");
			enterText(EmailName, "Jyothi","EmailName" );
			
			WebElement EmailAddress = driver.findElement(By.xpath("//input[@id='sender_email']"));
			ClearText(EmailAddress,"EmailAddress");	
			enterText(EmailAddress, "jyothi.t113-uv7d@force.com","EmailAddress" );
			
			WebElement AutomaticBCCradiobutton = driver.findElement(By.xpath("//input[@id='auto_bcc1']"));
			ClickButton(AutomaticBCCradiobutton,"AutomaticBCCradiobutton");
			
			
			WebElement Savebutton = driver.findElement(By.xpath("//input[@name='save']"));
			ClickButton(Savebutton,"Savebutton");
			
			WebElement calendersandReminders = driver.findElement(By.xpath("//span[@id='CalendarAndReminders_font']"));
			ClickButton(calendersandReminders,"calendersandReminders");
			
			WebElement Reminderslink = driver.findElement(By.xpath("//span[@id='Reminders_font']"));
			ClickButton(Reminderslink,"Reminderslink");
			
			
			WebElement RemindersButton = driver.findElement(By.xpath("//input[@id='testbtn']"));
			ClickButton(RemindersButton,"RemindersButton");
			
			Thread.sleep(5000);
			quit();
			
		}
		
		@Test(priority=9)
		public static void TC_08_DevelopersConsole() throws InterruptedException{
			CreateTestScriptReport("TC_08_DevelopersConsole");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
	
			WebElement UserMenudropdown = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
			Dropdown(UserMenudropdown,"userName");
			
			WebElement DeveloperConsole = driver.findElement(By.xpath("//a[@class='debugLogLink menuButtonMenuLink']"));
			ClickButton(DeveloperConsole,"DeveloperConsole");
			String parentWindow = driver.getWindowHandle();
			Set<String> handles = driver.getWindowHandles();
			for(String childWindow : handles){
				if(!childWindow.equals(parentWindow))
				{
					driver.switchTo().window(childWindow);
					driver.close();
				}
			}
			driver.switchTo().window(parentWindow);
			
			
		}
	
		@Test(priority=10)
		public static void TC_09_LogOut() throws InterruptedException{
			CreateTestScriptReport("TC_09_LogOut");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
	
			WebElement UserMenudropdown = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
			Dropdown(UserMenudropdown,"userName");
			
			WebElement LogoutOption = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
			ClickButton(LogoutOption,"LogoutOption");
			Thread.sleep(3000);
		}
		
		@Test(priority=11)
		public static void TC_10_CreateAccount() throws InterruptedException{
			CreateTestScriptReport("TC_10_CreateAccount");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			WebElement Accounts = driver.findElement(By.xpath("//li[@id='Account_Tab']//a[contains(text(),'Accounts')]"));
			ClickButton(Accounts,"Accounts");
		
			WebElement AccountsNewTab = driver.findElement(By.xpath("//input[@name='new']"));
			ClickButton(AccountsNewTab,"AccountsNewTab");
			
			WebElement NewTabAccountName = driver.findElement(By.xpath("//input[@id='acc2']"));
			enterText(NewTabAccountName, "Jyo","NewTabAccountName" );
			
			Thread.sleep(2000);
			WebElement SaveTab = driver.findElement(By.xpath("//div[contains(@class,'pbHeader')]//input[1]"));
			ClickButton(SaveTab,"SaveTab");
		}
		
		@Test(priority=12)
		public static void TC_11_CreateNewView() throws InterruptedException{
			CreateTestScriptReport("TC_11_CreateNewView");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			WebElement Accounts = driver.findElement(By.xpath("//li[@id='Account_Tab']//a[contains(text(),'Accounts')]"));
			ClickButton(Accounts,"Accounts");
			
			WebElement CreateNewViewLink = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
			ClickButton(CreateNewViewLink,"CreateNewViewLink");
			
			Thread.sleep(3000);
			WebElement ViewName = driver.findElement(By.xpath("//input[@id='fname']"));
			enterText(ViewName, "abc","ViewName" );
			Thread.sleep(2000);
			
			WebElement ViewUniqueName = driver.findElement(By.xpath("//input[@id='devname']"));
			enterText(ViewUniqueName, "1234","ViewUniqueName" );
			
			Thread.sleep(2000);
			
			WebElement SaveTab = driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']"));
			ClickButton(SaveTab,"SaveTab");
	
		}
		
		
}
	
	
