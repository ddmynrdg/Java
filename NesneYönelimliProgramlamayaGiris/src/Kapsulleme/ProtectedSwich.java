package Kapsulleme;

public class ProtectedSwich
{
	//protected
	String gizlidgr = "didem"; //defoult olarak tan�mlanan de�i�ken
	protected void gizlimetod()
	{
		System.out.println("buras� gizli metoddur.");
	}
	public static void main(String[] args) 
	{
		ProtectedSwich nesne = new ProtectedSwich();
		nesne.gizlimetod();
		System.out.println(nesne.gizlidgr);

	}

}
