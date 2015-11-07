package isimsizSinifOrnegi;

// isimsiz s�nflar nesne ismi tan�mlamadan olu�turulan s�n�flard�r
// interface lere eri�imi yoktur.
//eri�im belirteci yoktur
//k�sa s�reli kullan�mlarda yarar sa�lar

public class isimsizSinifOrnegi
{

	public static faktoriyel faktoriyelAl(final double sayi) {
		return new faktoriyel(){
			
			@Override
			public double hesap() {
				double faktoriyel = 1;
				
				for (int i = 1; i <= sayi; i++) 
					faktoriyel = faktoriyel * i; 
				return faktoriyel;
			}
		};
	}
	public static void main(String[] args) {
		faktoriyel f = faktoriyelAl(5);
		System.out.println(f.hesap());
	}

}
