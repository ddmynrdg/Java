package Override;

public class Ogrenci
{
	public String ad = "didem";
	public String soyad = "yanardag";
	
	public String toString () //toString metodu: ad ve soyad�n kendisini al�r
	{
		return ad + " " + soyad;
	}
	
	public static void main(String[] args) 
	{
		Ogrenci o = new Ogrenci();
		System.out.println(o);
	}

}
