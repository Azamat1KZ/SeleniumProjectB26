package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) {

        // setting up Webdriver manager
        WebDriverManager.chromedriver().setup();
        // creating instance of Webdriver
        WebDriver driver = new ChromeDriver();
        // maximizing the browser window
        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com/");

        // actual title comes from Selenium
        String actualTitle = driver.getTitle();
        System.out.println("Actual title: " + actualTitle);

        // expected title comes from requirements
        String expectedTitle = "Yahoo";

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verification is passed");
        }else{
            System.out.println("Title verification is failed");
        }

        driver.quit();
    }
}
