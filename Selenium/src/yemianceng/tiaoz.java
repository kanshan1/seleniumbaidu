package yemianceng;

import jichuceng.loginutil;

public class tiaoz extends loginutil{
	public void tiaozhuan(){//跳转左边界面
		web.switchTo().frame("menu");
	}
	public void tiaozhuan2(){//跳转右边界面
		web.switchTo().defaultContent();
		web.switchTo().frame("main");
	}
}
