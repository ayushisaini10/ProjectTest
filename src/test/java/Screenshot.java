import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {


    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();  // to maximiz the window

        driver.manage().deleteAllCookies();  // to remove cookies


        //    driver.manage().getCookieNamed("key");  // to remove particular cookie

       driver.get("https://www.myntra.com/");


       // how to take screenshot in  files
       File src =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(src,new File("/Users/ayugemini/downloads/screenshot.png"));

        driver.quit();



    }

}
