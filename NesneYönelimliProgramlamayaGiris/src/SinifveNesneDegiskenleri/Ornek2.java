package SinifveNesneDegiskenleri;

public class Ornek2 
{

	public static void main(String[] args) 
	{
		int dizi1[] = {100, 299,524};
		degistir(dizi1);
		
		System.out.println(dizi1[0]);
		System.out.println(dizi1[1]);
		System.out.println(dizi1[2]);
		// diziler REFERANS TÝPLÝ olduðu için deðerler deðiþir.
	}
	
	static void degistir(int dizi1[])
	{
		dizi1[1] = 50;
		dizi1[2] = 100;
	}
}
