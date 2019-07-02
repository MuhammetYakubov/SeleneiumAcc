package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForthAndClick {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Muhammet\\Documents\\Selenium dependensies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("http://google.com");
        //
        driver.findElement(By.linkText("Gmail")).click();
        //
        if(driver.getTitle().contains("Gmail")){
            System.out.println("good");
        }else{
            System.out.println("not good");
        }
        //
        driver.navigate().back();
        if(driver.getTitle().contains("Google")){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        //
        driver.navigate().forward();
        if(driver.getTitle().contains("Gmail")){
            System.out.println("good1");
        }else{
            System.out.println("not good1");
        }

    }
}
