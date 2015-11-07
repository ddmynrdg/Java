package Kapsulleme;

public class PublicSwitch
{

	public void gizlimetod() 
	{
		System.out.println("burasý gizli metoddur.");
	}
	public static void main(String[] args) 
	{
		PublicSwitch nesne = new PublicSwitch();
		nesne.gizlimetod();
	}

}
