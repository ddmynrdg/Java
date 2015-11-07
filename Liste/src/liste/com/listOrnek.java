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
		System.out.println("baþtan tarama");
		
		while (li.hasNext()) {
			System.out.print("Ýndis deðeri : " + li.nextIndex() + " ");
			System.out.println("elemanýmýz : " + li.next());
		}
		System.out.println("sondan tama");
		while (li.hasPrevious()) {
			System.out.print("Ýndis deðerimiz : " + li.previousIndex() + " ");
			System.out.println("elemanýmýz : " + li.previous());
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