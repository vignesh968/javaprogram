package recursion;
import java.util.Scanner;

public class samplerecursion2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int a=s.nextInt();
        System.out.println("output");
        recursionsamplefun(a);
    }
    public static void recursionsamplefun(int n)
    {
        if(n==0)
        {
            return ;
        }    recursionsamplefun(n-1);
        System.out.println(n);
    recursionsamplefun(n-1);
  
    }
    
}
