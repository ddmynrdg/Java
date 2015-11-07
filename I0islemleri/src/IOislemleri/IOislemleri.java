package IOislemleri;

import java.io.*;


public class IOislemleri 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("C:\\Users\\DIDEM_YANARDAG\\Desktop\\deneme2.txt"); 
		//FileWriter fw = new FileWriter(f);
		
		//String yazilacak = "Bu bir deneme yazýsýdýr.";
		//fw.write(yazilacak);
		//fw.close();
		FileReader fr =  new FileReader(f);
		char[] okunan = new char[(int) f.length()];
		fr.read(okunan);
		String veriler = new String(okunan);
		System.out.println(veriler);
		 
	
	}

}
 