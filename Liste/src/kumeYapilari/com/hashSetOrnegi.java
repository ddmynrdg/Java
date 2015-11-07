package kumeYapilari.com;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetOrnegi 
{
	public static void main(String[] args) 
	{
	
		//tekrarlý eleman olamaz
		//eleman sýrasý belli deðildir
		HashSet<String> hs = new HashSet<>();
		boolean b1, b2;
		
		b1 = hs.add("java");
		hs.add("android");
		hs.add("c++");
		hs.add(".NET");
		hs.add("windows phone");
		hs.add("HTML5");
		b2 = hs.add("java");
		
		Iterator i = hs.iterator();
		
		System.out.println(b1 + " - " + b2);
		
		while (i.hasNext()) {
			
			System.out.println("kumemiz : " + i.next());
			
		}
		
		
		
		}

}
