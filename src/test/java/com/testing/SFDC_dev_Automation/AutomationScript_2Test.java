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
			enterText(EmailAddress, "jyothi.t113@force.com","EmailAddress" );
			
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
		
		@Test(priority=13)
		public static void TC_12_EditView() throws InterruptedException{
			CreateTestScriptReport("TC_12_EditView");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			WebElement Accounts = driver.findElement(By.xpath("//li[@id='Account_Tab']//a[contains(text(),'Accounts')]"));
			ClickButton(Accounts,"Accounts");
			
			WebElement View =driver.findElement(By.xpath("//select[@id='fcf']"));
			SelectFromList(View,"joe","View");
			
			Thread.sleep(2000);
			WebElement viewEdit =driver.findElement(By.xpath("//a[contains(text(),'Edit')]"));
			ClickLink(viewEdit,"viewEdit");
			
			WebElement NewViewName =driver.findElement(By.xpath("//input[@id='fname']"));
			enterText(NewViewName, "Joee","NewViewName" );
			
			
			WebElement fieldFilter =driver.findElement(By.xpath("//select[@id='fcol1']"));
			SelectFromList(fieldFilter,"Account Name","fieldFilter");
			
			
			Thread.sleep(2000);
			
			WebElement OperatorFilter =driver.findElement(By.xpath("//select[@id='fop1']"));
			SelectFromList(OperatorFilter,"contains","OperatorFilter");
		
			WebElement ValueFilter =driver.findElement(By.xpath("//input[@id='fval1']"));
			enterText(ValueFilter, "a","ValueFilter" );
			
			Thread.sleep(3000);
			
			WebElement LastActivity =driver.findElement(By.xpath("//select[@id='colselector_select_0']//option[contains(text(),'Last Activity')]"));
			ClickButton(LastActivity,"LastActivity");
			
			Thread.sleep(2000);
			
			WebElement AddButton =driver.findElement(By.xpath("//img[@class='rightArrowIcon']"));
			ClickButton(AddButton,"AddButton");
			
			//WebElement SaveButton =driver.findElement(By.xpath(""));
			//SaveButton.click();
			
		
		}
		
		@Test(priority=14)
		public static void TC_13_MergeAccounts() throws InterruptedException{
			CreateTestScriptReport("TC_13_MergeAccounts");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			WebElement Accounts = driver.findElement(By.xpath("//li[@id='Account_Tab']//a[contains(text(),'Accounts')]"));
			ClickButton(Accounts,"Accounts");
			
			Thread.sleep(2000);
			WebElement MergeAccountsLink = driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"));
			ClickLink(MergeAccountsLink,"MergeAccountsLink");
			
			WebElement MergeAccountsTextbox = driver.findElement(By.xpath("//input[@id='srch']"));
			enterText(MergeAccountsTextbox, "Jyo","MergeAccountsTextbox" );
			
			WebElement FindAccountsButton = driver.findElement(By.xpath("//input[@name='srchbutton']"));
			ClickButton(FindAccountsButton,"FindAccountsButton");
			WebElement decheck3 = driver.findElement(By.xpath("//input[@id='cid2']"));
			deSelectCheckBox(decheck3,"decheck3");
			
			WebElement Next = driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='goNext']"));
			ClickButton(Next,"Next");
			
			WebElement Merge = driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']"));
			ClickButton(Merge,"Merge");
			driver.switchTo().alert().accept();
		}
			
		
		@Test(priority=15)
		public static void TC_14_AccountReport() throws InterruptedException{
			CreateTestScriptReport("TC_14_AccountReport");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			WebElement Accounts = driver.findElement(By.xpath("//li[@id='Account_Tab']//a[contains(text(),'Accounts')]"));
			ClickButton(Accounts,"Accounts");
			
			WebElement AccountswithLastActivityLink = driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]"));
			ClickButton(AccountswithLastActivityLink,"AccountswithLastActivityLink");
		
			WebElement DAtefielddropdown = driver.findElement(By.xpath("//img[@id='ext-gen148']"));
			ClickButton(DAtefielddropdown,"DAtefielddropdown");
			
			WebElement createDAtedropdown = driver.findElement(By.xpath("//div[contains(text(),'Created Date')]"));
			ClickButton(createDAtedropdown,"createDAtedropdown");
			
			WebElement createDAteFrom = driver.findElement(By.xpath("//img[@id='ext-gen152']"));
			ClickImage(createDAteFrom,"createDAteFrom");
			
			
			WebElement createDAteFromToday = driver.findElement(By.xpath("//button[text()='Today']"));
			ClickButton(createDAteFromToday,"createDAteFromToday");
			
			WebElement createDAteTo = driver.findElement(By.xpath("//img[@id='ext-gen154']"));
			ClickImage(createDAteTo,"createDAteTo");
			
			WebElement createDAteToToday = driver.findElement(By.xpath("(//button[text()='Today'])[2]"));
			ClickButton(createDAteToToday,"createDAteToToday");
			
			
			WebElement saveButton = driver.findElement(By.xpath("//button[@id='ext-gen49']"));
			ClickButton(saveButton,"saveButton");
			Thread.sleep(3000);
			
			WebElement PopupReportName = driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']"));
			enterText(PopupReportName, "Pravin","PopupReportName" );
			
			
			WebElement PopupReportUniqueName = driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']"));
			ClearText(PopupReportUniqueName,"PopupReportUniqueName");
			enterText(PopupReportUniqueName, "1234","PopupReportUniqueName" );
			
			Thread.sleep(5000);
			WebElement PopupsaveandRunReportButton = driver.findElement(By.xpath("//table[@id='dlgSaveAndRun']//td[@class='x-btn-mc']"));
			ClickButton(PopupsaveandRunReportButton,"PopupsaveandRunReportButton");
			
		}
		

		@Test(priority=16)
		public static void TC_15_Opportunities() throws InterruptedException{
			CreateTestScriptReport("TC_15_Opportunities");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			
			WebElement oppurtunities = driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]"));
			ClickButton(oppurtunities,"oppurtunities");
			
			Thread.sleep(2000);
			WebElement oppurtunitiesdropdown = driver.findElement(By.xpath("//select[@id='fcf']"));
			ClickButton(oppurtunitiesdropdown,"oppurtunitiesdropdown");
			
			Thread.sleep(2000);
			quit();
		}
		
		@Test(priority=17)
		public static void TC_16_Opportunities() throws InterruptedException{
			CreateTestScriptReport("TC_16_Opportunities");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			
			WebElement oppurtunities = driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]"));
			ClickButton(oppurtunities,"oppurtunities");

			
			WebElement oppurtunitiesNewButton = driver.findElement(By.xpath("//input[@name='new']"));
			ClickButton(oppurtunitiesNewButton,"oppurtunitiesNewButton");
			
			WebElement oppurtunitiesName = driver.findElement(By.xpath("//input[@id='opp3']"));
			enterText(oppurtunitiesName, "sampleOpp","oppurtunitiesName" );
			
			WebElement AccountName = driver.findElement(By.xpath("//input[@id='opp4']"));
			enterText(AccountName, "Jyo","AccountName" );
			
			WebElement closeDate = driver.findElement(By.xpath("//input[@id='opp9']"));
			ClickButton(closeDate,"closeDate");
			
			WebElement closeDateToday = driver.findElement(By.xpath("//a[@class='calToday']"));
			ClickLink(closeDateToday,"closeDateToday");
			
			
			WebElement stage = driver.findElement(By.xpath("//select[@id='opp11']"));
			SelectFromList(stage,"Proposal/Price Quote","stage");
			
			WebElement LeadSource = driver.findElement(By.xpath("//select[@id='opp6']"));
			SelectFromList(LeadSource,"Web","LeadSource");
			
			//WebElement PrimaryCampaignsource = driver.findElement(By.xpath("//input[@id='opp17']"));
			//PrimaryCampaignsource.sendKeys("Website");
			
			WebElement saveButton = driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']"));
			ClickButton(saveButton,"saveButton");
			
		}
		
		@Test(priority=18)
		public static void TC_17_Opportunity_pipeline() throws InterruptedException{
			CreateTestScriptReport("TC_17_Opportunity_pipeline");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			
			WebElement oppurtunities = driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]"));
			ClickButton(oppurtunities,"oppurtunities");


			WebElement oppurtunitiesPipelinelink = driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]"));
			ClickButton(oppurtunitiesPipelinelink,"oppurtunitiesPipelinelink");
			
			Thread.sleep(2000);
			
			quit();
			}
		
		@Test(priority=19)
		public static void TC_18_Opportunity_StuckLink() throws InterruptedException{
			CreateTestScriptReport("TC_18_Opportunity_StuckLink");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			
			WebElement oppurtunities = driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]"));
			ClickButton(oppurtunities,"oppurtunities");

			WebElement Stuckoppurtunities = driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]"));
			ClickButton(Stuckoppurtunities,"Stuckoppurtunities");
			
			Thread.sleep(2000);
			quit();
		}
		
		@Test(priority=20)
		public static void TC_19_OppSummaryReport() throws InterruptedException{
			CreateTestScriptReport("TC_18_Opportunity_StuckLink");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			
			WebElement oppurtunities = driver.findElement(By.xpath("//a[contains(text(),'Opportunities')]"));
			ClickButton(oppurtunities,"oppurtunities");
			
			
			WebElement QSInterval = driver.findElement(By.xpath("//select[@id='quarter_q']"));
			//SelectFromList(QSInterval,"Current FQ","QSInterval");
			SelectFromList(QSInterval,"Next FQ","QSInterval");
			//SelectFromList(QSInterval,"Current and Next FQ","QSInterval");
		
			
			WebElement QSInclude = driver.findElement(By.xpath("//select[@id='open']"));
			SelectFromList(QSInclude,"Open Opportunities","QSInclude");
			//SelectFromList(QSInclude,"All Opportunities","QSInclude");
			//SelectFromList(QSInclude,"Closed Opportunities","QSInclude");
			
			WebElement RunReport = driver.findElement(By.xpath("//table[@class='opportunitySummary']//input[@name='go']"));
			ClickButton(RunReport,"RunReport");
		}

		@Test(priority=21)
		public static void TC_20_LeadsTab() throws InterruptedException{
			CreateTestScriptReport("TC_20_LeadsTab");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			
			WebElement LeadsTab = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
			ClickButton(LeadsTab,"LeadsTab");
			
			WebElement UserMenuDropdown = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
			ClickButton(UserMenuDropdown,"UserMenuDropdown");
			
			WebElement LogoutOption = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
			ClickButton(LogoutOption,"LogoutOption");
			quit();
		}
		
		
		@Test(priority=22)
		public static void TC_21_LeadsSelectView() throws InterruptedException{
			CreateTestScriptReport("TC_21_LeadsSelectView");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			
			WebElement LeadsTab = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
			ClickButton(LeadsTab,"LeadsTab");
			
			WebElement LeadsViewDropdown = driver.findElement(By.xpath("//select[@id='fcf']"));
			ClickButton(LeadsViewDropdown,"LeadsViewDropdown");
		
			WebElement UserMenuDropdown = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
			ClickButton(UserMenuDropdown,"UserMenuDropdown");
			
			WebElement LogoutOption = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
			ClickButton(LogoutOption,"LogoutOption");
			quit();
		}
		
		@Test(priority=23)
		public static void TC_22_GoFunctionality() throws InterruptedException{
			CreateTestScriptReport("TC_22_GoFunctionality");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			
			WebElement LeadsTab = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
			ClickButton(LeadsTab,"LeadsTab");

			
			WebElement LeadsView = driver.findElement(By.xpath("//select[@id='fcf']"));
			SelectFromList(LeadsView,"Today's Leads","LeadsView");
			
			WebElement UserMenuDropdown = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
			ClickButton(UserMenuDropdown,"UserMenuDropdown");
			
			WebElement LogoutOption = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
			ClickButton(LogoutOption,"LogoutOption");
			
			Thread.sleep(7000);
			
			WebElement userName1 = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName1, "jyothi.t113-uv7d@force.com","UserName1" );
		
			WebElement passWord1 =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord1, "Salesforce123*","passWord1" );
			
			WebElement loginButton1 = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton1,"loginButton1");
			
			Thread.sleep(2000);
			
			WebElement LeadsTab1 = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
			ClickButton(LeadsTab1,"LeadsTab1");
		
			WebElement GoButton = driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']"));
			ClickButton(GoButton,"GoButton");
			Thread.sleep(4000);
			
			WebElement UserMenuDropdown1 = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
			ClickButton(UserMenuDropdown1,"UserMenuDropdown1");
		
			WebElement LogoutOption1 = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
			ClickButton(LogoutOption1,"LogoutOption1");
			
			quit();
		
		}

		@Test(priority=24)
		public static void TC_23_ListItemTodaysLead() throws InterruptedException{
			CreateTestScriptReport("TC_23_ListItemTodaysLead");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			
			WebElement LeadsTab = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
			ClickButton(LeadsTab,"LeadsTab");

			WebElement LeadsView = driver.findElement(By.xpath("//select[@id='fcf']"));
			SelectFromList(LeadsView,"Today's Leads","LeadsView");
			
			WebElement UserMenuDropdown = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
			ClickButton(UserMenuDropdown,"UserMenuDropdown");
			
			WebElement LogoutOption = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
			ClickButton(LogoutOption,"LogoutOption");
			Thread.sleep(4000);
			quit();
		}
		
		@Test(priority=25)
		public static void TC_24_NewButtonLeadsPage() throws InterruptedException{
			CreateTestScriptReport("TC_24_NewButtonLeadsPage");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			
			WebElement LeadsTab = driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
			ClickButton(LeadsTab,"LeadsTab");
			
			WebElement NewButton = driver.findElement(By.xpath("//input[@name='new']"));
			ClickButton(NewButton,"NewButton");
			
			WebElement LastName = driver.findElement(By.xpath("//input[@id='name_lastlea2']"));
			enterText(LastName, "ABCD","LastName" );
			
			WebElement CompanyName = driver.findElement(By.xpath("//input[@id='lea3']"));
			enterText(CompanyName, "ABCD","CompanyName" );
			
			WebElement SaveButton = driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']"));
			ClickButton(SaveButton,"SaveButton");
		
			WebElement UserMenuDropdown = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
			Thread.sleep(3000);
			ClickButton(UserMenuDropdown,"UserMenuDropdown");
			
			WebElement LogoutOption = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
			Thread.sleep(3000);
			ClickButton(LogoutOption,"LogoutOption");
			Thread.sleep(5000);
			quit();
		}

		@Test(priority=26)
		public static void TC_25_CreateNewContact() throws InterruptedException{
			CreateTestScriptReport("TC_25_CreateNewContact");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			
			Thread.sleep(2000);
			WebElement ContactTab = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
			ClickButton(ContactTab,"ContactTab");
			
			WebElement NewButton = driver.findElement(By.xpath("//input[@name='new']"));
			ClickButton(NewButton,"NewButton");
			
			WebElement LastName = driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
			enterText(LastName, "abc","LastName" );
			
			WebElement AccountName = driver.findElement(By.xpath("//input[@id='con4']"));
			enterText(AccountName, "Jyo","AccountName" );
			
			WebElement saveButton = driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']"));
			ClickButton(saveButton,"saveButton");
			
			Thread.sleep(3000);
		}


		@Test(priority=27)
		public static void TC_26_ContactNewView() throws InterruptedException{
			CreateTestScriptReport("TC_26_ContactNewView");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			
			Thread.sleep(2000);
			WebElement ContactTab = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
			ClickButton(ContactTab,"ContactTab");

			WebElement CreateNewViewLink = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
			ClickButton(CreateNewViewLink,"CreateNewViewLink");
			
			WebElement ViewName = driver.findElement(By.xpath("//input[@id='fname']"));
			enterText(ViewName, "joe","ViewName" );
			
			WebElement UniqueViewName = driver.findElement(By.xpath("//input[@id='devname']"));
			enterText(UniqueViewName, "12","UniqueViewName" );
			
			WebElement saveButton = driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']"));
			ClickButton(saveButton,"saveButton");
			
			Thread.sleep(2000);

		}

		@Test(priority=28)
		public static void TC_27_RecentlyCreated() throws InterruptedException{
			CreateTestScriptReport("TC_27_RecentlyCreated");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			
			Thread.sleep(2000);
			WebElement ContactTab = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
			ClickButton(ContactTab,"ContactTab");
			
			WebElement RecentlyCreated = driver.findElement(By.xpath("//select[@id='hotlist_mode']"));
			SelectFromList(RecentlyCreated,"Recently Created","RecentlyCreated");
			Thread.sleep(4000);
		}
		

		@Test(priority=29)
		public static void TC_28_MyContacts() throws InterruptedException{
			CreateTestScriptReport("TC_28_MyContacts");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			
			Thread.sleep(2000);
			WebElement ContactTab = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
			ClickButton(ContactTab,"ContactTab");
			
			WebElement view = driver.findElement(By.xpath("//select[@id='fcf']"));
			SelectFromList(view,"My Contacts","view");
			Thread.sleep(4000);
		}
		
		@Test(priority=30)
		public static void TC_29_ViewContact() throws InterruptedException{
			CreateTestScriptReport("TC_29_ViewContact");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			
			Thread.sleep(2000);
			WebElement ContactTab = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
			ClickButton(ContactTab,"ContactTab");
			
			WebElement ContactName = driver.findElement(By.xpath("//a[contains(text(),'Stamos (Sample), Jennifer')]"));
			ClickButton(ContactName,"ContactName");
		}
		
		@Test(priority=31)
		public static void TC_30_CheckErrorMessage() throws InterruptedException{
			CreateTestScriptReport("TC_30_CheckErrorMessage");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			

			Thread.sleep(2000);
			WebElement Homepage = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
			ClickButton(Homepage,"Homepage");
			
			WebElement ContactTab = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
			ClickButton(ContactTab,"ContactTab");
			
			WebElement CreateNewViewHyperLink = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
			ClickLink(CreateNewViewHyperLink,"CreateNewViewHyperLink");
			
			WebElement ViewName = driver.findElement(By.xpath("//input[@id='fname']"));
			ClearText(ViewName,"ViewName");
			
			WebElement UniqueViewName = driver.findElement(By.xpath("//input[@id='devname']"));
			enterText(UniqueViewName, "EFGHI","UniqueViewName" );
			
			WebElement saveButon = driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='save']"));
			ClickButton(saveButon,"saveButon");
		
		}
		@Test(priority=32)
		public static void TC_31_CancelButton() throws InterruptedException{
			CreateTestScriptReport("TC_31_CancelButton");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			

			Thread.sleep(2000);
			WebElement Homepage = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
			ClickButton(Homepage,"Homepage");
			
			WebElement ContactTab = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
			ClickButton(ContactTab,"ContactTab");
			
			WebElement CreateNewViewHyperLink = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
			ClickLink(CreateNewViewHyperLink,"CreateNewViewHyperLink");
			
			WebElement ViewName = driver.findElement(By.xpath("//input[@id='fname']"));
			enterText(ViewName, "ABCDE","ViewName" );
			
			WebElement UniqueViewName = driver.findElement(By.xpath("//input[@id='devname']"));
			enterText(UniqueViewName, "EFGHIJ","UniqueViewName" );
			
			WebElement CancelButton = driver.findElement(By.xpath("//div[@class='pbHeader']//input[@name='cancel']"));
			ClickButton(CancelButton,"CancelButton");
		}
		
		@Test(priority=33)
		public static void TC_32_SaveandNewButton() throws InterruptedException{
			CreateTestScriptReport("TC_32_SaveandNewButton");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			

			Thread.sleep(2000);
			WebElement Homepage = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
			ClickButton(Homepage,"Homepage");
			
			WebElement ContactTab = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
			ClickButton(ContactTab,"ContactTab");
			
			WebElement NewButton = driver.findElement(By.xpath("//input[@name='new']"));
			ClickButton(NewButton,"NewButton");
			
			WebElement LastName = driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
			enterText(LastName, "Indian","LastName" );
			
			WebElement AccountName = driver.findElement(By.xpath("//input[@id='con4']"));
			enterText(AccountName, "Global Media","AccountName" );
			
			WebElement SaveandNewButton = driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save_new']"));
			ClickButton(SaveandNewButton,"SaveandNewButton");
		
		}
		@Test(priority=34)
		public static void TC_33_VerifyFirstandLastName() throws InterruptedException{
			CreateTestScriptReport("TC_33_VerifyFirstandLastName");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			
			WebElement Namelink = driver.findElement(By.xpath("//h1[@class='currentStatusUserName']//a[contains(text(),'Jyothi T')]"));
			ClickButton(Namelink,"Namelink");
			Thread.sleep(2000);
			
			WebElement UserMenuDropdown = driver.findElement(By.xpath("//span[@id='userNavLabel']"));	
			Thread.sleep(3000);
			ClickButton(UserMenuDropdown,"UserMenuDropdown");
	
			WebElement myProfileOption = driver.findElement(By.xpath("//a[contains(text(),'My Profile')]"));
			ClickButton(myProfileOption,"myProfileOption");
		}
			
		@Test(priority=36)
		public static void TC_35_TabCustomization() throws InterruptedException{
			CreateTestScriptReport("TC_35_TabCustomization");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			

			WebElement PlusTab = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
			ClickButton(PlusTab,"PlusTab");
			Thread.sleep(2000);
			WebElement CustomizeMyTabs = driver.findElement(By.xpath("//input[@name='customize']"));
			ClickButton(CustomizeMyTabs,"CustomizeMyTabs");
			Thread.sleep(3000);
			WebElement Quotes = driver.findElement(By.xpath("//option[contains(text(),'Quotes')]"));
			ClickButton(Quotes,"Quotes");
			Thread.sleep(2000);
			WebElement RemoveButton = driver.findElement(By.xpath("//img[@class='leftArrowIcon']"));
			ClickButton(RemoveButton,"RemoveButton");
			Thread.sleep(5000);
			
			WebElement SaveButton = driver.findElement(By.xpath("//input[@name='save']"));
			ClickButton(SaveButton,"SaveButton");
			System.out.println("Removed Quotes from tabs");
			
			WebElement UserMenuDropdown = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
			
			Thread.sleep(3000);
			ClickButton(UserMenuDropdown,"UserMenuDropdown");
			
			WebElement LogoutOption = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
			
			Thread.sleep(3000);
			ClickButton(LogoutOption,"LogoutOption");
			
			System.out.println("Logout Successful");
			Thread.sleep(6000);
			
			WebElement userName1 = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName1, "jyothi.t113-uv7d@force.com","userName1" );
			
			System.out.println("Username Entered");
			
			WebElement passWord1 =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord1, "Salesforce123*","PassWord1" );
			
			
			WebElement loginButton1 = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton1,"loginButton1");
		}
		@Test(priority=37)
		public static void TC_36_BlockingEvent() throws InterruptedException{
			CreateTestScriptReport("TC_36_BlockingEvent");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			

			Thread.sleep(2000);
			WebElement Homepage = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
			ClickButton(Homepage,"Homepage");
			
			WebElement CurrentDateLink = driver.findElement(By.xpath("//a[contains(text(),'Friday July 12, 2019')]"));
			ClickLink(CurrentDateLink,"CurrentDateLink");
			Thread.sleep(2000);
			
			WebElement EightPMLink = driver.findElement(By.xpath("//a[contains(text(),'8:00 PM')]"));
			ClickLink(EightPMLink,"EightPMLink");
			Thread.sleep(3000);
			
			WebElement SubjectComboIcon = driver.findElement(By.xpath("//img[@class='comboboxIcon']"));
			ClickButton(SubjectComboIcon,"SubjectComboIcon");
			Thread.sleep(4000);
			
			WebElement NinePMDropDown = driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
			ClickButton(NinePMDropDown,"NinePMDropDown");
			
			WebElement SaveButton = driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@name='save']"));
			ClickButton(SaveButton,"SaveButton");
			
		}
		
		@Test(priority=38)
		public static void TC_37_BlockingEventWeekly() throws InterruptedException{
			CreateTestScriptReport("TC_37_BlockingEventWeekly");
			launchURL();
			
			WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
			enterText(userName, "jyothi.t113-uv7d@force.com","UserName" );
			
			WebElement passWord =driver.findElement(By.xpath("//input[@id='password']"));
			enterText(passWord, "Salesforce123*","PassWord" );
	
			WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));
			ClickButton(loginButton,"Login");
			

			Thread.sleep(2000);
			WebElement Homepage = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
			ClickButton(Homepage,"Homepage");
			
			WebElement CurrentDateLink = driver.findElement(By.xpath("//a[contains(text(),'Friday July 12, 2019')]"));
			ClickLink(CurrentDateLink,"CurrentDateLink");
			Thread.sleep(2000);
			
			WebElement FourPMLink = driver.findElement(By.xpath("//a[contains(text(),'4:00 PM')]"));
			ClickLink(FourPMLink,"FourPMLink");
			
			WebElement SubjectComboIcon = driver.findElement(By.xpath("//img[@class='comboboxIcon']"));
			ClickImage(SubjectComboIcon,"SubjectComboIcon");
			Thread.sleep(4000);
			
			WebElement other = driver.findElement(By.xpath("//a[contains(text(),'Other')]"));
			ClickLink(other,"other");
			
			WebElement SevenPMDropDown = driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
			ClickButton(SevenPMDropDown,"SevenPMDropDown");
			
			WebElement RecurranceCheckBox = driver.findElement(By.xpath("//input[@id='IsRecurrence']"));
			selectCheckBox(RecurranceCheckBox,"RecurranceCheckBox");
			Thread.sleep(2000);
			
			WebElement WeeklyRadioButton = driver.findElement(By.xpath("//input[@id='rectypeftw']"));
			ClickButton(WeeklyRadioButton,"WeeklyRadioButton");
			Thread.sleep(2000);
			
			WebElement EndDate = driver.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']"));
			ClickButton(EndDate,"EndDate");
			
			WebElement TwoWeeksEndDate = driver.findElement(By.xpath("//tr[@id='calRow2']//td[@class='weekday'][contains(text(),'5')]"));
			ClickButton(TwoWeeksEndDate,"TwoWeeksEndDate");
			Thread.sleep(2000);
			WebElement SaveButton = driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@name='save']"));
			ClickButton(SaveButton,"SaveButton");
			Thread.sleep(2000);
			WebElement MonthViewIcon = driver.findElement(By.xpath("//img[@class='monthViewIcon']"));
			ClickImage(MonthViewIcon,"MonthViewIcon");
			
			
		}
		
}
	
	
