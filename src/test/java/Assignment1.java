import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {


    public static void main(String[] args) throws InterruptedException {

        // Initializing the Driver

        WebDriver driver = new ChromeDriver();

        //Giving the site URL
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //selecting the checkbox
        driver.findElement(By.id("checkBoxOption2")).click();

        System.out.println("After Selecting : " + driver.findElement(By.id("checkBoxOption2")).isSelected());

        Thread.sleep(2000);

        driver.findElement(By.id("checkBoxOption2")).click();

        System.out.println("After Unselecting : " + driver.findElement(By.id("checkBoxOption2")).isSelected());


        // Count the no of checkbox
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());


       driver.quit();









    }
}
