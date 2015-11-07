package linkedSet.com;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedSetOrnegi 
{
	public static void main(String[] args) 
	{
		// elemanlar sýralýdýr
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		
		lhs.add("java");
		lhs.add("android");
		lhs.add("c++");
		lhs.add(".NET");
		lhs.add("Windows Phone");
		lhs.add("HTML5");
		lhs.add("java");
		
		Iterator i = lhs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
			
		}
	
	}

}
