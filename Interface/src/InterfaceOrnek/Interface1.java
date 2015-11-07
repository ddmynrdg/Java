package InterfaceOrnek;

public class Interface1 
{
	
	public static void main(String[] args) 
	{
		Isci i = new Isci();
		i.BolumYazdir();
		i.UcretBelirle(912.230);
		System.out.println("Ucreti: " + i.ucret() + "\n");
		
		Yonetici y = new Yonetici();
		y.BolumYazdir();
		y.UcretBelirle(1005.56);
		System.out.println("Ucreti: " + y.ucret() + "\n");
		
		Pazarlamaci p = new Pazarlamaci();
		p.BolumYazdir();
		p.UcretBelirle(957.45);
		p.komBelirle(50);
		System.out.println("Komisyon : " + p.komisyon);
		System.out.println("Ucreti: " + p.ucret() + "\n");
	}

}
