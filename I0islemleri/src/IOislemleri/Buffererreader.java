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
			
			bw.write("Buffeered writer s�n�f� ile dosyaya veri yazd�rma\n");
			bw.write("bu bir deneme yaz�s�d�r.");
			bw.flush(); //bu metod bufferdaki verileri dosyaya yaz�yor
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
			System.out.println("Bu dosya �zerinde hata olu�tu.");
		}
	}

}
