package InterfaceOrnek;

public class Yonetici implements Calisan{
	double ucret;
	@Override
	public void BolumYazdir() {
		System.out.println("---Y�netici---");
	}

	@Override
	public void UcretBelirle(double ucret) {
		this.ucret = ucret;
	}
	@Override
	public double ucret() {
		
		return ucret;
	}

}
