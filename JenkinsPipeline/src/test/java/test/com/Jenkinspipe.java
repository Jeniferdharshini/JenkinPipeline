package test.com;

import org.apache.commons.math3.geometry.spherical.twod.Edge;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jenkinspipe {
	public void m1() {
		WebDriver driver = null;
		String BROWSER =System.getProperty("browser");
		String URL = System.getProperty("url");
		System.out.println(BROWSER);
		if(BROWSER.equalsIgnoreCase("browser")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("firebox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		driver.get(URL);
	}
}



	/*public static void main(String[] args)throws Throwable{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		/*String key="webdriver.chrome.driver";
		String value="./chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver(); */

		
		//driver.get("https://www.amazon.in/");
	/*	Thread.sleep(2000);
		 String data = driver.getTitle();
		 System.out.println(data);
		 
		 String URL = driver.getCurrentUrl(); 
		 System.out.println(URL);
		 
		 //Source code of the page
		 
		 String source = driver.getPageSource();
		 System.out.println(source);
		 
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 driver.manage().window().fullscreen();
		 Thread.sleep(1000);
         driver.manage().window().minimize();

         
		 
		// driver.close(); used close one window only current page
         //driver.quit(); // used close all windows
         
       //  driver.findElement(By.id("username")).sendKeys("manager");// used to handle single element
      
	}
	} */
	
	


