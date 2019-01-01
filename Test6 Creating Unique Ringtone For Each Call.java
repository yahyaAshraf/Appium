//Creating Unique RingTone For Each Call
package try1;
import io.appium.java_client.AppiumDriver;
import java.net.MalformedURLException;
import java.net.URL;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Scanner;

public class Try7 {

    public static AppiumDriver driver;
		
    public static void main(String[] args) throws MalformedURLException {
            
    DesiredCapabilities capabilites = new DesiredCapabilities();
		
    capabilites.setCapability("device", "Android");
    capabilites.setCapability("deviceName", "LG-H830");
    capabilites.setCapability("platformVersion", "8.0.0");
    capabilites.setCapability("platformName", "Android");
		
    capabilites.setCapability("appPackage", "com.lge.launcher3");
    capabilites.setCapability("appActivity", "com.lge.launcher3.AllAppsLauncherExtension");

    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilites);
    driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);    
    
    driver.swipe(693, 26, 699, 2132, 1000);
    driver.swipe(658, 662, 689, 2048, 1000);

    WebElement buttonSettingContainer = driver.findElement(By.id("com.android.systemui:id/settings_button_container"));
    WebElement settingButton = buttonSettingContainer.findElement(By.id("com.android.systemui:id/settings_button"));
    settingButton.click();
    
    WebElement tabMenu = driver.findElement(By.id("android:id/tabs"));
    List<WebElement> actionTab = tabMenu.findElements(By.className("android.widget.LinearLayout"));
    actionTab.get(1).click();
    
    
    WebElement frameLayout = driver.findElement(By.className("android.widget.FrameLayout"));
    List<WebElement> soundTabList = frameLayout.findElements(By.id("com.android.settings:id/list"));
    soundTabList.get(0).click();
    
    WebElement ringToneSwitch = driver.findElement(By.id("com.android.settings:id/switch_widget"));
    ringToneSwitch.click();
    }
    
}
