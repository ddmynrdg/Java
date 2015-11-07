package IOislemleri;

import java.io.*;

public class Buffererreader 
{

	public static void main(String[] args) throws IOException 
	{
		
		try {
		
			File f = new File("C:\\Users\\DIDEM_YANARDAG\\Desktop\\deneme4.txt");
			FileWriter fw  = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("Buffeered writer sýnýfý ile dosyaya veri yazdýrma\n");
			bw.write("bu bir deneme yazýsýdýr.");
			bw.flush(); //bu metod bufferdaki verileri dosyaya yazýyor
			bw.close();
			
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String satir  = br.readLine();
			while (satir != null)
			{
				System.out.println(satir);
				satir = br.readLine();
			}
			
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Bu dosya üzerinde hata oluþtu.");
		}
	}

}
