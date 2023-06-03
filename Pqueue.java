//PRIORITY QUEUE
import java.util.*;
public class Pqueue
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);	
		PriorityQueue<String> a=new PriorityQueue<String>();
		a.add("E");
		a.add("V");
		a.add("S");
	    for(String i:a)
	    System.out.print(i);
	    System.out.println();
	    System.out.println(a.peek());
	    System.out.println(a.poll());
	    System.out.println(a);
	    System.out.println(a.peek());
	    ArrayDeque b=a.clone();
	    b.remove();
	    b.offerFirst(1);
	    Iterator ib=b.iterator();
	    while(ib.hasNext())
	    System.out.print(ib.next()+" ");
	    System.out.println();
	    System.out.println(b.size());
	    ArrayList l=new ArrayList();
	    l=sc.nextInt();
	    System.out.println(l);
	    
	}
	}