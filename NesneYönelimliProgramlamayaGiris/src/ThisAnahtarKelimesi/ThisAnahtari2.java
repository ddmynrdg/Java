package ThisAnahtarKelimesi;

public class ThisAnahtari2 
{
	public  ThisAnahtari2(String ad) 
	{
		this(ad, "Yanarda�", 22);
    }
	public ThisAnahtari2(String ad, String soyad, int yas)
	{
		System.out.println("Ad�: " + ad+ "\nSoyad�: " + soyad + "\nYa��: " + yas);
	}
	
	public static void main(String[] args) 
	{
		ThisAnahtari2 t1 =  new ThisAnahtari2("Didem");
	}

}
