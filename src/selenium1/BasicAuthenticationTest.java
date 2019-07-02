package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthenticationTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Muhammet\\Documents\\Selenium dependensies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

      //  driver.manage().window().maximize();
        driver.manage().window().fullscreen();

        driver.get("http://google.com");

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

        driver.findElement(By.name("ctl00$MainContent$login_button")).click();
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();

        if(driver.getTitle().contains("Web Orders")){
            System.out.println("good");
        }else{
            System.out.println("bad");
        }

        driver.close();
    }
}
