package testpackage;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;

import basepackage.BaseSetup;
import pagepackage.TeaBox;


public class Homepage extends BaseSetup{
	
	 TeaBox ob;

	    @BeforeClass
	    public void setup() {
	        driversetup(); 
	        //driver.get("https://www.teabox.com");
	        ob = new TeaBox(driver); 
	        test = reports.createTest("TeaBox Tests");
	    }
	    
	    @Test(priority = 1)
	    public void verifytitle() {
	    	ob.verifyTitle();
	    	logTestResult("Title verification");
	    	
	    	
	    }
	    
       
      @Test(priority = 2)
         public void verifyLogo() throws Exception
         {
        	 ob.verifyLogo();
        	 logTestResult("Logo verification");
         }
         
	   @Test(priority =3 )
	    public void search() {
	        ob.searchingproduct("Organic Green Tea");
	        logTestResult("Searching product");
	    }

	    @Test(priority = 4)
	    public void brokenLinks() throws Exception {
	        ob.linkSearch();
	        logTestResult("BrokenLinks");
	    }

	    

	    @Test(priority = 5)
	    public void switchWindowTest() {
	        ob.switchWindow();
	        logTestResult("Switch Window");
	    }
	    
	    @Test(priority = 6)
	    public void takeScreenshot() throws Exception {
	        ob.captureScreenshot();
	        logTestResult("Taking Screenshort");
	    }
	    
	    @Test(priority = 7)
	    public void hoverOverEle() {
	        ob.hoverOverElement(ob.getHoverElement());
	        logTestResult("Hover over Element");
	    }
	    
	    @Test(priority = 8)
	    public void Exitcart() throws Exception {
	    	ob.addProductTocart();
	    	logTestResult("Exit from cart");
	    }
	    @Test(priority = 9)
	    public void searchInvalidProduct() {
	        ob.searchInvalidProduct("ada4");

	        // Expected "No results" message
	        String expectedMessage = "No results could be found.";
	        String actualMessage = ob.getNoResultMessage();

	        Assert.assertEquals(actualMessage, expectedMessage, "No result message mismatch!");
	        logTestResult("Searching invalid products");
	    }
	    @Test(priority = 10)
	    public void validateContactUsForm() {
	        String name = "Adarsh C V";
	        String email = "adarshcv@example.com";
	        String message = "Test message for Contact Us validation.";
	        String subjects="aaaaaaaaa";
	        ob.fillContactUsForm(name, email, message,subjects);
	        boolean isSubmissionSuccessful = ob.isContactUsSubmissionSuccessful();
	        Assert.assertTrue(isSubmissionSuccessful, "Contact Us form submission failed!");
	        logTestResult("Validation of contact us form");
	    }
	    @Test(priority = 11)
	    public void verifyFooterLinks() {
	        boolean allLinksWorking = ob.verifyFooterLinks();
	        Assert.assertTrue(allLinksWorking, "One or more footer links are broken!");
	        logTestResult("Footer links");
	    }
	    @Test(priority = 12)
	    public void logo()throws Exception {	   
	    	String phonenumber="9995631822";
	    	String ot1="2";
	    	String ot2="3";
	    	String ot3="3";
	    	String ot4="5";
	    	ob.loginOtp(phonenumber,ot1,ot2,ot3,ot4, ot4);
	    	logTestResult("otp verification");
	    	
	    }

	    @Test(priority = 13)
	    public void verifySortingFunctionality() {
	        String sortOption = "Price: Low to High";
	        ob.sortProducts(sortOption);
	        Assert.assertTrue(ob.isSortedCorrectly(sortOption), "Products are not sorted correctly.");
	        logTestResult("Verify sorting functinality");
	    }
	    
	    @Test(priority = 14)
	    public void verifyNewsletterSubscription() {
	        String email = "adarshhari494@gami.com";
	        ob.subscribeToNewsletter(email);
	        Assert.assertTrue(ob.isSubscriptionSuccessMessageDisplayed(), "Subscription success message not displayed.");
	        logTestResult("Verify news letter");
	    }
	    
	    @Test(priority = 15)
	    public void addProductandCheckout() {
	    	ob.addAproductoCart();
	    	logTestResult("Add Product and Check out");
	    }

	    
		@AfterMethod
		public void browserClose(ITestResult result) throws IOException 
		{
			if(result.getStatus()==ITestResult.FAILURE) 
			{
				test.log(Status.FAIL, "Test failed: " + result.getName());
	            test.log(Status.FAIL, "Error: " + result.getThrowable());
				
				String Screenshotpath=screenshotMethod(driver,result.getName());
				test.addScreenCaptureFromPath(Screenshotpath);
			}
			else if(result.getStatus()==ITestResult.SKIP) 
			{
				test.log(Status.SKIP, "Test skipped: " + result.getName());
			}
			else if(result.getStatus()==ITestResult.SUCCESS)
			{
				test.log(Status.PASS, "Test passed: " + result.getName());
			}
		}
		
	    private void logTestResult(String testName) {
	        test = reports.createTest("Test Passed : " + testName);
	    }
	    
	    public static String screenshotMethod(WebDriver driver,String screenShotName) throws IOException {
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String destination="./Screenshorts"+screenShotName+".jpg";
			
			FileHandler.copy(src, new File(destination));
			return destination;
		}
		
		@AfterTest
		public void executeReport() {
			reports.flush();
	
		}
}
       