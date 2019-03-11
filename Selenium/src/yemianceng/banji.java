package yemianceng;

import org.openqa.selenium.By;

import jichuceng.loginutil;

public class banji  extends loginutil{
	//学生管理
	public void xsgl(){
		web.findElement(By.className("tmc_menu_user")).click();
	}
	//班级管理
	public void bjgl(){
		web.findElement(By.xpath("/html/body/div/div[1]/ul/li[2]/a")).click();
	}
	//新增班级
	public void xzbj(){
		web.findElement(By.linkText("新增班级")).click();
	}
	//班级名称
	public void name(){
		web.findElement(By.name("b_name")).sendKeys("张微闽");;
	}
	//提交
	public void tijiao(){
		web.findElement(By.xpath("//*[@id=\"form_branch_add\"]/table/tfoot/tr/td/button[1]")).click();
	}
	//立即返回
	public void ljfh(){
		web.findElement(By.xpath("//*[@id=\"tm_lnk_back\"]")).click();
	}
}
