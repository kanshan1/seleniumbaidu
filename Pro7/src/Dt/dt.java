package Dt;

import java.rmi.server.SocketSecurityException;

public class dt {

	public static void main(String[] args) {
		animal a=new animal();
		animalcry(a);
		person b=new person();
		animalcry(b);
		animalcry(new people());
	}
	static void animalcry(animal a){
		a.shout();
	}

}

class animal{
	public void shout() {
		System.out.println("�Զ�����һ��!");
	}
}
class person extends animal{
	public void shout() {
		System.out.println("�Զ���������!");
	}
	
}
class people extends animal{
	public void shout() {
		System.out.println("�Զ���������");
	}
}
