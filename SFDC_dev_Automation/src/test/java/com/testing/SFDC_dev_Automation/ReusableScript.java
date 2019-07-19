package com.testing.SFDC_dev_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReusableScript {
	static WebDriver driver;
	static ExtentReports reports;
	
	static ExtentTest logger;
	{
	reports = new ExtentReports("C:\\Jyothi\\JAVA_programs\\SalesForceAuto_Test\\target\\test-classes\\com\\testing\\SalesForceAuto_Test");
	String path= "C:\\Jyothi\\JAVA_programs\\SalesForceAuto_Test\\target\\test-classes\\com\\testing\\SalesForceAuto_Test\\Salesforce.html";
	reports =new ExtentReports(path);
	}
	
	/*String fileName = new SimpleDateFormat("'SampleDemo_'yyyyMMddHHmm'.html'").format(new Date());
	String path = "C:\\Jyothi\\ExtentReport\\"+fileName;
	reports =new ExtentReports(path);
	 * 
	 */
	
	
	
	public static ExtentTest  CreateTestScriptReport(String TestScriptName){
		logger = reports.startTest(TestScriptName);
		return logger;
	}
	
	
	public static void initialize_driver() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Jyothi\\drivers\\chromedriver.exe");
		//WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		driver = new ChromeDriver();
	}
	
	public static void launchURL() {
		
		initialize_driver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		System.out.println("Salesforce application opened");
	}
	
	
	/*Name of the Method:enterText
	 * Brief Description : Enter text into text box
	 * Arguments :obj-- web object, text-- text to be entered, objname --Name of the object
	 * Created by :AutomationTeam
	 * CreationDate :July 15 2019
	 * LastModified : July 15 2019
	 */
		public static void enterText(WebElement obj, String text, String objName){
			if(obj.isEnabled()){
				obj.sendKeys(text);
				System.out.println("Pass:"+text+" is entered in "+objName+" field");
				logger.log(LogStatus.PASS, objName + "is selected");
			}else{
				System.out.println("Fail: "+objName +" field is not enabled, please check the application");
				logger.log(LogStatus.FAIL, objName + "field is not enabled, please check the application");
			}
		}
		
		/*Name of the Method : ClickButton
		 * Brief Description : Click the object
		 * Arguments :Button-- web object, objname --Name of the object
		 * Created by :AutomationTeam
		 * CreationDate :July 15 2019
		 * LastModified : July 15 2019
		 */
		
		public static void ClickButton(WebElement Button , String objName ){
			if(Button.isEnabled()){
				Button.click();
				System.out.println("Pass: "+objName+ "is clicked");
				logger.log(LogStatus.PASS, objName + "is clicked");
			}
			else{
				System.out.println("Fail "+objName+" is not enabled,please check the application");
				logger.log(LogStatus.FAIL, objName + "is not enabled,please check the application");
			}
		}
		
		/*Name of the Method : Check Box
		 * Brief Description : Click the object
		 * Arguments :checkbox-- web object, objname --Name of the object
		 * Created by :AutomationTeam
		 * CreationDate :July 15 2019
		 * LastModified : July 15 2019
		 */
		public static void selectCheckBox(WebElement checkbox,String objName){
			if(checkbox.isEnabled()){
				checkbox.click();
				System.out.println("Pass: "+ objName+ "is clicked");
				logger.log(LogStatus.PASS, objName + "is clicked");
			}else{
				System.out.println("fail "+objName+ "is not enabled");
				logger.log(LogStatus.FAIL, objName + "is not enabled,please check the application");
			}
		}
		
		/*Name of the Method : DeCheck Box
		 * Brief Description : Click the object
		 * Arguments :checkbox-- web object, objname --Name of the object
		 * Created by :AutomationTeam
		 * CreationDate :July 15 2019
		 * LastModified : July 15 2019
		 */
		public static void deSelectCheckBox(WebElement checkbox,String objName){
			if(checkbox.isEnabled()){
				checkbox.click();
				checkbox.click();
				System.out.println("Pass: "+ objName+ "is clicked");
				logger.log(LogStatus.PASS, objName + "is clicked");
			}else{
				System.out.println("fail "+objName+ "is not enabled");
				logger.log(LogStatus.FAIL, objName + "is not enabled,please check the application");
			}
		}
		
		/*Name of the Method : ValidateTextMessage
		 * Brief Description : Enter text into text box
		 * Arguments :obj-- web object, ExpectedMessage--displays text when username or password is wrong,
		 *  objname --Name of the object
		 * Created by :AutomationTeam
		 * CreationDate :July 15 2019
		 * LastModified : July 15 2019
		 */
		public static void validateTextMessage(WebElement obj,String expectedMessage,String objName){
			String actualMessage;
			if(obj.isEnabled()){
				actualMessage = obj.getText();
				if(actualMessage.equals(expectedMessage)){
					System.out.println("Pass with proper statement");
					logger.log(LogStatus.PASS, objName + "is proper statement ");
				}else{
					System.out.println("Expected Message is not matching with actual message");
					logger.log(LogStatus.FAIL, objName + "Expected Message is not matching with actual message");
				}
			}
		}
		
		/*Name of the Method : DropDown
		 * Brief Description : select from dropdown list
		 * Arguments :obj-- web object,objname --Name of the object
		 * Created by :AutomationTeam
		 * CreationDate :July 15 2019
		 * LastModified : July 15 2019
		 */
		
		public static void Dropdown(WebElement obj,String objName){
			if(obj.isEnabled()){
				if(obj.isSelected()){
					System.out.println("Pass"+objName+ "is selected");
					logger.log(LogStatus.PASS, objName + "is clicked");
				}else{
					obj.click();
					System.out.println("Pass: "+ objName+ "is clicked");
					logger.log(LogStatus.PASS, objName + "is clicked");
				}
				
				
			}else{
				System.out.println("fail "+objName+ "is not enabled");
				logger.log(LogStatus.FAIL, objName + "is not enabled");
			}
		}
	}



