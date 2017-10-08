package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) {

		final String webDriverPath = "C:\\SeleniumTest\\chromedriver.exe";
		final String User_NAME = "ctl00$MainContent$txtUserName";
		final String Password = "ctl00$MainContent$txtPassword";
		final String LOGIN = "ctl00$MainContent$btnLogin";

		System.setProperty("webdriver.chrome.driver", webDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");

		// find the element in the webpage

		driver.findElement(By.name(User_NAME)).sendKeys("beso.127.d@gmail.com");;
		driver.findElement(By.name(Password)).sendKeys("");

		WebElement login = driver.findElement(By.name(LOGIN));
		login.click();

		String message = driver.findElement(By.id("conf_message")).getText();
		System.out.println("CONFIRMATION" + message);

		String pageTitle =  driver.getTitle();
		System.out.println(pageTitle);

		if(pageTitle == " SDET Training | Account Management"){
			System.out.println("Page Title test pass");
		}
		//close browser

		driver.close();

	}

}
