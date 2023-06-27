package recursion;

import java.util.Scanner;

public class factorial {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int a=s.nextInt();
        System.out.println("output");
   int y=factorialfun(a);
   System.out.println(y);
    }
    public static int factorialfun(int n)
{
if(n==0)
{
    return 1;
}
else
{
    return n*factorialfun(n-1);
}
}
}
