package yemianceng;

import org.openqa.selenium.By;

import jichuceng.loginutil;

public class banji  extends loginutil{
	//ѧ������
	public void xsgl(){
		web.findElement(By.className("tmc_menu_user")).click();
	}
	//�༶����
	public void bjgl(){
		web.findElement(By.xpath("/html/body/div/div[1]/ul/li[2]/a")).click();
	}
	//�����༶
	public void xzbj(){
		web.findElement(By.linkText("�����༶")).click();
	}
	//�༶����
	public void name(){
		web.findElement(By.name("b_name")).sendKeys("��΢��");;
	}
	//�ύ
	public void tijiao(){
		web.findElement(By.xpath("//*[@id=\"form_branch_add\"]/table/tfoot/tr/td/button[1]")).click();
	}
	//��������
	public void ljfh(){
		web.findElement(By.xpath("//*[@id=\"tm_lnk_back\"]")).click();
	}
}
