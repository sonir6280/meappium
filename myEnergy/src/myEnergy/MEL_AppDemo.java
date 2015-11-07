package myEnergy;

import io.appium.java_client.ios.IOSDriver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class MEL_AppDemo {
	
	@SuppressWarnings("rawtypes")
	private IOSDriver wd;
	
	@SuppressWarnings("rawtypes")
//	public static void main(String[] args) {
	
	@Parameters({ "appiumVer", "platform", "platformVer", "device", "driverURL", "wait" })
	@BeforeTest
		public void setcapability(String appiumVer, String platform, String platformVer, String device, String driverURL, long wait)
				throws MalformedURLException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("appium-version", appiumVer);
		capabilities.setCapability("platformName", platform);
		capabilities.setCapability("platformVersion", platformVer);
		capabilities.setCapability("deviceName", device);

		capabilities.setCapability("app", "/Users/rohit/Desktop/MEA_Test.app");
		capabilities.setCapability("bundleId","uk.co.britishgas.myenergylive");

		//		driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);		
		wd = new IOSDriver (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		wd.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
	}
	
		@Test
		public void test () {
			try {
//		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIATextField[1]")).sendKeys("gawainmedwards@googlemail.com");
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIAButton[4]")).click();
//		wd.wait(1000);

		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAButton[1]")).click();
//		wd.wait(1000);

		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATabBar[1]/UIAButton[2]")).click();
//		wd.wait(1000);
	
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAButton[1]")).click();
//		wd.wait(1000);
	
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATabBar[1]/UIAButton[3]")).click();
//		wd.wait(1000);
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIAButton[1]")).click();
	//	wd.wait(1000);
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIANavigationBar[1]/UIAButton[2]")).click();
	//	wd.wait(1000);
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[2]/UIAStaticText[1]")).click();
	//	wd.wait(1000);
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATabBar[1]/UIAButton[2]")).click();
		//wd.wait(1000);
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATabBar[1]/UIAButton[3]")).click();
		//wd.wait(1000);
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIANavigationBar[1]/UIAButton[2]")).click();
		//wd.wait(1000);
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[3]")).click();
		//wd.wait(1000);
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIANavigationBar[1]/UIAButton[3]")).click();
	//	wd.wait(1000);
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[4]/UIAStaticText[1]")).click();
//		wd.wait(1000);
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIANavigationBar[1]/UIAButton[2]")).click();
//		wd.wait(1000);
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[5]/UIAStaticText[1]")).click();
	//	wd.wait(1000);
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIANavigationBar[1]/UIAButton[1]")).click();
		//wd.wait(1000);
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIANavigationBar[1]/UIAButton[2]")).click();
		//wd.wait(1000);
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[6]/UIAStaticText[1]")).click();
		//wd.wait(1000);
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIANavigationBar[1]/UIAButton[1]")).click();
		//wd.wait(1000);
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIANavigationBar[1]/UIAButton[2]")).click();
		//wd.wait(1000);
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[7]/UIAStaticText[1]")).click();
		//wd.wait(1000);
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIANavigationBar[1]/UIAButton[1]")).click();
		//wd.wait(1000);
		
		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIANavigationBar[1]/UIAButton[2]")).click();
		//wd.wait(1000);

		wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[8]")).click();
		
		wd.quit();
		
		wd.close();
			} catch (Exception e) {

				System.err.println("Exception found while executing test. Please refer screenshots folder");
				File scrfile = wd.getScreenshotAs(OutputType.FILE);
				String fileName = UUID.randomUUID().toString();
				File targetFile = new File("Exception/screenshots/" + fileName + ".jpg");
				try {
					FileUtils.copyFile(scrfile, targetFile);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				System.out.println(targetFile);
			}
	}
		@AfterTest
		public void afterTest() {
			System.out.println("Test completed.....");
}
}
	