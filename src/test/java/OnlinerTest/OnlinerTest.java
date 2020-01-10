package OnlinerTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class OnlinerTest {

    @Test
    public void verifyOnliner() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://catalog.onliner.by/");
        driver.manage().window().maximize();

        //classname (1)
        WebElement webElement = driver.findElement(By.className("fast-search__input"));
        webElement.sendKeys(Keys.ENTER);
        webElement.sendKeys("abc");

        driver.navigate().back();

        //xpath (2)
        WebElement webElement1 = driver.findElement(By.xpath("//a[text()='Мобильные телефоны']"));
        webElement1.click();

        //linktext (3)
        WebElement webElement2 = driver.findElement(By.linkText("Автобарахолка"));
        webElement2.click();

        //partiallinktext (4)
        WebElement webElement3 = driver.findElement(By.partialLinkText("Мото"));
        webElement3.click();

        //css (5)
        WebElement webElement4 = driver.findElement(By.cssSelector("a.project-navigation__link.project-navigation__link_primary"));
        webElement4.click();

        driver.navigate().back();

        //id (6)
        driver.get("https://catalog.onliner.by/");
        WebElement webElement5 = driver.findElement(By.id("widget-18"));
        webElement5.click();

        //name (7)
        WebElement webElement6 = driver.findElement(By.name("query"));
        webElement6.sendKeys(Keys.ENTER);
        webElement6.sendKeys("123");

        driver.navigate().back();

        //tagname (8)
        WebElement webElement7 = driver.findElement(By.tagName("input"));
        webElement7.sendKeys("abc+123");

        driver.quit();
    }
}
