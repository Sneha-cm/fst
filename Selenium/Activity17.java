import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {
    public static void main(String[] args) {
        WebDriver browser = new FirefoxDriver();

        browser.get("https://training-support.net/webelements/selects");
        String heading = browser.getTitle();
        System.out.println("Page title: " + heading);
        
        WebElement menu = browser.findElement(By.cssSelector("select.h-80"));
        Select dropdown = new Select(menu);
        
        dropdown.selectByVisibleText("HTML");

        int[] indexes = {3, 4, 5};
        for (int index : indexes) {
            dropdown.selectByIndex(index);
        }

        dropdown.selectByValue("nodejs");

        System.out.println("Selected options are:");
        displaySelected(dropdown);

        dropdown.deselectByIndex(4);

        System.out.println("Selected options are:");
        displaySelected(dropdown);

        browser.quit();
    }

    public static void displaySelected(Select dropdown) {
        List<WebElement> selected = dropdown.getAllSelectedOptions();
        for (WebElement item : selected) {
            System.out.println(item.getText());
        }
    }
}
