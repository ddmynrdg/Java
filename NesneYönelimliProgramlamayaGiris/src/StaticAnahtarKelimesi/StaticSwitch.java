package StaticAnahtarKelimesi;
import static java.lang.Math.*;

public class StaticSwitch
{
	public static void ornek()
	{
		System.out.println("buras� static metoddur.S�n�f olu�turulamadan da eri�ilebilir.");
	}
	public static void main(String[] args) 
	{
		System.out.println(Math.pow(4, 5));
		System.out.println(pow(3,5));
		StaticSwitch.ornek();
	}

}
