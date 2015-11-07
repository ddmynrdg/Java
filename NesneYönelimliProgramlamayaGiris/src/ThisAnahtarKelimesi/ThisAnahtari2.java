package ThisAnahtarKelimesi;

public class ThisAnahtari2 
{
	public  ThisAnahtari2(String ad) 
	{
		this(ad, "Yanardað", 22);
    }
	public ThisAnahtari2(String ad, String soyad, int yas)
	{
		System.out.println("Adý: " + ad+ "\nSoyadý: " + soyad + "\nYaþý: " + yas);
	}
	
	public static void main(String[] args) 
	{
		ThisAnahtari2 t1 =  new ThisAnahtari2("Didem");
	}

}
