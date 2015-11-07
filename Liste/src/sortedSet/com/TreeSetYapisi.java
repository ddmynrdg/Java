package sortedSet.com;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetYapisi {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<>();
		
		ts.add(1);
		ts.add(55);
		ts.add(54);
		ts.add(33);
		ts.add(5);
		ts.add(19);
		ts.add(88);
		
		System.out.println("a�a� yap�s�n�n elemanlar� : " + ts);
		System.out.println("a�ac yap�s�n�n en k���k yap�s� : "+ ts.first());
		System.out.println("a�a� yap�s�n�n en b�y�k eleman� : " + ts.last());
		System.out.println("21 den k���k elemanlar�m�z" + ts.headSet(21));
		System.out.println("5 ile 88 aras� de�erlerimiz : " + ts.subSet(5, 88));
		System.out.println("33 ile 33 ten b�y�k eemanlar�m�z : " + ts.tailSet(33) );
		
		
		
		
	}

}
