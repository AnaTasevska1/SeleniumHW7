package HWclass7;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Task1 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();
        WebElement pimBtn = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimBtn.click();

        List<WebElement> allIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

        for (int i = 0; i < allIDs.size(); i++) {
            String id= allIDs.get(i).getText();
            if(id.equals("34405466")) {
                System.out.println("The ID is on row number: "+(i+1));
            }
        } driver.close();
    }
}

/*
goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
login
click on PIM
from the table choose any ID
and print out the row number of that id

please make sure that ur code is dynamic enough to cater if another row gets deleted , it still prints the row correctly
 */
