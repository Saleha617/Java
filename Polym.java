//polymorphism
class Parent{
    Parent(){
        System.out.println("Parent class no parameters");
    }
    Parent(int x)
    {
        System.out.println("Parent class with "+x);
    }
}

class Derived extends Parent{
    Derived(int x,int y)
    {   
        super(x);
        System.out.println("Derived class with "+x+","+y);
    }
    Derived(){
        System.out.println("Derived class no parameters");
    }
    
}
class Gc extends Derived{
    Gc(){
        System.out.println(" Grandchild class no parameters");
    }
    Gc(int x,int y,int z)
    {   
        super(x,y);
        System.out.println("Grandchild class with "+x+","+y+","+z);
    }
}
public class Polym{
public static void main (String[] args) {
    Gc obj=new Gc(20,40,60);
}    
}
