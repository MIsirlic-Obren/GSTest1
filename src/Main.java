

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

   
    public static void main(String[] args) {
        
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       
       driver.get("https://app.getswift.co/Account/Login?ReturnUrl=%2fAdmin%2fIndex%2f");
       
       
       WebElement usernameField=driver.findElement(By.name("Email"));
       usernameField.sendKeys("obrenakaksdr@hotmail.com");
       
       WebElement passwordField=driver.findElement(By.name("Password"));
       passwordField.sendKeys("436598obi1");
       
       WebElement loginButton=driver.findElement(By.xpath("//*[@id=\"form-account-login\"]/button"));
       loginButton.click();
       
      
       
       
     
        
        
    }
    
}
