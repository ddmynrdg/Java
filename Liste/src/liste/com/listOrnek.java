package liste.com;

import java.util.ArrayList;
import java.util.ListIterator;



public class listOrnek 
{
	public static void main(String[] args) 
	{
		ArrayList listeYapisi = new ArrayList();
		
		listeYapisi.add("edirne");
		listeYapisi.add("sivas");
		listeYapisi.add("bolu");
		listeYapisi.add("newsehir");
		listeYapisi.add(5);
		listeYapisi.add("bolu");
		listeYapisi.set(3, "sivas");
		
		
		ListIterator li = listeYapisi.listIterator();
		System.out.println("ba�tan tarama");
		
		while (li.hasNext()) {
			System.out.print("�ndis de�eri : " + li.nextIndex() + " ");
			System.out.println("eleman�m�z : " + li.next());
		}
		System.out.println("sondan tama");
		while (li.hasPrevious()) {
			System.out.print("�ndis de�erimiz : " + li.previousIndex() + " ");
			System.out.println("eleman�m�z : " + li.previous());
		}
		System.out.println(listeYapisi.get(5));
	}
	
}
/*
*listIterator
*add()
*set()
*hasnext()
*hasPrevious()
*next()
*previous()
*nextIndex
*previousIndex
*/