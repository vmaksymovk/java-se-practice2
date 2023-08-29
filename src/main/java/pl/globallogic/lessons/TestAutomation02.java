package pl.globallogic.lessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestAutomation02 {
    private boolean isSearchResultItemTitles(WebDriver driver, String validQuery) {
        List<WebElement> itemTitles = driver.findElements(By.cssSelector("h3.v2-listing-card__title"));
        List<String> tokenizedQuery = List.of(validQuery.toLowerCase().split(" "));
        for (WebElement title : itemTitles) {
            List<String> tokenizedTitle = List.of(title.getText().toLowerCase().split(" "));
            if (!tokenizedTitle.containsAll(tokenizedQuery)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Replace with the URL you want to navigate to
        driver.get("https://www.example.com");

        TestAutomation02 automation = new TestAutomation02();

        // Replace with the desired search query
        String searchQuery = "your search query";

        boolean result = automation.isSearchResultItemTitles(driver, searchQuery);
        System.out.println("Search result validation: " + result);

        // Close the browser
        driver.quit();
    }
}
