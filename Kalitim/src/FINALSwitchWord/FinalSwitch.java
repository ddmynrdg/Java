package FINALSwitchWord;

public class FinalSwitch 
{
	// sabt tanımlama:değişkenler tanımlandığı ilk satırda değerlerini
	// almak zorundadır.Aldıktan sonra değiştirilmez.Yapıcılar ile değer 
	//verilebilir.
	
	private final int a;
	public FinalSwitch(int x)
	{
		a = x;
	}
	public static void main(String[] args) 
	{
		FinalSwitch f1 = new FinalSwitch(3);
		final int b;
		b = 10;
	}

}
