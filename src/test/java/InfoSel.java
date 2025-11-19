import com.github.dockerjava.api.model.Driver;
import com.github.dockerjava.api.model.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InfoSel {


    public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();
    driver.get("https://demoqa.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }







}
