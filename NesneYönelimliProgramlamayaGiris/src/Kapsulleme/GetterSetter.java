package Kapsulleme;

// getter ve setter metodlar bir s�n�f i�erisinde tan�mlanm��
//private elemanlar�na eri�mek i�in kullan�l�r
//getter metod : Okuma yaparlar ve parametre almazlar
// setter metodlar : Atama i�lemi yapar ve bir parametre almal�lar.
public class GetterSetter
{
		private int sayi = 6;
		private String ad = "didem";
	
	public int getSayi() 
	{
		return sayi;
	}
	public void setSayi(int sayi) 
	{
		this.sayi = sayi;
	}
	public String getAd() 
	{
		return ad;
	}
	public void setAd(String ad) 
	{
		this.ad = ad;
	}
	
	public static void main(String[] args) 
	{
		GetterSetter nesne =new GetterSetter();
		nesne.setAd("bilgin");
		nesne.setSayi(5);
		System.out.println(nesne.getAd());
		System.out.println(nesne.getSayi());

	}

}
