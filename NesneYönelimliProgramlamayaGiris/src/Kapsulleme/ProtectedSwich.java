package Kapsulleme;

public class ProtectedSwich
{
	//protected
	String gizlidgr = "didem"; //defoult olarak tanýmlanan deðiþken
	protected void gizlimetod()
	{
		System.out.println("burasý gizli metoddur.");
	}
	public static void main(String[] args) 
	{
		ProtectedSwich nesne = new ProtectedSwich();
		nesne.gizlimetod();
		System.out.println(nesne.gizlidgr);

	}

}
