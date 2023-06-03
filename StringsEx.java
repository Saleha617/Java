import java.util.Scanner;
public class StringsEx
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    String s = "CBIT";
    String s1 = "CBIT";
    if (s == s1)
      System.out.println ("equal");
    else
	System.out.println ("not equal");
    if (s.equals (s1))
        System.out.println ("strings equal");
    else
        System.out.println ("strs not equal");

    String s2 = new String ("CBIT");
    String s3 = new String ("CBITs");
    if (s == s2)
      System.out.println ("equal");
    else
        System.out.println ("not equal");
    if (s.equals (s2))
        System.out.println ("strings equal");
    else
        System.out.println ("strs not equal");

    String s4 = new String ("cbit");
    if (s == s4)
      System.out.println ("equal");
    else
        System.out.println ("not equal");
    if (s.equalsIgnoreCase (s4))
        System.out.println ("strings equal");
    else
        System.out.println ("strs not equal");

    String t = "College";
      String c = s.concat (t);
      System.out.println (c);
      System.out.println (t.contains ("leg"));
      System.out.println (s.substring (1, 3));
      String v = s + t;
      String r = s + t;
      System.out.println (v);
      System.out.println (c == v);
      System.out.println (c.equals (v));
      System.out.println (v == r);
      System.out.println (r.equals (v));
      System.out.println(t.replace("l","b"));
      System.out.println(t.indexOf("g"));
      System.out.println(t.toLowerCase());
      System.out.println(t.toUpperCase());
      System.out.println(t.toString());
      System.out.println(t.charAt(4));
      System.out.println(t.toCharArray());
      
  }
}