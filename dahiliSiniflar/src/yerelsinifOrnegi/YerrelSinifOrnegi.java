package yerelsinifOrnegi;
 //yerel s�n�flar�n erei�im belirteci yok
//d��ardan override edilebilir
//bu s�n�f� metodlar sarmalar ve sadece bu metodlar bu s�n�flara  eri�ebilir

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
