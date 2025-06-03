import java.awt.Checkbox;
import java.sql.Driver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Activity11 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.training-support.net/webelements/dynamic-controls");
        System.out.println("Page title is: " + driver.getTitle());

        WebElement checkbox = driver.findElement(By.id("checkbox"));
        System.out.println("Checkbox is visible:" + checkbox.isDisplayed());

        WebElement toggleBtn = driver.findElement(By.xpath("//button[text()='Toggle Checkbox']"));
        toggleBtn.click();
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
        
        toggleBtn.click();
        WebElement newCheckbox = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("checkbox")));
        newCheckbox.click();
        System.out.println("Checkbox is selected: " + newCheckbox.isSelected());

        driver.quit();
    }
}


		



