package SinifNesneKavrami;

public class Calisan
{	
	String ad; //nesne de�i�keni
	int maas; // nesne de�i�keni
	void ata(String a, int b)
	{
		ad =a;
		maas = b;
	}
	void yazdir()
	{
		System.out.println("ad� :"+ ad + " olan ki�inini maa�� :" +maas);
	}

	public static void main(String[] args) 
	{
		Calisan isci = new Calisan();
		isci.ata("diden", 5000);
		isci.yazdir();
		
		Calisan isci2 = new Calisan();
		isci2.ata("oya", 6000);
		isci2.yazdir();
	}

}
