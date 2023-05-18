package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {

    public static void main(String[] args) throws InterruptedException {
        //        instance
        WebDriver driver=new ChromeDriver();
//       navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
//        maximize the windows
        driver.manage().window().maximize();

//        send some text in the username
//        find the element                .  send some text
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

//          send some text to the password field
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

//          slow down here
        Thread.sleep(2000);

//        print the title on the console
        String title = driver.getTitle();
        System.out.println(title);
//        confirm that the title is "Web Orders Login"
        if(title.equals("Web Orders Login")){
            System.out.println("the title is correct");
        }
        else{
            System.out.println("the title is incorrect");
        }
//        close
        driver.quit();
    }

}


/*
Navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
Enter the username “Tester”
Enter the password “test”
Get the title of the webPage and confirm that it is “Web Orders Login”

 */

