package generic;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.relevantcodes.extentreports.ExtentReports;

/**
 * 
 * @author Yogita
 * 
 *
 */

public class Base_Test extends UtilityMethods{
	
	
	@BeforeSuite
	public void beforeSuit(){
		report=new ExtentReports(REPORTS_PATH+name()+".html");
		
	}
	
	@BeforeMethod
	public void setup(Method method) {
	    String testMethodName = method.getName();
	    test = report.startTest(testMethodName);
	}
	
	
	@BeforeClass(alwaysRun=true)
	public void browserSetup() throws Throwable {
		browserName= getValueProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_PATH);
			driver=new ChromeDriver();
			
			
		}else if(browserName.equalsIgnoreCase("firefox")) {


			System.setProperty(FIREFOX_KEY, FIREFOX_PATH);
			driver=new FirefoxDriver();
			
		}else {
			Reporter.log("Enter valid Browser name");
		}

		driver.manage().window().maximize();
		Reporter.log("Browser window is maximized successfully",true);
		//test.log(LogStatus.INFO, "Browser window is maximized successfully");
		driver.manage().timeouts().implicitlyWait(TIMEOUTS_WAIT,TimeUnit.SECONDS);
		explicitWait = new WebDriverWait(driver, TIMEOUTS_WAIT);
		
        URL=getValueProperty("URL");
        //test.log(LogStatus.INFO, "WebPage is displayed successfully");
		driver.get(URL);
		initObjects();
	}

	@AfterClass(alwaysRun=true)
	public void CloseApp() {
		//driver.quit();
		//test.log(LogStatus.INFO, "End Test");
	}
	
	@AfterSuite
	public void afterSuite() {
		report.endTest(test);
		report.flush();
	}
	
	


}
