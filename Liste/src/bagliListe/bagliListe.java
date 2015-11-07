package bagliListe;

import java.util.LinkedList;

public class bagliListe
{

	public static void main(String[] args)
	{
	Yigit yeniyigit = new Yigit();
	yeniyigit.ekle(1);
	yeniyigit.ekle(2);
	yeniyigit.ekle(3);
	yeniyigit.ekle(4);
	yeniyigit.ekle(5);
	yeniyigit.ekle(6);
	
	System.out.println("yýðýt sýnýfýnýn elemanlarý = " + yeniyigit.bagliListe);
	System.out.println("Tepe eleman = " + yeniyigit.tepeEleman());
	System.out.println("Yýðýt yapýsýnýn ilk elemaný = " + yeniyigit.getir());
	System.out.println("Tepe eleman = " + yeniyigit.tepeEleman());
	System.out.println("yýðýt sýnýfýnýn elemanlarý = " + yeniyigit.bagliListe);
	}
}
class Yigit
{
	public LinkedList bagliListe = new LinkedList();
	
	public void ekle(Object veri) {
		bagliListe.addFirst(veri);
	}
	
	public Object getir() {
		return bagliListe.removeFirst();
	}
	public Object tepeEleman() {
		return bagliListe.getFirst();
	}
}
