package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hii\\Downloads\\chromedriver_win32\\chromedriver.exe");
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hii\\Desktop\\Graphs\\Tensile Strength\\chromedriver.exe");
   //     WebDriver driver= new ChromeDriver();
        WebDriver driver = BrowserLunch.callbrowser1();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        driver.get("https://login.yahoo.com/?.intl=us");
   //   WebElement id = driver.findElement(By.xpath("//input[@name=\"username\"]"));
  //    id.sendKeys("alsksj");
  //    WebElement ft = driver.findElement(By.xpath("//input[@id=\"login-signin\"]"));
  //    ft.click();
        WebElement ca = driver.findElement(By.xpath("//a[@id=\"createacc\"]"));
       // ca.click();
        
          //sendkeys method
   //        ca.sendKeys(Keys.ENTER);
        WebElement check = driver.findElement(By.xpath("//input[@id=\"persistent\"]"));
    //    check.sendKeys(Keys.ENTER);
        
        
        // java executor
        JavascriptExecutor js = ((JavascriptExecutor)driver);
    //    js.executeScript("document.getElementById(\"createacc\").click();");
   //     js.executeScript("document.getElementById(\"persistent\").click();");
        js.executeScript("arguments[0].click()", check);
        Thread.sleep(1500);
        js.executeScript("arguments[0].click()", ca);
        
        Thread.sleep(3500);
        driver.close();
	}

}
