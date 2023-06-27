package recursion;

import java.util.Scanner;

public class naturailnum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int a=s.nextInt();
        System.out.println("output");
        int y=naturailnumfun(a);
        System.out.println(y);
    } 
    public static int naturailnumfun(int a)
    {
        if(a==0)
        {
            return 0;
        }
        return a+ naturailnumfun(a-1);

    }
}
