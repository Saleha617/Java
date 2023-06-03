import java.util.*;
abstract class Car{
    public abstract void drive(String a);
    public abstract void race();
    public void activity(){
        System.out.println("Playing music");
    }
} 
abstract class Gmc extends Car{
    public abstract void fly();
    public void drive(String a){
        System.out.println(a+" is Driving");
    }
    public void drive(String a,int b)
    {
        System.out.println(a+"drives "+b);
    }
}
class UpdtGmc extends Gmc{
    public void drive(String a){
        System.out.println(a+" is Driving a car");
    }
    public void fly(){
        System.out.println("Flying");
    }
    public void race(){
        System.out.println("Racing");
    }
}
public class AbsEx
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		UpdtGmc c=new UpdtGmc();
		c.fly();
		c.drive("Seher",2);
		c.activity();
		c.race();
		
	}
}
