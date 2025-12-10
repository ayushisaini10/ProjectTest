import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class SSLCertificate {

    public static void main (String[] args){

      /*  ChromeOptions Options = new ChromeOptions();
        Options.setAcceptInsecureCerts(true);


        WebDriver driver = new ChromeDriver(Options);
        driver.get("https://expired.badssl.com/");

        System.out.println(driver.getTitle());


        driver.close();

*/

       SafariOptions Opt = new SafariOptions();
        Opt.setAcceptInsecureCerts(true);

        SafariDriver driver = new SafariDriver(Opt);
        driver.get("https://expired.badssl.com");

        System.out.println(driver.getTitle());

        driver.close();





    }
}
