package StaticAnahtarKelimesi;
 // static anahtar kelimesi:bir sýnýf içerisindeki alanlara
// nesne oluþturmadan eriþmeyi saðlar.
public class Calisan
{
	public static String bolum = "Bilgi Ýþlem";
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
		System.out.println("Adý : " + this.ad + " \nSoyad : " +this.soyad);
		System.out.println("Yer : " + this.sehir+ "\nMaaþý : " +this.maas);
		System.out.println("Bölümü : " + this.bolum);
	}
}
