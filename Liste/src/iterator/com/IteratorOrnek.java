package iterator.com;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorOrnek 
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		Iterator i = hs.iterator();
		
		while (i.hasNext()) {
			i.next();
			
		}
	}

}
