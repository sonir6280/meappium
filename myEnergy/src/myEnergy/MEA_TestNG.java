package myEnergy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class MEA_TestNG {

	@SuppressWarnings("rawtypes")
	private AndroidDriver wd;

	@SuppressWarnings("rawtypes")

	@Parameters({ "Device", "Wait", "appPackage", "appActivity", "platform" })
	@BeforeTest
	public void setcapability(String Device, long Wait, String appPackage, String appActivity, String platform)
			throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("appium-version", "1.0");
		capabilities.setCapability("platformName", platform);
		capabilities.setCapability("deviceName", Device);

		// capabilities.setCapability("appPackage",
		// "com.centrica.android.britishgas");
		// capabilities.setCapability("appActivity", ".menu.BootActivity");

		wd = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

		wd.manage().timeouts().implicitlyWait(Wait, TimeUnit.SECONDS);
	}

	@Parameters({ "Login", "Password" })
	@Test
	public void login(String Login, String Password) {

		try {
			// Login page
			wd.findElement(By
					.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.ViewSwitcher[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.EditText[1]"))
					.sendKeys(Login);
			wd.findElement(By
					.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.ViewSwitcher[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.EditText[2]"))
					.sendKeys(Password);
			// click Login button
			wd.findElement(By
					.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.ViewSwitcher[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.Button[1]"))
					.click();
			// click MEA tile on BG app v4.0.2 on Android v 4.4.4
//wd.findElementByAccessibilityId("my energy").click();
//wd.findElementByTagName("my energy");

			wd.findElement(By
					.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.GridView[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]"))
					.click();
/*			
			// click MEA tile on Samsung 4.4.4 15443d67 192.168.12.175:5555
			wd.findElement(By
					.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.GridView[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]"))
					.click();
			
			// click MEA tile on HTC 5.0.1 Nora Phone: HT49PWM02967 (192.168.12.175:5555)
			wd.findElementByXPath(
					"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.GridView[1]/android.widget.LinearLayout[10]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
					.click();
*/
			// click Elec account
			wd.findElement(By
					.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]"))
					.click();
			
/*					
			for (int v =1; v<= 2; v++) { 
					 wd.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.view.View[1]/android.widget.ListView[2]/android.view.View[1]").click();

					 while ((wd.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.view.View[1]/android.widget.ListView[2]/android.view.View[2]").isDisplayed())) 
					  {      System.out.println("Inside while loop....."); 
					     //    wd.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.view.View[1]/android.widget.ListView[2]/android.view.View["+v+"]").click(); 
					   wd.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.view.View[1]/android.widget.ListView[2]/android.view.View[1]").click(); 
					  }
			System.out.println("Outside while loop....."); 
					 }			 
*/
			
			// click < on calendar view
			wd.findElementByXPath(
					"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.view.View[1]/android.widget.ListView[2]/android.view.View[1]")
					.click();

			// click > on calendar view
			wd.findElementByXPath(
					"//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.view.View[1]/android.widget.ListView[2]/android.view.View[2]")
					.click();

			// click Graph tab
			wd.findElement(By
					.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[5]/android.view.View[2]"))
					.click();

			// click Year tab
			wd.findElement(By
					.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[6]/android.view.View[4]"))
					.click();

			// click Month tab
			wd.findElement(By
					.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[6]/android.view.View[3]"))
					.click();

			// click Week tab
			wd.findElement(By
					.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[6]/android.view.View[2]"))
					.click();

			// click Day tab
			wd.findElement(By
					.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[6]/android.view.View[1]"))
					.click();

			// click main dropdown menu
			wd.findElement(By
					.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[3]"))
					.click();
			Thread.sleep(1000);

			// select Breakdown option
			wd.findElement(By
					.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[2]"))
					.click();
			Thread.sleep(1000);

			// click main dropdown menu
			wd.findElement(By
					.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[3]"))
					.click();
			Thread.sleep(1000);

			// select Home profile option
			wd.findElement(By
					.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[3]"))
					.click();
			Thread.sleep(1000);

			wd.findElement(By
					.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[3]"))
					.click();
			Thread.sleep(2000);

			// click main dropdown menu
			wd.findElement(By
					.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[4]"))
					.click();
			Thread.sleep(1000);

			// select Advice option
			wd.findElement(By
					.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.view.View[1]/android.view.View[1]/android.view.View[3]"))
					.click();

			// select Usage option
			wd.findElement(By
					.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.webkit.WebView[1]/android.view.View[1]/android.widget.ListView[1]/android.view.View[1]"))
					.click();

			// click Home button
			wd.findElement(By
					.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]"))
					.click();

			// click Options button
			wd.findElement(By
					.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]"))
					.click();

			// click Log out button
			wd.findElement(By
					.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.Button[1]"))
					.click();

			// release android driver
			// wd.close();

			// Calls dispose to close all browser windows and safely and ends
			// the session
			wd.quit();

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
