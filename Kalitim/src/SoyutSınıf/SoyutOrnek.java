package SoyutSýnýf;

public class SoyutOrnek 
{
	public abstract class sekil
	{
		public String isim;
		public void isimBelirle(String isim)
		{
			this.isim = isim;
		}
		public String isimGetir() 
		{
			return this.isim;
		}
		
		public abstract double alan(); 
		//soyut metodlar gövdesizdir yani içi boþtur.
		
	}
	public class ucgen extends sekil
	{
		public int taban;
		public int yukseklik;
		
		public ucgen(int taban, int yukseklik)
		{
			isimBelirle("Uçgen\n");
			this.taban = taban;
			this.yukseklik= yukseklik;
		}
		
		@Override //implement(uygulamak) edildi
		public double alan() 
		{
			return (taban * yukseklik) / 2;
		}	
	}
	
	public class daire extends sekil
	{
		int r;
		daire(int r)
		{
			isimBelirle("Daire\n");
			this.r =r;
		}
		@Override
		public double alan() {
			return Math.PI * Math.pow(r, 2);
		}
	}
	
	public class yamuk extends sekil
	{
		int alt, ust, h;
		yamuk(int alt, int ust, int h)
		{
			isimBelirle("Yamuk\n");
			this.alt = alt;
			this.ust = ust;
			this.h = h;
		}
		@Override
		public double alan() {
			return h/2 * (alt * ust);
		}
	}
	
	public static void main(String[] args) 
	{
		/*ucgen u = new ucgen(3,5); //hata verir, dahili sýnýf oluþturulur.*/
		SoyutOrnek.ucgen u = new SoyutOrnek().new ucgen(3, 5);
		SoyutOrnek.daire d = new SoyutOrnek().new daire(5);
		SoyutOrnek.yamuk y = new SoyutOrnek().new yamuk(3, 5, 8);
		
		System.out.print("Sýnýf: " + u.isimGetir());
		System.out.println("Alan: " + u.alan() + "\n");
		System.out.print("Sýnýf: " + d.isimGetir());
		System.out.println("Alan: " + d.alan() + "\n");
		System.out.print("Sýnýf: " + y.isimGetir());
		System.out.println("Alan: " + y.alan());
		
	}

}
