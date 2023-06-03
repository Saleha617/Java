//ArrayList prgm............................
import java.util.*;
public class ArrList
{
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(30);
		l.add(23);
		//l.add("sony");
	    //l.add(1,"White");
		System.out.println("l1:"+l);
		ArrayList l2=new ArrayList();
		l2.add(40.2);
		l2.add("black");
		System.out.println("l2:"+l2);
		l.addAll(2,l2);
		System.out.println("l1:"+l);
		System.out.println(l.contains("black"));
		System.out.println(l2.contains(30));
		System.out.println(l.get(3));
		System.out.println(l.indexOf(23));
		//l.remove("sony");
		l.removeAll(l2);
	//	l.set(1,"Pink");
		System.out.println(l);
		for(Object o:l)
		System.out.print(o+" ");
	}
}