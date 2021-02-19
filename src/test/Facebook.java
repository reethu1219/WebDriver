package test;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Facebook {
	
	public static void main(String[] args) {
	​​​​​​​​
	// TODO Auto-generated method stub



	System.setProperty("webdriver.chrome.driver","/home/reethacmtecnotr/Downloads/chromedriver");
	System.setProperty("webdriver.gecko.driver","/home/reethacmtecnotr/Downloads/geckodriver");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	


		//
		// WebElement lnkLogin = driver.findElement(By.linkText("Log in"));
		// lnkLogin.click();
		//
		// WebElement editUsername=driver.findElement(By.name("user_login"));
		// editUsername.sendKeys("akshay.com");
		//
		// WebElement editpwd= driver.findElement(By.name("user_pwd"));
		// editpwd.sendKeys("007");
		//
		// WebElement chkBox= driver.findElement(By.className("rememberMe"));
		// chkBox.click();
		//
		// WebElement btnpwd=driver.findElement(By.name("btn_login"));
		// btnpwd.click();
		
	/*	WebElement lg=driver.findElement(By.xpath("//a[@class='login']"));
		lg.click();

		WebElement wb=driver.findElement(By.xpath("//*[contains(text(),'Welcome back!')]"));




		WebElement un=driver.findElement(By.xpath("//input[@name='user_login']"));
		un.sendKeys("reetha.cm@tecnotree.com");

		WebElement ck=driver.findElement(By.xpath("//input[@id='remember-me']"));
		ck.click();

*/
	//Syntax:"css=tag#id"
	WebElement username=driver.findElement(By.cssSelector("input#email"));
	username.sendKeys("abc@tecnotree.com");
	
	//Syntax:"css=tag.class"
	WebElement pwd=driver.findElement(By.cssSelector("input#pass"));
	pwd.sendKeys("122132");
	
	//Syntax:"css=tag[attribute=value]"
	WebElement login=driver.findElement(By.cssSelector("button[name=login]"));
	login.click();
	
	//*[@name='birthday_month']
	WebElement month = driver.findElement(By.xpath("//*[@name='birthday_month']"));
    
    Select ddmonth = new Select(month);
    
    ddmonth.selectByIndex(1);
    
    ddmonth.selectByValue("2");
    
    ddmonth.selectByVisibleText("Feb");
    
    package test;
    import java.util.concurrent.TimeUnit;


    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.support.ui.Select;


    public class Locators {
    	
    	public static void main(String[] args) {​​​​​​​​
    		// TODO Auto-generated method stub



    	System.setProperty("webdriver.chrome.driver","/home/reethacmtecnotr/Downloads/chromedriver");
    	System.setProperty("webdriver.gecko.driver","/home/reethacmtecnotr/Downloads/geckodriver");
    	
    	WebDriver driver = new ChromeDriver();
    	
    	driver.get("https://www.simplilearn.com/");
    	
    	driver.manage().window().maximize(); 
    	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    	


    		//
    		// WebElement lnkLogin = driver.findElement(By.linkText("Log in"));
    		// lnkLogin.click();
    		//
    		// WebElement editUsername=driver.findElement(By.name("user_login"));
    		// editUsername.sendKeys("akshay.com");
    		//
    		// WebElement editpwd= driver.findElement(By.name("user_pwd"));
    		// editpwd.sendKeys("007");
    		//
    		// WebElement chkBox= driver.findElement(By.className("rememberMe"));
    		// chkBox.click();
    		//
    		// WebElement btnpwd=driver.findElement(By.name("btn_login"));
    		// btnpwd.click();
    		
    	/*	WebElement lg=driver.findElement(By.xpath("//a[@class='login']"));
    		lg.click();

    		WebElement wb=driver.findElement(By.xpath("//*[contains(text(),'Welcome back!')]"));




    		WebElement un=driver.findElement(By.xpath("//input[@name='user_login']"));
    		un.sendKeys("reetha.cm@tecnotree.com");

    		WebElement ck=driver.findElement(By.xpath("//input[@id='remember-me']"));
    		ck.click();

    */
    	//Syntax:"css=tag#id"
    	WebElement username=driver.findElement(By.cssSelector("input#email"));
    	username.sendKeys("abc@tecnotree.com");
    	
    	//Syntax:"css=tag.class"
    	WebElement pwd=driver.findElement(By.cssSelector("input#pass"));
    	pwd.sendkeys("122132");
    	
    	//Syntax:"css=tag[attribute=value]"
    	WebElement login=driver.findElement(By.cssSelector("button[name=login]"));
    	login.click();
    	
    	//*[@name='birthday_month']
    	WebElement Day = driver.findElement(By.xpath("//*[@name='birthday_month']"));
        
        Select ddmonth = new Select(month);
        
        ddmonth.selectByIndex(1);
        
        ddmonth.selectByValue("2");
        
        ddmonth.selectByVisibleText("Feb");
    	
    	}
    	
    	
    		}​​​​​​​​
/* WebElement createAc = driver.findElement(By.xpath("//*[contains(text(),'Create New Account')]"));
    createAc.click();
    WebElement Firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
    Firstname.sendKeys("sushil");
    WebElement Lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
    Lastname.sendKeys("kumar");
    WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
    email.sendKeys("abc@xyz.com");
    WebElement emailconf = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
    emailconf.sendKeys("abc@xyz.com");
    WebElement passwd = driver.findElement(By.xpath("//input[@id='password_step_input']"));
    passwd.sendKeys("1234");
    
    WebElement Month = driver.findElement(By.xpath("//*[@name='birthday_month']"));

    Select ddmonth=new Select(Month);
    ddmonth.selectByIndex(3);
    
    WebElement Day = driver.findElement(By.xpath("//*[@name='birthday_day']"));
    //Day.click();
    	
        
*/



    
    
    
	
	
	
	
		}​​​​​​​​

	
    



