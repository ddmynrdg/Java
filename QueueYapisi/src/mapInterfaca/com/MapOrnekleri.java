package mapInterfaca.com;

import java.util.HashMap;
import java.util.Set;

public class MapOrnekleri 
{
	public static void main(String[] args) 
	{
		
		HashMap<Integer, String> hm = new HashMap<Integer,String>(10, 0.5f);
		//verilerimiz sıralı değildir
		hm.put(17, "çanakkaler");
		hm.put(22, "edirne");
		hm.put(39, "kırklareli");
		hm.put(59, "tekirdag");
		hm.put(76, "ıgdır");
		hm.put(76, "Igdir");
	
		System.out.println("hash map öğemisz içerisindeki veriler : " + hm);
		Set anahtarlar = hm.keySet();
		Set veriler = hm.entrySet();
		System.out.println("anahtarlarımız. " + anahtarlar);
		System.out.println("verilerimiz " + veriler);
		
		
	}

}
