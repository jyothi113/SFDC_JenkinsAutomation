package com.testing.SFDC_dev_Automation;

import org.openqa.selenium.By;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
public class AutomationScriptTest extends ReusableScript {
	
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
	
		
}
	
	
