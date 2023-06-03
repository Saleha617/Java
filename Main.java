import java.util.Scanner;
class Meth1{
    public void meth(int a,int b)
    {
        System.out.println(a+b);
    }
    public void meth(int a,String b)
    {
        System.out.println(a+b);
    }
    Meth1(int c,int d){
        System.out.println("c and d are "+c+" ,"+d);
    }
     Meth1(int c,int d,int e){
        System.out.println("c, d and e are "+c+","+d+","+e);
    }
}
public class Main
{
	public static void main(String[] args) {
	    Meth1 n=new Meth1(20,50);
	    n.meth(10,20);
	    n.meth(10,"joe");
	}
}