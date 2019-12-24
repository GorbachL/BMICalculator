import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BMICalculatorObeseTest {

    /*
    BMI = weight (kg)/ height (m)2
    cms = 161 >> 1.61 * 1.61 = 2.5921
    77.8 <= kg
     */

    @Test
    public void culculateBMIObeseCsm() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver");

        WebDriver browser = new ChromeDriver();

        browser.get("https://healthunify.com/bmicalculator/");

        browser.findElement(By.name("wg")).sendKeys("77.8");
        browser.findElement(By.name("ht")).sendKeys("161");
        browser.findElement(By.name("cc")).click();

        String category = browser.findElement(By.name("desc")).getAttribute("value");

        assertEquals(category, "Your category is Obese", "Category does not match.");

        System.out.println(category);
        browser.quit();
    }
}
