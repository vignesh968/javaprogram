package recursion;
import java.util.Scanner;

public class fibonacci
{
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int a=s.nextInt();
        System.out.println("output");
      
       for(int i=0;i<a;i++)
       {
        System.out.println(fibonaccifun(i));
       }
    }
    public static int fibonaccifun(int n)
    {
        if(n<=1)
        {
            return 1;
        }
       
        else{
            return fibonaccifun(n-1)+fibonaccifun(n-2);
        }
    }
}