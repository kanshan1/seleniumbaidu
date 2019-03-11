package yemianceng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import jichuceng.loginutil;

public class loginpage extends loginutil{
	public void name(){
		web.findElement(By.name("username")).sendKeys("hujianming");
	}
	public void pass(){
		web.findElement(By.name("userpass")).sendKeys("hujianming123");
	}
	public void select() throws InterruptedException{
		WebElement select = web.findElement(By.name("usertype"));
		Select s=new Select(select);
		s.selectByIndex(2);
		Thread.sleep(5000);
	}
	public void click(){
		web.findElement(By.className("tm_btn")).click();
	}
	/*public void tiku(){
		web.switchTo().frame("menu");
		web.findElement(By.className("tmc_menu_qdb")).click();
		web.findElement(By.xpath("/html/body/div/div[3]/ul/li[1]/a")).click();
		web.switchTo().defaultContent();
		web.switchTo().frame("main");
		web.findElement(By.name("d_name")).sendKeys("Python");
		Select s=new Select(web.findElement(By.name("d_status")));
		s.selectByIndex(0);
		web.findElement(By.name("d_remark")).sendKeys("ÓÐÈ¤");
		web.findElement(By.xpath("//*[@id=\"form_qdb_add\"]/table/tfoot/tr/td/button[1]")).click();
		web.findElement(By.xpath("//*[@id=\"tm_lnk_back\"]")).click();
	}*/
}
