package recursion;

import java.util.Scanner;

public class print1toN {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int a=s.nextInt();
        System.out.println("Equilant taild recursion output");
        print1toNfun(a,1);
          System.out.println("not taild output");
        print1toNfun(a);
    }
    public static void print1toNfun(int n,int k)
    {
        if(n==0)
        {
            return ;
        }
       
        System.out.println(k);
        print1toNfun(n-1, k+1);
    }
       public static void print1toNfun(int n)
    {
        if(n==0)
        {
            return ;
        }
       print1toNfun(n-1);
        System.out.println(n);
        
    }
}
