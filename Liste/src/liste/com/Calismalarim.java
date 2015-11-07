package liste.com;

import java.util.*;

public class Calismalarim {

	
	public static void main(String[] args) {
			
		Queue<Integer> kuyruk = new PriorityQueue<Integer>(); 
		kuyruk.add(new Integer(1));
		kuyruk.add(new Integer(2));
		kuyruk.add(new Integer(3));
		kuyruk.add(new Integer(4));
		kuyruk.add(new Integer(5));
		
		System.out.println(kuyruk.poll());
		System.out.println(kuyruk.peek());
		System.out.println(kuyruk.poll());
		System.out.println(kuyruk.peek());
		System.out.println(kuyruk.poll());
	
		System.out.println("Size = " + kuyruk.size());
	}

}
