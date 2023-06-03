//access private member
class C1{
    private String p="945677888409";
    public void getp(){
        System.out.println(p);
    }
    public void setp(){
        p="4757583934";
        System.out.println(p);
    }
}
public class enc extends C1{
    public static void main (String[] args) {
        enc obj=new enc();
        obj.getp();
        obj.setp();
        }
}