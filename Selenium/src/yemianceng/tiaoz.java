package yemianceng;

import jichuceng.loginutil;

public class tiaoz extends loginutil{
	public void tiaozhuan(){//��ת��߽���
		web.switchTo().frame("menu");
	}
	public void tiaozhuan2(){//��ת�ұ߽���
		web.switchTo().defaultContent();
		web.switchTo().frame("main");
	}
}
