package InterfaceOrnek;
// bir sýnýf soyut sýnýfý miras alýyorsa baþka bir sýnýfý miras alamýyor.
//bu yüzden implement iþlemi yapýlýr

public class Isci implements Calisan
{
	double ucret;
	
	@Override
	public void BolumYazdir() {
		System.out.println("--Ýþçi----");
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
