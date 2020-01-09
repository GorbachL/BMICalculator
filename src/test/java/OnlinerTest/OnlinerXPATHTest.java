package OnlinerTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OnlinerXPATHTest {

    /*
    ancestor +(1)
    ancestor-or-self +(2)
    attribute +(3)
    child
    descendant +(3)
    descendant-or-self
    following +(3)
    following-sibling
    namespace
    parent +(4)
    preceding +(5)
    preceding-sibling
    self
     */

    @Test
    public void verifyOnlinerUsingXPATH() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://catalog.onliner.by/");
        driver.manage().window().maximize();

        WebElement webElement1 = driver.findElement(By.xpath("//*[contains(text(), 'Услуги')]//ancestor::span[@class='b-main-navigation__text']"));
        webElement1.click();

        driver.navigate().back();

        WebElement webElement2 = driver.findElement(By.xpath("//ancestor-or-self::span[@class='_u']/following::a[@class='b-top-navigation-informers__link']"));
        webElement2.click();

        driver.navigate().back();

        WebElement webElement3 = driver.findElement(By.xpath("//attribute::id['currency-informer']/following::ul[@class='b-top-navigation-informers helpers_hide_desktop']/descendant::li[@class='b-top-navigation-informers__item top-informer-currency up']"));
        webElement3.click();

        driver.navigate().back();

        WebElement webElement4 = driver.findElement(By.xpath("//parent::li[@class='b-main-navigation__item b-main-navigation__item_arrow']"));
        webElement4.click();

        driver.navigate().back();

        WebElement webElement5 = driver.findElement(By.xpath("//*[contains(text(), 'Барахолка')]/preceding::li[@class='b-main-navigation__item']"));
        webElement5.click();

        driver.quit();
    }
}
