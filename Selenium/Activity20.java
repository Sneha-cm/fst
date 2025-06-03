import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity20 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("https://training-support.net/webelements/alerts");
        System.out.println("Title loaded: " + driver.getTitle());

        driver.findElement(By.id("prompt")).click();

        Alert alertPrompt = driver.switchTo().alert();
        System.out.println("Prompt says: " + alertPrompt.getText());

        alertPrompt.sendKeys("Sneha");
        alertPrompt.accept();  

        String response = driver.findElement(By.id("result")).getText();
        System.out.println("Response shown: " + response);

        driver.quit();
    }
}
