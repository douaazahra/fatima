package Banque;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Compte extends Thread {
	public int sold;
	public String nom;
	public static  int  montant=500000000;
	public static ReentrantLock lock=new ReentrantLock();

	public Compte( String nom ,int sold ) {
		super();
		this.sold = sold;
		this.nom=nom;
	}
	public  void AddRemove() {
		
		if(nom=="femme") {
			lock.lock();
			try {
				 montant=montant-sold;
			}
			 finally {
				 lock.unlock();
			 }
		}
		else {
			lock.lock();
			try {
				montant=montant+sold;
			}
			finally {
				lock.unlock();
			}
		
		}
		
	}
/*	private String getName() {
		// TODO Auto-generated method stub
		return null;
	}*/
	public void run() {
		for(int i=0;i<1000000000;i++) {
			AddRemove();
		}
		
		
	}
	
	public int getMontant() {
		return montant;
	}
	

}
