package day03;

import java.util.Set;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lj {
	@Test
	public void lianjie() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		WebDriver web = new ChromeDriver();
		String url = "file:///E:/%E9%A1%B5%E9%9D%A2/index.html";
		web.get(url);
		

//		String Z = web.getWindowHandle();
//		int a=0;
//		while(a<5){
//		web.findElement(By.linkText("Open new window")).click();
//		
//		Set<String> w = web.getWindowHandles();//��ȡ��ǰҳ������о������ǰ������ҳ��
//		//��������һ���ַ����������������������
//		for(String handle:w){//����ھ�������У�ѡ��һ�����
//			web.switchTo().window(handle);
//			String title = web.getTitle();
//			System.out.println(title);
//			//ͨ�������жϣ�����ȡ��ҳ���Ƿ�������Ҫ��
//			//���������Ҫ�ģ���Ը�ҳ����в���
//			if("UIAutomation iFrame".equals(title)){
//				web.findElement(By.id("user")).sendKeys("�Բ�");
//			}
//		}
//		web.switchTo().window(Z);
//		a++;
//		}
		
		//web.switchTo().frame("aa");//��һ�ַ�������Сҳ��
		web.switchTo().frame(0);//�ڶ��ַ�ʽ������
		Thread.sleep(5000);
		web.findElement(By.id("user")).sendKeys("��һ��");
		
		web.switchTo().defaultContent();
		Thread.sleep(5000);
		web.findElement(By.id("user")).sendKeys("���ʮ��");
	}
}
