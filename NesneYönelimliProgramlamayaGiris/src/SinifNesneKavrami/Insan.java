package SinifNesneKavrami;

public class Insan
{
	String ad;
	int yas;
	void adYaz(String a)
	{
		ad = a;
	}
	void yasYaz(int b)
	{
		yas = b;
	}
	String sah�s()
	{
		return ad;
	}
	int yasver()
	{
		return yas;
	}
	public static void main(String[] args)
	{
		Insan kisi = new Insan();
		kisi.adYaz("D�DEM");
		kisi.yasYaz(21);
		
		Insan kisi2 = new Insan();
		kisi2.adYaz("seda");
		kisi2.yasYaz(51);
		
		System.out.println(kisi.sah�s());
		System.out.println(kisi.yasver());
		
		System.out.println(kisi2.sah�s());
		System.out.println(kisi2.yasver());
	}

}
