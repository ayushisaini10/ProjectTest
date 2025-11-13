import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class WindowActiviy {

    public static void main(String[] args) {

        // Initializing the Driver

        WebDriver driver = new ChromeDriver();

        //Giving the site URL
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

     //   Maximize the window

        driver.manage().window().fullscreen();

     // back and forward navigation in window

       driver.navigate().back();

       driver.navigate().forward();

        driver.quit();





    }

}
