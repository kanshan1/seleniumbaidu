package day02;

import static org.junit.Assert.*;

import java.rmi.server.SocketSecurityException;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cz {
	@Test
	public void open() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		WebDriver web = new ChromeDriver();
		String url = "file:///E:/%E4%B8%8A%E8%AF%BE/%E6%B5%8B%E8%AF%95-%E9%BB%84%E5%A8%9F/%E6%B5%8B%E8%AF%95/index.html";
		web.get(url);
		WebElement input = web.findElement(By.id("user"));
		input.sendKeys("����Ϊ");
		WebElement select = web.findElement(By.id("moreSelect"));
		Select s = new Select(select);
		s.selectByIndex(4);//��һ�ַ���:byindex
//		Thread.sleep(1000);
//		s.selectByValue("oppe");//�ڶ���:byvalue
//		Thread.sleep(1000);
//		s.selectByVisibleText("xiaomi");//������:�ɼ�ֵbyvisibletext
		WebElement Dx = web.findElement(By.className("Saab"));
		Dx.click();
		System.out.println(Dx.isSelected());
		WebElement Duox = web.findElement(By.name("checkbox2"));
		if(!Duox.isSelected()){
			Duox.click();
		}
		WebElement Duox1 = web.findElement(By.name("checkbox3"));
		if(!Duox1.isSelected()){
			Duox1.click();
		}
		WebElement button = web.findElement(By.name("buttonhtml"));
		System.out.println(button.isEnabled());//�ж��Ƿ����
		WebElement alert = web.findElement(By.className("alert"));
		alert.click();
		Thread.sleep(1000);
		Alert alert1 = web.switchTo().alert();
		alert1.accept();//ֻ��һ������������ȷ��
		WebElement confirm = web.findElement(By.className("confirm"));
		confirm.click();
		Thread.sleep(1000);
		Alert confirm1 = web.switchTo().alert();
		confirm1.dismiss();//���ȡ��
		confirm1.accept();//���ȷ��
		WebElement prompt = web.findElement(By.className("prompt"));
		prompt.click();
		Alert prompt1 = web.switchTo().alert();
		prompt1.sendKeys("jeff");
		String a = prompt1.getText();
		System.out.println(a);
		Thread.sleep(1000);
		prompt1.accept();
		Thread.sleep(1000);
		prompt1.accept();
		//�����ļ���·��
		String lj = "E:\\׼��֤�ű�.pdf";
		WebElement up = web.findElement(By.id("load"));
		up.sendKeys(lj);
	}
}
