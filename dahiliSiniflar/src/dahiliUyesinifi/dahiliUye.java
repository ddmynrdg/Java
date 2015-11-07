package dahiliUyesinifi;

public class dahiliUye {// dahili sýnýfý sarmalayan sýnýfým
	int sayi = 5;
	static int sayi3 = 5;
	
	
	public class toplama //dahili uye sýnýfým
	{
		public int topla(int sayi1, int sayi2) {
			
			return sayi1 + sayi2;
		}
	}
	
	private static class carpma
	{
		private static int carp(int sayi4, int sayi5)
		{
			return sayi3 * sayi4 * sayi5;
		}
	}
	
	
	public static void main(String[] args) {
		// dahili uye sýnýfý çaðýralým
		dahiliUye.toplama t = new dahiliUye().new toplama();
		System.out.println("toplam : " + t.topla(4, 54));
		
		carpma c = new carpma();
		System.out.println("Çarpým : " + c.carp(6, 5));
	}

}

