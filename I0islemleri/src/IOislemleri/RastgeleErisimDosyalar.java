package IOislemleri;

import java.io.*;

public class RastgeleErisimDosyalar 
{

	public static void main(String[] args) throws IOException 
	{
		File f = new File("C:\\Users\\DIDEM_YANARDAG\\Desktop\\deneme4.txt");
		RandomAccessFile far = new RandomAccessFile(f,  "rw");
		
		far.writeBytes("Random accsess file sinifi ile dosyaya veri yazdýrýyoruz");
		
		far.seek(6);
		far.writeBytes("didem");
		far.close();
		
		File f2 = new File("C:\\Users\\DIDEM_YANARDAG\\Desktop\\deneme4.txt");
		RandomAccessFile far2 = new RandomAccessFile(f2,  "r");
		String satir = far2.readLine();
		System.out.println(satir);
	}

}
