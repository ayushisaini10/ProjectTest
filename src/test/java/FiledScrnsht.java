import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class FiledScrnsht {


    public static void main(String[] args) throws IOException {

// TODO Auto-generated method stub

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

//Screenshot

        WebElement name = driver.findElement(By.cssSelector("[name='name']"));

        java.io.File file = name.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(file, new java.io.File("name.png"));


//GEt Height & Width

        System.out.println(name.getRect().getDimension().getHeight());

        System.out.println(name.getRect().getDimension().getWidth());


    }


}








