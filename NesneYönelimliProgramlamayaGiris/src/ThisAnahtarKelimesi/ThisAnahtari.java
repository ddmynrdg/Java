package ThisAnahtarKelimesi;

public class ThisAnahtari 
{
	String ad;
	String soyad;
	public void ata(String ad, String soyad)
	{
		this.ad = ad;
		this.soyad = soyad;
	}
	public void Yazdir() {
		System.out.println("ad: " + ad + " Soyad�: " + soyad);
	}
	public static void main(String[] args) 
	{
		ThisAnahtari nesne = new ThisAnahtari();
		nesne.ata("D�DEM", "YANARDA�");
		nesne.Yazdir();
		
	}

}
