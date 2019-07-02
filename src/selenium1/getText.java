package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Muhammet\\Documents\\Selenium dependensies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();
       // driver.manage().window().fullscreen();

        driver.get("http://zero.webappsecurity.com/login.html");

       // System.out.println(driver.findElement(By.className("page-header")).getText());


        System.out.println(driver.findElement(By.linkText("Forgot your password ?")).getAttribute("href"));

        if(driver.findElement(By.linkText("Forgot your password ?")).getAttribute("href").contains("/forgot-password.html")){
            System.out.println("Link verificatoin is Passed");

        }else{
            System.out.println("Link verification is Failed!!!!");

        }
      //  driver.close();
    }
}