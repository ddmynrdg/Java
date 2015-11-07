package externalizable.com;

import java.io.*;

public class GeriDonder {

	public static void main(String[] args) throws Exception {
	
		FileInputStream f2 = null;
		ObjectInputStream o2 =null;
		
		f2 = new FileInputStream("C:\\Users\\DIDEM_YANARDAG\\Desktop\\musteri2.txt");
		o2 = new ObjectInputStream(f2);
	    
		musteri2 m2 = (musteri2) o2.readObject(); 
		System.out.println(m2.getAd() + m2.getSoyad() + m2.getYas());

	}

}
