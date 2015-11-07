package Polimorfizm.com;

public class PolimorfizmOrnek {

	public static void main(String[] args) 
	{
		calisan c = new calisan("Didem", "yanardag");
		isci i = new isci("Ali", "can");
		Pazarlama p = new Pazarlama("aycan", "fal");
		Patron pa = new Patron("demet", "hal�m");
		
		//c.yaz();
		//c.calisanYaz();
		//i.yaz();
		//i.isciYaz();
		//p.yaz();
	   //p.pazarlamaYaz();
		
		// �imdi �ok bi�imlilik i�lemlerini yapal�m
		//c = i;
		//c.yaz();
		//c = p;
		//c.yaz();
		
	//	if (c instanceof calisan) {
	//		calisan c1 = c;
		//	c1.yaz();
	//	}
		//else if (c instanceof isci) {
			//isci i1 = (isci) c;
			//i1.yaz();
		//}
		//else if (c instanceof Pazarlama) {
			//Pazarlama p1 = (Pazarlama) c;
		//	p1.yaz();
	//	}
		
	//calisan[]  c = new calisan[3];
	//for (int i = 0; i < c.length; i++) {
		//int indis = (int) (Math.random() * 3);
		//switch (indis)
	//	{
	//	case 0:
	//		c[indis] = new isci("didem", "yanardag");
	//		c[indis].yaz();
			
	//		break;
	//	case 1:
	//		c[indis] = new Pazarlama("meryem", "deveci");
	//		c[indis].yaz();
			
	//		break;
			
//		case 2:
	//		c[indis] = new Patron("didar", "yanar");
	//		c[indis].yaz();
	/*		
			break;
		default:
			c[indis] = new calisan("seda", "sayan");
			break;
		}
	}*/
		// GetClass metodunu kullanal�m
		// c nesnesini get class metodudu ile s�n�f�n� sorgulayal�m
		// s�n�f� verir. class paketAd�.s�n�fAd� ekrana basar.
		
		System.out.println(c.getClass());
		System.out.println(i.getClass());
		System.out.println(p.getClass());
		System.out.println(pa.getClass());
	}

}

class calisan 
{
	String ad, soyad;
	calisan(String ad, String soyad)
	{
		this.ad = ad;
		this.soyad = soyad;
	}
	public void yaz() 
	{
		System.out.println("�uan �al��an s�n�f�nday�z");
		calisanYaz();
	}
	public void calisanYaz() 
	{
		System.out.println("�al��an Ad ve Soyad : " + ad + " " + soyad);
	}
}

class isci extends calisan 
{
	isci(String ad, String soyad) //yap�land�r�c�m�z
	{
		super(ad, soyad);
	}
	
	public void yaz() {
		System.out.println("i��i s�n�f�nday�m.");
		isciYaz();
	}
	public void isciYaz() {
		System.out.println("���i Ad ve Soyad : " + ad + " " + soyad);
	}
	
}

class Pazarlama extends calisan 
{

	Pazarlama(String ad, String soyad) 
	{
		super(ad, soyad);
	} 
	public void yaz() {
		System.out.println("�u an pazarlama s�n�f�nday�z.");
		pazarlamaYaz();
	}
	public void pazarlamaYaz() {
		System.out.println("Pazarlama Aa ve Soyad : " + ad + " " + soyad);
	}
}

class Patron extends calisan 
{

	Patron(String ad, String soyad) 
	{
		super(ad, soyad);
	} 
	public void yaz() {
		System.out.println("�u an patron s�n�f�nday�z.");
		patronYaz();
	}
	public void patronYaz() {
		System.out.println("Pazarlama Aa ve Soyad : " + ad + " " + soyad);
	}
}