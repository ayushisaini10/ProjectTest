import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {

    public static void main(String[] args) throws InterruptedException {


        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the OrangeHRM demo site
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Wait 3 seconds for elements to load

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Enter username
        //  driver.findElement(By.name("username")).sendKeys("Admi");

        // Enter Password
        //   driver.findElement(By.name("password")).sendKeys("admi123");

        // Click Login button
        //  driver.findElement(By.className("orangehrm-login-button")).click();


        // Wait to see result
        //    Thread.sleep(3000);

        //   System.out.println("Login Successfully");

        //  System.out.println(driver.findElement(By.cssSelector(".oxd-alert-content.oxd-alert-content--error")).getText());




        driver.findElement(By.linkText("Forgot your password?")).click();




        // Close browser
        driver.quit();






            }
        }









