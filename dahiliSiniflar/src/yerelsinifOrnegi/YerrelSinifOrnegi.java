package yerelsinifOrnegi;
 //yerel sýnýflarýn ereiþim belirteci yok
//dýþardan override edilebilir
//bu sýnýfý metodlar sarmalar ve sadece bu metodlar bu sýnýflara  eriþebilir

public class YerrelSinifOrnegi
{
	public static boolean mukemmelSayiBul(int m)
	{
		class mukemmelSayi
		{
			public boolean mukemmelSayim(int mukemmel) {
				int bolenToplam = 0;
				boolean kontrol;
				
				for (int i = 1; i < mukemmel; i++) {
					if (mukemmel % i == 0) 
						bolenToplam += i;
				}
				
				if (bolenToplam == mukemmel) 
					kontrol = true;
			    else 
					kontrol = false;
				
				return kontrol;
			}
		}
	mukemmelSayi sayi = new mukemmelSayi();
	return sayi.mukemmelSayim(m);
	}
	public static void main(String[] args) 
	{
		System.out.println(mukemmelSayiBul(6));
		System.out.println(mukemmelSayiBul(12));
	}

}
