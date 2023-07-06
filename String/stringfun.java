package String;
import java.util.Scanner;

public class stringfun {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       System.out.println("enter a first string");
        String a=s.nextLine();
        System.out.println("enter a second string");
        String b=s.nextLine();

        stringfunfun(a,b);
    }    
    public static void stringfunfun(String a,String b)
    {
        System.out.println("string length");
        System.out.println(a.length() );
        System.out.println("substring");
        System.out.println(a.substring(2));
        System.out.println(b.substring(1, 5));
        System.out.println("string equal");
        System.out.println((a.equals(b))?"equal":"not equal");
        System.out.println("compare to");
        int res=a.compareTo(b);
        System.out.println((res==0)?"same":(res>0)?"a greater":"a smaller");

        System.out.println("index of");
        System.out.println(a.indexOf(b, 2));
    }

}