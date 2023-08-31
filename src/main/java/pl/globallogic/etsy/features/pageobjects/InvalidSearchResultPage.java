package pl.globallogic.etsy.features.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InvalidSearchResultPage {
    private static final String INVALID_MESSAGE_HEADER = "//p[contains(@class, 'wt-text-heading-02')]";

    private WebDriver driver;

    public InvalidSearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isVisible() {
        WebElement invalidResultMessageHeading = new WebDriverWait(driver, Duration.ofSeconds(5)).
                until(ExpectedConditions.visibilityOfElementLocated(By.xpath(INVALID_MESSAGE_HEADER)));
        return invalidResultMessageHeading.isDisplayed();
    }

}
