//multithreading .................
import java.util.*;
class Asgmnt extends Thread{
    public void run(){ 
    Scanner sc=new Scanner(System.in);
    System.out.println("Student Assignment...enter a number to start");
    int s=sc.nextInt();
    System.out.println("Student wrote Assignment "+s);
}}
class Prnt extends Thread{
    public void run(){
        System.out.println("Printing started");
    for(int i=1;i<=4;i++){
    System.out.println("cbit");
    try{
        Thread.sleep(5000);
        
    }
        catch(InterruptedException e){
            e.printStackTrace();
            
        }
    }
        System.out.println("Printing ended");
}}
class Mul extends Thread{
    public void run(){
    System.out.println("Multiplication started");
     try{
         System.out.println(20*16);
        Thread.sleep(5000);
        
    }
        catch(InterruptedException e){
            e.printStackTrace();
            
        }
    System.out.println("Multiplication ended");
}}
public class MulThrd
{
	public static void main(String[] args) {
	Asgmnt a=new Asgmnt();
	Prnt p=new Prnt();
	Mul m=new Mul();
	a.run();
	p.run();
	m.run();
	}
}