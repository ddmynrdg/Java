package string.com;

public class stringOrnek 
{

	public static void main(String[] args) 
	{
		char[] dizi = {'d', 'i', 'z', 'g','e'};
		String yeniDizge = new String(dizi);
		String yeniDizge2 = "Bu bir test c�mlesidir.";
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
		kontrol[2] = yeniDizge2.equalsIgnoreCase("Bu Bir TeSt C�mlesidir.");
		kontrol[3] = yeniDizge2.equalsIgnoreCase("D�Z�");
		
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
		System.out.println(isim1 + "ve " + isim2 + " kar��la�t�r�lmas� : " + isim1.compareTo(isim2));
		System.out.println(isim1 + "ve " + isim2 + " kar��la�t�rmas� : " + isim1.compareToIgnoreCase(isim3));
		System.out.println(isim1 + " kar��la�t�rmas� : " + isim1.compareToIgnoreCase("ERHAN"));
		System.out.println(isim2 + " i�erisin de : " + isim3 + " arama soncu : " + isim2.regionMatches(1, isim3, 0, isim3.length()));
		
	
	}

}

/* 
*string birle�tirme i�in + operat�r� ve 
* concat metodunu kullanabiliriz
*/

/* == oparat�t� kulan�lm�yor, yerine;
 * equals(b/k harf duyarl�l��� vard�r) ve equalsIgnorCase(b/k harf duyarl�l��� yoktur)
 * k�yaslama i�in;
 * compareTo(> i�lemi) ve compareIgnorCase
 */

/* 
 * reachinmash
 /*/
 

