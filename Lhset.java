//LinkedHashSet
import java.util.*;

public class Lhset
{
	public static void main(String[] args) {
	 Set<Integer> h=new LinkedHashSet<>();
	 h.add(2);
	 h.add(1);
	 h.add(4);
	 h.add(3);
	 h.add(0);
	 h.add(7);
	 h.add(5);
	 System.out.println(h);
	 System.out.println(h.size());
	 Set<String> a=new LinkedHashSet<>();
	 a.add("Casandra");
	 a.add("Arya");
	 a.add("Dolly");
	 a.add("Bunny");
	 System.out.println(a);
	}
}