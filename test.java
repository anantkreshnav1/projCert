import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class test {

	public static void main(String[] args) {
	
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://13.212.20.82:81/");
        WebElement button = driver.findElement(By.id("About Us"));
        assert(button.isDisplayed());
        System.out.println("Button 'About Us' is there?: " + button.isDisplayed());
        button.click();
        assert(button.getText().equals("About Us"));
        driver.close();

	}

}
