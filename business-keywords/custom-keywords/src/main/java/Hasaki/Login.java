package Hasaki;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.fpt.ivs.at.core.utilities.WebDriverUtilities;
public class Login {
		public void LoginHa(String email, String password ) throws InterruptedException
		{
			RemoteWebDriver driver = WebDriverUtilities.getDriver();
				driver.get("https://hasaki.vn/");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[@id='onesignal-slidedown-cancel-button']")).click();
				driver.findElement(By.xpath("//a[@id='btn-login']")).click();
				driver.findElement(By.xpath("//input[@id='username']")).click();
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
                driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
                driver.findElement(By.xpath("//button[contains(text(),'Đăng nhập')]")).click();
		}
}