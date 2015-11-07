package Kapsulleme;

public class ProviteSwitch 
{
	private String gizli = "didem";
	private void gizlimetod() 
	{
		System.out.println("bura gizlidir.");
	}
	
	public static void main(String[] args) 
	{
		ProtectedSwich nesne = new ProtectedSwich();
		nesne.gizlimetod();
		System.out.println(nesne.gizlidgr);
	}

}
