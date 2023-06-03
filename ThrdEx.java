//Single thread............................................
import java.util.*;
class A extends Thread{
    public void run()
    {
        System.out.println("thread in class A");
    }
}
public class ThrdEx
{
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    Thread t=Thread.currentThread();
    t.setPriority(3);
    t.setName("first");
    A a=new A();
    a.run();
    for(int i=1;i<=4;i++){
    System.out.println("Main Thread");
    try{
        Thread.sleep(5000);
        
    }
        catch(InterruptedException e){
            e.printStackTrace();
            
        }
    }
    }
}