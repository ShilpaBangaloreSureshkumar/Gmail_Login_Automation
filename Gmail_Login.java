package trainingsessions;

import org.openqa.selenium.By;
//import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;

public class Gmail_Login {

	public static void main(String[] args) throws InterruptedException {

		//objects and variables initiations
		System.setProperty("webdriver.gecko.driver", "D:\\Shilpa\\Software\\Selenium\\geckodriver\\Latest\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String appUrl = "https://accounts.google.com";
		
		//launch the firefox browser and open the application url
        driver.get(appUrl);
        
        //maximize the browser window
        driver.manage().window().maximize();
        
        //declare and initialize the variable to store the expected title of the webpage.
        String expectedTitle = " Sign in - Google Accounts ";
       
        //fetch the title of the web page and save it into a string variable
        String actualTitle = driver.getTitle();
        
        //compare the expected title of the page with the actual title of the page and print the result

        if (expectedTitle.equals(actualTitle))
        {
               System.out.println("Verification Successful - The correct title is displayed on the web page.");
        }
       else
        {
               System.out.println("Verification Failed - An incorrect title is displayed on the web page. Actual title is "+actualTitle);
        }
        
        
        //enter a valid username in the email textbox
        WebElement username = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        username.clear();
        username.sendKeys("seleniumrw025");   
        Thread.sleep(2000);
        
      //Click on next button
        WebElement next = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/content/span"));
        next.click();
        Thread.sleep(5000);

        //enter a valid password in the password textbox
        WebElement password = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div/div[1]/div/div[1]/input"));
       
       // password.clear();
        password.sendKeys("Password@123");
        Thread.sleep(5000);
     
        //click on the Sign in button
        WebElement SignInButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/content/span"));
        SignInButton.click();
       // Thread.sleep(2000);
        
        driver.findElement(By.xpath("/html/body/div[2]/c-wiz/div/div/div[5]/div[1]/c-wiz/div/div[1]/div/div[1]/div[2]/a[2]")).click();
        Thread.sleep(7000);
        
        //close the web browser
        driver.close();
       // Thread.sleep(5000);
        System.out.println("Test script executed successfully.");
Thread.sleep(5000);
        //terminate the program
        System.exit(0);

	
		
	}

}
