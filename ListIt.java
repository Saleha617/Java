//list iterator.....................
import java.util.*;

public class ListIt
{
	public static void main(String[] args) {
	    int i;
		ArrayList l=new ArrayList();
		l.add("arpita");
		l.add("tejaswini");
		l.add("vinod");
		l.add("kiran");
		l.add("rajeswari");
		ListIterator<String> li=l.listIterator();
		while(li.hasNext())
		{
		    if(li.next()=="vinod")
		    {
		       // i=l.indexOf(li.next());
		        li.remove();
		        //break;
		    }
		}
	//	System.out.println(l);
	}
}