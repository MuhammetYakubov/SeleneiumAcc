package selenium1;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class ibragimTest  {
    public static void main(String[] args) {
        CD.SetChromeMethod("https://play.typeracer.com/");

        CD.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        CD.driver.findElement(By.linkText("Enter a typing race")).click();
        CD.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        CD.driver.close();
    }
}
