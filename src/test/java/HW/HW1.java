package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Duncan");
        driver.findElement(By.id("customer.lastName")).sendKeys("Thomas");
        driver.findElement(By.id("customer.address.street")).sendKeys("456 Maple Drive");
        driver.findElement(By.id("customer.address.city")).sendKeys("Los Angeles");
        driver.findElement(By.id("customer.address.state")).sendKeys("California");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("91343");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("818-123-4567");
        driver.findElement(By.id("customer.ssn")).sendKeys("987-65-9856");
        driver.findElement(By.id("customer.username")).sendKeys("dukethomas@ymail.com");
        driver.findElement(By.name("customer.password")).sendKeys("aseoifh12!@");
        driver.findElement(By.name("repeatedPassword")).sendKeys("aseoifh12!@");
        Thread.sleep(5000);
        driver.close();
    }
}


 /* Navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
            Fill out the form
            Close the browser
            Note: use name or id as locators
 */
