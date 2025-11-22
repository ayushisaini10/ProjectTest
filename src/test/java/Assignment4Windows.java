import javassist.tools.web.Webserver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Assignment4Windows {


    public static  void main (String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

      //  driver.findElement(By.cssSelector("a[href='/windows']");

        Thread.sleep(2000);


        driver.findElement(By.linkText("Multiple Windows")).click();

        driver.findElement(By.linkText("Click Here")).click();


        Set<String> wind = driver.getWindowHandles(); //[parentid,childid,subchildId]

        Iterator<String> it = wind.iterator();

        String parentId = it.next();


        driver.switchTo().window(it.next());

        System.out.println(driver.findElement(By.xpath("//div/h3")).getText());

driver.switchTo().window(parentId);

        System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());









        driver.quit();


    }


}
