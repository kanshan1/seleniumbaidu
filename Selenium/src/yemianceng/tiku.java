package yemianceng;

import org.openqa.selenium.By;

import jichuceng.loginutil;

public class tiku extends loginutil{
	
	public void tikugl(){
		web.findElement(By.className("tmc_menu_qdb")).click();
	}
	public void xintk(){
		web.findElement(By.xpath("/html/body/div/div[3]/ul/li[1]/a")).click();
	}
	public void tkname(){
		web.findElement(By.name("d_name")).sendKeys("Python");
	}
	public void tijiao(){
		web.findElement(By.xpath("//*[@id=\"form_qdb_add\"]/table/tfoot/tr/td/button[1]")).click();
	}
	public void lijifh(){
		web.findElement(By.xpath("//*[@id=\"tm_lnk_back\"]")).click();
	}
}
