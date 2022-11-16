package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFox_Browser {
    public static void main(String[] args) {

        String baseUrl = "http://the-internet.herokuapp.com/login";
        //Set up FireFox browser
        System.setProperty("webdriver.firefox.driver", "drivers/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        //Open URL
        driver.get(baseUrl);
        driver.manage().window().maximize();

        //Implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        //Print the current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source is: " + driver.getPageSource());

        //Enter the email to email field
        driver.findElement(By.name("username"));
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("tomsmith");

        //Enter the password to password field
        driver.findElement(By.name("password"));
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("SuperSecretPassword!");

        //Close the browser
        //driver.quit();
    }
}
