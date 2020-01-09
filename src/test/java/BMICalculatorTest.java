import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BMICalculatorTest {

    @Test
    public void calculateBMICms() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");

        /*
        1. Open browser
        2. Go to Link https://healthunify.com/bmicalculator/
        3. Find element for weight
        4. Enter Weight
        5. Enter Height
        6. Find Calculate button
        7. Verify BMI
        8. Verify BMI all
        9. Find result label
        10. Close browser
         */

        WebDriver browser = new ChromeDriver();

        browser.get("https://healthunify.com/bmicalculator/");
        browser.findElement(By.name("wg")).sendKeys("82");
        browser.findElement(By.name("ht")).sendKeys("187");
        browser.findElement(By.name("cc")).click();

        String siUnits = browser.findElement((By.name("si"))).getAttribute("value");
        String usUnits = browser.findElement(By.name("us")).getAttribute("value");
        String ukUnits = browser.findElement(By.name("uk")).getAttribute("value");

        String category = browser.findElement(By.name("desc")).getAttribute("value");

        assertEquals(category, "Your category is Normal", "Category is not matched");

        //System.out.println(category +" - "+" SI Units: "+ siUnits +" US Units: "+ usUnits +" UK Units: "+ ukUnits);

        new Select(browser.findElement(By.name("opt1"))).selectByVisibleText("pounds");

        browser.quit();

    }
}
