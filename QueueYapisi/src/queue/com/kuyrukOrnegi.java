package queue.com;

import java.util.LinkedList;
import java.util.Queue;

public class kuyrukOrnegi 
{

	public static void main(String[] args) 
	{
		Queue<String> kuyruk = new LinkedList<String>();
		
		kuyruk.add("Bir");
		kuyruk.add("Iki");
		kuyruk.add("Uc");
		kuyruk.offer("D�rt");
		kuyruk.offer("Bes");
		kuyruk.offer("Alt");
		
		System.out.println("Kuyruktaki elemanlar. ----> " + kuyruk);
		while(!kuyruk.isEmpty()){
			System.out.println("kuyruk bo� de�il daha bekleyenler : " + kuyruk.peek());
			System.out.println("kuyruk bo� de�il kuyruktan �ekilen elemanlar : " + kuyruk.poll());
			
			
		}

	}

}
