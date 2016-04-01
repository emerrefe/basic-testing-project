package com.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search{

    public static WebDriverWait wait;
    public static WebDriver driver;

    //webElements
    @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
    private WebElement searchInput;

    @FindBy(xpath = "//*[@id='nav-search']/form/div[2]/div/input")
    private WebElement searchButton;

    public Search(WebDriver d2){
        driver = d2;
        PageFactory.initElements(driver, this);
    }

    public void searchString(String product){
        driver.get("https://www.amazon.com");
        searchInput.sendKeys(product);
        searchButton.click();
    }
}