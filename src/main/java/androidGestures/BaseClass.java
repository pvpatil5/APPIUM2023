package androidGestures;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseClass 
{
	public AppiumDriver driver;
	private AppiumDriverLocalService server;

	@BeforeSuite
	public void launchserver() throws MalformedURLException 
	{
		server=DriverMethods.getAppiumServer();
		server.start();
	}

	@AfterSuite
	public void stopserver() {
		server.stop();
	}

	//@Parameters({"deviname","udid"})
	@BeforeClass
	public void launchApp() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		desiredCapabilities.setCapability(MobileCapabilityType.UDID, "RZ8N91KGFEH");
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung");
		desiredCapabilities.setCapability("appPackage", "io.appium.android.apis");
		desiredCapabilities.setCapability("appActivity", ".ApiDemos");
		//desiredCapabilities.setCapability(MobileCapabilityType.APP, "D:\\APPIUM_Stuff\\Appium_Docs\\ApiDemos-debug.apk");


		URL url = new URL("http://localhost:4723/wd/hub");

		driver = new AndroidDriver(url, desiredCapabilities);

	}
	@BeforeMethod
	public void logintoApp() 
	{

	}

	@AfterMethod
	public void logout() 
	{

	}

	@AfterClass
	public void terminateApp1()
	{
		((InteractsWithApps) driver).terminateApp("io.appium.android.apis");
	}

}
