import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

    public static void main(String[] args) throws InterruptedException {

        // Initializing the Driver

        WebDriver driver = new ChromeDriver();

        //Giving the site URL
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("divpaxinfo")).click();

        Thread.sleep(3000);

      /*  int i= 1;
        while (i<6)
       {
           driver.findElement(By.id("hrefIncAdt")).click();    // 6clicks
           i++;
        }
    */

        for (int i=1; i<6; i++)
        {
            driver.findElement(By.id("hrefIncAdt")).click();   // 6 clicks
        }



        Thread.sleep(2000L);
        driver.findElement(By.id("btnclosepaxoption")).click();

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());




driver.quit();




    }
}
