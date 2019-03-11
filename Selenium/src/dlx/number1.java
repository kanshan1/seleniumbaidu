package dlx;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class number1 {
	static WebDriver web;
	static String url;
	@BeforeClass
	@Test
	public static void aopen(){
		//打开在线考试网页
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		web = new ChromeDriver();
		url = "http://localhost:8080/Exam_ssh/";
		web.get(url);
	}
	@Test
	public void blogin(){
		//进入后台管理，输入账户、密码
		web.findElement(By.linkText("进入后台管理")).click();
		web.findElement(By.id("name")).sendKeys("admin");
		web.findElement(By.id("pass")).sendKeys("admin");
		web.findElement(By.name("B1")).click();
	}
	@Test
	public void ckaoshitype(){
		//添加考试类型，1、试卷名称，2、考试时间
		web.findElement(By.linkText("添加试题类型")).click();
		web.findElement(By.id("testName")).sendKeys("Python");
		web.findElement(By.id("testTime")).sendKeys("120");
		web.findElement(By.name("submit")).click();
	}
	@Test
	public void dtimu(){
		//添加试题，1、题目名称 2、选择科目 3 、选择分数 4、选择 5、选择难度 6、类型 7、选项 8、答案
		web.findElement(By.id("title")).sendKeys("下列中使用正切正确的是？");
		WebElement select = web.findElement(By.id("score"));
		Select s = new Select(select);
		s.selectByIndex(9);
		WebElement select2 = web.findElement(By.id("level"));
		Select s2 = new Select(select2);
		s.selectByIndex(1);
		WebElement select3 = web.findElement(By.id("note"));
		Select s3 = new Select(select3);
		s.selectByIndex(1);
		web.findElement(By.id("choices")).sendKeys("A.[3:2] : B.[0：1] : C.[：：-1] : D.[]");
		web.findElement(By.id("standardAnswer")).sendKeys("A:B:B:C");
		web.findElement(By.name("submit")).click();
	}
	@Test
	public void emassage(){
		//打印浏览试题
		WebElement massage = web.findElement(By.className("Xsmall"));
		String text = massage.getText();
		System.out.println(text);
	}
	@Test
	public void fstudent(){
		//添加学生：1、身份证号 2、姓名 3、学号 4、班级 5、地址 6、电话 7、email 8、身份证
		web.findElement(By.linkText("添加考生数据")).click();
		web.findElement(By.id("id")).sendKeys("362233199808081010");
		web.findElement(By.id("realname")).sendKeys("jeff");
		web.findElement(By.id("stuNumber")).sendKeys("00000001");
		web.findElement(By.id("className")).sendKeys("建筑工程");
		web.findElement(By.id("address")).sendKeys("天堂鸟");
		web.findElement(By.id("phone")).sendKeys("1008611");
		web.findElement(By.id("email")).sendKeys("2020@qq.com");
		web.findElement(By.id("humanId")).sendKeys("中国合法人民");
		web.findElement(By.name("submit")).click();
	}
	@Test
	public void gmassage2(){
		//打印全部学生信息
		WebElement massage2 = web.findElement(By.className("Xsmall"));
		String text2 = massage2.getText();
		System.out.println(text2);
	}
	@AfterClass
	public void h(){
		//关闭
		web.close();
	}
}
