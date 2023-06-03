import java.util.Scanner;
class Fan{
    public void fanpro(String c,double p,String b)
    {
        System.out.println("This fan is in "+c+ " color, of brand-"+b+" and its cost is Rs."+p);
    }
}

public class ParaCons
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String clr=sc.nextLine();
        String br=sc.nextLine();
        double pr=sc.nextDouble();
        Fan f=new Fan();
        f.fanpro(clr,pr,br);
	}
}
