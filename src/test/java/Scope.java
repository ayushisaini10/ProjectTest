import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Scope {


    public static void main (String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//1. No of links on an entire page

     //   System.out.println(driver.findElements(By.tagName("a")).size());


//2. find the link on the footer section of website - by limiting the webdriver scope

   //     WebElement footerDriver = driver.findElement(By.id("gf-BIG"));  // limiting the Webdriver

     //   System.out.println(footerDriver.findElements(By.tagName("a")).size());


//3. Limiting the webdriver to particular column

       WebElement columnDriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

        System.out.println(columnDriver.findElements(By.tagName("a")).size());


// 4. Capture all links in the column

        List<WebElement> links = columnDriver.findElements(By.tagName("a"));

        for (int i = 1; i < links.size(); i++) {

            // Re-fetch the column & links EVERY iteration
            WebElement freshColumn = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
            List<WebElement> freshLinks = freshColumn.findElements(By.tagName("a"));

            WebElement link = freshLinks.get(i);

            String clickInNewTab = Keys.chord(Keys.COMMAND, Keys.ENTER);
            link.sendKeys(clickInNewTab);

            Thread.sleep(1500);
        }



// 5. capturing all the title in output


        Set <String> abc = driver.getWindowHandles();
        Iterator<String> it = abc.iterator();

        while(it.hasNext())
        {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }


        driver.quit()

    }
}
