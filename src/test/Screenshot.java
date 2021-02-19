package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/reethacmtecnotr/Downloads/chromedriver");
		System.setProperty("webdriver.gecko.driver","/home/reethacmtecnotr/Downloads/geckodriver");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		TakesScreenshot TSObj = (TakesScreenshot) driver;
        
        
        File image = TSObj.getScreenshotAs(OutputType.FILE);
        
        try {
            FileUtils.copyFile(image, new File("test.png")); //screenshot as file in workspace folder-webdriver
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		

	}

}
