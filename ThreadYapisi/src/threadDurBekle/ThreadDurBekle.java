package threadDurBekle;

public class ThreadDurBekle {

	
	public static void main(String[] args)
	{
		// 3 bekleme 1 durdurma 4 adet nesne oluþturalým,
		try {
		threadOrnek to1 = new threadOrnek("t1", 3); 
			to1.sleep(5000);
		
		threadOrnek to2 = new threadOrnek("t2", 4); 
			to2.stop();
		
		threadOrnek to3 = new threadOrnek("t3", 2); 
			to3.join();
		threadOrnek to4 = new threadOrnek("t4", 5); 
			to4.yield(); // beklememizi saðlar
		 System.out.println(to2.isAlive());
	}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
class threadOrnek extends Thread {
	private String s; //sarmalama iþlemi
	private int k; // sarmalama yapacaðýz
	public threadOrnek(String s, int k) {
		
		super();
		start();
		this.k = k;
		this.s = s;	
	}
	
	public void run() {
		for (int i = 1; i <= k; i++) {
			System.out.print(s + " ");
		}
	}
	
}