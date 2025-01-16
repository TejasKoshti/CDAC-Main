package com.example.Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set up the Chrome WebDriver (adjust the path to chromedriver as needed)
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://artoftesting.com/samplesiteforselenium"); // Replace with the actual URL
    }

    @Test
    public void testTextBoxAndButton() {
        // Locate text box using ID and send text
        WebElement textBox = driver.findElement(By.id("fname"));
        textBox.sendKeys("YADNYESH");

        // Locate button using CSS selector and click
        WebElement button = driver.findElement(By.id("dblClkBtn"));
        button.click();
        button.click();

        // Assertion to verify success message
        WebElement successMessage = driver.findElement(By.id("dblClkBtn"));
        Assert.assertEquals(successMessage.getText(), "Double-click to generate alert box", "Text box test failed");
    }

    @Test
    public void testRadioButtonSelection() {
        // Locate radio button using id and select it
        WebElement radioButton = driver.findElement(By.id("male"));
        radioButton.click();

        // Assert radio button is selected
        Assert.assertTrue(radioButton.isSelected(), "Radio button selection test failed");
    }

    @Test
    public void testDropdownInteraction() {
        // Locate dropdown using ID
    	WebElement dropdown = driver.findElement(By.xpath("//select[@id='testingDropdown']"));

        // Select an option using Select class
        Select select = new Select(dropdown);
        select.selectByVisibleText("Manual Testing");

        // Assert the selected option
        WebElement selectedOption = select.getFirstSelectedOption();
        Assert.assertEquals(selectedOption.getText(), "Manual Testing", "Dropdown selection test failed");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}

