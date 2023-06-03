//interfaces
interface A{
    int a;
    public void meth();
    public void meth2();
    public void meth3();
}
abstract class B implements A{
    public void meth(){
        System.out.println("B using A interface");
    }
}
class C extends B{
    public void meth2(){
        System.out.println("Method 2 in C");
        
    }
    public void meth3(){
        System.out.println("Method 3 in C");
        
    }
    
}
public class Interfc
{
	public static void main(String[] args) {
		A obj=new C();
		obj.meth();
		obj.meth2();
		obj.meth3();
	}
}
