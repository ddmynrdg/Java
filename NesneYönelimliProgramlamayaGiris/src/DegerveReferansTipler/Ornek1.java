package DegerveReferansTipler;

public class Ornek1 
{
	
	public static void main(String[] args) 
	{
		int a = 100;
		carp(a);
		System.out.println(a);

	}
	static void carp(int a)
	{
		a *= 1; 
		// burda yap�lan de�i�iklikler yukardaki de�i�keni etkilemez
	}
}
