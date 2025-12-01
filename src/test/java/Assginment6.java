import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Assginment6 {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

// clicking on checkbox
        driver.findElement(By.id("checkBoxOption3")).click();

// storing the value of box title
        String clickedBox = driver.findElement(By.cssSelector("label[for='honda']")).getText();

        WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));

        Select s = new Select(dropDown);

        s.selectByVisibleText(clickedBox); // pass captured value to dropdown

        driver.findElement(By.name("enter-name")).sendKeys(clickedBox); // sending same text to another field

        driver.findElement(By.id("alertbtn")).click();

        String text = driver.switchTo().alert().getText();

        if (text.contains(clickedBox)) {
            System.out.println("Alert mgs text");
        } else {
            System.out.println("Something went wrong");
        }

        System.out.println("Text on the alert message " + text);
      driver.switchTo().alert().accept();




        driver.quit();


    }


}
