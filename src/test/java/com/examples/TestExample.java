package com.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class TestExample {

    private static WebDriver driver;
    private static Search searchPage;

    private String product1 = "flowers";
    private String product2 = "mushrooms";

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Arrays.asList("ignore-certificate-errors"));
        driver = new ChromeDriver(options);
        searchPage = new Search(driver);
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

    @Test(description = "Search Tests", groups = {"simple","checklist critico"})
    public void testMethod() throws InterruptedException{
        searchPage.searchString(product1);
        searchPage.searchString(product2);
    }
}