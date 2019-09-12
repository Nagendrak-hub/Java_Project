

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dev03\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		List<WebElement> element = driver.findElements(By.tagName("a"));
		System.out.println(element.size());
		for (int i = 0; i < element.size(); i++) {
			System.out.println(element.get(i).getText());
			if (element.get(i).getText().equals("Sign in")) {
				element.get(i).click();
				//driver.findElement(By.xpath(xpathExpression))
				
				
				
			}
		}

	}


}