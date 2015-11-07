package Override;

class A
{
	
	public void islemYap(int a, int b)
	{
		System.out.println("iþlem sonucu: " + (a * b));
	}
	public void ornekMetod() {
		System.out.println("üst sýnýfýn metodu");
	}
}
class B extends A
{
	
	public void islemYap(int a, int b) {
		System.out.println("iþlem sonucu " + (a + b));
	}
	
	public void ornekMetod() //override(deðiþtirilme) iþlemi
	{
		System.out.println("ust sýnýftaki metod override edildi");
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
