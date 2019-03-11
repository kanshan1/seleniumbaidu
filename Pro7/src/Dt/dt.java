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
		System.out.println("ÃÔ¶ù½ĞÁËÒ»Éù!");
	}
}
class person extends animal{
	public void shout() {
		System.out.println("ÃÔ¶ùÍôÍôÍô½Ğ!");
	}
	
}
class people extends animal{
	public void shout() {
		System.out.println("ÃÔ¶ùß÷ß÷ß÷½Ğ");
	}
}
