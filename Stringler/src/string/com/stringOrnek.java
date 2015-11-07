package string.com;

public class stringOrnek 
{

	public static void main(String[] args) 
	{
		char[] dizi = {'d', 'i', 'z', 'g','e'};
		String yeniDizge = new String(dizi);
		String yeniDizge2 = "Bu bir test cümlesidir.";
		String yeniDizge3;
		String yeniDizge4;
		boolean[] kontrol = new boolean[4];
		String isim1 = "erhan";
		String isim2 = "serkan";
		String isim3 = "erkan";
		
		
		yeniDizge3 = yeniDizge2 + " " + yeniDizge;
		yeniDizge4 = yeniDizge.concat(yeniDizge2);
		kontrol[0] = yeniDizge.equals("dizge");
		kontrol[1] = yeniDizge.equals("dizi");
		kontrol[2] = yeniDizge2.equalsIgnoreCase("Bu Bir TeSt Cümlesidir.");
		kontrol[3] = yeniDizge2.equalsIgnoreCase("DÝZÝ");
		
		System.out.println(dizi);
		System.out.println(yeniDizge);
		System.out.println(yeniDizge2);
		System.out.println(yeniDizge.length());
		System.out.println(yeniDizge2.length());
		System.out.println(yeniDizge3);
		System.out.println(yeniDizge4);
		System.out.println(kontrol[0]);
		for (int i = 0; i < kontrol.length; i++) {
			System.out.println(kontrol[i]);
		}
		System.out.println(isim1 + "ve " + isim2 + " karþýlaþtýrýlmasý : " + isim1.compareTo(isim2));
		System.out.println(isim1 + "ve " + isim2 + " karþýlaþtýrmasý : " + isim1.compareToIgnoreCase(isim3));
		System.out.println(isim1 + " karþýlaþtýrmasý : " + isim1.compareToIgnoreCase("ERHAN"));
		System.out.println(isim2 + " içerisin de : " + isim3 + " arama soncu : " + isim2.regionMatches(1, isim3, 0, isim3.length()));
		
	
	}

}

/* 
*string birleþtirme için + operatörü ve 
* concat metodunu kullanabiliriz
*/

/* == oparatötü kulanýlmýyor, yerine;
 * equals(b/k harf duyarlýlýðý vardýr) ve equalsIgnorCase(b/k harf duyarlýlýðý yoktur)
 * kýyaslama için;
 * compareTo(> iþlemi) ve compareIgnorCase
 */

/* 
 * reachinmash
 /*/
 

