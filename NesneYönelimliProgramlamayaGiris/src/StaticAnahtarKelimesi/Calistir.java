
package StaticAnahtarKelimesi;

public class Calistir 
{

	public static void main(String[] args) 
	{
		Calisan eleman1 = new Calisan("Didem", "Yanardað", "samsun", 6000);
		Calisan eleman2 = new Calisan("ali", "can", "bolu", 5000);
		Calisan eleman3 = new Calisan("Dilek", "Yanar", "bursa", 1000);
		Calisan eleman4 = new Calisan("salih", "gül", "sivas", 2000);
		Calisan eleman5 = new Calisan("demet", "kýlýç", "van", 3000);
		eleman1.BilgiVer();
		System.out.println();
		eleman2.BilgiVer();
		System.out.print("\n");
		eleman3.BilgiVer();
		System.out.print("\n");
		eleman4.BilgiVer();
		System.out.print("\n");
		eleman5.BilgiVer();
	}

}
