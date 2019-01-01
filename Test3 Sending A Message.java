//Sending A Message
package try1;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Try3 {
        public static AppiumDriver driver;
		
    public static void main(String[] args) throws MalformedURLException {
            
    DesiredCapabilities capabilites = new DesiredCapabilities();
		
    capabilites.setCapability("device", "Android");
    capabilites.setCapability("deviceName", "LG-H830");
    capabilites.setCapability("platformVersion", "8.0.0");
    capabilites.setCapability("platformName", "Android");
    
    capabilites.setCapability("appPackage", "com.android.mms");
    capabilites.setCapability("appActivity", "com.android.mms.ui.ConversationList");

    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilites);
    driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);

    Scanner reader = new Scanner(System.in);
    
    WebElement newMessageLayout = driver.findElement(By.id("com.android.mms:id/fab"));
    newMessageLayout.click();
    
    WebElement enterReceiverNumberLayout = driver.findElement(By.className("android.widget.LinearLayout"));
    WebElement receiverNumber = enterReceiverNumberLayout.findElement(By.className("android.widget.MultiAutoCompleteTextView"));
    String no = reader.nextLine();
    receiverNumber.sendKeys(no.toString());
    
    WebElement textMessageLayout = driver.findElement(By.id("com.android.mms:id/bottom_panel"));
    WebElement editTextLayout = textMessageLayout.findElement(By.id("com.android.mms:id/mms_edit_text_layout"));
    WebElement message = editTextLayout.findElement(By.className("android.widget.EditText"));
    String msg = reader.nextLine();
    message.sendKeys(msg.toString());
    
    WebElement sendButtonArea = driver.findElement(By.id("com.android.mms:id/button_area"));
    WebElement sendButton = sendButtonArea.findElement(By.id("com.android.mms:id/send_button_text"));
    sendButton.click();
    
    }
}
