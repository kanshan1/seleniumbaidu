package lianx;

/*
 ���һ�ų������Door����ô������������˵����Ӧ��ӵ�������ŵĹ��ԣ�����openDoor()�͹���closeDoor()��
 Ȼ����Ž�������Ĺ������,����--theftproof()����ˮ--waterproof()������--bulletproof()��
 ���𡢷��⡭��
Ҫ�����ü̳С������ࡢ�ӿڵ�֪ʶ��Ƹ���
 */
public class zuoye {
public static void main(String[] args) {
	Proof M=new Proof();
	M.opendoor();
	M.closdoor();
	M.theftproof("��");
	M.waterproof("��");
	M.bulletproof("����");
	M.huoproof("��");
	M.xiuproof("����");
}
}
abstract class Door{
	String goods = "��";
	String GN;
	void opendoor(){
		System.out.println("��" + goods);
	}
	void closdoor(){
		System.out.println("��" + goods);
	}
}
class Proof extends Door{
	void theftproof(String Gn){
		this.GN=Gn;
		System.out.println(goods + "+" + this.GN + " = ������");
	}
	void waterproof(String Gn){
		this.GN=Gn;
		System.out.println(goods + "+" + this.GN + " = ���ܷ�ˮ");
	}
	void bulletproof(String Gn){
		this.GN=Gn;
		System.out.println(goods + "+" + this.GN + " = ������");
	}
	void huoproof(String Gn){
		this.GN=Gn;
		System.out.println(goods + "+" + this.GN + " = ������");
	}
	void xiuproof(String Gn){
		this.GN=Gn;
		System.out.println(goods + "+" + this.GN + " = ������");
	}
}