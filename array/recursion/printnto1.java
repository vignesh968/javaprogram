package recursion;

import java.util.Scanner;

public class printnto1 {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int a=s.nextInt();
        System.out.println("output");
       printnto1fun(a);
    }
    public static void printnto1fun(int n)
    {
        if(n==0)
        {
            return ;
        }
        else{
            System.out.println(n);
            printnto1fun(n-1);
        }
    }
}
