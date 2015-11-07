package sortedMap.com;

import java.util.*;

public class treeMapOrnegi 
{

	public static void main(String[] args) 
	{
	
		TreeMap<Integer, String> agac = new TreeMap<>();
		agac.put(17, "�anakkale");
		agac.put(22, "edirne");
		agac.put(39, "k�rklareli");
		agac.put(16, "bursa");
		agac.put(34, "istbul");
		agac.put(71, "k�r�kkale");
	
		System.out.println("tree map yap�m�z :  " + agac); // {16=bursa, 17=�anakkale, 22=edirne, 34=istbul, 39=k�rklareli, 71=k�r�kkale}
		System.out.println("degeri 22 olan plaka ili : " + agac.ceilingEntry(22) ); // 22=edirne
		System.out.println("22 ve 22 den b�y�k anahtarlar : " + agac.ceilingKey(22)); // 22
		System.out.println("azalan s�rada anahtarlar : " + agac.descendingKeySet()); // [71, 39, 34, 22, 17, 16]
		System.out.println("azalan s�rada yap�m�z : " + agac.descendingMap()); // {71=k�r�kkale, 39=k�rklareli, 34=istbul, 22=edirne, 17=�anakkale, 16=bursa}
		System.out.println("22 ve 22 den k���k degerler : " + agac.floorEntry(22)); // 22=edirne
		System.out.println("22 ve 22 den k���k anahtarlar :" + agac.floorKey(22)); // 22
		System.out.println("22 den k���k degerler : " + agac.headMap(22)); // {16=bursa, 17=�anakkale}
		System.out.println("22 deb b�y�k degerler : " + agac.higherEntry(22)); // 34=istbul
		System.out.println("22 den b�y�k anahtarlar : " + agac.higherKey(22)); // 34
		System.out.println("22 den k���k anahtarlar : " + agac.lowerKey(22)); // 17
		System.out.println("22 den b�y�k degerler : " + agac.lowerEntry(22));  // 17=�anakkale
		System.out.println("22 ile 39 aras�nddaki degerler : " + agac.subMap(22, 39)); // {22=edirne, 34=istbul}
		System.out.println("22 ile 22 den b�y�k deger : " + agac.tailMap(22)); // {22=edirne, 34=istbul, 39=k�rklareli, 71=k�r�kkale}
		
		
		
		
		
		
		
		
		
		
	}
}

