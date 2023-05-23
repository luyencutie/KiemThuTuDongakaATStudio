package Hasaki;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.fpt.ivs.at.core.utilities.WebDriverUtilities;
public class Search {
	public void SearchHa(String search ) throws InterruptedException
		{
			RemoteWebDriver driver = WebDriverUtilities.getDriver();
				driver.get("https://hasaki.vn/");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[@id='onesignal-slidedown-cancel-button']")).click();
				driver.findElement(By.xpath("//input[@id='search']")).click();
				driver.findElement(By.xpath("//input[@id='search']")).sendKeys(search);
                driver.findElement(By.xpath("//img[@class='icon_search loading']")).click();
		}

}