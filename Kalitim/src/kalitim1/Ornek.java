package kalitim1;

class Animals //s�per s�n�ft�r.
{
	private String tur = "hayvan";
	
	void nefesAl()
	{
		System.out.println("hayvan nefes al�yor");
	}
}

class Omurgali extends Animals
{
	public Omurgali()
	{
		System.out.println("omurgal� hayva s�n�f�n�n yap�c�s�");
	}
	
	void yazdir()
	{
		System.out.println("bura omurgal� hayvanlar s�n�f�d�r.");
	}
}

class Omurgasiz extends Animals
{
	public Omurgasiz()
	{
		System.out.println("omurgas�z hayvan s�n�f�n�n yap�c�s�");
	}
}
public class Ornek 
{

	public static void main(String[] args) 
	{
		Omurgali h1 = new Omurgali();
		h1.nefesAl();
		h1.yazdir();
		//h1.tur: Private olarak tan�mland��� i�in hata verir
		System.out.println("**************");
		Omurgasiz h2 = new Omurgasiz();
	}

}
