package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleVerification {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Muhammet\\Documents\\Selenium dependensies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
//test1
        driver.get("http://google.com");

        if(driver.getTitle().equals("Google")){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
//test2
        driver.get("https://cybertekschool.com/");
        if(driver.getCurrentUrl().contains("cybertekschool")){
            System.out.println("true");
        }else{
            System.out.println("false");
        }




    }
}
