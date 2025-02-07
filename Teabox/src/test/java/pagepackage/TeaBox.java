package pagepackage;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.google.common.io.Files;

public class TeaBox {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"shopify-section-sections--17039148089432__header\"]/height-observer/store-header/div/h1/a/img")
	WebElement Teaboxlogo;
	
	@FindBy(xpath = "//*[@id=\"shopify-section-sections--17039148089432__header\"]/height-observer/store-header/div/div[1]/div/nav/ul/li[2]/details/summary")
	WebElement Teaplus;
	
	@FindBy(xpath ="//*[@id=\"shopify-section-sections--17039148089432__header\"]/height-observer/store-header/div/h1/a/img")
	WebElement titleteabox;
	
	@FindBy(xpath="//*[@id=\"shopify-section-sections--17039148089432__header\"]/height-observer/store-header/div/div[1]/div/nav/ul/li[1]/a/span")
	WebElement chaititle;
	
	@FindBy(xpath = "//*[@id=\"shopify-section-sections--17039148089432__header\"]/height-observer/store-header/div/div[1]/div/nav/ul/li[3]/a/span")
	WebElement trialpacks;
	
	@FindBy(xpath = "//*[@id=\"shopify-section-sections--17039148089432__header\"]/height-observer/store-header/div/div[1]/div/nav/ul/li[4]/a")
	WebElement gifts;
	
	@FindBy(xpath = "//*[@id=\"shopify-section-sections--17039148089432__header\"]/height-observer/store-header/div/div[1]/div/nav/ul/li[5]/a")
	WebElement teaware;
	
	@FindBy(xpath = "//*[@id=\"shopify-section-sections--17039148089432__header\"]/height-observer/store-header/div/div[1]/div/nav/ul/li[7]/a")
	WebElement reviews;
	
	@FindBy(xpath = "//*[@id=\"shopify-section-sections--17039148089432__header\"]/height-observer/store-header/div/div[1]/div/nav/ul/li[8]/a/span")
	WebElement offers;
	
	@FindBy(xpath = "//*[@id=\"shopify-section-sections--17039148089432__header\"]/height-observer/store-header/div/div[2]/div/a[1]")
	WebElement search;
	
	@FindBy(xpath = "//*[@id=\"search-drawer\"]/form/div/input")
	WebElement serachfeild;
	
	@FindBy(tagName = "a")
	List<WebElement> allLinks;
	
	@FindBy(xpath = "//*[@id=\"customer_login\"]/div[2]/a")
	WebElement Signup;
	
	@FindBy(xpath = "//*[@id=\"input-template--17039162376280__main--customerfirst_name\"]")
	WebElement Firstname;
	
	@FindBy(xpath = "//*[@id=\"input-template--17039162376280__main--customerlast_name\"]")
	WebElement Lastname;
	
	@FindBy(xpath = "//*[@id=\"input-template--17039162376280__main--customeremail\"]")
	WebElement Emailid;
	
	@FindBy(xpath = "//*[@id=\"input-template--17039162376280__main--customerpassword\"]")
	WebElement Password;
	
	@FindBy(xpath = "//*[@id=\"create_customer\"]/button/div")
	WebElement Createaccount;
	
	@FindBy(xpath = "//*[@id=\"input-template--17039162310744__main--customeremail\"]")
	WebElement Lemail;
	
	@FindBy(xpath = "//*[@id=\"input-template--17039162310744__main--customerpassword\"]")
	WebElement Lpassword;
	
	@FindBy(xpath = "//*[@id=\"svgkp\"]/path[1]")
	WebElement Login;

	@FindBy(xpath = "//*[@id=\"scroll-area-template--17039162474584__featured_collection_f6ciFW\"]/reveal-items/product-list/product-card[2]/div[1]/a/img[2]")
	WebElement Producthed;
	
	@FindBy(xpath = "//*[@id=\"product-form-6696483323992-template--17039166701656__main\"]/div/buy-buttons/button/div")
	WebElement AddtoCart;
	
	@FindBy(xpath = "//*[@id=\"product-form-7496415838296-template--17039166734424__main\"]/div/buy-buttons/button")
	WebElement Daddtocart;
	
	@FindBy(xpath = "//*[@id=\"shopify-section-sections--17039148089432__header\"]/height-observer/store-header/div/div[2]/div/a[2]")
	WebElement GotoCart;
	
	@FindBy(xpath = "//*[@id=\"chkout-btn\"]/div/div[1]/span")
	WebElement ProceedCheckButton;
	
	@FindBy(xpath = "//*[@id=\"shopify-section-sections--17039148089432__header\"]/height-observer/store-header/div/div[1]/div/nav/ul/li[6]/a")
	WebElement Whyteabox;
	
	@FindBy(xpath = "//*[@id=\"shopify-section-sections--17039148089432__header\"]/height-observer/store-header/div/div[1]/div/nav/ul/li[2]/details/div/ul/li[2]/div/ul/li[1]/a/span/span")
	WebElement Black;
	
	@FindBy(xpath = "//*[@id=\"shopify-section-template--17039162179672__main\"]/div/div/div[3]/div/reveal-items/product-list/product-card[1]/div[1]/a/img[2]")
	WebElement darjlingtea;
	
	@FindBy(xpath = "//*[@id=\"phone-input\"]")
	WebElement phonenumber;
	
	@FindBy(xpath = "//*[@id=\"svgkp\"]")
	WebElement phLOgin;
	
	@FindBy(xpath = "//*[@id=\"input-0\"]")
	WebElement otp1;
	
	@FindBy(xpath = "//*[@id=\"input-1\"]")
	WebElement otp2;
	
	@FindBy(xpath = "//*[@id=\"input-2\"]")
	WebElement otp3;
	
	@FindBy(xpath = "//*[@id=\"input-3\"]")
	WebElement otp4;
	
	@FindBy(xpath = "//*[@id=\"submit-button\"]")
	WebElement verify;
	
	
	
	
	
	public TeaBox(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        PageFactory.initElements(driver, this);
    }
	

	//Title verification
	
	  public void verifyTitle() {
	        String expectedTitle = "Teabox: Buy Delicious Indian Teas Online - Delivered Fresh";
	        String actualTitle = driver.getTitle();
	        Assert.assertEquals(actualTitle,expectedTitle);
	        System.out.println("Expected title of the home page"+expectedTitle);
	        System.out.println("Actual Title of the home oagr"+actualTitle);
	        
	        Actions actionObject=new Actions(driver);
			
			//APPLY EXPLICIT WAIT
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.visibilityOf(Teaboxlogo));
	       	
	        //Title verification of Chai
	        actionObject.moveToElement(chaititle).click();
	        actionObject.pause(Duration.ofMillis(300)).perform();
	        String chaiExpect="Teabox: Buy Delicious Indian Teas Online - Delivered Fresh";
	        String chaiactual=driver.getTitle();
	        Assert.assertEquals(chaiactual,chaiExpect);
	        System.out.println("Expected title of chai is"+chaiExpect);
	        System.out.println("Actual title of chai is"+chaiactual);
	       
	        //Title verification of Gifts
	        actionObject.moveToElement(gifts).click();
	        actionObject.pause(Duration.ofMillis(300)).perform();
	        String giftExpected="Buy Tea Gift Box Sets Online | 2024 Harvest | Teabox";
	        String giftActual=driver.getTitle();
	        System.out.println("Expected title of gift is"+giftExpected);
	        System.out.println("Actual title of gift is"+giftActual);
	        
	        //Title verification of Teaware
	        actionObject.moveToElement(teaware).click();
	        actionObject.pause(Duration.ofMillis(300)).perform();
	        String teawareExpected="Buy Tea Accessories Online | Teabox";
	        String teawareActual=driver.getTitle();
	        System.out.println("Expected title of teaware"+teawareExpected);
	        System.out.println("Actual title of teaware is"+teawareActual);
	        
	        //Title verification of Trial Packs
	        actionObject.moveToElement(trialpacks).click();
	        actionObject.pause(Duration.ofMillis(300)).perform();
	        String trialExpected="Buy Tea Samples Online | 2024 Harvest | Teabox";
	        String trialActual=driver.getTitle();
	        System.out.println("Expected title of trialpacks is"+trialExpected);
	        System.out.println("Actual title of trialpacks is"+trialActual);
	        
	        //Title verification of Why teabox
	        actionObject.moveToElement(Whyteabox).click();
	        actionObject.pause(Duration.ofMillis(300)).perform();
	        String whyExpected="About Us PAGE";
	        String whyActual=driver.getTitle();
	        System.out.println("Expected title of WhyTeabox is"+whyExpected);
	        System.out.println("Actual title of WhyTeabox is"+whyActual);
	        
	        //Title verification of Offers
	        actionObject.moveToElement(offers).click();
	        actionObject.pause(Duration.ofMillis(300)).perform();
	        String offersExpected="Offers";
	        String offersActual=driver.getTitle();
	        System.out.println("Expected title of Offers is"+offersExpected);
	        System.out.println("Actual title of Offers is"+offersActual);
	        
	        //Title verification of Reviews
	        actionObject.moveToElement(reviews).click();
	        actionObject.pause(Duration.ofMillis(300)).perform();
	        String reviewsExpected="Offers";
	        String reviewsActual=driver.getTitle();
	        System.out.println("Expected title of Reviews is"+reviewsExpected);
	        System.out.println("Actual title of Reviews is"+reviewsActual);
	        
	        Teaboxlogo.click();       
	        
	  }
	  
	  //Login using mobile number
	  
	  
	  
