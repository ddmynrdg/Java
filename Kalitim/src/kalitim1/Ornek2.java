package kalitim1;


class Otomobil
{
	public String plaka;
	public Otomobil(String plaka) 
	{
		this.plaka = plaka;
		System.out.println("otomobilin plakas�: " + this.plaka);
	}
}

class Gazli extends Otomobil
{
	public Gazli()
	{
		super("dfkgu87");
		System.out.println("buras� gazl� otomobilin s�nf�n�n yap�c�cs�");
	}
}
public class Ornek2
{
	public static void main(String[] args) 
	{
		Gazli oto = new Gazli();
	
	}

}
