package InterfaceOrnek;
// bir s�n�f soyut s�n�f� miras al�yorsa ba�ka bir s�n�f� miras alam�yor.
//bu y�zden implement i�lemi yap�l�r

public class Isci implements Calisan
{
	double ucret;
	
	@Override
	public void BolumYazdir() {
		System.out.println("--���i----");
	}

	@Override
	public void UcretBelirle(double ucret) {
		this.ucret = ucret;
	}

	@Override
	public double ucret() {
		return ucret * calisanSbtti;
	}

}
