package string2.com;

public class StringOrnek2 
{

	public static void main(String[] args)
	{
		String dizge = "bu bölümde karakter iþleme metodlarýný öðreniyoruz";
		char[] hedef = new char[15];
		
		dizge.getChars(11, 19, hedef, 0);
		System.out.println(hedef);
		dizge.getChars(19, 26, hedef, 8);
		System.out.println(hedef);
		
		//srting icinde istenilen nesneye ulaþmayý saðlar
		for (int i = 11; i <= 18; i++) {
			System.out.println(dizge.charAt(i)); //karakter karakter yazar
		}
		
		//toArray metodu string yapýsýný bir diziye dönüþtürür
		char[] karakter = new char[dizge.length()];
		karakter = dizge.toCharArray();
		for (int k = 0; k < karakter.length; k++) {
			System.out.print(karakter[k]);
		}
		
		//indexOf ilk parametreyi lastindexOf  son parametreyi
		int ilkindis = dizge.indexOf("a");
		int sonindis = dizge.lastIndexOf("a");
		
		System.out.println(dizge.charAt(ilkindis));
		System.out.println(ilkindis + " " + sonindis);
		System.out.println(dizge.charAt(sonindis));
		
		System.out.println(dizge.substring(ilkindis, sonindis));
		System.out.println(dizge.replace("i", "I"));
		
		System.out.println(dizge);
		System.out.println(dizge.trim());
		
		String buyuk = dizge.toUpperCase();
		System.out.println(buyuk);
		System.out.println(buyuk.toLowerCase());
		
		int i = 35;
		float f = 35.f;
		long l = 100000000;
		boolean b = false;
		Object o = new String("deneme");
		String s;
		
		s = String.valueOf(i);
		System.out.println(s);
		
		s = String.valueOf(l);
		System.out.println(s);
		
		s = String.valueOf(b);
		System.out.println(s);
		
		s = String.valueOf(o);
		System.out.println(s);
		
		
		
		
		
		}

}
/*string karakter metodlarý:
* getchars: string dizisi iççerisindeki nesneleri 
* bir char metoduna dönüþtürür
* getChars(ilindis, bitiþindis, hedefdizi[], hedefindis)
*/

/*
* subString(): bir string içerisinde belli bir alaný seçmek için kullanýlýr.
* içersinde iki parametre alýr bunlar ilk ve son parametrelerdir
* replace(orjkartr, degkartr): deðiþimi saðlar
* trim()
* toUpperCase() ve toLowerCase()
* valueOf()
*/