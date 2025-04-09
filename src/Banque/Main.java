package Banque;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Main {

	public static void main(String[] args) throws InterruptedException {
		Compte C1=new Compte("femme",10000000);
		Compte C2=new Compte("homme",10000000);
		
			C1.start();
			C2.start();
		
		
		C1.join();
		C2.join();
		
		System.out.println("le montant est="+Compte.montant);

	}

}
