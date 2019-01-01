//Enabling ScreenLock Sound
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

public class Try1 {

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
    
    driver.swipe(670, 2287, 670, 495, 1000);
    driver.swipe(670, 2000, 670, 300, 1000);
    
    List<WebElement> list = tabMenu.findElements(By.id("com.android.settings:id/list"));
    WebElement tar = list.get(3);
    WebElement screenLockSoundButton = tar.findElement(By.id("android:id/switch_widget"));
    screenLockSoundButton.click();
    
    }
    
}
