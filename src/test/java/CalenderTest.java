import org.bouncycastle.util.StringList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class CalenderTest {

    public static  void main (String[] args) throws InterruptedException {

        String Date = "10";
        String Month = "5" ;
        String Year = "2028" ;

        String [] expectedList ={ Month,Date,Year };

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        driver.findElement(By.className("react-date-picker__inputGroup")).click();

        driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();

        driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();

        driver.findElement(By.xpath("//button[text()='" + Year + "']")).click();

// Wait for month view
        Thread.sleep(1000);

        driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(Month)-1).click();

        driver.findElement(By.xpath("//abbr[text()='"+Date+"']")).click();


        List<WebElement> actualList= driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));

      for(int i =0; i<actualList.size(); i++)

      {
         /* System.out.println("i = "+i);
          System.out.println("actualList at i = "+actualList.get(i));
          System.out.println("actualList.get(i).getAttribute  = "+actualList.get(i).getAttribute("value"));     */
          Assert.assertEquals(actualList.get(i).getAttribute("value"), expectedList[i]);
      }


      driver.close();








    }





    }
