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
		
		System.out.println("aðaç yapýsýnýn elemanlarý : " + ts);
		System.out.println("aðac yapýsýnýn en küçük yapýsý : "+ ts.first());
		System.out.println("aðaç yapýsýnýn en büyük elemaný : " + ts.last());
		System.out.println("21 den küçük elemanlarýmýz" + ts.headSet(21));
		System.out.println("5 ile 88 arasý deðerlerimiz : " + ts.subSet(5, 88));
		System.out.println("33 ile 33 ten büyük eemanlarýmýz : " + ts.tailSet(33) );
		
		
		
		
	}

}
