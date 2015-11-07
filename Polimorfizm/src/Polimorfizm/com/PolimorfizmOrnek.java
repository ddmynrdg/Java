package Polimorfizm.com;

public class PolimorfizmOrnek {

	public static void main(String[] args) 
	{
		calisan c = new calisan("Didem", "yanardag");
		isci i = new isci("Ali", "can");
		Pazarlama p = new Pazarlama("aycan", "fal");
		Patron pa = new Patron("demet", "halým");
		
		//c.yaz();
		//c.calisanYaz();
		//i.yaz();
		//i.isciYaz();
		//p.yaz();
	   //p.pazarlamaYaz();
		
		// þimdi çok biçimlilik iþlemlerini yapalým
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
		// GetClass metodunu kullanalým
		// c nesnesini get class metodudu ile sýnýfýný sorgulayalým
		// sýnýfý verir. class paketAdý.sýnýfAdý ekrana basar.
		
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
		System.out.println("Þuan çalýþan sýnýfýndayýz");
		calisanYaz();
	}
	public void calisanYaz() 
	{
		System.out.println("Çalýþan Ad ve Soyad : " + ad + " " + soyad);
	}
}

class isci extends calisan 
{
	isci(String ad, String soyad) //yapýlandýrýcýmýz
	{
		super(ad, soyad);
	}
	
	public void yaz() {
		System.out.println("iþçi sýnýfýndayým.");
		isciYaz();
	}
	public void isciYaz() {
		System.out.println("Ýþçi Ad ve Soyad : " + ad + " " + soyad);
	}
	
}

class Pazarlama extends calisan 
{

	Pazarlama(String ad, String soyad) 
	{
		super(ad, soyad);
	} 
	public void yaz() {
		System.out.println("Þu an pazarlama sýnýfýndayýz.");
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
		System.out.println("Þu an patron sýnýfýndayýz.");
		patronYaz();
	}
	public void patronYaz() {
		System.out.println("Pazarlama Aa ve Soyad : " + ad + " " + soyad);
	}
}