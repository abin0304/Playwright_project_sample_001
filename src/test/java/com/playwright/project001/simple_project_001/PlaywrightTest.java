package com.playwright.project001.simple_project_001;
import com.microsoft.playwright.*;

public class PlaywrightTest {
    public static void main(String[] args) {
        // Create Playwright instance
        try (Playwright playwright = Playwright.create()) {
            // Launch Chrome browser
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            
            // Open a new page
            Page page = browser.newPage();
            
            // Navigate to Saucedemo website
            page.navigate("https://www.saucedemo.com/v1/");
            
            // Print page title
            System.out.println("Page Title: " + page.title());
            
            // Close the browser
            browser.close();
        }
    }
}
