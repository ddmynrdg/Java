package Kapsulleme2;

import Kapsulleme.PublicSwitch;;
public class PublicSwitch2 
{
	
	protected void gizli(int x, int y)
	{
		System.out.println("carpma iþlemi: " + x*y);
	}
	public static void main(String[] args) {
		
			PublicSwitch2 nesne = new PublicSwitch2();
			nesne.gizli(5, 3);
			PublicSwitch nesne2 = new PublicSwitch();
			nesne2.gizlimetod();
			
	}

}
