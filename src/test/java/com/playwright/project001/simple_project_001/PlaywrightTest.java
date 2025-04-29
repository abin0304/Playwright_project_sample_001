package com.playwright.project001.simple_project_001;
import com.microsoft.playwright.*;

public class PlaywrightTest {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        // Create Playwright instance
    	Playwright playwright = Playwright.create();
            // Launch Chrome browser
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(1000));
            
            // Open a new page
            Page page = browser.newPage();
            
            page.navigate("https://www.saucedemo.com/v1/");
           
            page.locator("//input[@id='user-name']").fill("standard_user");
            
            page.locator("//input[@id='password']").fill("secret_sauce");
            
            page.locator("//input[@id='login-button']").click();
            
            page.waitForSelector("select.product_sort_container");
            page.selectOption("select.product_sort_container", "lohi");
            
            page.click("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button");
            
            page.click("//a[@class='shopping_cart_link fa-layers fa-fw']//*[name()='svg']");
            
            System.out.println("Inside cart");
            
            page.click("//a[@class='btn_action checkout_button']");
            
            page.locator("//input[@id='first-name']").fill("User1234");
            page.locator("//input[@id='last-name']").fill("name");
            page.locator("//input[@id='postal-code']").fill("1221");
            
            page.click("//input[@value='CONTINUE']");
            
            page.locator("//a[@class='btn_action cart_button']").scrollIntoViewIfNeeded();
            page.click("//a[@class='btn_action cart_button']");
            
            page.click("//button[normalize-space()='Open Menu']");
            page.click("//a[@id='logout_sidebar_link']");
            
            System.out.println("success");
              
         // Print page title
            System.out.println("Page Title: " + page.title());
            
            // Close the browser
           // browser.close();
        }
    }
