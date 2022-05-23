import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogDemo {

	public static void main(String[] args) {
		
		Logger log = LogManager.getLogger(LogDemo.class.getName());
		
		log.debug("Demo Test Execution has started");
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\15099\\eclipse-workspace\\LogsDemo\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		log.debug("Chrome Test got launched");
		
		driver.manage().window().maximize();
		
		log.debug("Got maximized");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://omayo.blogspot.com/");
		log.debug("Navigated to the App");
		
		driver.findElement(By.linkText("compendiumdev")).click();
		log.debug("Clicked on the link");

		driver.navigate().back();
		driver.navigate().forward();
		
		if (driver.getTitle().equals("Basic Web Page Title")) {
			

			log.info("Success");
			//Do something
			
		}else {
			//Do some

			log.error("Non-Success");
		}
		
		driver.close();
		log.debug("Browser got closed and Test has got ...end");

	}

}
