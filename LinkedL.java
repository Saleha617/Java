//linked list.........................
import java.util.*;
public class LinkedL
{
	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(35);
		l.add(25);
		l.add(89);
		l.add(38);
		l.remove(1);
		for(int a:l)
		System.out.print(a+" ");
		Iterator it=l.iterator();
		while(it.hasNext())
		System.out.print(it.next()+" ");
		System.out.println();
		ListIterator<Integer> listit=l.listIterator();
		while(listit.hasNext())
		System.out.println(listit.next());
		while(listit.hasPrevious()){
		//int s=listit.previous();
		System.out.println(listit.previous());
		    
		}
		System.out.print(listit.next()+" ");
		System.out.println();
		l.addFirst(9);
		l.set(3,4);
		l.addLast(10);
		l.push(50);
		System.out.println(l);
		l.pop();
		System.out.println(l);
		System.out.println(l.peek());
		System.out.println(l.poll());
		
	}
}