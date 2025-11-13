import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {
    public static void main(String[] args) {

        // Initializing the Driver

        WebDriver driver = new ChromeDriver();

        //Giving the site URL
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // Dropdown with static text

        WebElement StaticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

        Select dropdown = new Select(StaticDropdown);

        dropdown.selectByIndex(1);

        System.out.println(dropdown.getFirstSelectedOption().getText());

        dropdown.selectByVisibleText("USD");

        System.out.println(dropdown.getFirstSelectedOption().getText());

        dropdown.selectByValue("AED");

        System.out.println(dropdown.getFirstSelectedOption().getText());

        driver.quit();







    }

}
