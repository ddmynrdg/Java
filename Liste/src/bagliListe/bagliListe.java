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
	
	System.out.println("y���t s�n�f�n�n elemanlar� = " + yeniyigit.bagliListe);
	System.out.println("Tepe eleman = " + yeniyigit.tepeEleman());
	System.out.println("Y���t yap�s�n�n ilk eleman� = " + yeniyigit.getir());
	System.out.println("Tepe eleman = " + yeniyigit.tepeEleman());
	System.out.println("y���t s�n�f�n�n elemanlar� = " + yeniyigit.bagliListe);
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
