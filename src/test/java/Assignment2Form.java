import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.plaf.TableHeaderUI;

public class Assignment2Form {


    public static void main(String[] args) throws InterruptedException {

        // Initializing the Driver

        WebDriver driver = new ChromeDriver();

        //Giving the site URL
        driver.get("https://rahulshettyacademy.com/angularpractice");

        Thread.sleep(2000);

        //name

        driver.findElement(By.name("name")).sendKeys("Ayushi");

        //email
        driver.findElement(By.name("email")).sendKeys("ayu@yopmail.com");

        //password
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("Test@123");

        // Checkbox
        driver.findElement(By.id("exampleCheck1")).click();



        // Static Dropdown (Gender)
        WebElement genderDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select dropdown = new Select(genderDropdown);
        dropdown.selectByVisibleText("Female");


       Thread.sleep(1000);

       // Radio Button
        driver.findElement(By.id("inlineRadio1")).click();


        // DOB
        driver.findElement(By.name("bday")).sendKeys("16/10/2000");

        Thread.sleep(2000);

        
        // Submit button
        driver.findElement(By.cssSelector(".btn-success")).click();


        //mgs
        System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());



        // driver close
        driver.quit();


    }
}
