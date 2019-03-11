package dlx;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class shop {
	@Test
	public void shop(){
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		WebDriver iphone = new ChromeDriver();
		String url = "http://localhost:8080/mobile_mysql/index.jsp";
		iphone.get(url);
		WebElement input = iphone.findElement(By.name("name"));
		input.sendKeys("jeff");
		WebElement psw_input = iphone.findElement(By.name("password"));
		psw_input.sendKeys("123456");
		WebElement button = iphone.findElement(By.className("input1"));
		button.click();
		iphone.findElement(By.linkText("1  魅族魅蓝U20")).click();
		iphone.findElement(By.linkText("查看详细内容")).click();
		
		String winHandleBefore = iphone.getWindowHandle();
		for(String winHandle : iphone.getWindowHandles()) {
		if (winHandle.equals(winHandleBefore)) {
		continue;
		}
		iphone.switchTo().window(winHandle);
		break;
		}
		
		iphone.findElement(By.name("Submit")).click();
		Alert submit = iphone.switchTo().alert();
		submit.accept();
		iphone.findElement(By.className("a4")).click();
		iphone.findElement(By.linkText("去收银台结账")).click();
		WebElement address = iphone.findElement(By.name("address"));
		address.sendKeys("天堂街");
		iphone.findElement(By.name("tel")).sendKeys("1008611");
		WebElement money = iphone.findElement(By.name("setMoney"));
		Select monkey = new Select(money);
		monkey.selectByIndex(2);
		WebElement post = iphone.findElement(By.name("post"));
		Select post1 = new Select(post);
		post1.selectByIndex(2);
		iphone.findElement(By.name("Submit2")).click();
		Alert submit2 = iphone.switchTo().alert();
		submit2.accept();
		submit2.accept();
	}
}
