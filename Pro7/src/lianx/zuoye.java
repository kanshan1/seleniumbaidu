package lianx;

/*
 设计一张抽象的门Door，那么对于这张门来说，就应该拥有所有门的共性，开门openDoor()和关门closeDoor()；
 然后对门进行另外的功能设计,防盗--theftproof()、防水--waterproof()、防弹--bulletproof()、
 防火、防锈……
要求：利用继承、抽象类、接口的知识设计该门
 */
public class zuoye {
public static void main(String[] args) {
	Proof M=new Proof();
	M.opendoor();
	M.closdoor();
	M.theftproof("锁");
	M.waterproof("铁");
	M.bulletproof("厚铁");
	M.huoproof("铁");
	M.xiuproof("油漆");
}
}
abstract class Door{
	String goods = "门";
	String GN;
	void opendoor(){
		System.out.println("开" + goods);
	}
	void closdoor(){
		System.out.println("关" + goods);
	}
}
class Proof extends Door{
	void theftproof(String Gn){
		this.GN=Gn;
		System.out.println(goods + "+" + this.GN + " = 防盗门");
	}
	void waterproof(String Gn){
		this.GN=Gn;
		System.out.println(goods + "+" + this.GN + " = 门能防水");
	}
	void bulletproof(String Gn){
		this.GN=Gn;
		System.out.println(goods + "+" + this.GN + " = 防弹门");
	}
	void huoproof(String Gn){
		this.GN=Gn;
		System.out.println(goods + "+" + this.GN + " = 防火门");
	}
	void xiuproof(String Gn){
		this.GN=Gn;
		System.out.println(goods + "+" + this.GN + " = 防锈门");
	}
}