package serializable.com;

import java.io.*;

public class serilestirme {

	public static void main(String[] args) throws Exception
	{
		musteri m = new musteri("didem", " yanardað ",22);
		FileOutputStream f1 = null;
		ObjectOutputStream o2 = null;
		f1 = new FileOutputStream("C:\\Users\\DIDEM_YANARDAG\\Desktop\\musteri.txt");
		o2 = new ObjectOutputStream(f1);
		
		o2.writeObject(m);
		
	}


}
