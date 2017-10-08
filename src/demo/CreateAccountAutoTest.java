package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateAccountAutoTest {

	public static void main (String[] args){

		final String WEB_DRIVER = "C:\\SeleniumTest\\geckodriver.exe";
		final String UserName = "ctl00$MainContent$txtFirstName";
		final String E_MAIL = "MainContent_txtEmail";
		final String Phone = "MainContent_txtHomePhone";

		System.setProperty("webdriver.gecko.driver", WEB_DRIVER);
		WebDriver driver = new FirefoxDriver();

		//open Browser
		driver.get("http://sdettraining.com/trguitransactions/NewAccount.aspx");
		WebElement button =  driver.findElement(By.linkText("Create Account"));
		button.click();

		//Fill out the form 
		driver.findElement(By.name(UserName)).sendKeys("Bassam");
		driver.findElement(By.id(E_MAIL)).sendKeys("bes.ss@gmail.com");
		driver.findElement(By.id(Phone)).sendKeys("22259877");

	}

}
