package mapInterfaca.com;

import java.util.HashMap;
import java.util.Set;

public class MapOrnekleri 
{
	public static void main(String[] args) 
	{
		
		HashMap<Integer, String> hm = new HashMap<Integer,String>(10, 0.5f);
		//verilerimiz s�ral� de�ildir
		hm.put(17, "�anakkaler");
		hm.put(22, "edirne");
		hm.put(39, "k�rklareli");
		hm.put(59, "tekirdag");
		hm.put(76, "�gd�r");
		hm.put(76, "Igdir");
	
		System.out.println("hash map ��emisz i�erisindeki veriler : " + hm);
		Set anahtarlar = hm.keySet();
		Set veriler = hm.entrySet();
		System.out.println("anahtarlar�m�z. " + anahtarlar);
		System.out.println("verilerimiz " + veriler);
		
		
	}

}
