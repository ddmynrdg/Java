package isimsizSinifOrnegi;

// isimsiz sýnflar nesne ismi tanýmlamadan oluþturulan sýnýflardýr
// interface lere eriþimi yoktur.
//eriþim belirteci yoktur
//kýsa süreli kullanýmlarda yarar saðlar

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