//TeaBox logo verification
	  public void verifyLogo() throws IOException, InterruptedException 
		{
			//AMARON LOGO VERIFICATION USING SOFT ASSERTION
			boolean logoStatus=Teaboxlogo.isEnabled();
			if(logoStatus) 
			{
				System.out.println("Teabox Logo is Present.\nStatus is "+logoStatus);
			}
			else 
			{
				System.out.println("Teabox Logo is not Present.\nStatus is "+logoStatus);
			}
		}	
	  
	  
	  
//A VALID PRODUCT SEARCHING
	 public void searchingproduct(String value) {
		search.click();
		serachfeild.sendKeys(value,Keys.ENTER);
		driver.navigate().back();
	}
	
	
	//Brokenlinks
    public void linkSearch() throws Exception {
    	System.out.println("Total links available :"+allLinks.size());
		for (WebElement we:allLinks) {
			
			String hrefValue=we.getAttribute("href");
			String text=we.getText();
			System.out.println(text+"\t"+hrefValue);
			verifylinks(hrefValue);
		}
    
    }

    public void verifylinks(String hrefLink) {
    	try {
    		
    	URL url =new URL(hrefLink);
    	HttpURLConnection con=(HttpURLConnection) url.openConnection();
    	con.setConnectTimeout(1000);
    	if(con.getResponseCode()==200) {
    		System.out.println("valid link:"+hrefLink);
    	}
    		else {
    		      System.out.println("broken link:"+hrefLink);
    		}
    		
    	}
    		
    		catch (Exception e) {
				System.out.println(e);
} 
}	
    
    //Adding product to cart
    
    public void addAproductoCart() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Producthed.click();
        AddtoCart.click();
        driver.navigate().back();
         	
    }
    
 // Switch window
    
    public void switchWindow() {
        String parentWindow = driver.getWindowHandle();
        for (String window : driver.getWindowHandles()) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    }
    
  //Capture Screen Short

    public void captureScreenshot() throws Exception {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenshortPath="C:\\selenium\\TeaboxScreenshort";
        FileHandler.copy(screenshot, new File(screenshortPath));
    }

 // Hover over element
    public void hoverOverElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    } 
 // Get element to hover
    public WebElement getHoverElement() {
        return reviews;
    }
    
     //Select chai option then adding one product to cart then exit from cart
    
    public void addProductTocart() throws Exception {
    	Teaplus.click();
    	Actions actions=new Actions(driver);
    	actions.moveToElement(Black).perform();
    	Black.click();
    	Thread.sleep(2000);
    	darjlingtea.click();
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
    	Daddtocart.click();
    	WebElement exit=driver.findElement(By.xpath("//*[@id=\"corner-cowi-close-btn\"]"));
    	exit.click();
    	Teaboxlogo.click();
    	
    	
    }
    // Searching Invalid Products
    
	public void searchInvalidProduct(String Invalidname) {
		search.click();
		serachfeild.sendKeys(Invalidname,Keys.ENTER);
		driver.navigate().back();
		
	}
	 public String getNoResultMessage() {
	        WebElement noResultElement = driver.findElement(By.xpath("//*[@id=\"shopify-section-template--17039166832728__main\"]/div/div/h1"));
	        return noResultElement.getText();
	    }

    // Contact Us Form
    public void fillContactUsForm(String name, String email,String subjects, String message) {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)");
        WebElement cotactus=driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--17039148023896__footer\"]/div/div/div/div[1]/div[2]/ul/li[2]/a"));
        cotactus.click(); 
        WebElement nameInput = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[2]/div/div[2]/div[1]/input"));
        WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[2]/div/div[2]/div[2]/input"));
        WebElement subject = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[2]/div/div[2]/div[3]/input"));
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[2]/div/div[2]/button"));
        WebElement messages=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[2]/div/div[2]/div[4]/textarea"));
        nameInput.sendKeys(name);
        emailInput.sendKeys(email);
        subject.sendKeys(subjects);
        messages.sendKeys(message);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
    	wait.until(ExpectedConditions.elementToBeClickable(submitButton));
       
       
        submitButton.click();
    }

    public boolean isContactUsSubmissionSuccessful() {
        WebElement successMessage = driver.findElement(By.cssSelector(".contact-success-message"));
        return successMessage.isDisplayed();
    }
    
	//Footer links
    
	public boolean verifyFooterLinks() {
        List<WebElement> footerLinks = driver.findElements(By.cssSelector(".footer-links a"));
        for (WebElement link : footerLinks) {
            String url = link.getAttribute("href");
            driver.navigate().to(url);

            if (driver.getTitle().isEmpty()) {
                return false;
            }
            
        }
        return true;
	}
	
	
	//login using otp
	
		public void loginOtp(String phnumber,String otp,String ot1,String ot2,String ot3,String ot4) throws Exception{
			phLOgin.click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOf(phonenumber));
			phonenumber.sendKeys(phnumber);
			Thread.sleep(2000);
			otp1.sendKeys(ot1);
			otp2.sendKeys(ot2);
			otp3.sendKeys(ot3);
			otp4.sendKeys(ot4);
			verify.click();	
			
		}
		
	
	    // Sort products based on the given option
	    public void sortProducts(String sortOption) {
	        WebElement sortDropdown = driver.findElement(By.xpath("//select[contains(@class, 'product-sort-dropdown')]"));
	        sortDropdown.click();
	        WebElement sortOptionElement = driver.findElement(By.xpath("//option[text()='" + sortOption + "']"));
	        sortOptionElement.click();
	        
	    }
		 // Verify if products are sorted correctly
	    public boolean isSortedCorrectly(String sortOption) {
	     
	        List<WebElement> productPrices = driver.findElements(By.xpath("//span[contains(@class, 'product-price')]"));
	        List<Double> prices = productPrices.stream()
	                                           .map(e -> Double.parseDouble(e.getText().replace("$", "")))
	                                           .collect(Collectors.toList());

	        List<Double> sortedPrices = new ArrayList<>(prices);
	        if (sortOption.equalsIgnoreCase("Price: Low to High")) {
	            Collections.sort(sortedPrices);
	        } else if (sortOption.equalsIgnoreCase("Price: High to Low")) {
	            Collections.sort(sortedPrices, Collections.reverseOrder());
	        }

	        return prices.equals(sortedPrices);
	    }
	    
	     // Subscribe to newsletter
	    
	    public void subscribeToNewsletter(String email) {
	        WebElement newsletterInput = driver.findElement(By.xpath("//input[contains(@class, 'newsletter-input')]"));
	        WebElement subscribeButton = driver.findElement(By.xpath("//button[contains(@class, 'newsletter-button')]"));
	        newsletterInput.sendKeys(email);
	        subscribeButton.click();
	    }
	    
	    
	   // Check if subscription success message is displayed
	    public boolean isSubscriptionSuccessMessageDisplayed() {
	        WebElement successMessage = driver.findElement(By.xpath("//div[contains(@class, 'subscription-success-message')]"));
	        return successMessage.isDisplayed();
	    }
	    
	    }
   


  



