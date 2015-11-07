package Kapsulleme;

// getter ve setter metodlar bir sýnýf içerisinde tanýmlanmýþ
//private elemanlarýna eriþmek için kullanýlýr
//getter metod : Okuma yaparlar ve parametre almazlar
// setter metodlar : Atama iþlemi yapar ve bir parametre almalýlar.
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
