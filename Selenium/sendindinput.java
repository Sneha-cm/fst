import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sendindinput {
    public static void main(String[] args) {
        // Launch Firefox
        WebDriver driver = new FirefoxDriver();

        // Open the login page
        driver.get("https://training-support.net/webelements/login-form/");

        // Print the page title
        System.out.println("Page Title: " + driver.getTitle());

        // Enter username
        driver.findElement(By.id("username")).sendKeys("admin");

        // Enter password
        driver.findElement(By.id("password")).sendKeys("password");

        // Click login button
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        System.out.println(driver.findElement(By.tagName("h2")).getText());


        // Close browser
        driver.quit();
    }
}