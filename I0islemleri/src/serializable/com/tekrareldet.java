package serializable.com;

import java.io.*;

public class tekrareldet {

	public static void main(String[] args) throws Exception {
		FileInputStream f2 = null;
		ObjectInputStream o2 =null;
		
		f2 = new FileInputStream("C:\\Users\\DIDEM_YANARDAG\\Desktop\\musteri.txt");
		o2 = new ObjectInputStream(f2);
	    
		musteri m2 = (musteri) o2.readObject(); 
		System.out.println(m2.getAd() + m2.getSoyad() + m2.getYas());
		
	}

}
