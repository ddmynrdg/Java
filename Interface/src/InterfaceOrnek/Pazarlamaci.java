package InterfaceOrnek;

public class Pazarlamaci implements pazarlamaKom{
	double ucret;
	double komisyon;
	//final double komSbti = 0.2;
	
	@Override
	public void BolumYazdir() {
		System.out.println("---Pazarlama---");
		
	}

	@Override
	public void UcretBelirle(double ucret) {
		this.ucret = ucret;
	}
	//sonrdan bir metod kendimisz olu�turduk
	public void komBelirle(int adet)
	{
		System.err.println("Sat�lan �r�n adedi: " + adet);
		komisyon = komSbti * adet;
	}
	
	@Override
	public double ucret() {
		
		return ucret * (calisanSbtti + komisyon);
	}

}
