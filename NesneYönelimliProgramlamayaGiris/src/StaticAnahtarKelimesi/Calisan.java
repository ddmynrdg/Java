package StaticAnahtarKelimesi;
 // static anahtar kelimesi:bir s�n�f i�erisindeki alanlara
// nesne olu�turmadan eri�meyi sa�lar.
public class Calisan
{
	public static String bolum = "Bilgi ��lem";
	public String ad, soyad, sehir;
	public double maas;
	
	public Calisan(String ad, String soyad, String sehir, double maas) 
	{
		this.ad = ad;
		this.soyad = soyad;
		this.maas = maas;
		this.sehir = sehir;
	}
	public void BilgiVer() 
	{
		System.out.println("Ad� : " + this.ad + " \nSoyad : " +this.soyad);
		System.out.println("Yer : " + this.sehir+ "\nMaa�� : " +this.maas);
		System.out.println("B�l�m� : " + this.bolum);
	}
}
