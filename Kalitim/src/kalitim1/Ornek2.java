package kalitim1;


class Otomobil
{
	public String plaka;
	public Otomobil(String plaka) 
	{
		this.plaka = plaka;
		System.out.println("otomobilin plakasý: " + this.plaka);
	}
}

class Gazli extends Otomobil
{
	public Gazli()
	{
		super("dfkgu87");
		System.out.println("burasý gazlý otomobilin sýnfýnýn yapýcýcsý");
	}
}
public class Ornek2
{
	public static void main(String[] args) 
	{
		Gazli oto = new Gazli();
	
	}

}
