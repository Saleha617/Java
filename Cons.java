class Obj{
    private String name;
    private int age;
    private String dept;
    Obj(String n,int a, String d){
        name=n;
        age=a;
        dept=d;
        }public void getinfo(){
            return ;
        }
}
public class Cons{
     public static void main (String[] args) {
        Obj o=new Obj("Riya",21,"CSE");
        Obj o2=new Obj("Sarah",23,"EEE");
        System.out.println("Student1:");
        System.out.println("Name:"+o.getname());
        System.out.println("Age:"+o.getage());
        System.out.println("Department: "+o.getdept());
         System.out.println("Student2:");
        System.out.println("Name:"+o2.getname());
        System.out.println("Age:"+o2.getage());
        System.out.println("Department: "+o2.getdept());
    }
}