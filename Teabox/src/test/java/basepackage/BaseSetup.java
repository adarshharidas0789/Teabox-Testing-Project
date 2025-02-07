package basepackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseSetup{
	
	
public static  WebDriver driver;
public static ExtentSparkReporter htmlReporter;
public static ExtentReports reports;
public static ExtentTest test;
//CODE FOR CROSS BROWSER TESTING
/*public static WebDriver driver;

public static ExtentSparkReporter htmlReporter;
public static ExtentReports reports;
public static ExtentTest test;

@Parameters("browser")
@BeforeTest
public void DriverUrlSetup(String browser) 
{

    if (browser.equalsIgnoreCase("chrome")) 
    {
        driver = new ChromeDriver();
    } 
    else if (browser.equalsIgnoreCase("edge")) 
    {
        driver = new EdgeDriver();
    }
    driver.manage().window().maximize();
    driver.get("https://www.teabox.com");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
    
    htmlReporter = new ExtentSparkReporter("./Reports/TeaBox.html");
	htmlReporter.config().setDocumentTitle("Teabox test reports");
    htmlReporter.config().setReportName("TeaBox Functional Test");
    htmlReporter.config().setTheme(Theme.STANDARD);

    reports = new ExtentReports();
    reports.attachReporter(htmlReporter);
    reports.setSystemInfo("Hostname", "Localhost");
    reports.setSystemInfo("OS", "Windows 11");
    reports.setSystemInfo("Browser Name", "Chrome");
    reports.setSystemInfo("Tester Name", "Adarsh C V");
}
*/


       @BeforeTest
 public void driversetup() {
    		//CONFIGURING HTML REPORTER
   		   htmlReporter = new ExtentSparkReporter("./Reports/TeaBox.html");
   		   htmlReporter.config().setDocumentTitle("TeaBox Automation Test Report");
           htmlReporter.config().setReportName("TeaBox Functional Test");
           htmlReporter.config().setTheme(Theme.STANDARD);

           //CONFIGURING EXTENT REPORTS
           reports = new ExtentReports();
           reports.attachReporter(htmlReporter);
           reports.setSystemInfo("Hostname", "Localhost");
           reports.setSystemInfo("OS", "Windows 11");
           reports.setSystemInfo("Browser Name", "Chrome");
           reports.setSystemInfo("Tester Name", "Adarsh C v");
   		
	       driver= new ChromeDriver();
	       driver.get("https://in.teabox.com/");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
}

    
	
	
}