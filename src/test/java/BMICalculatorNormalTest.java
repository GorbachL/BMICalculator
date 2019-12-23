import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BMICalculatorNormalTest {

    /*
    BMI = weight (kg)/ height (m)2
    cms = 161 >> 1.61 * 1.61 = 2.5921
    48 <= kg <= 64.8
     */

    @Test
    public void culculateBMINormalCsm() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver");

        WebDriver browser = new ChromeDriver();

        browser.get("https://healthunify.com/bmicalculator/");

        browser.findElement(By.name("wg")).sendKeys("64");
        browser.findElement(By.name("ht")).sendKeys("161");
        browser.findElement(By.name("cc")).click();

        String category = browser.findElement(By.name("desc")).getAttribute("value");

        assertEquals(category, "Your category is Normal", "Category does not match.");

        System.out.println(category);

        browser.quit();
    }
}
