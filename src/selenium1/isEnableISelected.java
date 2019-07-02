package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class isEnableISelected {
    public static void main(String[] args) {

        CD.SetChromeMethod("http://practice.cybertekschool.com/checkboxes");

        System.out.println("chcekcBox #1 is not selected: " + CD.passOrFail(!CD.driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]")).isSelected()));

        System.out.println("checkBox #2 is selected: " + CD.passOrFail(CD.driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]")).isSelected()));

        CD.driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]")).click();

        CD.driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]")).click();

        System.out.println("chcekcBox #1 is  selected: " + CD.passOrFail( CD.driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]")).isSelected()));

        System.out.println("checkBox #2 is not selected: " + CD.passOrFail(!CD.driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]")).isSelected()));

        CD.driver.close();
    }
}
