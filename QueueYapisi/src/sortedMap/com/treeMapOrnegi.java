package sortedMap.com;

import java.util.*;

public class treeMapOrnegi 
{

	public static void main(String[] args) 
	{
	
		TreeMap<Integer, String> agac = new TreeMap<>();
		agac.put(17, "çanakkale");
		agac.put(22, "edirne");
		agac.put(39, "kýrklareli");
		agac.put(16, "bursa");
		agac.put(34, "istbul");
		agac.put(71, "kýrýkkale");
	
		System.out.println("tree map yapýmýz :  " + agac); // {16=bursa, 17=çanakkale, 22=edirne, 34=istbul, 39=kýrklareli, 71=kýrýkkale}
		System.out.println("degeri 22 olan plaka ili : " + agac.ceilingEntry(22) ); // 22=edirne
		System.out.println("22 ve 22 den büyük anahtarlar : " + agac.ceilingKey(22)); // 22
		System.out.println("azalan sýrada anahtarlar : " + agac.descendingKeySet()); // [71, 39, 34, 22, 17, 16]
		System.out.println("azalan sýrada yapýmýz : " + agac.descendingMap()); // {71=kýrýkkale, 39=kýrklareli, 34=istbul, 22=edirne, 17=çanakkale, 16=bursa}
		System.out.println("22 ve 22 den küçük degerler : " + agac.floorEntry(22)); // 22=edirne
		System.out.println("22 ve 22 den küçük anahtarlar :" + agac.floorKey(22)); // 22
		System.out.println("22 den küçük degerler : " + agac.headMap(22)); // {16=bursa, 17=çanakkale}
		System.out.println("22 deb büyük degerler : " + agac.higherEntry(22)); // 34=istbul
		System.out.println("22 den büyük anahtarlar : " + agac.higherKey(22)); // 34
		System.out.println("22 den küçük anahtarlar : " + agac.lowerKey(22)); // 17
		System.out.println("22 den büyük degerler : " + agac.lowerEntry(22));  // 17=çanakkale
		System.out.println("22 ile 39 arasýnddaki degerler : " + agac.subMap(22, 39)); // {22=edirne, 34=istbul}
		System.out.println("22 ile 22 den büyük deger : " + agac.tailMap(22)); // {22=edirne, 34=istbul, 39=kýrklareli, 71=kýrýkkale}
		
		
		
		
		
		
		
		
		
		
	}
}

