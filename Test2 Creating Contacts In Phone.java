//Creating Contact In Phone Test Case
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


public class Try2 {
    
    public static AppiumDriver driver;
		
    public static void main(String[] args) throws MalformedURLException {
            
    DesiredCapabilities capabilites = new DesiredCapabilities();
		
    capabilites.setCapability("device", "Android");
    capabilites.setCapability("deviceName", "LG-H830");
    capabilites.setCapability("platformVersion", "8.0.0");
    capabilites.setCapability("platformName", "Android");
		
    capabilites.setCapability("appPackage", "com.android.contacts");
    capabilites.setCapability("appActivity", "com.android.contacts.activities.DialtactsActivity");
		
    driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilites);
    driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
    
     
    WebElement dialpad = driver.findElement(By.id("com.android.contacts:id/dialpad"));
    WebElement one = dialpad.findElement(By.id("com.android.contacts:id/one"));
    WebElement two = dialpad.findElement(By.id("com.android.contacts:id/two"));
    WebElement three = dialpad.findElement(By.id("com.android.contacts:id/three"));
    WebElement four = dialpad.findElement(By.id("com.android.contacts:id/four"));
    WebElement five = dialpad.findElement(By.id("com.android.contacts:id/five"));
    WebElement six = dialpad.findElement(By.id("com.android.contacts:id/six"));
    WebElement seven = dialpad.findElement(By.id("com.android.contacts:id/seven"));
    WebElement eight = dialpad.findElement(By.id("com.android.contacts:id/eight"));
    WebElement nine = dialpad.findElement(By.id("com.android.contacts:id/nine"));
    WebElement zero = dialpad.findElement(By.id("com.android.contacts:id/zero"));
    
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter 11 Digit Number To Call");
       for(int i=1;i<=11;i++){  
        int n = reader.nextInt(); 
        switch (n) {
            case 1:
                one.click();
                break;
            case 2:
                two.click();
                break;
            case 3:
                three.click();
                break;
            case 4:
                four.click();
                break;
            case 5:
                five.click();
                break;
            case 6:
                six.click();
                break;
            case 7:
                seven.click();
                break;
            case 8:
                eight.click();
                break;
            case 9:
                nine.click();
                break;
            case 0:
                zero.click();
                break;
            default:
                break;
        }    
    }  
       reader.close();
    
    WebElement addContactLayout = driver.findElement(By.id("com.android.contacts:id/add_to_contact"));
    WebElement createContactButton = addContactLayout.findElement(By.id("com.android.contacts:id/textCreateToContacts"));
    createContactButton.click();
     
    WebElement createContactWidget = driver.findElement(By.className("android.widget.ListView"));
    WebElement saveToPhone = createContactWidget.findElement(By.id("android:id/text1"));
    saveToPhone.click();
     
    WebElement editorsLayout = driver.findElement(By.id("com.android.contacts:id/editors"));
    WebElement editorName = editorsLayout.findElement(By.className("android.widget.EditText"));
    String n = reader.nextLine(); 
    editorName.sendKeys(n);
     
     
    WebElement saveContactLayout = driver.findElement(By.className("android.widget.LinearLayout"));
    WebElement saveTextButton = saveContactLayout.findElement(By.id("com.android.contacts:id/btn_save"));
    saveTextButton.click();
    }
}
