package yongliceng;

import org.testng.annotations.Test;

import jichuceng.loginutil;
import yewuceng.banjidy;
import yewuceng.diaoyong;
import yewuceng.xztkudz;

public class loginbusiness extends loginutil{
	@Test
	public void xianf() throws InterruptedException{
		diaoyong B = new diaoyong();
		//xztkudz Cc=new xztkudz();
		banjidy C=new banjidy();
		B.yunx();
	Thread.sleep(2000);
		C.xzbanji();
		//Cc.xztku();
	}
}