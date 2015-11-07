package thread.com;


public class threadOrnek {
	
	public static void main(String[] args) {
		
		threadKalitim tk = new threadKalitim("tk");
		threadRunnable tr = new threadRunnable();
	}
}
class threadKalitim extends Thread {
	
	public threadKalitim(String isim){
		super(isim);
		start();
	}
	public void run() {
		//sınıfımızı adı yazdıralı
		System.out.println(Thread.currentThread().getName());
	}
}
class threadRunnable implements Runnable {

	Thread kanal;
	public threadRunnable() {
		kanal = new Thread(this);
	    kanal.start();
		
	}
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
	}
}