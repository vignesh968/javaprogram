package recursion;

import java.util.Scanner;

public class genericsubset {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
String a=s.nextLine();
String b="";

 genericStringfun(a,b,0);
    }
    public static void genericStringfun(String a,String b, int i)
    {
        if(i==a.length())
        {
            System.out.println(b);
            return;
        }
        genericStringfun(a, b+a.charAt(i), i+1);
        genericStringfun(a, b, i);
    }
}
