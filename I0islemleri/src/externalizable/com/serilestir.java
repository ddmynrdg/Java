package externalizable.com;

import java.io.*;

public class serilestir 
{
	public static void main(String[] args) throws Exception 
	{
		musteri2 m1 = new musteri2("didem", "yanrdað", 22);
		FileOutputStream f1 = new FileOutputStream("C:\\Users\\DIDEM_YANARDAG\\Desktop\\musteri2.txt");
		ObjectOutputStream o1 = new ObjectOutputStream(f1);
		
		o1.writeObject(m1);
		o1.close();
	}

}
