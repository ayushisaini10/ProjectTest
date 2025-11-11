import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) {


        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the OrangeHRM demo site
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Enter username
        driver.findElement(By.name("username")).sendKeys("Admin");

        // Enter Password
        driver.findElement(By.name("password")).sendKeys("admin123");

        // Click Login button
        driver.findElement(By.className("orangehrm-login-button")).click();;

        System.out.println("Login Successfully");


        // Close browser
        driver.quit();


            }
        }









