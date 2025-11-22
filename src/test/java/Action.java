import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Action {

    public static  void main (String[] args){



        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        //mouseover on object   -create action class-
        Actions a = new Actions(driver);

        WebElement mouse = driver.findElement(By.id("nav-link-accountList"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // shift key is converting into upper case  & double click is selecting that word
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Cream").doubleClick().build().perform();

        // contextclick it will open the right click option as in mouse
         a.moveToElement(mouse).contextClick().build().perform();










     driver.quit();


    }


    }
