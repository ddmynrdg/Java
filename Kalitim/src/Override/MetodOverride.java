package Override;

class A
{
	
	public void islemYap(int a, int b)
	{
		System.out.println("i�lem sonucu: " + (a * b));
	}
	public void ornekMetod() {
		System.out.println("�st s�n�f�n metodu");
	}
}
class B extends A
{
	
	public void islemYap(int a, int b) {
		System.out.println("i�lem sonucu " + (a + b));
	}
	
	public void ornekMetod() //override(de�i�tirilme) i�lemi
	{
		System.out.println("ust s�n�ftaki metod override edildi");
	}
}
public class MetodOverride 
{

	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.ornekMetod();
		System.out.println("*********");
		b1.islemYap(5, 2);
	}

}
