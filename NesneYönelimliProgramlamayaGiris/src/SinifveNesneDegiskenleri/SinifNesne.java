package SinifveNesneDegiskenleri;

public class SinifNesne 
{
	static String ad; // sýnýf deðiþkenleri
	
	String adVer()
	{
		return ad;
	}

	public static void main(String[] args) 
	{
		SinifNesne kisi1 =new SinifNesne(); //sinif deðiþkenlerini çaðrýlamsý
		kisi1.ad = "fatma";
		SinifNesne kisi2 =new SinifNesne();
		kisi2.ad = "didem";
		
		System.out.println(kisi1.adVer());
		System.out.println(kisi2.adVer());
		
	}

}
