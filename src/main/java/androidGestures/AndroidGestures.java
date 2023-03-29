package androidGestures;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;

public class AndroidGestures {

	/**
	 * this method perform click operation
	 * @param driver
	 * @param element
	 */
	public void clickonElement(AndroidDriver driver, WebElement element)
	{

		driver.executeScript("mobile: clickGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement) element).getId()
				));
	}

	public void clcikCordinates(AndroidDriver driver,int x, int y) {
		driver.executeScript("mobile: clickGesture", ImmutableMap.of(

				"x",x,
				"y",y

				));
	}

	public void longClick(AndroidDriver driver, WebElement element)
	{
		// Java
		driver.executeScript("mobile: longClickGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement) element).getId(),
				"duration",2000

				));
	}

	public void longClickCordinates(AndroidDriver driver,int x, int y) 
	{
		driver.executeScript("mobile: longClickGesture", ImmutableMap.of(
				"x",x,
				"y",y,
				"duration",2000
				));
	}

	public void doubleClickgesture(AndroidDriver driver, WebElement element)
	{
		// Java
		driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement) element).getId()
				));
	}

	public void doubleClickcoordinates(AndroidDriver driver, int x, int y)
	{

		driver.executeScript("mobile: doubleClickGesture", ImmutableMap.of(
				"x",x,
				"y",y
				));
	}

	public void dragGesture(AndroidDriver driver, WebElement element,int endx, int endy)
	{
		// Java
		driver.executeScript("mobile: dragGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement) element).getId(),
				"endX", endx,
				"endY", endy
				));
	}

	public void dragGesture(AndroidDriver driver,int startx,int starty,int endx, int endy)
	{
		// Java
		driver.executeScript("mobile: dragGesture", ImmutableMap.of(
				//	"elementId", ((RemoteWebElement) element).getId(),
				"startX",startx,
				"startY",starty,
				"endX", endx,
				"endY", endy
				));
	}


}