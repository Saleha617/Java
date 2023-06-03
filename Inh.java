class A
{
  int a = 10, b = 20;
  public void add (int a,int b)
  {
    System.out.println (a + b);
  }
  
}
class B extends A
{
    int a=7,c = 50;
    public void add (int a,int b,int c)
  {
    System.out.println(a+b+c);
    System.out.println(this.a);
  }
}
public class Inh extends B
{
  public static void main (String[]args)
  {
    Inh obj = new Inh ();
      obj.add (5,6,6);
      
  }
}