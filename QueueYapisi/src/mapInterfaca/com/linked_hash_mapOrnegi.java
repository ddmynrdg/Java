package mapInterfaca.com;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class linked_hash_mapOrnegi 
{
	public static void main(String[] args) 
	{
		//veriler ba�l� bir �ekilde tutulur
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		lhm.put("�anakkale", 17);
		lhm.put("tekirda�", 59);
		lhm.put("Edirne", 22);
		lhm.put("K�rklareli", 39);
		
		System.out.println("B�l� hash Map yap�m�z : " + lhm);
		Set anahtarlar = lhm.keySet();
		System.out.println("anahtarlar�m�z : " + anahtarlar);
		
		Collection deger = lhm.values();
		System.out.println("de�erlerimiz : " + deger);
		
	}

}
