package kalitim1;

class Animals //süper sýnýftýr.
{
	private String tur = "hayvan";
	
	void nefesAl()
	{
		System.out.println("hayvan nefes alýyor");
	}
}

class Omurgali extends Animals
{
	public Omurgali()
	{
		System.out.println("omurgalý hayva sýnýfýnýn yapýcýsý");
	}
	
	void yazdir()
	{
		System.out.println("bura omurgalý hayvanlar sýnýfýdýr.");
	}
}

class Omurgasiz extends Animals
{
	public Omurgasiz()
	{
		System.out.println("omurgasýz hayvan sýnýfýnýn yapýcýsý");
	}
}
public class Ornek 
{

	public static void main(String[] args) 
	{
		Omurgali h1 = new Omurgali();
		h1.nefesAl();
		h1.yazdir();
		//h1.tur: Private olarak tanýmlandýðý için hata verir
		System.out.println("**************");
		Omurgasiz h2 = new Omurgasiz();
	}

}
