package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Muhammet\\Documents\\Selenium dependensies\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        // driver.manage().window().fullscreen();

        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement login = driver.findElement(By.id("user_login"));
        WebElement submit = driver.findElement(By.name("submit"));
        WebElement password= driver.findElement(By.id("user_password"));


        login.sendKeys("username");
        password.sendKeys("password");

        submit.click();

        System.out.println(driver.findElement(By.linkText("username")).getText());

        if(driver.findElement(By.linkText("username")).getText().contains("username")){
            System.out.println("Username verification PASSED!");
        }else{
            System.out.println("Username vefication FAILED!!!");
    }
        if("Zero - Account Summary".equals(driver.getTitle())){
            System.out.println("title verification PASSED!");
        }else{
            System.out.println("Title verification Failed");
        }

        WebElement accaountSummaryLink = driver.findElement(By.linkText("Account Summary"));
        if(accaountSummaryLink.getAttribute("href").contains("account-summary")){
            System.out.println("Expected HREF is inside of the actual HREF");
        }else {
            System.out.println("Expected HREF is not inside of actual HREF");
            System.out.println("HREF verification failed!!!");
        }
        driver.close();
    }
}
