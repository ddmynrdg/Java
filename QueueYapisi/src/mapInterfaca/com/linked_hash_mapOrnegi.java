package mapInterfaca.com;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class linked_hash_mapOrnegi 
{
	public static void main(String[] args) 
	{
		//veriler baðlý bir þekilde tutulur
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		lhm.put("Çanakkale", 17);
		lhm.put("tekirdað", 59);
		lhm.put("Edirne", 22);
		lhm.put("Kýrklareli", 39);
		
		System.out.println("Bðlý hash Map yapýmýz : " + lhm);
		Set anahtarlar = lhm.keySet();
		System.out.println("anahtarlarýmýz : " + anahtarlar);
		
		Collection deger = lhm.values();
		System.out.println("deðerlerimiz : " + deger);
		
	}

}
