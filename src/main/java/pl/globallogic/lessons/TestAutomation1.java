package pl.globallogic.lessons;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestAutomation1 {
    @Test
    public void shouldDisplaySearchResultsForValidQuery() {
        WebDriver driver = new ChromeDriver();
        String validQuery = "leather bag";
        driver.get("https://www.etsy.com");
        searchFor(driver, validQuery);
        String actualPageTitle = driver.getTitle().toLowerCase();
        driver.quit();
        Assert.assertTrue(actualPageTitle.contains(validQuery));
    }

    @Test
    public void shouldDisplayNotFoundPageForInvalidQuery() {
        String queryForInvalidSearchResultPage = "invalid query"; // Replace with an actual invalid query
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com");
        searchFor(driver, queryForInvalidSearchResultPage);
        WebElement invalidResultMessageHeading = driver.findElement(
                By.xpath("//*[@id='content']/div[1]/div/div/div/div[1]/div/p")
        );
        String invalidResultMessage = invalidResultMessageHeading.getText().toLowerCase();
        driver.quit();
        Assert.assertTrue(invalidResultMessage.contains(queryForInvalidSearchResultPage));
    }


    private static void searchFor(WebDriver driver, String queryForInvalidSearchResultPage) {
        WebElement acceptButton = driver.findElement(By.xpath(
                "//*[@id='gdpr-single-choice-overlay']/div/div[2]/div[2]/button"));
        acceptButton.click();
        WebElement searchField = driver.findElement(By.id("global-enhancements-search-query"));
        searchField.sendKeys(queryForInvalidSearchResultPage + Keys.ENTER);
    }
}
