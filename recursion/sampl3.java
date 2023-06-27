package recursion;

import java.util.Scanner;

public class sampl3 {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int a=s.nextInt();
        System.out.println("output");
       int y= sample3fun(a);
       System.out.println(y);
    }
    public static int sample3fun(int n)
    {
        if(n==1)
        {
            return 0;
        }
        else{
            return 1 + sample3fun(n/2);
        }
    }
}
