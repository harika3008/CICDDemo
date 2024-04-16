import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {


    @Test
    public void start(){
        WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.amazon.com");
       System.out.println("---------------------------Opened browser---------------------------");
       driver.manage().window().maximize();
       driver.quit();
    }
}
